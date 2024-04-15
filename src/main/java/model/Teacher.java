package model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    
    private String teacherId;
    private String firstName;
    private String lastName;
    private EQualification qualification;
    
    @ManyToMany
    @JoinTable(
        name = "Teacher_Course",
        joinColumns = @JoinColumn(name = "teacher_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String teacherId, String firstName, String lastName, EQualification qualification,
			List<Course> courses) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.qualification = qualification;
		this.courses = courses;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
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

	public EQualification getQualification() {
		return qualification;
	}

	public void setQualification(EQualification qualification) {
		this.qualification = qualification;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	
	
    
}
