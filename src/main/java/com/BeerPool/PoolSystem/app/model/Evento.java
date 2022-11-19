package com.BeerPool.PoolSystem.app.model;

public class Evento {
	 private int ID_evento, ID_servicio, num_jugadores, valor_inscripcion;
	    private String nom_evento, estado;
	    private String fecha_inicio, fecha_fin, hora_inicio, hora_fin;
	    private String primer_premio, segundo_premio, tercer_puesto;
	    private Servicio servicio;
	    
		public Evento() {
			
		}
	    
		public Evento(int iD_evento, int iD_servicio, int num_jugadores, int valor_inscripcion, String nom_evento,
				String estado, String fecha_inicio, String fecha_fin, String hora_inicio, String hora_fin,
				String primer_premio, String segundo_premio, String tercer_puesto, Servicio servicio) {
			super();
			ID_evento = iD_evento;
			ID_servicio = iD_servicio;
			this.num_jugadores = num_jugadores;
			this.valor_inscripcion = valor_inscripcion;
			this.nom_evento = nom_evento;
			this.estado = estado;
			this.fecha_inicio = fecha_inicio;
			this.fecha_fin = fecha_fin;
			this.hora_inicio = hora_inicio;
			this.hora_fin = hora_fin;
			this.primer_premio = primer_premio;
			this.segundo_premio = segundo_premio;
			this.tercer_puesto = tercer_puesto;
			this.servicio = servicio;
		}
		
		public int getID_evento() {
			return ID_evento;
		}
		public void setID_evento(int iD_evento) {
			ID_evento = iD_evento;
		}
		public int getID_servicio() {
			return ID_servicio;
		}
		public void setID_servicio(int iD_servicio) {
			ID_servicio = iD_servicio;
		}
		public int getNum_jugadores() {
			return num_jugadores;
		}
		public void setNum_jugadores(int num_jugadores) {
			this.num_jugadores = num_jugadores;
		}
		public int getValor_inscripcion() {
			return valor_inscripcion;
		}
		public void setValor_inscripcion(int valor_inscripcion) {
			this.valor_inscripcion = valor_inscripcion;
		}
		public String getNom_evento() {
			return nom_evento;
		}
		public void setNom_evento(String nom_evento) {
			this.nom_evento = nom_evento;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getFecha_inicio() {
			return fecha_inicio;
		}
		public void setFecha_inicio(String fecha_inicio) {
			this.fecha_inicio = fecha_inicio;
		}
		public String getFecha_fin() {
			return fecha_fin;
		}
		public void setFecha_fin(String fecha_fin) {
			this.fecha_fin = fecha_fin;
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
		public String getPrimer_premio() {
			return primer_premio;
		}
		public void setPrimer_premio(String primer_premio) {
			this.primer_premio = primer_premio;
		}
		public String getSegundo_premio() {
			return segundo_premio;
		}
		public void setSegundo_premio(String segundo_premio) {
			this.segundo_premio = segundo_premio;
		}
		public String getTercer_puesto() {
			return tercer_puesto;
		}
		public void setTercer_puesto(String tercer_puesto) {
			this.tercer_puesto = tercer_puesto;
		}
		public Servicio getServicio() {
			return servicio;
		}
		public void setServicio(Servicio servicio) {
			this.servicio = servicio;
		}
}
