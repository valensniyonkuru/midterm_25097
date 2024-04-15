package model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "AcademicUnit")
public class AcademicUnit {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String academicId;
    private String academicCode;
    private String academicName;
    private EAcademicUnit type;
    private String parentId;
    private List<AcademicUnit> childUnits; // Recursive one-to-many relationship with itself
    private List<Teacher> teachers;

    // Constructors
    public AcademicUnit() {
    }

	public AcademicUnit(String academicId, String academicCode, String academicName, EAcademicUnit type,
			String parentId, List<AcademicUnit> childUnits, List<Teacher> teachers) {
		super();
		this.academicId = academicId;
		this.academicCode = academicCode;
		this.academicName = academicName;
		this.type = type;
		this.parentId = parentId;
		this.childUnits = childUnits;
		this.teachers = teachers;
	}

	public String getAcademicId() {
		return academicId;
	}

	public void setAcademicId(String academicId) {
		this.academicId = academicId;
	}

	public String getAcademicCode() {
		return academicCode;
	}

	public void setAcademicCode(String academicCode) {
		this.academicCode = academicCode;
	}

	public String getAcademicName() {
		return academicName;
	}

	public void setAcademicName(String academicName) {
		this.academicName = academicName;
	}

	public EAcademicUnit getType() {
		return type;
	}

	public void setType(EAcademicUnit type) {
		this.type = type;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public List<AcademicUnit> getChildUnits() {
		return childUnits;
	}

	public void setChildUnits(List<AcademicUnit> childUnits) {
		this.childUnits = childUnits;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

   
}
