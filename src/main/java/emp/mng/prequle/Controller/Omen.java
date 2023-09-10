package emp.mng.prequle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import emp.mng.prequle.Service.EmpService;
import emp.mng.prequle.entity.Employee;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Omen {
    @Autowired
    EmpService service;
    @RequestMapping(value = "/emp/save",method = RequestMethod.PUT)
    public void SaveData(@RequestParam("id") String id,@RequestParam("f_name") String f_name,@RequestParam("l_name") String l_name,@RequestParam("phno") String phno,@RequestParam("email") String email){
        Employee xmp = new Employee(id, f_name, l_name, phno, email);
        service.savedata(xmp);
    }
    @RequestMapping(value = "/emp/getdata",method = RequestMethod.GET)
    public List<Employee> getData(HttpServletResponse response,HttpServletResponse request){
    	response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
        return service.getData();
    }
    @RequestMapping(value = "/emp/update",method = RequestMethod.DELETE)
    public void UpdateData(@RequestParam("id") String id,@RequestParam("phno") String phno,@RequestParam("email") String email){
        Employee xmp = service.getDatabyID(id);
        xmp.setEmail(email);
        xmp.setPhno(phno);
        service.updateData(xmp);
    }
    @RequestMapping(value = "/emp/delete",method = RequestMethod.POST)
    public void deleteData(@RequestParam("id") String id){
        Employee empx = new Employee();
        empx.setEmp_id(id);
        service.deleteData(empx);
    }
}
