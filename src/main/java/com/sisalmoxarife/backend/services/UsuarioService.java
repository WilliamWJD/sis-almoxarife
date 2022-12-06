package com.sisalmoxarife.backend.services;

import com.sisalmoxarife.backend.dto.UsuarioEntradaDTO;
import com.sisalmoxarife.backend.dto.UsuarioSaidaDTO;

public interface UsuarioService {
	UsuarioSaidaDTO salvaUsuario(final UsuarioEntradaDTO usuarioEntradaDTO);
}
