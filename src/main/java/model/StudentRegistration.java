// StudentRegistration.java
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "StudentRegistration")
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId; // Changed type to Long for auto-generation
    private String registrationCode;
    private Timestamp registrationDate;
    
    @ManyToOne
    private Student student;
    
    @ManyToOne
    private Semester semester;
    
    @ManyToOne
    private Department department;

    // Constructors
    public StudentRegistration() {
    }

    public StudentRegistration(String registrationCode, Timestamp registrationDate,
            Student student, Semester semester, Department department) {
        this.registrationCode = registrationCode;
        this.registrationDate = registrationDate;
        this.student = student;
        this.semester = semester;
        this.department = department;
    }

    // Getters and setters
    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
