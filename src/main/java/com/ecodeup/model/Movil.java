package com.ecodeup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipo")

public class Movil {
	
	@Id
	private int idequipo;
	
	@Column
	private String liNumeroLinea;
	@Column
	private String equipoMarca;
	@Column
	private String equipoDescripcion;
	@Column
	private String equipoEstado;
	
	public String getLiNumeroLinea() {
		return liNumeroLinea;
	}
	public void setLiNumeroLinea(String liNumeroLinea) {
		this.liNumeroLinea = liNumeroLinea;
	}
	public String getEquipoMarca() {
		return equipoMarca;
	}
	public void setEquipoMarca(String equipoMarca) {
		this.equipoMarca = equipoMarca;
	}
	public String getEquipoDescripcion() {
		return equipoDescripcion;
	}
	public void setEquipoDescripcion(String equipoDescripcion) {
		this.equipoDescripcion = equipoDescripcion;
	}
	public String getEquipoEstado() {
		return equipoEstado;
	}
	public void setEquipoEstado(String equipoEstado) {
		this.equipoEstado = equipoEstado;
	}


}
