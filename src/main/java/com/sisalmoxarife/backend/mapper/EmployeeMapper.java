package com.sisalmoxarife.backend.mapper;

import com.sisalmoxarife.backend.domain.Employee;
import com.sisalmoxarife.backend.dto.employee.EmployeeInputDto;
import com.sisalmoxarife.backend.dto.employee.EmployeeResponseDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public Employee mapperDtoForEntity(final EmployeeInputDto employeeInputDto){
        Employee entity = new Employee();
        entity.setName(employeeInputDto.getName());
        entity.setCpf(employeeInputDto.getCpf());
        entity.setEmail(employeeInputDto.getEmail());
        return entity;
    }

    public EmployeeResponseDto mapperEntityForEmployeeResponseDto(final Employee employee){
        EmployeeResponseDto dto = new EmployeeResponseDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setCpf(employee.getCpf());
        dto.setEmail(employee.getEmail());
        return dto;
    }
}
