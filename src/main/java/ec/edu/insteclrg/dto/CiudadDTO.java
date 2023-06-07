package ec.edu.insteclrg.dto;

import ec.edu.insteclrg.domain.Provincia;
import lombok.Data;

@Data
public class CiudadDTO {
 private Long id;
 private String nombreCiudad;
 private Provincia provincia;
}
