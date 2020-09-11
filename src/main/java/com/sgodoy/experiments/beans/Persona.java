package com.sgodoy.experiments.beans;

import java.io.Serializable;

public class Persona implements Serializable{
	private static final long serialVersionUID = 6018204459871938023L;
	
	private int idPersona;
	private String nombrePersona;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	public Persona(int idPersona, String nombrePersona, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
}
