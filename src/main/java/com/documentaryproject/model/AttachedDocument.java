package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class AttachedDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_claim", unique = true)
    @NotNull
    private Claim claim;

    @Column(name = "document_route")
    @NotNull
    private String documentRoute;

    public AttachedDocument() {

    }

    public AttachedDocument(Long id, @NotNull Claim claim, @NotNull String documentRoute) {
        this.id = id;
        this.claim = claim;
        this.documentRoute = documentRoute;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public String getDocumentRoute() {
        return documentRoute;
    }

    public void setDocumentRoute(String documentRoute) {
        this.documentRoute = documentRoute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttachedDocument)) return false;
        AttachedDocument that = (AttachedDocument) o;
        return getId().equals(that.getId()) &&
                getClaim().equals(that.getClaim()) &&
                getDocumentRoute().equals(that.getDocumentRoute());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getClaim(), getDocumentRoute());
    }

    @Override
    public String toString() {
        return "AttachedDocument{" +
                "id=" + id +
                ", claim=" + claim +
                ", documentRoute='" + documentRoute + '\'' +
                '}';
    }

}
