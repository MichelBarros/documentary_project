package com.documentaryproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Motive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String motive;

    @NotNull
    private boolean status;

    public Motive() {

    }

    public Motive(Long id, @NotNull String motive, @NotNull boolean status) {
        this.id = id;
        this.motive = motive;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
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
        if (!(o instanceof Motive)) return false;
        Motive motive1 = (Motive) o;
        return getId() == motive1.getId() &&
                isStatus() == motive1.isStatus() &&
                getMotive().equals(motive1.getMotive());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMotive(), isStatus());
    }

    @Override
    public String toString() {
        return "motive{" +
                "id=" + id +
                ", motive='" + motive + '\'' +
                ", status=" + status +
                '}';
    }

}
