package com.sisalmoxarife.backend.services;

import com.sisalmoxarife.backend.dto.employee.EmployeeInputDto;
import com.sisalmoxarife.backend.dto.employee.EmployeeResponseDto;

public interface EmployeeService {
    EmployeeResponseDto saveEmployee(final EmployeeInputDto employeeInput);
}
