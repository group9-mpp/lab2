package lesson.labs.prob4;

 public class TranscriptEntry {
	private Student student;
	private Section section;
	private String grade;
	private Transcript transcript;

	
	
	
	public TranscriptEntry(Student student, Section section, String grade,Transcript transcript) {
		this.student = student;
		this.section = section;
		this.grade = grade;
		this.transcript = transcript;
	}


	public Student getStudent() {
		return student;
	}


	public Section getSection() {
		return section;
	}


	public String getGrade() {
		return grade;
	}



	public Transcript getTranscript() {
		return transcript;
	}


	public String toString() {
		return "Student: " + student.getName() + "\n"
				+ "Course name: " + section.getCourseName() + "\n"
				+ "Section number: " + section.getSectionNumber() + "\n"
				+ "Grade: " + grade + "\n";
	}
}
