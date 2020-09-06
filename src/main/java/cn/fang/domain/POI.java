package cn.fang.domain;

import java.io.Serializable;

public class POI implements Serializable{

    private Integer id_poi;
    private String label;
    private String description;
    private Double longitude;
    private Double latitude;
    private String street;
    private Integer postcode;
    private String locality;
    private Integer review;
    private String representation;
    private String type3;
    private String type4;
//    private Integer theme_entertainment;
//    private Integer theme_garden;

    public Integer getId_poi() {
        return id_poi;
    }

    public void setId_poi(Integer id_poi) {
        this.id_poi = id_poi;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public String getType4() {
        return type4;
    }

    public void setType4(String type4) {
        this.type4 = type4;
    }

    @Override
    public String toString() {
        return "POI{" +
                "id_poi=" + id_poi +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", street='" + street + '\'' +
                ", postcode=" + postcode +
                ", locality='" + locality + '\'' +
                ", review=" + review +
                ", representation='" + representation + '\'' +
                ", type3='" + type3 + '\'' +
                ", type4='" + type4 + '\'' +
                '}';
    }
}
