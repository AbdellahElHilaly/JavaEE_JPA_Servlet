package come.youcode.model.Entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Date deadline;
    private String priority;
    private String status;

    @ManyToOne
    private Employee assignedEmployee;

}
