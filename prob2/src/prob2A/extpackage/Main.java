package prob2A.extpackage;

import prob2A.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("Group 9");
		GradeReport gradeReport = student.getGradeReport();
		
		gradeReport.setGrade("A+");
		
		System.out.println(student  + " " + gradeReport );

	}

}
