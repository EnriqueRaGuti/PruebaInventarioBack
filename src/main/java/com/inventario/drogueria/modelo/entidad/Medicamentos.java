package com.inventario.drogueria.modelo.entidad;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamentos")
public class Medicamentos {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "laboratorio")
	private String laboratorio;
	
	@Column(name = "fecha_creacion")
	private Date fecha_creacion;
	
	@Column(name = "fecha_vencimiento")
	private Date fecha_vencimiento;
	
	@Column(name = "stock")
	private int stock;
	
	@Column(name = "valor")
	private int valor;

	public Medicamentos() {

	}

	public Medicamentos(Long id, String nombre, String laboratorio, Date fecha_creacion, Date fecha_vencimiento,
			int stock, int valor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.fecha_creacion = fecha_creacion;
		this.fecha_vencimiento = fecha_vencimiento;
		this.stock = stock;
		this.valor = valor;
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

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
