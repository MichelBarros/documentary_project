package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name="status_process")
public class StatusProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status_process")
    @NotNull
    private String statusProcess;

    @NotNull
    private boolean status;

    public StatusProcess() {

    }

    public StatusProcess(Long id, @NotNull String statusProcess, @NotNull boolean status) {
        this.id = id;
        this.statusProcess = statusProcess;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusProcess() {
        return statusProcess;
    }

    public void setStatusProcess(String statusProcess) {
        this.statusProcess = statusProcess;
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
        if (!(o instanceof StatusProcess)) return false;
        StatusProcess that = (StatusProcess) o;
        return getId() == that.getId() &&
                isStatus() == that.isStatus() &&
                getStatusProcess().equals(that.getStatusProcess());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStatusProcess(), isStatus());
    }

    @Override
    public String toString() {
        return "StatusProcess{" +
                "id=" + id +
                ", statusProcess='" + statusProcess + '\'' +
                ", status=" + status +
                '}';
    }

}
