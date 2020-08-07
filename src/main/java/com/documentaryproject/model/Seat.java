package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat_name")
    @NotNull
    private String seatName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_city",unique = true)
    @NotNull
    private City city;

    @NotNull
    private byte building;

    @NotNull
    private byte floor;

    public Seat() {

    }

    public Seat(Long id, @NotNull String seatName, @NotNull City city, @NotNull byte building, @NotNull byte floor) {
        this.id = id;
        this.seatName = seatName;
        this.city = city;
        this.building = building;
        this.floor = floor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public byte getBuilding() {
        return building;
    }

    public void setBuilding(byte building) {
        this.building = building;
    }

    public byte getFloor() {
        return floor;
    }

    public void setFloor(byte floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat)) return false;
        Seat seat = (Seat) o;
        return getId() == seat.getId() &&
                getBuilding() == seat.getBuilding() &&
                getFloor() == seat.getFloor() &&
                getSeatName().equals(seat.getSeatName()) &&
                getCity().equals(seat.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSeatName(), getCity(), getBuilding(), getFloor());
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", seatName='" + seatName + '\'' +
                ", city=" + city +
                ", building=" + building +
                ", floor=" + floor +
                '}';
    }

}
