package com.practica.web.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.web.services.IncidenciaInter;

import com.practrica.web.repository.IncidenciaRepository;

@Service
public class IncidenciaServiceImpl implements IncidenciaInter {

	@Autowired
	private IncidenciaRepository repository;
	
	public List<IncidenciaInter> listaIncidencias() {
		return repository.findAll();
	}

	public IncidenciaInter guardarIncidencia(IncidenciaInter Incidencia) {
		return repository.save(Incidencia);
	}

	public IncidenciaInter actualizarIncidencia(IncidenciaInter Incidencia) {
		return repository.save(Incidencia);
	}

	public IncidenciaInter obtnerIncidenciaById(Long id) {
		return repository.findById(id).get();	
	}

	public IncidenciaInter obtnerIncidenciaByFecha(Date fecha) {
		return null;
	}


}
