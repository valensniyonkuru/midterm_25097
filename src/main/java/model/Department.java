// Department.java
package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId; // Changed type to Long for auto-generation
    private String departmentName;
    
    @OneToMany(mappedBy = "department")
    private List<StudentRegistration> registrations;

    // Constructors
    public Department() {
    }

    public Department(String departmentName, List<StudentRegistration> registrations) {
        this.departmentName = departmentName;
        this.registrations = registrations;
    }

    // Getters and setters
    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<StudentRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<StudentRegistration> registrations) {
        this.registrations = registrations;
    }
}
