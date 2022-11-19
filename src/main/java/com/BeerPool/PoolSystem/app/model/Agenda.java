package com.BeerPool.PoolSystem.app.model;

public class Agenda {
	private int ID_agenda, idUsuario, ID_servicio;
    private String fecha_reserva,hora_inicio,hora_fin,observaciones,estado;
    private Servicio servicio;
    
    public Agenda() {
    	
    }
    
	public Agenda(int iD_agenda, int idUsuario, int iD_servicio, String fecha_reserva, String hora_inicio,
			String hora_fin, String observaciones, String estado, Servicio servicio) {
		super();
		ID_agenda = iD_agenda;
		this.idUsuario = idUsuario;
		ID_servicio = iD_servicio;
		this.fecha_reserva = fecha_reserva;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.observaciones = observaciones;
		this.estado = estado;
		this.servicio = servicio;
	}

	public int getID_agenda() {
		return ID_agenda;
	}

	public void setID_agenda(int iD_agenda) {
		ID_agenda = iD_agenda;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getID_servicio() {
		return ID_servicio;
	}

	public void setID_servicio(int iD_servicio) {
		ID_servicio = iD_servicio;
	}

	public String getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

    
    
}
