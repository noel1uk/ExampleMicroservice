package com.intro.returnjson.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examples")
public class Example {
    @Id
    @Column(name = "example_id", nullable = false)
    private String exampleId;

    @Column(name = "organisation_id", nullable = false)
    private String organisationId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "example_type", nullable = false)
    private String exampleType;

    @Column(name = "example_max", nullable = false)
    private Integer exampleMax;

    @Column(name = "example_allocated", nullable = false)
    private Integer exampleAllocated;

    @Column(name = "comment")
    private String comment;

    public String getExampleId() {
        return exampleId;
    }

    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }

    public String getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(String organisationId) {
        this.organisationId = organisationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getExampleType() {
        return exampleType;
    }

    public void setExampleType(String exampleType) {
        this.exampleType = exampleType;
    }

    public Integer getExampleMax() {
        return exampleMax;
    }

    public void setExampleMax(Integer exampleMax) {
        this.exampleMax = exampleMax;
    }

    public Integer getExampleAllocated() {
        return exampleAllocated;
    }

    public void setExampleAllocated(Integer exampleAllocated) {
        this.exampleAllocated = exampleAllocated;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Example withId(String exampleId) {
        this.setExampleId(exampleId);
        return this;
    }

    public Example withOrganisationId(String organisationId) {
        this.setOrganisationId(organisationId);
        return this;
    }

    public Example withProductName(String productName) {
        this.setProductName(productName);
        return this;
    }

    public Example withExampleType(String exampleType) {
        this.setExampleType(exampleType);
        return this;
    }

    public Example withExampleMax(Integer exampleMax) {
        this.setExampleMax(exampleMax);
        return this;
    }

    public Example withExampleAllocated(Integer exampleAllocated) {
        this.setExampleAllocated(exampleAllocated);
        return this;
    }

    public Example withComment(String comment) {
        this.setComment(comment);
        return this;
    }
}
