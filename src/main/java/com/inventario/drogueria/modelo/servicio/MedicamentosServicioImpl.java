package com.inventario.drogueria.modelo.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventario.drogueria.modelo.dao.IMedicamentosDao;
import com.inventario.drogueria.modelo.entidad.Medicamentos;

@Service
public class MedicamentosServicioImpl implements IMedicamentosServicio{
	
	private final IMedicamentosDao medicamentosDao;

	public MedicamentosServicioImpl(IMedicamentosDao medicamentosDao) {
		this.medicamentosDao = medicamentosDao;
	}

	@Override
	public List<Medicamentos> findAll() {
		// TODO Auto-generated method stub
		return medicamentosDao.findAll();
	}

	@Override
	public Medicamentos findById(Long id) {
		// TODO Auto-generated method stub
		return medicamentosDao.findById(id).orElse(null);
	}

	@Override
	public Medicamentos save(Medicamentos medicamento) {
		// TODO Auto-generated method stub
		return medicamentosDao.save(medicamento);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicamentosDao.deleteById(id);
	}
	
	
}
