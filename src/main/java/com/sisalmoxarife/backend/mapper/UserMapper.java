package com.sisalmoxarife.backend.mapper;

import com.sisalmoxarife.backend.domain.User;
import com.sisalmoxarife.backend.dto.user.InputUserDto;
import com.sisalmoxarife.backend.dto.user.ResponseUserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User mapperDtoForEntity(final InputUserDto dto) {
        User entity = new User();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        return entity;
    }

    public ResponseUserDto mapperEntityForResponseUserDto(final User entity) {
        ResponseUserDto responseUserDto = new ResponseUserDto();
        responseUserDto.setId(entity.getId());
        responseUserDto.setName(entity.getName());
        responseUserDto.setEmail(entity.getEmail());
        return responseUserDto;
    }
}
