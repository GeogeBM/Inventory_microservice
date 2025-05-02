package com.xiom.Inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xiom.Inventario.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
