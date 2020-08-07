package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Dependency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_dependency")
    @NotNull
    private String nameDependency;

    @NotNull
    private boolean status;

    public Dependency() {

    }

    public Dependency(Long id, @NotNull String nameDependency, @NotNull boolean status) {
        this.id = id;
        this.nameDependency = nameDependency;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDependency() {
        return nameDependency;
    }

    public void setNameDependency(String nameDependency) {
        this.nameDependency = nameDependency;
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
        if (!(o instanceof Dependency)) return false;
        Dependency that = (Dependency) o;
        return getId() == that.getId() &&
                isStatus() == that.isStatus() &&
                getNameDependency().equals(that.getNameDependency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNameDependency(), isStatus());
    }

    @Override
    public String toString() {
        return "Dependency{" +
                "id=" + id +
                ", nameDependency='" + nameDependency + '\'' +
                ", status=" + status +
                '}';
    }
}
