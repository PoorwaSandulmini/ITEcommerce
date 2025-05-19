package lk.ac.vau.fas.ict.model;

public class Course {
	  private int CourseId;
	  private String CoursName;
	public Course(int courseId, String coursName) {
		super();
		CourseId = courseId;
		CoursName = coursName;
	}
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCoursName() {
		return CoursName;
	}
	public void setCoursName(String coursName) {
		CoursName = coursName;
	}
	  
	  

}
