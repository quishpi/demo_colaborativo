package ec.edu.insteclrg.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Marco {

	private Long id;
	private String nombre;
}

