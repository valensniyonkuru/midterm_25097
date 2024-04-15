package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.protobuf.Timestamp;

@Entity
@Table(name = "Semester")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String semesterId;
    private String semesterName;
    private Timestamp startingDate;
    private Timestamp endDate;
    
    @OneToMany(mappedBy = "semester")
    private List<StudentRegistration> registrations; // One-to-many relationship with StudentRegistration

    // Constructors
    public Semester() {
    }

    public Semester(String semesterId, String semesterName, Timestamp startingDate, Timestamp endDate,
            List<StudentRegistration> registrations) {
        super();
        this.semesterId = semesterId;
        this.semesterName = semesterName;
        this.startingDate = startingDate;
        this.endDate = endDate;
        this.registrations = registrations;
    }

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public Timestamp getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Timestamp startingDate) {
        this.startingDate = startingDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public List<StudentRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<StudentRegistration> registrations) {
        this.registrations = registrations;
    }
}
