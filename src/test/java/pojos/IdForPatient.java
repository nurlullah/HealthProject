package pojos;

public class IdForPatient {



    private int expectedPatientAppoId;
    private int expectedPatientIdPost;


    public void IdForPatient(){

    }

    public int getExpectedPatientAppoId() {
        return expectedPatientAppoId;
    }

    public int getExpectedPatientIdPost() {
        return expectedPatientIdPost;
    }

    public void setExpectedPatientIdPost(int expectedPatientIdPost) {
        this.expectedPatientIdPost = expectedPatientIdPost;
    }

    public void setExpectedPatientAppoId(int expectedPatientAppoId) {
        this.expectedPatientAppoId = expectedPatientAppoId;
    }
}
