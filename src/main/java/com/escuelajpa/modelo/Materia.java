package com.escuelajpa.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	@Column(name = "horas_clase",nullable = false)
	private int horasDeClase;
	
	@ManyToOne
	@JoinColumn(name = "grupo_id", nullable = false)
	private Grupo grupo;

	@OneToMany
	private List<Calificacion> calificaciones;
	
	public Materia(String nombre, int horasDeClase, Grupo grupo) {
		this.nombre = nombre;
		this.horasDeClase = horasDeClase;
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", horasDeClase=" + horasDeClase + "]";
	}
	
	
}
