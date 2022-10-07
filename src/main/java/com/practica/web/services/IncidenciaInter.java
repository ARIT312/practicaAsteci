package com.practica.web.services;

import java.util.Date;
import java.util.List;

import com.practrica.web.entity.Equipo;

public interface IncidenciaInter {

	public List<IncidenciaInter> Incidencias();
	public IncidenciaInter guardarIncidencia(IncidenciaInter equipo);
	public IncidenciaInter obtnerIncidenciaById(Long id);
	public IncidenciaInter obtnerIncidenciaByFecha(Date fecha);
}
