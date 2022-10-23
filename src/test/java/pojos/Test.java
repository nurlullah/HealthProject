package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Test {
    /*
    "ctests":
        {
          "appointment": "string",
          "createdBy": "string",
          "createdDate": "2022-10-22T19:59:35.566Z",
                    "ctestResults": [

                            ],
          "date": "2022-10-22T19:59:35.566Z",
          "description": "string",
          "id": 0,
          "name": "string"
        }

     */

    private String appointment;
    private String createdBy;
    private Date createdDate;
    private TestResult ctestResults;
    private Date date;
    private String description;
    private int id;
    private String name;

    public String getAppointment() {
        return appointment;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public TestResult getCtestResults() {
        return ctestResults;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setCtestResults(TestResult ctestResults) {
        this.ctestResults = ctestResults;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "appointment='" + appointment + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", ctestResults=" + ctestResults +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
