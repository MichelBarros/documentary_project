package com.documentaryproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String profile;

    @NotNull
    private boolean status;

    public Profile() {

    }

    public Profile(Long id, @NotNull String profile, @NotNull boolean status) {
        this.id = id;
        this.profile = profile;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
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
        if (!(o instanceof Profile)) return false;
        Profile profile1 = (Profile) o;
        return getId() == profile1.getId() &&
                isStatus() == profile1.isStatus() &&
                getProfile().equals(profile1.getProfile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProfile(), isStatus());
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", profile='" + profile + '\'' +
                ", status=" + status +
                '}';
    }

}
