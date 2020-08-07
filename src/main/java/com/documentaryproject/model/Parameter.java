package com.documentaryproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Parameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private byte response_period;

    @NotNull
    private byte extension_deadline;

    public Parameter() {

    }

    public Parameter(Long id, @NotNull byte response_period, @NotNull byte extension_deadline) {
        this.id = id;
        this.response_period = response_period;
        this.extension_deadline = extension_deadline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte getResponse_period() {
        return response_period;
    }

    public void setResponse_period(byte response_period) {
        this.response_period = response_period;
    }

    public byte getExtension_deadline() {
        return extension_deadline;
    }

    public void setExtension_deadline(byte extension_deadline) {
        this.extension_deadline = extension_deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parameter)) return false;
        Parameter parameter = (Parameter) o;
        return getId() == parameter.getId() &&
                getResponse_period() == parameter.getResponse_period() &&
                getExtension_deadline() == parameter.getExtension_deadline();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getResponse_period(), getExtension_deadline());
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "id=" + id +
                ", response_period=" + response_period +
                ", extension_deadline=" + extension_deadline +
                '}';
    }

}
