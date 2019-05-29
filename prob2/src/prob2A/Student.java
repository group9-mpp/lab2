package prob2A;

// Student owns the relationship with Grade Report
public class Student {

	private String name;
	private GradeReport gradeReport;

	public Student(String name) {
		this.name = name;
		gradeReport = new GradeReport(this);
	}

	public String getName() {
		return name;
	}

	public GradeReport getGradeReport() {
		return gradeReport;
	}

	@Override
	public String toString() {
		return "Student " + name;
	}
	
	

}
