package emp.mng.prequle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import emp.mng.prequle.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, String> {
    
}
