package ec.edu.insteclrg.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.insteclrg.dto.TipoBarrioDTO;
import ec.edu.insteclrg.service.crud.TipoBarrioService;

@RestController
@RequestMapping("/api/v1.0/tipobarrio/")
public class TipoBarrioController {

	@Autowired
	TipoBarrioService service;

	@PostMapping
	public ResponseEntity<Object> guardar(@RequestBody TipoBarrioDTO dto) {
		service.save(dto);
		return new ResponseEntity<>("Guardado correctamente", HttpStatus.OK);
	}
}
