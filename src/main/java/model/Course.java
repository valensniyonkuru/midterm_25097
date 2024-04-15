package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Use an integer ID for auto-generation

    private String courseId; // Assuming this is a unique identifier for the course

    @ManyToOne
    private CourseDefinition courseDefinition; // One-to-many relationship with CourseDefinition

    // Constructors
    public Course() {
    }

    public Course(String courseId, CourseDefinition courseDefinition) {
        this.courseId = courseId;
        this.courseDefinition = courseDefinition;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public CourseDefinition getCourseDefinition() {
        return courseDefinition;
    }

    public void setCourseDefinition(CourseDefinition courseDefinition) {
        this.courseDefinition = courseDefinition;
    }
}
