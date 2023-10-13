package come.youcode.model.Entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String headOfDepartment;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
