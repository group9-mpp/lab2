package lesson2.labs.prob4.extpackage;

import java.util.*;

import lesson2.labs.prob4.*;

/**
 * Shows how the design in this package of classes allows you to navigate in the
 * way that the class diagram suggests
 */
public class Main {

	Student bob;
	Student tim;
	Student allen;
	Student[] students;// = { bob, tim, allen };
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
		for (TranscriptEntry te : all) {
			courseNames.add(te.getSection().getCourseName());
		}
		return courseNames;
	}

	private List<String> getGrades(Section s) {
		List<String> grades = new ArrayList<>();
		for (TranscriptEntry t : s.getGradeSheet()) {
			grades.add(t.getGrade());
		}
		return grades;
	}

	private List<String> getStudentsWith(String grade) {
		List<String> studentNames = new ArrayList<>();
		for (Student s : students) {
			boolean found = false;
			for (TranscriptEntry te : s.getGrades()) {
				if (!found) {
					if (te.getGrade().equals(grade)) {
						found = true;
						studentNames.add(s.getName());
					}
				}
			}
		}
		return studentNames;
	}

	private void readDataFromDb() {
		
		bob = StudentSectionFactory.createStudent("1", "Bob");
		tim = StudentSectionFactory.createStudent("2", "Tim");
		allen = StudentSectionFactory.createStudent("3", "Allen");

		bio1 = StudentSectionFactory.createSection(1, "Biology");
		bio2 = StudentSectionFactory.createSection(2, "Biology");
		math = StudentSectionFactory.createSection(3, "Mathematics");

		StudentSectionFactory.newTranscriptEntry(bob, bio1, "A");
		StudentSectionFactory.newTranscriptEntry(bob, math, "B");
		StudentSectionFactory.newTranscriptEntry(tim, bio1, "B+");
		StudentSectionFactory.newTranscriptEntry(tim, math, "A-");
		StudentSectionFactory.newTranscriptEntry(allen, math, "B");
		StudentSectionFactory.newTranscriptEntry(allen, bio2, "B+");

		students = new Student[]{bob, tim, allen};
	}

}
