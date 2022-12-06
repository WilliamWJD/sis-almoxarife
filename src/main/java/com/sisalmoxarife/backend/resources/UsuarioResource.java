package com.sisalmoxarife.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisalmoxarife.backend.dto.UsuarioEntradaDTO;
import com.sisalmoxarife.backend.dto.UsuarioSaidaDTO;
import com.sisalmoxarife.backend.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<UsuarioSaidaDTO> salvarUsuario(@RequestBody final UsuarioEntradaDTO usuarioEntrada){
		return ResponseEntity.ok(usuarioService.salvaUsuario(usuarioEntrada));
	}
}
