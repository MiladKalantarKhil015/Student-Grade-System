public class Course {
	private String courseName;
	private int courseCode;
	private String teacherName;

	// public Course(String courseName, int courseCode, String teacherName) {
	// this.courseName = courseName;
	// this.courseCode = courseCode;
	// this.teacherName = teacherName;
	// }

	public void printCourseDetails() {
		System.out.println("Course: " + courseName + "\nCourseCode: " + courseCode + "\nTeacher: " + teacherName);
	}

	public String getCourseName() {
		return this.courseName;
	}

	public int getCourseCode() {
		return this.courseCode;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public void setTeacherName(String name) {
		this.teacherName = name;
	}

}
