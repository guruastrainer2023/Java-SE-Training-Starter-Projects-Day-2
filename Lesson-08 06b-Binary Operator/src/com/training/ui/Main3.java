package com.training.ui;

import java.time.LocalDate;
import java.util.function.BiConsumer;

import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Student;

public class Main3 {

	public static void main(String[] args) {
		
		/*BiConsumer<String, Integer> consumer1;
		consumer1=(String s, Integer n)->{
			
			String str="";
			for(int i=1; i<=n; i++)
				str=str+"-"+s;
			
			System.out.println(str);
		};
		
		consumer1.accept("hello", 5);
		
		BiConsumer<Student, Employee> consumer2;
		consumer2=(Student s, Employee e)->{
			System.out.println(s.getAverageMark() + e.getBasicSalary());
		};
		
		Student student=new Student(101,"Rahul", Gender.MALE, 50.0, "ME");
		Employee employee=new Employee(1011, "John", 'A', LocalDate.now(), 4000.00, Gender.MALE);
		
		consumer2.accept(student, employee);
		*/
		

	}

}
