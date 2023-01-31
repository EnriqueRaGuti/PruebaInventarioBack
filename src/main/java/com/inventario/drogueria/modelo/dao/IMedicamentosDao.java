package com.inventario.drogueria.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventario.drogueria.modelo.entidad.Medicamentos;

@Repository
public interface IMedicamentosDao extends JpaRepository<Medicamentos, Long> {

}