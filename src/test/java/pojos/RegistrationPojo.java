package pojos;

public class RegistrationPojo {
/*
    {
        "activated": true,
            "authorities": [
        "string"
  ],
        "createdBy": "string",
            "createdDate": "2022-10-20T09:11:42.603Z",
            "email": "string",
            "firstName": "string",
            "id": 0,
            "imageUrl": "string",
            "langKey": "string",
            "lastModifiedBy": "string",
            "lastModifiedDate": "2022-10-20T09:11:42.603Z",
            "lastName": "string",
            "login": "string",
            "ssn": "string"
    }

 */

    private String ssn;
    private String firstName;
    private String lastName;
    private String login;     //username
    private String email;
    private String password;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email + "@gmail.com";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegistrationPojo{" +
                "ssn='" + ssn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}