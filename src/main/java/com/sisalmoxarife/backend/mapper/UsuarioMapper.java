package com.sisalmoxarife.backend.mapper;

import org.springframework.stereotype.Component;

import com.sisalmoxarife.backend.domain.Usuario;
import com.sisalmoxarife.backend.usuario.dto.UsuarioEntradaDTO;
import com.sisalmoxarife.backend.usuario.dto.UsuarioSaidaDTO;

@Component
public class UsuarioMapper {
	public Usuario mapearDtoParaEntidade(final UsuarioEntradaDTO dto) {
		Usuario entidade = new Usuario();
		entidade.setNome(dto.getNome());
		entidade.setEmail(dto.getEmail());
		entidade.setSenha(dto.getSenha());
		return entidade;
	}
	
	public UsuarioSaidaDTO mapearEntidadeParaDtoSaida(final Usuario entidade) {
		UsuarioSaidaDTO saida = new UsuarioSaidaDTO();
		saida.setId(entidade.getId());
		saida.setNome(entidade.getNome());
		saida.setEmail(entidade.getEmail());
		return saida;
	}
}
