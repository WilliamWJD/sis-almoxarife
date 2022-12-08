package com.sisalmoxarife.backend.services;

import com.sisalmoxarife.backend.usuario.dto.UsuarioEntradaDTO;
import com.sisalmoxarife.backend.usuario.dto.UsuarioSaidaDTO;

public interface UsuarioService {
	UsuarioSaidaDTO salvaUsuario(final UsuarioEntradaDTO usuarioEntradaDTO);
	void excluirUsuario(final Integer id);
}
