package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.dto.user.InputUserDto;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import com.sisalmoxarife.backend.mapper.UserMapper;
import com.sisalmoxarife.backend.repositories.UserRepository;
import com.sisalmoxarife.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper mapper;

    @Override
    public ResponseUserDto saveUser(final InputUserDto inputUserDto) {
        return mapper.mapperEntityForResponseUserDto(userRepository.save(mapper.mapperDtoForEntity(inputUserDto)));
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
