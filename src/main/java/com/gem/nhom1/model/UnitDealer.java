package com.gem.nhom1.model;
// Generated Jan 20, 2016 8:31:28 PM by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * UnitDealer generated by hbm2java
 */
@Entity
@Table(name = "dealer_unit")
public class UnitDealer implements java.io.Serializable {

    private UnitDealerId id;
    private Dealer dealer;
    private Unit unit;
    private double price;

    public UnitDealer() {
    }

    public UnitDealer(Dealer dealer, Unit unit, double price) {
        this.dealer = dealer;
        this.unit = unit;
        this.price = price;
        id = new UnitDealerId(unit.getUnitId(), dealer.getDealerId());
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "unitId", column = @Column(name = "unit_id", nullable = false)),
            @AttributeOverride(name = "dealerId", column = @Column(name = "dealer_id", nullable = false))})
    @JsonIgnore
    public UnitDealerId getId() {
        return this.id;
    }

    public void setId(UnitDealerId id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "dealer_id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    public Dealer getDealer() {
        return this.dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false, insertable = false, updatable = false)
    public Unit getUnit() {
        return this.unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @NotNull
    @Digits(integer = 10, fraction = 2)
    @Column(name = "price")
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}


