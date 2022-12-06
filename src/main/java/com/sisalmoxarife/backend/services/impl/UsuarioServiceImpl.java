package com.sisalmoxarife.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisalmoxarife.backend.dto.UsuarioEntradaDTO;
import com.sisalmoxarife.backend.dto.UsuarioSaidaDTO;
import com.sisalmoxarife.backend.mapper.UsuarioMapper;
import com.sisalmoxarife.backend.repositories.UsuarioRepository;
import com.sisalmoxarife.backend.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	UsuarioMapper mapper;
	
	@Override
	public UsuarioSaidaDTO salvaUsuario(UsuarioEntradaDTO usuarioEntradaDTO) {
		return mapper.mapearEntidadeParaDtoSaida(usuarioRepository.save(mapper.mapearDtoParaEntidade(usuarioEntradaDTO)));
	}

}
