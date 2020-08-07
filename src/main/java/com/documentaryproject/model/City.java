package com.documentaryproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String state_province;

    @NotNull
    private String city;

    @NotNull
    private boolean status;

    public City() {

    }

    public City(Long id, @NotNull String state_province, @NotNull String city, @NotNull boolean status) {
        this.id = id;
        this.state_province = state_province;
        this.city = city;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        if (!(o instanceof City)) return false;
        City city1 = (City) o;
        return getId() == city1.getId() &&
                isStatus() == city1.isStatus() &&
                getState_province().equals(city1.getState_province()) &&
                getCity().equals(city1.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getState_province(), getCity(), isStatus());
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", state_province='" + state_province + '\'' +
                ", city='" + city + '\'' +
                ", status=" + status +
                '}';
    }
    
}
