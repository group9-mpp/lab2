package lesson2.labs.prob4;

public class StudentSectionFactory {

	public static Section createSection(int secNum, String courseName) {
		return new Section(secNum, courseName);
	}

	public static Student createStudent(String id, String name) {
		return new Student(id, name);
	}

	public static void newTranscriptEntry(Student s, Section sect, String grade) {

		if (s == null) {
			throw new NullPointerException("student can't be null");
		}
		if (sect == null) {
			throw new NullPointerException("section can't be null");
		}

		var transcript = new TranscriptEntry(s, sect, grade);
		s.addGrade(transcript);
		sect.addGradeSheet(transcript);
	}

}
