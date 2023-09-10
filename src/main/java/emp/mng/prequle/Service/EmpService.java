package emp.mng.prequle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emp.mng.prequle.Repository.EmpRepo;
import emp.mng.prequle.entity.Employee;

@Service
public class EmpService {
    @Autowired
    EmpRepo repo;
    public List<Employee> getData(){
        return repo.findAll();
    }
    public Employee getDatabyID(String id){
        return repo.findById(id).get();
    }
    public void savedata(Employee input){
        repo.save(input);
    }
    public void updateData(Employee input){
        Employee data = repo.findById(input.getEmp_id()).get();
        data.setEmail(input.getEmail());
        data.setPhno(input.getPhno());
        repo.save(data);
    }
    public void deleteData(Employee input){
        Employee data = repo.findById(input.getEmp_id()).get();
        repo.delete(data);
    }
}
