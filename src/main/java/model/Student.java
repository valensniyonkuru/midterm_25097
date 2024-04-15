package model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth; // Change type to java.util.Date
    private List<StudentRegistration> registrations;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentId, String firstName, String lastName, Date dateOfBirth,
			List<StudentRegistration> registrations) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.registrations = registrations;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<StudentRegistration> getRegistrations() {
		return registrations;
	}
	public void setRegistrations(List<StudentRegistration> registrations) {
		this.registrations = registrations;
	}

   
}
