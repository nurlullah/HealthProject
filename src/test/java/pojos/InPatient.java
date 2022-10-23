package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class InPatient {
    /*
    "inPatients": [
                        {
                            "appointment": "string",
                            "createdBy": "string",
                            "createdDate": "2022-10-22T19:59:35.566Z",
                            "description": "string",
                            "endDate": "2022-10-22T19:59:35.566Z",
                            "id": 0,
                            "patient": "string",
                            "room": {
                                    },
                            "startDate": "2022-10-22T19:59:35.566Z",
                            "status": "UNAPPROVED"
                        }
                    ],
     */

    private String appointment;
    private String createdBy;
    private Date createdDate;
    private String description;
    private Date endDate;
    private int id;
    private String patient;
    private Room room;
    private Date startDate;
    private String status;

    public String getAppointment() {
        return appointment;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getDescription() {
        return description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getId() {
        return id;
    }

    public String getPatient() {
        return patient;
    }

    public Room getRoom() {
        return room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InPatient{" +
                "appointment='" + appointment + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", description='" + description + '\'' +
                ", endDate=" + endDate +
                ", id=" + id +
                ", patient='" + patient + '\'' +
                ", room=" + room +
                ", startDate=" + startDate +
                ", status='" + status + '\'' +
                '}';
    }
}
