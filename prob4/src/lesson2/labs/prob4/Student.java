package lesson2.labs.prob4;

import java.util.*;

public class Student {
	private String name;
	private String id;

	private List<TranscriptEntry> grades;

	Student(String id, String name) {
		this.name = name;
		this.id = id;
		grades = new ArrayList<TranscriptEntry>();
	}

	public Transcript getTranscript() {
		return new Transcript(grades);

	}

	public List<TranscriptEntry> getGrades() {
		return grades;
	}

	 
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected void addGrade(TranscriptEntry transcript) {
		grades.add(transcript);
	}

}
