package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "assignment_cycle")
public class AssignmentCycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_claim", unique = true)
    @NotNull
    private Claim claim;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user", unique = true)
    @NotNull
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_status_user", unique = true)
    @NotNull
    private StatusUser statusUser;

    public AssignmentCycle() {

    }

    public AssignmentCycle(Long id, @NotNull Claim claim, @NotNull User user, @NotNull StatusUser statusUser) {
        this.id = id;
        this.claim = claim;
        this.user = user;
        this.statusUser = statusUser;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public StatusUser getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(StatusUser statusUser) {
        this.statusUser = statusUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignmentCycle)) return false;
        AssignmentCycle that = (AssignmentCycle) o;
        return getId().equals(that.getId()) &&
                getClaim().equals(that.getClaim()) &&
                getUser().equals(that.getUser()) &&
                getStatusUser().equals(that.getStatusUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getClaim(), getUser(), getStatusUser());
    }

    @Override
    public String toString() {
        return "AssignmentCycle{" +
                "id=" + id +
                ", claim=" + claim +
                ", user=" + user +
                ", statusUser=" + statusUser +
                '}';
    }

}
