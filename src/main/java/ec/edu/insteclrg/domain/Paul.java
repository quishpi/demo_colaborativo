package ec.edu.insteclrg.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Paul {

	private Long id;
	private String nombre;
}

