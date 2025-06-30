package com.escuelajpa.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private int grado;
	@Column(nullable = false)
	private char grupo;
	private String turno;
	
	@OneToMany(mappedBy = "grupo",cascade = CascadeType.REMOVE)
	private List<Alumno> alumnos;
	
	@OneToMany(mappedBy = "grupo")
	private List<Materia> materias;
	
	public Grupo(int grado, char grupo, String turno) {
		this.grado = grado;
		this.grupo = grupo;
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", grado=" + grado + ", grupo=" + grupo + ", turno=" + turno + "]";
	}
	
}
