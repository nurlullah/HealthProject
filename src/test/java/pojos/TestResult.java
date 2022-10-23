package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestResult {
    /*
    {
        "createdBy": "string",
        "createdDate": "2022-10-22T19:59:35.566Z",
        "ctest": "string",
        "ctestItem": {
                                            "createdBy": "string",
                                            "createdDate": "2022-10-22T19:59:35.566Z",
                                            "defaultValMax": "string",
                                            "defaultValMin": "string",
                                            "description": "string",
                                            "id": 0,
                                            "name": "string",
                                            "price": 0
                      },
       "date": "2022-10-22T19:59:35.566Z",
       "description": "string",
       "id": 0,
       "result": "string"
    }
     */

    private String createdBy;
    private Date createdDate;
    private String ctest;
    private TestItem ctestItem;
    private Date date;
    private String description;
    private int id;
    private String result;

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getCtest() {
        return ctest;
    }

    public TestItem getCtestItem() {
        return ctestItem;
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

    public String getResult() {
        return result;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setCtest(String ctest) {
        this.ctest = ctest;
    }

    public void setCtestItem(TestItem ctestItem) {
        this.ctestItem = ctestItem;
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

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", ctest='" + ctest + '\'' +
                ", ctestItem=" + ctestItem +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", result='" + result + '\'' +
                '}';
    }
}
