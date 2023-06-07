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
	private String Identificacion;
	
	@Column(nullable = false)
	private Sexo sexo;
	
	@Column(nullable = false)
	private Tipoidentificacion tipoidentificacion;
	
	@Column(nullable = false, length = 50)
	private String nombre;
	
	@Column(updatable = false, length = 50)
	private String apellido;
	
	@Column(updatable = false)
	private Date fechadeNacimiento;
	
	@Column(updatable = false, length = 10)
	private String telefono;
	
	@Column(updatable = false, length = 50)
	private String Email;
	
	@Column(updatable = false)
	private byte[] Foto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Casa casa;
	

}
