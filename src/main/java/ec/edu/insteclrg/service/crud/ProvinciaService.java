package ec.edu.insteclrg.service.crud;

import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Provincia;
import ec.edu.insteclrg.dto.ProvinciaDTO;
import ec.edu.insteclrg.persistence.ProvinciaRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;


@Service
public class ProvinciaService {
	@Autowired
	private ProvinciaRepository repository;
	
	private ModelMapper modelMapper = new ModelMapper();

	public Optional<Provincia> find(ProvinciaDTO dto) {
		return repository.findById(dto.getId());
	}

	public ProvinciaDTO mapToDto(Provincia domain) {
		return modelMapper.map(domain, ProvinciaDTO.class);
	}

	public Provincia mapToDomain(ProvinciaDTO dto) {
		return modelMapper.map(dto, Provincia.class);
	}

	public void save(ProvinciaDTO dto) {
		// TODO Auto-generated method stub
		
	}
}
