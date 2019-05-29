package lesson.labs.prob4;

import java.util.*;

public class Section {
	private String courseName;
	private int sectionNumber;
	private List<TranscriptEntry> gradeSheet = new ArrayList<TranscriptEntry>();
	public String getCourseName() {
		return courseName;
	}
	public int getSectionNumber() {
		return sectionNumber;
	}
	public List<TranscriptEntry> getGradeSheet() {
		return gradeSheet;
	}
	//package level
	Section(String courseName, int sectionNumber) {
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
	}
	
	
	
}
