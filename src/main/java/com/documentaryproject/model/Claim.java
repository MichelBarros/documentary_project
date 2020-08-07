package com.documentaryproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Objects;

@Entity
public class Claim {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar opening_date;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar close_date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "estimated_close_date")
    @NotNull
    private Calendar estimatedCloseDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_origin", unique = true)
    @NotNull
    private Origin origin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cause", unique = true)
    @NotNull
    private Cause cause;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_status_process", unique = true)
    @NotNull
    private StatusProcess statusProcess;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_motive", unique = true)
    @NotNull
    private Motive motive;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_initial_status", unique = true)
    @NotNull
    private InitialStatus initialStatus;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_response", unique = true)
    @NotNull
    private Response response;

    @Column(name = "service_id")
    @NotNull
    private String serviceId;

    @Column(name = "client_id")
    @NotNull
    private Long clientId;

    @Column(name = "client_name")
    @NotNull
    private String clientName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_city", unique = true)
    @NotNull
    private City city;

    @NotNull
    private String comment;

    @NotNull
    private boolean status;

    @Column(name = "request_extension")
    @NotNull
    private boolean requestExtension;

    @Column(name = "extension_approved")
    @NotNull
    private boolean extensionApproved;

    @Column(name = "extension_comment")
    private String extensionComment;

    @Column(name = "received_confirmation")
    @NotNull
    private boolean receivedConfirmation;

    @NotNull
    private boolean closed;

    @Column(name = "stored_claim")
    @NotNull
    private boolean storedClaim;

    public Claim() {

    }

    public Claim(Long id, @NotNull Calendar opening_date, Calendar close_date, @NotNull Calendar estimatedCloseDate,
                 @NotNull Origin origin, @NotNull Cause cause, @NotNull StatusProcess statusProcess,
                 @NotNull Motive motive, @NotNull InitialStatus initialStatus, @NotNull Response response,
                 @NotNull String serviceId, @NotNull Long clientId, @NotNull String clientName, @NotNull City city,
                 @NotNull String comment, @NotNull boolean status, @NotNull boolean requestExtension,
                 @NotNull boolean extensionApproved, String extensionComment, @NotNull boolean receivedConfirmation,
                 @NotNull boolean closed, @NotNull boolean storedClaim) {
        this.id = id;
        this.opening_date = opening_date;
        this.close_date = close_date;
        this.estimatedCloseDate = estimatedCloseDate;
        this.origin = origin;
        this.cause = cause;
        this.statusProcess = statusProcess;
        this.motive = motive;
        this.initialStatus = initialStatus;
        this.response = response;
        this.serviceId = serviceId;
        this.clientId = clientId;
        this.clientName = clientName;
        this.city = city;
        this.comment = comment;
        this.status = status;
        this.requestExtension = requestExtension;
        this.extensionApproved = extensionApproved;
        this.extensionComment = extensionComment;
        this.receivedConfirmation = receivedConfirmation;
        this.closed = closed;
        this.storedClaim = storedClaim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(Calendar opening_date) {
        this.opening_date = opening_date;
    }

    public Calendar getClose_date() {
        return close_date;
    }

    public void setClose_date(Calendar close_date) {
        this.close_date = close_date;
    }

    public Calendar getEstimatedCloseDate() {
        return estimatedCloseDate;
    }

    public void setEstimatedCloseDate(Calendar estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Cause getCause() {
        return cause;
    }

    public void setCause(Cause cause) {
        this.cause = cause;
    }

    public StatusProcess getStatusProcess() {
        return statusProcess;
    }

    public void setStatusProcess(StatusProcess statusProcess) {
        this.statusProcess = statusProcess;
    }

    public Motive getMotive() {
        return motive;
    }

    public void setMotive(Motive motive) {
        this.motive = motive;
    }

    public InitialStatus getInitialStatus() {
        return initialStatus;
    }

    public void setInitialStatus(InitialStatus initialStatus) {
        this.initialStatus = initialStatus;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isRequestExtension() {
        return requestExtension;
    }

    public void setRequestExtension(boolean requestExtension) {
        this.requestExtension = requestExtension;
    }

    public boolean isExtensionApproved() {
        return extensionApproved;
    }

    public void setExtensionApproved(boolean extensionApproved) {
        this.extensionApproved = extensionApproved;
    }

    public String getExtensionComment() {
        return extensionComment;
    }

    public void setExtensionComment(String extensionComment) {
        this.extensionComment = extensionComment;
    }

    public boolean isReceivedConfirmation() {
        return receivedConfirmation;
    }

    public void setReceivedConfirmation(boolean receivedConfirmation) {
        this.receivedConfirmation = receivedConfirmation;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isStoredClaim() {
        return storedClaim;
    }

    public void setStoredClaim(boolean storedClaim) {
        this.storedClaim = storedClaim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Claim)) return false;
        Claim claim = (Claim) o;
        return getId().equals(claim.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", opening_date=" + opening_date +
                ", close_date=" + close_date +
                ", estimatedCloseDate=" + estimatedCloseDate +
                ", origin=" + origin +
                ", cause=" + cause +
                ", statusProcess=" + statusProcess +
                ", motive=" + motive +
                ", initialStatus=" + initialStatus +
                ", response=" + response +
                ", serviceId='" + serviceId + '\'' +
                ", clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", city=" + city +
                ", comment='" + comment + '\'' +
                ", status=" + status +
                ", requestExtension=" + requestExtension +
                ", extensionApproved=" + extensionApproved +
                ", extensionComment='" + extensionComment + '\'' +
                ", receivedConfirmation=" + receivedConfirmation +
                ", closed=" + closed +
                ", storedClaim=" + storedClaim +
                '}';
    }
}
