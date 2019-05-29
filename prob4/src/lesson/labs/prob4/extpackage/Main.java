package lesson.labs.prob4.extpackage;
import java.util.*;


import lesson.labs.prob4.Section;
import lesson.labs.prob4.Student;
import lesson.labs.prob4.StudentSectionFactory;
import lesson.labs.prob4.Transcript;
import lesson.labs.prob4.TranscriptEntry;


/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {	
	StudentSectionFactory factory = new StudentSectionFactory();
	Student bob;
	Student tim;
	Student allen;
	Student[] students;
	Section bio1;
	Section bio2;
	Section math;
	public static void main(String[] args) { 
		Main m = new Main();
		m.readDataFromDb();
		System.out.println(m.getTranscript(m.bob));
		System.out.println("Grades for math section:\n " + m.getGrades(m.math));
		System.out.println("Courses that Tim took: " + m.getCourseNames(m.tim));
		System.out.println("Students who got A's: " + m.getStudentsWith("A"));
	}
	
	private Transcript getTranscript(Student s) {
		return s.getTranscript();
	}
	private List<String> getCourseNames(Student s) {
		List<TranscriptEntry> all = s.getGrades();
		List<String> courseNames = new ArrayList<>();
		for(TranscriptEntry te : all) {
			courseNames.add(te.getSection().getCourseName());
		}
		return courseNames;
	}
	private List<String> getGrades(Section s) {
		List<String> grades  = new ArrayList<>();
		for(TranscriptEntry t : s.getGradeSheet()) {
			grades.add(t.getGrade());
		}
		return grades;
	}
	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		for(Student s : students) {
			boolean found = false;
			for(TranscriptEntry te : s.getGrades()) {
				if(!found) {
					if(te.getGrade().equals(grade)) {
						found = true;
						studentNames.add(s.getName());
					}
				}
			}
		}
		return studentNames;
	}
	private void readDataFromDb() {
		bob = factory.createStudent("610103","Bob");
		tim = factory.createStudent("610098","Tim");
		allen = factory.createStudent("610878","Allen");
		
		
		bio1 = factory.createSection(1, "Biology");
		bio2 = factory.createSection(2, "Biology");
		math = factory.createSection(3, "Mathematics");
		
		
		
		factory.newTranscriptEntry(bob, bio1, "A");
		
		factory.newTranscriptEntry(bob, math, "B");

		factory.newTranscriptEntry(tim, bio1, "B+");
		
		factory.newTranscriptEntry(tim, math, "A-");
		
		factory.newTranscriptEntry(allen, math, "B");
		
		factory.newTranscriptEntry(allen, bio2, "B+");
		students = new Student[]{bob, tim, allen};

				
	}

}
