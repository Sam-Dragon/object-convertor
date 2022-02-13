package learn.model.mapper.service.employee;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import learn.model.mapper.service.employee.model.Employee;

@Component
public class EmployeeInit {

	@Autowired
	private EmployeeRepository repository;

	@PostConstruct
	public void defaultEmployees() {
		repository.saveAll(Arrays.asList(new Employee(1L, "Ramesh", "Admin Address", 32, 'M', true),
				new Employee(2L, "Suresh", "Finance Address", 30, 'F', false),
				new Employee(3L, "Murgesh", "IT Address", 35, 'F', true)));
	}
}
