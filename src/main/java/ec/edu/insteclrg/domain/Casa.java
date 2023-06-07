package ec.edu.insteclrg.domain;

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

@Setter
@Getter
@Entity
public class Casa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String propietario;
	
	@Column(nullable = false, length = 50)
	private String telefono;
	
	@Column(nullable = false, length = 50)
	private String ubicacion;
	
	@Column(nullable = false, length = 50)
	private String referencia;
	
	@Column(nullable = false, length = 50)
	private String color;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( nullable = false)
	private Barrio barrio;
}
