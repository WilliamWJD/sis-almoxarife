package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.mapper.UsuarioMapper;
import com.sisalmoxarife.backend.repositories.UsuarioRepository;
import com.sisalmoxarife.backend.services.UsuarioService;
import com.sisalmoxarife.backend.usuario.dto.UsuarioEntradaDTO;
import com.sisalmoxarife.backend.usuario.dto.UsuarioSaidaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioMapper mapper;

    @Override
    public UsuarioSaidaDTO salvaUsuario(final UsuarioEntradaDTO usuarioEntradaDTO) {
        return mapper.mapearEntidadeParaDtoSaida(usuarioRepository.save(mapper.mapearDtoParaEntidade(usuarioEntradaDTO)));
    }

    @Override
    public void excluirUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
