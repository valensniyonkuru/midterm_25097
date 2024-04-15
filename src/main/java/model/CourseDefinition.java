package model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CourseDefinition")
public class CourseDefinition {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String courseDefinitionId;
    private String courseCode;
    private String courseName;
    private Semester semester;
    private Department department; // Many-to-one relationship with Department
    private String courseDefinitionCode;
    private String courseDefinitionDescription;

    // Constructors
    public CourseDefinition() {
    }

	public CourseDefinition(String courseDefinitionId, String courseCode, String courseName, Semester semester,
			Department department, String courseDefinitionCode, String courseDefinitionDescription) {
		super();
		this.courseDefinitionId = courseDefinitionId;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.semester = semester;
		this.department = department;
		this.courseDefinitionCode = courseDefinitionCode;
		this.courseDefinitionDescription = courseDefinitionDescription;
	}

	public String getCourseDefinitionId() {
		return courseDefinitionId;
	}

	public void setCourseDefinitionId(String courseDefinitionId) {
		this.courseDefinitionId = courseDefinitionId;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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

	public String getCourseDefinitionCode() {
		return courseDefinitionCode;
	}

	public void setCourseDefinitionCode(String courseDefinitionCode) {
		this.courseDefinitionCode = courseDefinitionCode;
	}

	public String getCourseDefinitionDescription() {
		return courseDefinitionDescription;
	}

	public void setCourseDefinitionDescription(String courseDefinitionDescription) {
		this.courseDefinitionDescription = courseDefinitionDescription;
	}

   
}
