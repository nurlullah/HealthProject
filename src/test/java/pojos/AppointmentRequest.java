package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentRequest {
    /*
    {
  "appoSpeciality": "string",
  "birthDate": "2022-10-25T15:55:50.783Z",
  "email": "string",
  "firstName": "string",
  "gender": "string",
  "lastName": "string",
  "phone": "string",
  "snumber": "string",
  "ssn": "string",
  "startDate": "2022-10-25"
}
     */

    private String appoSpeciality;
    private Date birthDate;
    private String email;
    private String firstName;
    private String gender;
    private String lastName;
    private String phone;
    private String snumber;
    private String ssn;
    private String startDate;

    public String getAppoSpeciality() {
        return appoSpeciality;
    }

    public Date getBirthDate() {
        return birthDate;
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

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getSnumber() {
        return snumber;
    }

    public String getSsn() {
        return ssn;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setAppoSpeciality(String appoSpeciality) {
        this.appoSpeciality = appoSpeciality;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "AppointmentRequest{" +
                "appoSpeciality='" + appoSpeciality + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", snumber='" + snumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}