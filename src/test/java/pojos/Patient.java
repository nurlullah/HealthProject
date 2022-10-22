package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {
    /*
            "adress": "string",
            "appointments": [
                            "string"
                            ],
            "birthDate": "2022-10-22T19:59:35.566Z",
            "bloodGroup": "Apositive",
            "country": {

             },
            "createdBy": "string",
            "createdDate": "2022-10-22T19:59:35.566Z",
            "cstate": {
                       },
            "description": "string",
            "email": "string",
            "firstName": "string",
            "gender": "MALE",
            "id": 0,
            "inPatients": [
                        {
                        }
                    ],
            "lastName": "string",
            "phone": "string",
            "ssn": "718-14-0788",
            "user": {

                    }
     */

    private String adress;
    private String[] appointments;
    private Date birthDate;
    private String bloodGroup;
    private Country country;
    private String createdBy;
    private Date createdDate;
    private StateCity cstate;
    private String description;
    private String email;
    private String firstName;
    private String gender;
    private int id;
    private InPatient[] inPatients;
    private String lastName;
    private String phone;
    private String ssn;
    private User user;

    public String getAdress() {
        return adress;
    }

    public String[] getAppointments() {
        return appointments;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public Country getCountry() {
        return country;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public StateCity getCstate() {
        return cstate;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public InPatient[] getInPatients() {
        return inPatients;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getSsn() {
        return ssn;
    }

    public User getUser() {
        return user;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAppointments(String[] appointments) {
        this.appointments = appointments;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setCstate(StateCity cstate) {
        this.cstate = cstate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInPatients(InPatient[] inPatients) {
        this.inPatients = inPatients;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "adress='" + adress + '\'' +
                ", appointments=" + Arrays.toString(appointments) +
                ", birthDate=" + birthDate +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", country=" + country +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", cstate=" + cstate +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", inPatients=" + Arrays.toString(inPatients) +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", user=" + user +
                '}';
    }
}
