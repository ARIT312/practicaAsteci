package com.practrica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practica.web.services.IncidenciaInter;
import com.practrica.web.entity.Equipo;

@Controller
public class IncidenciaController {

	@Autowired
	private IncidenciaInter service;
	
	@GetMapping({"/equipos","/"})
	public String listarDoctores(Model model) {
		model.addAttribute("incidencias", service.Incidencias());
		return "equipos";
	}
	

	
///sigue equipos, personal y soporte para busquedas decuardo el requerimiento ya no dio tiempo
	
	
	
}
