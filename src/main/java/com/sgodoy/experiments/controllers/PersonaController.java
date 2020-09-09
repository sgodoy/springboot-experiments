package com.sgodoy.experiments.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgodoy.experiments.beans.Persona;

@RestController
public class PersonaController {

	@GetMapping("/personas")
	public List<Persona> personas() {
		Persona persona = new Persona(0, "nombre", "apellido paterno", "apellido materno");
		List<Persona> listPersonas = new ArrayList<>();
		listPersonas.add(persona);
		return listPersonas;
	}
}
