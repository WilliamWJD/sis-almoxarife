package com.sisalmoxarife.backend.services;

import com.sisalmoxarife.backend.usuario.dto.InputUserDto;
import com.sisalmoxarife.backend.usuario.dto.ResponseUserDto;

public interface UserService {
	ResponseUserDto saveUser(final InputUserDto inputUser);
	void deleteUser(final Integer id);
}
