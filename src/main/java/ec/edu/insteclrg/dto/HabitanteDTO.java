package ec.edu.insteclrg.dto;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class HabitanteDTO {
	

	private Long id;
	private String nombre;
	private String apellido;
	private String identificacion;
	private Date fechaNacimiento;
	private String direccion;
	private String telefono;
	private String email;
	//private TipoIdentificacion tipoIdentificacion;
	//private Sexo sexo;
	private byte[] foto;
	private Casa casa;
	
}
