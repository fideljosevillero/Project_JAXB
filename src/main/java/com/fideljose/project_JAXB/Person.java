package com.fideljose.project_JAXB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="persona")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Person {

	private String nombre;
	private String direccion;
	private int edad;
	private Genero genero;
	
	public Person() {
//		super();
	}
	
	@XmlType
	@XmlEnum
	public enum Genero{
		@XmlEnumValue("m")
		masculino, 
		@XmlEnumValue("f")
		femenino;
	}
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
}
