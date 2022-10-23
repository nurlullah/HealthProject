package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TestItem {
    /*
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
     */

    private String createdBy;
    private Date createdDate;
    private String defaultValMax;
    private String defaultValMin;
    private String description;
    private int id;
    private int name;
    private double price;

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TestItem{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", defaultValMax='" + defaultValMax + '\'' +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", name=" + name +
                ", price=" + price +
                '}';
    }
}
