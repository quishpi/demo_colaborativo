package ec.edu.insteclrg.dto;

import lombok.Data;

@Data
public class CiudadDTO {
	
private Long id;

private String nombreCiudad;

private ProvinciaDTO provincia;
}
