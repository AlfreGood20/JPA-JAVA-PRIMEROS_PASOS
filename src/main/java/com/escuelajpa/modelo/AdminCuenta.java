package com.escuelajpa.modelo;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="administradores")
public class AdminCuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String correo;
	
	@Column(nullable = false)
	private String contraseña;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_creacion",updatable = false)
	private LocalDateTime fechaCreacion;

	
	public AdminCuenta(String correo, String contraseña) {
		this.correo = correo;
		this.contraseña = contraseña;
	}
	
}
