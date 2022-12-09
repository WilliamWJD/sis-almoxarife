package com.sisalmoxarife.backend.dto.employee;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInputDto {
    private Integer id;
    private String name;
    private String cpf;
    private String email;
}
