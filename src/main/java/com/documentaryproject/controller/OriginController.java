package com.documentaryproject.controller;

import com.documentaryproject.model.Origin;
import com.documentaryproject.repository.OriginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/origins")
public class OriginController {

    @Autowired
    private OriginRepository originRepository;

    @GetMapping
    public ResponseEntity<List<Origin>> getOrigin(){
        List<Origin> origins = (List<Origin>) originRepository.findAll();
        return ResponseEntity.ok(origins);
    }

    @RequestMapping(value = "{originId}")
    public ResponseEntity<Origin> getOriginById(@PathVariable("originId") Long originId){
        Optional<Origin> origins = originRepository.findById(originId);
        if(origins.isPresent()){
            return ResponseEntity.ok(origins.get());
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity<Origin> createOrigin(@RequestBody Origin origin){
        Origin newOrigin = originRepository.save(origin);
        return ResponseEntity.ok(newOrigin);
    }

    @DeleteMapping(value = "{originId}")
    public ResponseEntity<Void> createOrigin(@PathVariable("originId") Long originId){
        originRepository.deleteById(originId);
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<Origin> updateOrigin(@RequestBody Origin origin){
        Optional<Origin> origins = originRepository.findById(origin.getId());
        if(origins.isPresent()){
            Origin updateOrigin = origins.get();
            updateOrigin.setClaim(origin.getClaim());
            updateOrigin.setClaim_name(origin.getClaim_name());
            updateOrigin.setStatus(origin.isStatus());
            updateOrigin.setType(origin.getType());
            originRepository.save(updateOrigin);
            return ResponseEntity.ok(updateOrigin);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
