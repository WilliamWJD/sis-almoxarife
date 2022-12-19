package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.dto.employee.EmployeeInputDto;
import com.sisalmoxarife.backend.dto.employee.EmployeeResponseDto;
import com.sisalmoxarife.backend.mapper.EmployeeMapper;
import com.sisalmoxarife.backend.repositories.EmployeeRepository;
import com.sisalmoxarife.backend.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeResponseDto saveEmployee(final EmployeeInputDto employeeInput) {
        return employeeMapper.mapperEntityForEmployeeResponseDto(employeeRepository.save(employeeMapper.mapperDtoForEntity(employeeInput)));
    }
}
