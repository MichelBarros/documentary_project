package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id")
    @NotNull
    private Long employeeId;

    @Column(name = "first_name")
    @NotNull
    private String firstName;

    @Column(name = "other_names")
    private String otherNames;

    @Column(name = "last_name")
    @NotNull
    private String lastName;

    @NotNull
    private String position;

    private int extension;

    private Long cellphone;

    @NotNull
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_profile", unique = true)
    @NotNull
    private Profile profile;

    @NotNull
    private String pass;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dependency", unique = true)
    @NotNull
    private Dependency dependency;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_seat", unique = true)
    @NotNull
    private Seat seat;

    @NotNull
    private boolean status;

    public User() {

    }

    public User(Long id, @NotNull Long employeeId, @NotNull String firstName, String otherNames,
                @NotNull String lastName, @NotNull String position, int extension, Long cellphone,
                @NotNull String email, @NotNull Profile profile, @NotNull String pass, @NotNull Dependency dependency,
                @NotNull Seat seat, @NotNull boolean status) {
        this.id = id;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.otherNames = otherNames;
        this.lastName = lastName;
        this.position = position;
        this.extension = extension;
        this.cellphone = cellphone;
        this.email = email;
        this.profile = profile;
        this.pass = pass;
        this.dependency = dependency;
        this.seat = seat;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", otherNames='" + otherNames + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", extension=" + extension +
                ", cellphone=" + cellphone +
                ", email='" + email + '\'' +
                ", profile=" + profile +
                ", pass='" + pass + '\'' +
                ", dependency=" + dependency +
                ", seat=" + seat +
                ", status=" + status +
                '}';
    }

}
