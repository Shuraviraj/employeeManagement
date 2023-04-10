package raj.ravi.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import raj.ravi.employee.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
