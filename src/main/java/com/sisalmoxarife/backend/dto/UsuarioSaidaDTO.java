package com.sisalmoxarife.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class UsuarioSaidaDTO {
	private Integer id;
	private String nome;
	private String email;
}
