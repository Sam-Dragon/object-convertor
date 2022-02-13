package learn.model.mapper.service.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import learn.model.mapper.service.employee.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	public List<Employee> findAll();
}
