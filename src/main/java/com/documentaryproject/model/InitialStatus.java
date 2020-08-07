package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="initial_status")
public class InitialStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String initial_status;

    @NotNull
    private boolean status;

    public InitialStatus() {

    }

    public InitialStatus(Long id, @NotNull String initial_status, @NotNull boolean status) {
        this.id = id;
        this.initial_status = initial_status;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInitial_status() {
        return initial_status;
    }

    public void setInitial_status(String initial_status) {
        this.initial_status = initial_status;
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
        if (!(o instanceof InitialStatus)) return false;
        InitialStatus that = (InitialStatus) o;
        return getId() == that.getId() &&
                isStatus() == that.isStatus() &&
                getInitial_status().equals(that.getInitial_status());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInitial_status(), isStatus());
    }

    @Override
    public String toString() {
        return "InitialStatus{" +
                "id=" + id +
                ", initial_status='" + initial_status + '\'' +
                ", status=" + status +
                '}';
    }

}
