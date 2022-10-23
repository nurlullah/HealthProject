package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Physician {
    /*
    {
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
                "examFee": 0,
                "firstName": "string",
                "gender": "MALE",
                "id": 0,
                "image": "string",
                "imageContentType": "string",
                "lastName": "string",
                "phone": "string",
                "speciality": "ALLERGY_IMMUNOLOGY",
                "ssn": "071-87-1661",
                "user": {

                        }
                },
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
    private double examFee;
    private String firstName;
    private String gender;
    private int id;
    private String image;
    private String imageContentType;
    private String lastName;
    private String phone;
    private String speciality;
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

    public double getExamFee() {
        return examFee;
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

    public String getImage() {
        return image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getSpeciality() {
        return speciality;
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

    public void setExamFee(double examFee) {
        this.examFee = examFee;
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

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Physician{" +
                "adress='" + adress + '\'' +
                ", appointments=" + Arrays.toString(appointments) +
                ", birthDate=" + birthDate +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", country=" + country +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", cstate=" + cstate +
                ", description='" + description + '\'' +
                ", examFee=" + examFee +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", image='" + image + '\'' +
                ", imageContentType='" + imageContentType + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", speciality='" + speciality + '\'' +
                ", ssn='" + ssn + '\'' +
                ", user=" + user +
                '}';
    }
}
