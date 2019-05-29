package prob2A;

public class GradeReport {
	
	private String grade;
	private Student student;

	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	//package level
	GradeReport(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return " grade : " + grade;
	}
	
	
	

}
