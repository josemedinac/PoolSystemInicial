package com.BeerPool.PoolSystem.app.model;

public class Usuario {
	private int idUsuario, idRol;
    private String pNombre, sNombre, pApellido, sApellido, telefono, email, documento, userName, pass, nomRol;
   
	public Usuario() {
		
	}


    
	public Usuario(int idUsuario, int idRol, String pNombre, String sNombre, String pApellido, String sApellido,
			String telefono, String email, String documento, String userName, String pass, String nomRol) {
		super();
		this.idUsuario = idUsuario;
		this.idRol = idRol;
		this.pNombre = pNombre;
		this.sNombre = sNombre;
		this.pApellido = pApellido;
		this.sApellido = sApellido;
		this.telefono = telefono;
		this.email = email;
		this.documento = documento;
		this.userName = userName;
		this.pass = pass;
		this.nomRol = nomRol;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public int getIdRol() {
		return idRol;
	}


	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}


	public String getpNombre() {
		return pNombre;
	}


	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}


	public String getsNombre() {
		return sNombre;
	}


	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}


	public String getpApellido() {
		return pApellido;
	}


	public void setpApellido(String pApellido) {
		this.pApellido = pApellido;
	}


	public String getsApellido() {
		return sApellido;
	}


	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getNomRol() {
		return nomRol;
	}


	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}
}