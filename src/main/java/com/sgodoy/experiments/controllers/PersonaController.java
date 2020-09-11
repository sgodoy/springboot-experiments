package com.sgodoy.experiments.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgodoy.experiments.beans.Persona;
import com.sgodoy.experiments.dao.IPersonaDao;
import com.sgodoy.experiments.utils.LogUtils;

@RestController
public class PersonaController {

	private static final Logger log = LoggerFactory.getLogger(PersonaController.class);
	
	@Autowired
	IPersonaDao personaDao;
	
	@GetMapping("/personas")
	public List<Persona> getPersonas() {
		LogUtils.logInit(log, "getPersonas");
		
		List<Persona> listPersonas = new ArrayList<>();
		try {
//			Persona persona = new Persona(0, "nombre", "apellido paterno", "apellido materno");	
//			Persona persona1 = new Persona(1, "nombre", "apellido paterno", "apellido materno");	
//			listPersonas.add(persona);
//			listPersonas.add(persona1);
			listPersonas = personaDao.getPersonas();
		} catch (Exception e) {
			LogUtils.logError(log, e.getMessage(), "PersonaController", "getPersonas");
			e.printStackTrace();
		}
		LogUtils.logInit(log, "getPersonas");
		return listPersonas;
	}
}
