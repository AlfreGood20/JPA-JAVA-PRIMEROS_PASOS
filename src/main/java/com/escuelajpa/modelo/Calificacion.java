package com.escuelajpa.modelo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Calificacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Alumno alumno;
	@ManyToOne
	private Materia materia;
	
	@Column(name="primer_bimestre")
	private double primerBimestre;
	@Column(name="segundo_bimestre")
	private double segundoBimstre;
	@Column(name="tecer_bimestre")
	private double tercerBimestre;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_registro",updatable = false)
	private LocalDateTime fechaRegistro;
	
	
	public Calificacion(double primerBimestre, double segundoBimstre, double tercerBimestre) {
		this.primerBimestre = primerBimestre;
		this.segundoBimstre = segundoBimstre;
		this.tercerBimestre = tercerBimestre;
	}

}
