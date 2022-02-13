package learn.model.mapper.service.employee;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.model.mapper.service.employee.model.Employee;
import learn.model.mapper.service.employee.model.EmployeeRequestDto;
import learn.model.mapper.service.employee.model.EmployeeResponseDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public Employee addEmployee(EmployeeRequestDto employeeRequest) {
		// Converts Employee Request -> Employee
		Employee copyEmployeeRequestToEmployee = mapper.map(employeeRequest, Employee.class);
		System.out.println("Employee Object :: " + copyEmployeeRequestToEmployee);

		return repository.save(copyEmployeeRequestToEmployee);
	}

	@Override
	public List<EmployeeResponseDto> getEmployees() {
		List<Employee> employees = repository.findAll();

		// Converts Employee -> Employee Response
		Function<Employee, EmployeeResponseDto> copyEmployeeToEmployeeResponse = employee -> mapper.map(employee,
				EmployeeResponseDto.class);

		return employees.stream().map(copyEmployeeToEmployeeResponse).collect(Collectors.toList());

	}
}
