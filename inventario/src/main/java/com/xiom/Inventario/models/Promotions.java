package com.xiom.Inventario.models;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "PROMOTION")
public class Promotions {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column(name = "NAME")
    String name;
    @Column(name = "DESCRIPTION")
    String description;
    @Column(name = "QUANTITY")
    int quantity;
    @Column(name = "FIRST_DATE")
    LocalDate firstDate;
    @Column(name = "END_DATE")
    LocalDate endDate;

    public Promotions() {
    }

    public Promotions(Long id, String name, String description, int quantity, LocalDate firstDate, LocalDate endDate) {
        Id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.firstDate = firstDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Promotions{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", firstDate=" + firstDate +
                ", endDate=" + endDate +
                '}';
    }
}
