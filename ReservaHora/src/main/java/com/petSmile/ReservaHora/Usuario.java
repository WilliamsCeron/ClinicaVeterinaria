package com.petSmile.ReservaHora;

public class Usuario {
	private int Rut;
	private String nombeUsuario;
	private String password;
	
	
	public Usuario() {
		
	}


	public Usuario(int rut, String nombeUsuario, String password) {
		super();
		Rut = rut;
		this.nombeUsuario = nombeUsuario;
		this.password = password;
	}


	public int getRut() {
		return Rut;
	}


	public void setRut(int rut) {
		Rut = rut;
	}


	public String getNombeUsuario() {
		return nombeUsuario;
	}


	public void setNombeUsuario(String nombeUsuario) {
		this.nombeUsuario = nombeUsuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

}
