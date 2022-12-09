package com.sisalmoxarife.backend.services.impl;

import com.sisalmoxarife.backend.dto.employee.EmployeeInputDto;
import com.sisalmoxarife.backend.dto.employee.EmployeeResponseDto;
import com.sisalmoxarife.backend.mapper.EmployeeMapper;
import com.sisalmoxarife.backend.repositories.EmployeeRepository;
import com.sisalmoxarife.backend.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public EmployeeResponseDto saveEmployee(EmployeeInputDto employeeInput) {
        return employeeMapper.mapperEntityForEmployeeResponseDto(employeeRepository.save(employeeMapper.mapperDtoForEntity(employeeInput)));
    }
}
