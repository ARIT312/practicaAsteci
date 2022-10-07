package com.practrica.web.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "incidencia")
public class Incidencia {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idIncidencia;
	@Column(name ="nombre",nullable=false,length =50)
	private String nombre;
	@Column(name ="estatus",nullable=false,length =50)
	private boolean estatus;
	@Column(name ="fechaAlta",nullable=false,length =50)
	private Date fechaAlta;
	@Column(name ="fechaModi",nullable=false,length =50)
	private Date fechaModi;
	@Column(name ="idOperador",nullable=false,length =50)
	private int idOperador;
	@Column(name ="idEquipo",nullable=false,length =50)
	private int idEquipo;
	
	public Incidencia() {
		
	}

	public Incidencia(String idIncidencia, String nombre, boolean estatus, Date fechaAlta, Date fechaModi,
			int idOperador, int idEquipo) {
		super();
		this.idIncidencia = idIncidencia;
		this.nombre = nombre;
		this.estatus = estatus;
		this.fechaAlta = fechaAlta;
		this.fechaModi = fechaModi;
		this.idOperador = idOperador;
		this.idEquipo = idEquipo;
	}

	public String getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(String idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaModi() {
		return fechaModi;
	}

	public void setFechaModi(Date fechaModi) {
		this.fechaModi = fechaModi;
	}

	public int getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	
	
}
