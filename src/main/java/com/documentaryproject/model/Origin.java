package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

@Entity
public class Origin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String type;

    @NotNull
    private String claim;

    @NotNull
    private String claim_name;

    @NotNull
    private boolean status;

    public Origin() {

    }

    public Origin(Long id, String type, String claim, String claim_name, boolean status) {
        this.id = id;
        this.type = type;
        this.claim = claim;
        this.claim_name = claim_name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }

    public String getClaim_name() {
        return claim_name;
    }

    public void setClaim_name(String claim_name) {
        this.claim_name = claim_name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Origin)) return false;
        Origin origin = (Origin) o;
        return isStatus() == origin.isStatus() &&
                getId().equals(origin.getId()) &&
                getType().equals(origin.getType()) &&
                getClaim().equals(origin.getClaim()) &&
                getClaim_name().equals(origin.getClaim_name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getClaim(), getClaim_name(), isStatus());
    }

    @Override
    public String toString() {
        return "Origin{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", claim='" + claim + '\'' +
                ", claim_name='" + claim_name + '\'' +
                ", status=" + status +
                '}';
    }

}
