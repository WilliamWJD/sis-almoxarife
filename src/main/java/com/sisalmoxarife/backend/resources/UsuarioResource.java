package com.sisalmoxarife.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisalmoxarife.backend.services.UsuarioService;
import com.sisalmoxarife.backend.usuario.dto.UsuarioEntradaDTO;
import com.sisalmoxarife.backend.usuario.dto.UsuarioSaidaDTO;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<UsuarioSaidaDTO> salvarUsuario(@RequestBody final UsuarioEntradaDTO usuarioEntrada){
		return ResponseEntity.ok(usuarioService.salvaUsuario(usuarioEntrada));
	}
	
	@DeleteMapping("/{usuarioId}")
	public ResponseEntity<Void> excluirUsuario(@PathVariable final Integer usuarioId){
		usuarioService.excluirUsuario(usuarioId);
		return ResponseEntity.ok().build();
	}
}
