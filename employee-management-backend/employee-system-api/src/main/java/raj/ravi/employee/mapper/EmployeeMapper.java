package raj.ravi.employee.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import raj.ravi.employee.entity.EmployeeEntity;
import raj.ravi.employee.model.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(target = "id", ignore = true)
    EmployeeEntity mapToEntity(Employee employee);

    Employee mapToEmployee(EmployeeEntity savedEmployee);
}
