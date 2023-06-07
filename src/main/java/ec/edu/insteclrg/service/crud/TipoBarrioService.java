package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.insteclrg.domain.TipoBarrio;
import ec.edu.insteclrg.dto.TipoBarrioDTO;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class TipoBarrioService extends GenericCrudServiceImpl <TipoBarrio, TipoBarrioDTO>{

	@Override
	public Optional<TipoBarrio> find(TipoBarrioDTO dto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public TipoBarrioDTO mapToDto(TipoBarrio domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoBarrio mapToDomain(TipoBarrioDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
}
