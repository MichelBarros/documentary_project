package com.documentaryproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Cause {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String cause;

    @NotNull
    private boolean status;

    public Cause() {

    }

    public Cause(Long id, @NotNull String cause, @NotNull boolean status) {
        this.id = id;
        this.cause = cause;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
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
        if (!(o instanceof Cause)) return false;
        Cause cause1 = (Cause) o;
        return getId() == cause1.getId() &&
                isStatus() == cause1.isStatus() &&
                getCause().equals(cause1.getCause());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCause(), isStatus());
    }

    @Override
    public String toString() {
        return "Cause{" +
                "id=" + id +
                ", cause='" + cause + '\'' +
                ", status=" + status +
                '}';
    }

}
