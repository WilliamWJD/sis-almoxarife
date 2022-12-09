package com.sisalmoxarife.backend.resources;

import com.sisalmoxarife.backend.dto.employee.EmployeeInputDto;
import com.sisalmoxarife.backend.dto.employee.EmployeeResponseDto;
import com.sisalmoxarife.backend.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> saveEmployee(@RequestBody final EmployeeInputDto employeeInputDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.saveEmployee(employeeInputDto));
    }
}
