package com.training.ui;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.training.bean1.Gender;
import com.training.bean1.Student;

public class StudentReportMain {

	public static void main(String[] args) {
		List<Student> students=new LinkedList<>();
		Student s1=new Student(2501, "Kalpana", Gender.FEMALE, 88.0, "ECE");
		Student s2=new Student(2502, "Meghna", Gender.FEMALE, 72.0, "IT");
		Student s3=new Student(2503, "Aravind", Gender.MALE, 68.0, "CSE");
		Student s4=new Student(2504, "Rahul", Gender.MALE, 91.0, "IT");
		Student s5=new Student(2505, "Mohan", Gender.MALE, 81.0, "ECE");
		Student s6=new Student(2506, "Poojitha", Gender.FEMALE, 74.0, "CSE");
		
		Collections.addAll(students, s1,s2,s3,s4,s5,s6);
		
		// your code here

	}

}
