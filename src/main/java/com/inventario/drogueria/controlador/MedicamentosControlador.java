package com.inventario.drogueria.controlador;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.drogueria.modelo.entidad.Medicamentos;
import com.inventario.drogueria.modelo.servicio.IMedicamentosServicio;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class MedicamentosControlador {

	private final IMedicamentosServicio medicamentosServicio;
	
	public MedicamentosControlador(IMedicamentosServicio medicamentosServicio) {
		this.medicamentosServicio = medicamentosServicio;
	}

	@GetMapping("/medicamentos")
	public List<Medicamentos> listarTodosLosMedicamentos() {
		return medicamentosServicio.findAll();
	}
	
	@GetMapping("/medicamento/{id}")
	public Medicamentos listarUnMedicamento(@PathVariable Long id) {
		return medicamentosServicio.findById(id);
	}
	
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> save(@Valid @RequestBody Medicamentos medicamento) {
		Medicamentos medicamentoNew = null;
		Map<String, Object> response = new HashMap<>();
		medicamentoNew = medicamentosServicio.save(medicamento);
		response.put("message", "Medicamento Creado en base de datos");
		response.put("status", true);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity<?> update(@Valid @RequestBody Medicamentos medicamento, @PathVariable Long id) {
		
		Map<String, Object> response = new HashMap<>();
		Medicamentos medicamentoResponse = null;
		medicamentoResponse = medicamentosServicio.findById(id);
		medicamentoResponse.setNombre(medicamento.getNombre());
		medicamentoResponse.setLaboratorio(medicamento.getLaboratorio());
		medicamentoResponse.setFecha_creacion(medicamento.getFecha_creacion());
		medicamentoResponse.setFecha_vencimiento(medicamento.getFecha_vencimiento());
		medicamentoResponse.setStock(medicamento.getStock());
		medicamentoResponse.setValor(medicamento.getValor());
		medicamentosServicio.save(medicamentoResponse);
		response.put("message", "Proveedor actualizado en Base de datos");
		response.put("status", true);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		medicamentosServicio.delete(id);
	}
}
