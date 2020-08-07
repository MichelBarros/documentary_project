package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "status_user")
public class StatusUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status_user")
    @NotNull
    private String statusUser;

    public StatusUser() {

    }

    public StatusUser(Long id, @NotNull String statusUser) {
        this.id = id;
        this.statusUser = statusUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(String statusUser) {
        this.statusUser = statusUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StatusUser)) return false;
        StatusUser that = (StatusUser) o;
        return getId() == that.getId() &&
                getStatusUser().equals(that.getStatusUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStatusUser());
    }

    @Override
    public String toString() {
        return "StatusUser{" +
                "id=" + id +
                ", statusUser='" + statusUser + '\'' +
                '}';
    }
}
