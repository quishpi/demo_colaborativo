package ec.edu.insteclrg.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class ComunicadoDTO {
	
	private Long id;
	private String titulo ;
	private String asunto ;
	private String contenido ;
	private Date fecha;
	private BarrioDTO barrioDTO;


}
