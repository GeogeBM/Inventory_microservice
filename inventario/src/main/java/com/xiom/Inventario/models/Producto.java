package com.xiom.Inventario.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//@Builder
@Entity
@Table(name = "PRODUCTOS")
public class Producto {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id=0L;
    @Column(name="NOMBRE")
    String nombre;
    @Column(name="DETALLE")
    String detalle;
    @Column(name="FECHA_INGRESO")
    LocalDate create_date;
    @Column(name="FECHA_ACTUALIZACION")
    LocalDate update_date;

    /**
     * 
     */
 
    public Producto(LocalDate create_date, String detalle, String nombre, LocalDate update_date) {
        this.create_date = create_date;
        this.detalle = detalle;
        this.nombre = nombre;
        this.update_date = update_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Producto() {
    }

    public LocalDate getCreate_date() {
        return create_date;
    }

    public LocalDate getUpdate_date() {
        return update_date;
    }

    public void setCreate_date(LocalDate create_date) {
        this.create_date = create_date;
    }

    public void setUpdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }


    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", detalle=").append(detalle);
        sb.append(", create_date=").append(create_date);
        sb.append(", update_date=").append(update_date);
        sb.append('}');
        return sb.toString();
    }


}
