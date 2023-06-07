package ec.edu.insteclrg.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.insteclrg.dto.CasaDTO;
import ec.edu.insteclrg.service.crud.CasaService;

@RestController
@RequestMapping("api/v1.0/casa/")
public class CasaController {
	
	@Autowired
	CasaService service;
	
	@PostMapping
	public ResponseEntity<Object> guardar(@RequestBody CasaDTO dto) {
		service.save(dto);
		return new ResponseEntity<>("Guardado correctamente", HttpStatus.OK);
	}
}
