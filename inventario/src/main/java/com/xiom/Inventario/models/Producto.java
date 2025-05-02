package com.xiom.Inventario.models;

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
//    Date fechaIngreso;
//    @Column(name="FECHA_ACTUALIZACION")
//    Date fechaActualizacion;

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

//    public Date getFechaIngreso() {
//        return fechaIngreso;
//    }
//
//    public void setFechaIngreso(Date fechaIngreso) {
//        this.fechaIngreso = fechaIngreso;
//    }
//
//    public Date getFechaActualizacion() {
//        return fechaActualizacion;
//    }
//
//    public void setFechaActualizacion(Date fechaActualizacion) {
//        this.fechaActualizacion = fechaActualizacion;
//    }

    public Producto() {
    }

//    public Producto(Long id, String nombre, String detalle, Date fechaIngreso, Date fechaActualizacion) {
//        this.id = id;
//        this.nombre = nombre;
//        this.detalle = detalle;
////        this.fechaIngreso = fechaIngreso;
////        this.fechaActualizacion = fechaActualizacion;
//    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", detalle='" + detalle + '\'' +
//                ", fechaIngreso=" + fechaIngreso +
//                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}
