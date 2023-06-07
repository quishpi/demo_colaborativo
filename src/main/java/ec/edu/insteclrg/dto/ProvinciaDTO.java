package ec.edu.insteclrg.dto;

import ec.edu.insteclrg.domain.Pais;
import lombok.Data;

@Data
public class ProvinciaDTO {
	private Long id;
	private String nombre;
    private Pais pais;
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
