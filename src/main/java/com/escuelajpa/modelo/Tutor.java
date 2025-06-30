package com.escuelajpa.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Tutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellidos;
	@Column(name="numero_telefonico",nullable = false)
	private String numeroTelefonico;
	@Column(nullable = false)
	private String correo;
	@OneToOne
	private Alumno alumno;
	
	public Tutor(String nombre, String apellidos, String numeroTelefonico, String correo, Alumno alumno) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroTelefonico = numeroTelefonico;
		this.correo = correo;
		this.alumno = alumno;
	}
	
}
