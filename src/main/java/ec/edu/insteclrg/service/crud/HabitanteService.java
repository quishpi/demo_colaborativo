package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Habitante;
import ec.edu.insteclrg.dto.HabitanteDTO;
import ec.edu.insteclrg.persistence.HabitanteRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;


@Service
public class HabitanteService extends GenericCrudServiceImpl<Habitante, HabitanteDTO>{
	
	@Autowired
	private HabitanteRepository repository;
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public Optional<Habitante> find(HabitanteDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public HabitanteDTO mapToDto(Habitante domain) {
		return modelMapper.map(domain, HabitanteDTO.class);
	}

	@Override
	public Habitante mapToDomain(HabitanteDTO dto) {
		return modelMapper.map(dto, Habitante.class);
	}

	
	

}
