package com.xiom.Inventario.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "PRODUCT_TYPE")
public class ProductType {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column(name = "NAME")
    String name;
    @Column(name = "DESCRIPTION")
    String description;
    @Column(name = "REGISTER_DATE")
    LocalDate registerDate;
    @Column(name = "UPDATE_DATE")
    LocalDate updateDate;

    public ProductType(Long id, String name, String description, LocalDate registerDate, LocalDate updateDate) {
        Id = id;
        this.name = name;
        this.description = description;
        this.registerDate = registerDate;
        this.updateDate = updateDate;
    }


    public ProductType() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", registerDate=" + registerDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
