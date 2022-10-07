package com.practrica.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "equipo")
public class Equipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEquipo;
	@Column(name ="marca",nullable=false,length =50)
	private String marca;
	@Column(name ="modelo",nullable=false,length =50)
	private String modelo;
	@Column(name ="comentarios",nullable=false,length =50)
	private boolean estatus;
	
	public Equipo() {
		
	}
	
	public Equipo(Long idEquipo, String marca, String modelo, boolean estatus) {
		super();
		this.idEquipo = idEquipo;
		this.marca = marca;
		this.modelo = modelo;
		this.estatus = estatus;
	}


	public Long getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Long idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
}
