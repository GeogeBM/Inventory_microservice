package com.xiom.Inventario.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "PROVIDERS")
public class Providers {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column(name = "NAME")
    String name;
    @Column(name = "REGISTER_DATE")
    LocalDate registerDate;

    public Providers() {
    }

    public Providers(Long id, String name, LocalDate registerDate) {
        Id = id;
        this.name = name;
        this.registerDate = registerDate;
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

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Providers{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
