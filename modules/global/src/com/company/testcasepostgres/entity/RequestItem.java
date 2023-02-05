package com.company.testcasepostgres.entity;

import com.haulmont.cuba.core.entity.BaseLongIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@DiscriminatorValue("RequestItem")
@Table(name = "TESTCASEPOSTGRES_REQUEST_ITEM")
@Entity(name = "testcasepostgres_RequestItem")
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
public class RequestItem extends BaseLongIdEntity {
    private static final long serialVersionUID = -7841913283607687442L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "REQUEST_ID")
    private Request request;

    @NotNull
    @Column(name = "VOLUME", nullable = false)
    private Double volume;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}