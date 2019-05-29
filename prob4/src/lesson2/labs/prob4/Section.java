package lesson2.labs.prob4;

import java.util.*;

public class Section {
	private String courseName;
	private int sectionNumber;
	private List<TranscriptEntry> gradeSheet;

	 Section(int sectionNumber, String courseName) {

		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
		this.gradeSheet = new ArrayList<TranscriptEntry>();
		
	}

	public String getCourseName() {
		return courseName;
	}

	public int getSectionNumber() {
		return sectionNumber;
	}

	public List<TranscriptEntry> getGradeSheet() {
		return gradeSheet;
	}
	
	protected void addGradeSheet(TranscriptEntry transcript) {
		gradeSheet.add(transcript);
	}
}
