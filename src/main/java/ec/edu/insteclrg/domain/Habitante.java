package ec.edu.insteclrg.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Habitante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String identificacion;
	

	@Column(nullable = false, length = 20)
	private String nombre;
	
	@Column(nullable = false, length = 20)
	private String apellido;
	
	@Column(nullable = false)
	private Date fechaNacimiento;
	
	
	@Column(nullable = false, length = 10)
	private String telefono;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	
	@Column(nullable = false)
	private byte[] foto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( nullable = false)
	private Casa casa;
	
	

}