package com.documentaryproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String response;

    @NotNull
    private boolean status;

    public Response() {

    }

    public Response(Long id, @NotNull String response, @NotNull boolean status) {
        this.id = id;
        this.response = response;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
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
        if (!(o instanceof Response)) return false;
        Response response1 = (Response) o;
        return getId() == response1.getId() &&
                isStatus() == response1.isStatus() &&
                getResponse().equals(response1.getResponse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getResponse(), isStatus());
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", response='" + response + '\'' +
                ", status=" + status +
                '}';
    }
}
