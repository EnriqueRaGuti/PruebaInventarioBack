package com.inventario.drogueria.modelo.servicio;

import java.util.List;

import com.inventario.drogueria.modelo.entidad.Medicamentos;

public interface IMedicamentosServicio {
	
	public List <Medicamentos> findAll();
	
	public Medicamentos findById(Long id);
	
	public Medicamentos save(Medicamentos proveedores);

	public void delete(Long id);

}
