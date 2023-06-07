package ec.edu.insteclrg.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.insteclrg.dto.HabitanteDTO;
import ec.edu.insteclrg.dto.PaisDTO;
import ec.edu.insteclrg.service.crud.HabitanteService;
import ec.edu.insteclrg.service.crud.PaisService;


@RestController
@RequestMapping("/api/v1.0/habitante/") 
public class HabitanteController {
	
	@Autowired
	HabitanteService service;

	@PostMapping
	public ResponseEntity<Object> guardar(@RequestBody HabitanteDTO dto) {
		Service.save(dto);
		return new ResponseEntity<>("Guardado correctamente", HttpStatus.OK);
	
		
	}

}
