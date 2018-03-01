package com.javainuse;

import java.util.List;

public class IniciarResponse {
	
	private String id;
	private String nombre;
	List<Person> personas;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Person> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Person> personas) {
		this.personas = personas;
	}
	
	

}
