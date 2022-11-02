package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
    /*
    "user": {
                          "activated": true,
                          "createdBy": "string",
                          "createdDate": "2022-10-22T19:59:35.566Z",
                          "email": "string",
                          "firstName": "string",
                          "id": 0,
                          "imageUrl": "string",
                          "langKey": "string",
                          "lastName": "string",
                          "login": "string",
                          "resetDate": "2022-10-22T19:59:35.566Z",
                          "ssn": "493-98-2987"
                        }
     */

    private boolean activated;
    private String createdBy;
    private Date createdDate;
    private String email;
    private String firstname;
    private int id;
    private String imageUrl;
    private String langKey;
    private String lastName;
    private String login;
    private Date resetDate;
    private String ssn;
    private String password;
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }



    public boolean isActivated() {
        return activated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getLangKey() {
        return langKey;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public Date getResetDate() {
        return resetDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setResetDate(Date resetDate) {
        this.resetDate = resetDate;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "activated=" + activated +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", langKey='" + langKey + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", resetDate=" + resetDate +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}