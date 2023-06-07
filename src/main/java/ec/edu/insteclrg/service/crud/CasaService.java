package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.Casa;
import ec.edu.insteclrg.dto.CasaDTO;
import ec.edu.insteclrg.persistence.CasaRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class CasaService extends GenericCrudServiceImpl<Casa, CasaDTO> {
	
	@Autowired
	private CasaRepository repository;
	
	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public Optional<Casa> find(CasaDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public CasaDTO mapToDto(Casa domain) {
		return modelMapper.map(domain, CasaDTO.class);
	}

	@Override
	public Casa mapToDomain(CasaDTO dto) {
		return modelMapper.map(dto, Casa.class);
	}

}
