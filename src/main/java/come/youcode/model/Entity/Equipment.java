package come.youcode.model.Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private Date purchaseDate;
    private Date maintenanceDate;
    private String status;


    @ManyToOne
    private Employee assignedEmployee;
}
