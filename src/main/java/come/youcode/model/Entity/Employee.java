package come.youcode.model.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private Date hireDate;


    @OneToMany(mappedBy = "assignedEmployee")
    private List<Equipment> assignedEquipment;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "assignedEmployee")
    private List<Task> assignedTasks;


}
