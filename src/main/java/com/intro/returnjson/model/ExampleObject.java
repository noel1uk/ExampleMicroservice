package com.intro.returnjson.model;

import org.springframework.stereotype.Component;

public class ExampleObject {
    private String id;
    private String organisation;
    private String price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ExampleObject withId(String id) {
        this.setId(id);
        return this;
    }

    public ExampleObject withOrganisation(String organisation) {
        this.setOrganisation(organisation);
        return this;
    }

    public ExampleObject withPrice(String price) {
        this.setPrice(price);
        return this;
    }


}
