package lesson.labs.prob4;

import java.util.*;

public class Student {
	private String name;
	private String id;
	private List<TranscriptEntry> grades = new ArrayList<TranscriptEntry>();
	
	public Transcript getTranscript() {
		return new Transcript(grades);
		
	}

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public List<TranscriptEntry> getGrades() {
		return grades;
	}


	
	
	
}
