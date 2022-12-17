package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.domain.User;
import com.sisalmoxarife.backend.dto.user.InputUserDto;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import com.sisalmoxarife.backend.mapper.UserMapper;
import com.sisalmoxarife.backend.repositories.UserRepository;
import com.sisalmoxarife.backend.services.UserService;
import com.sisalmoxarife.backend.services.exception.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public ResponseUserDto findUserById(Integer userId) {
        return mapper.mapperEntityForResponseUserDto(userRepository.findById(userId).orElseThrow(()-> new NoSuchElementException("User not found")));
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
