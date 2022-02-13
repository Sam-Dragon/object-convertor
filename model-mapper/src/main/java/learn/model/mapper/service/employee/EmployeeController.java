package learn.model.mapper.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.model.mapper.service.employee.model.Employee;
import learn.model.mapper.service.employee.model.EmployeeRequestDto;
import learn.model.mapper.service.employee.model.EmployeeResponseDto;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping
	public Employee addEmployee(@RequestBody EmployeeRequestDto employeeRequest) {
		return service.addEmployee(employeeRequest);
	}

	@GetMapping
	public List<EmployeeResponseDto> getEmployees() {
		return service.getEmployees();
	}
}
