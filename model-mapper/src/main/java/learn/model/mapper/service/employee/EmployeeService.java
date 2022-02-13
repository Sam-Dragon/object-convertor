package learn.model.mapper.service.employee;

import java.util.List;

import learn.model.mapper.service.employee.model.Employee;
import learn.model.mapper.service.employee.model.EmployeeRequestDto;
import learn.model.mapper.service.employee.model.EmployeeResponseDto;

public interface EmployeeService {

	public Employee addEmployee(EmployeeRequestDto employeeRequest);

	public List<EmployeeResponseDto> getEmployees();
}
