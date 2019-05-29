package lesson.labs.prob4;

public class StudentSectionFactory {
	
	
	public Section createSection(int secNum, String courseName) {
		return new Section(courseName,secNum);
	}
	public Student createStudent(String id, String name) {
		return new Student(name, id);
	}
	public void newTranscriptEntry(Student s, Section sect, String grade) {
		if(s == null) {
			throw new NullPointerException("student can't be null");
		}
		if(sect == null ) {
			throw new NullPointerException("section can't be null");
		}
		TranscriptEntry trascEntry = new TranscriptEntry( s,  sect,  grade,s.getTranscript());
		s.getGrades().add(trascEntry);
		sect.getGradeSheet().add(trascEntry);
		
		
		
		
	}

}
