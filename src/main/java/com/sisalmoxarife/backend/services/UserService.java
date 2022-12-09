package com.sisalmoxarife.backend.services;

import com.sisalmoxarife.backend.dto.user.InputUserDto;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;

public interface UserService {
	ResponseUserDto saveUser(final InputUserDto inputUser);
	void deleteUser(final Integer id);
}
