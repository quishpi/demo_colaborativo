package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.insteclrg.domain.Comunicado;
import ec.edu.insteclrg.dto.ComunicadoDTO;
import ec.edu.insteclrg.persistence.ComunicadoRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class ComunicadoService extends GenericCrudServiceImpl<Comunicado, ComunicadoDTO>{
	
	@Autowired
	private ComunicadoRepository repository;
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public Optional<Comunicado> find(ComunicadoDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public ComunicadoDTO mapToDto(Comunicado domain) {
		return modelMapper.map(domain, ComunicadoDTO.class);
	}

	@Override
	public Comunicado mapToDomain(ComunicadoDTO dto) {
		return modelMapper.map(dto, Comunicado.class);
	}

	
	

}
