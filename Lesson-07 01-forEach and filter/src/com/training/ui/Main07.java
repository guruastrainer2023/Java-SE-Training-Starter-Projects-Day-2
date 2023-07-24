package com.training.ui;

import java.util.List;
import java.util.function.Predicate;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main07 {

	public static void main(String[] args) {
	
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		Predicate<Employee> predicate1=(e)-> e.getGender()==Gender.MALE;
		Predicate<Employee> predicate2=(e)-> e.getBasicSalary()>15000.00;
		
		/*employeeList.stream()
			.filter(predicate1)
			.filter(predicate2)
			.forEach((e)-> System.out.println(e));
			*/
	}

}
