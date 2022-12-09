package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.mapper.UserMapper;
import com.sisalmoxarife.backend.repositories.UserRepository;
import com.sisalmoxarife.backend.services.UserService;
import com.sisalmoxarife.backend.dto.user.InputUserDto;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper mapper;

    @Override
    public ResponseUserDto saveUser(final InputUserDto inputUserDto) {
        return mapper.mapperEntityForResponseUserDto(userRepository.save(mapper.mapperDtoForEntity(inputUserDto)));
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
