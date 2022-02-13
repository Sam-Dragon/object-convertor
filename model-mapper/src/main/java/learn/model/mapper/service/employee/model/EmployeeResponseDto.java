package learn.model.mapper.service.employee.model;

import lombok.Data;

@Data
public class EmployeeResponseDto {

	private Long id;
	private String name;
	private String address;
	private Integer age;
	private Character gender;
	private Boolean isReferred;
}
