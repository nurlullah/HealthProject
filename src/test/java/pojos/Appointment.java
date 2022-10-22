package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Appointment {
/*
{
  "anamnesis": "string",
  "createdBy": "string",
  "createdDate": "2022-10-22T19:59:35.566Z",
  "ctests": [
        {

    ],
  "description": "string",
  "diagnosis": "string",
  "endDate": "2022-10-22T19:59:35.566Z",
  "id": 0,
  "patient": {

            },
  "physician": {
                },
  "prescription": "string",
  "startDate": "2022-10-22T19:59:35.566Z",
  "status": "UNAPPROVED",
  "treatment": "string"
}
 */
    private String anamnesis;
    private String createdBy;
    private Date createdDate;
    private Test[] ctests;
    private String description;
    private String diagnosis;
    private Date endDate;
    private int id;
    private Patient patient;
    private Physician physician;
    private String prescription;
    private Date startDate;
    private String status;
    private String staetment;

    public String getAnamnesis() {
        return anamnesis;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Test[] getCtests() {
        return ctests;
    }

    public String getDescription() {
        return description;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public Physician getPhysician() {
        return physician;
    }

    public String getPrescription() {
        return prescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getStatus() {
        return status;
    }

    public String getStaetment() {
        return staetment;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setCtests(Test[] ctests) {
        this.ctests = ctests;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setPhysician(Physician physician) {
        this.physician = physician;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStaetment(String staetment) {
        this.staetment = staetment;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "anamnesis='" + anamnesis + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", ctests=" + Arrays.toString(ctests) +
                ", description='" + description + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", endDate=" + endDate +
                ", id=" + id +
                ", patient=" + patient +
                ", physician=" + physician +
                ", prescription='" + prescription + '\'' +
                ", startDate=" + startDate +
                ", status='" + status + '\'' +
                ", staetment='" + staetment + '\'' +
                '}';
    }
}
