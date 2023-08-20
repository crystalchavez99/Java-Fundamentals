package com.company.coffeeinventory.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="coffee")
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int roasterId;
    @NotNull
    private String name;
    @PositiveOrZero
    private int count;
    @PositiveOrZero
    private BigDecimal unitPrice;
    private String description;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoasterId() {
        return roasterId;
    }

    public void setRoasterId(int roasterId) {
        this.roasterId = roasterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return getId() == coffee.getId() && getRoasterId() == coffee.getRoasterId() && getCount() == coffee.getCount() && Objects.equals(getName(), coffee.getName()) && Objects.equals(getUnitPrice(), coffee.getUnitPrice()) && Objects.equals(getDescription(), coffee.getDescription()) && Objects.equals(getType(), coffee.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRoasterId(), getName(), getCount(), getUnitPrice(), getDescription(), getType());
    }
}
