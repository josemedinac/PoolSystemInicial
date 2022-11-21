package com.BeerPool.PoolSystem.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Servicio")
public class Servicio {
	@Id
	private int ID_servicio;
    private String nom_servicio;
    private String oferta;
    private String estado;
    private double tarifaXmin;
    @OneToMany(mappedBy ="servicio")
    List<Agenda> agendas;
     
    public Servicio() {
    	
    }
    
	public Servicio(int iD_servicio, String nom_servicio, String oferta, String estado, double tarifaXmin) {
		super();
		ID_servicio = iD_servicio;
		this.nom_servicio = nom_servicio;
		this.oferta = oferta;
		this.estado = estado;
		this.tarifaXmin = tarifaXmin;
	}
	public int getID_servicio() {
		return ID_servicio;
	}
	public void setID_servicio(int iD_servicio) {
		ID_servicio = iD_servicio;
	}
	public String getNom_servicio() {
		return nom_servicio;
	}
	public void setNom_servicio(String nom_servicio) {
		this.nom_servicio = nom_servicio;
	}
	public String getOferta() {
		return oferta;
	}
	public void setOferta(String oferta) {
		this.oferta = oferta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getTarifaXmin() {
		return tarifaXmin;
	}
	public void setTarifaXmin(double tarifaXmin) {
		this.tarifaXmin = tarifaXmin;
	}
    
	
}

