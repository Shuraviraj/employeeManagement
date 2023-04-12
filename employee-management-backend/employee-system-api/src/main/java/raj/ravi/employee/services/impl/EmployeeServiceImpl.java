package raj.ravi.employee.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import raj.ravi.employee.mapper.EmployeeMapper;
import raj.ravi.employee.model.Employee;
import raj.ravi.employee.repository.EmployeeRepository;
import raj.ravi.employee.services.EmployeeService;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeMapper employeeMapper;

    @Override
    @Transactional
    public Employee createEmployee(Employee employee) {
        var employeeEntity = employeeMapper.mapToEntity(employee);
        var savedEmployee = employeeRepository.save(employeeEntity);
        return employeeMapper.mapToEmployee(savedEmployee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        var employees = employeeRepository.findAll();
        return employees.stream()
                .map(employeeMapper::mapToEmployee)
                .toList();
    }
}
