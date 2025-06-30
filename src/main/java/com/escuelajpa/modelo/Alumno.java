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
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private String apellidos;

	@Column(nullable = false, unique = true)
	private String matricula;
	
	@ManyToOne
	@JoinColumn(name = "grupo_id", nullable = false)
	private Grupo grupo;
	
	@OneToMany(mappedBy = "alumno")
	private List<Calificacion> calificaciones;

	public Alumno(String nombre, String apellidos, String matricula, Grupo grupo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.matricula = matricula;
		this.grupo = grupo;
	}
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", matricula=" + matricula
				+ ", grupo=" + grupo.getId() + "]";
	}
	
}