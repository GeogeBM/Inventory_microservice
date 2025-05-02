package com.xiom.Inventario.dao;

import com.xiom.Inventario.models.Producto;
import org.apache.el.lang.ELArithmetic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
