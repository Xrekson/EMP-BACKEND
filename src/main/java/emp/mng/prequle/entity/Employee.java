package emp.mng.prequle.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee{
    @Id
    @Column(length = 10)
    String emp_id;
    @Column(length = 20)
    String f_name;
    @Column(length = 20)
    String l_name;
    @Column(length = 10)
    String phno;
    @Column(length = 50)
    String email;
}