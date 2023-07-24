package com.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.training.bean1.Gender;
import com.training.bean1.Person;
import com.training.bean1.PhoneCaller;

public class PhoneCallAppMain {
	
	private static List<Person> gatherPersons(){
		List<Person> personList=new ArrayList<>();
		Person p1=new Person("Rahul", 24, Gender.MALE, "Rahul@yahoomail.com", "9156466677", "Mumbai");
		Person p2=new Person("David", 33, Gender.MALE, "david@gmail.com", "9671245677", "Pune");
		Person p3=new Person("Payal", 16, Gender.FEMALE, "Payal1989@hotmail.com", "8912224321",  "Bangalore");
		Person p4=new Person("John", 28, Gender.MALE, "John@gmail.com", "7712377451", "Mumbai");
		Person p5=new Person("Karthick", 30, Gender.MALE, "Karthick1998@gmail.com", "8178599999", "Pune");
		Person p6=new Person("Meghala", 17, Gender.FEMALE, "Meghala1989@hotmail.com", "9378912654",  "Bangalore");
		Person p7=new Person("Victor", 26, Gender.MALE, "Victor@yahoomail.com", "8019043215", "Mumbai");
		Person p8=new Person("Utkarsh", 29, Gender.MALE, "Utkarsh@gmail.com", "8877661231", "Pune");
		Person p9=new Person("Palak", 17, Gender.FEMALE, "Palak_kr@hotmail.com", "9465790908",  "Bangalore");
		Person p10=new Person("Sravya", 22, Gender.FEMALE, "Sravya_ap@gmail.com", "7134590308", "Mumbai");
		
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		return personList;
	}
	
	static void callElgibleDrivers() {
		List<Person> personList=gatherPersons();
		for(Person person: personList) {
			if(person.getAge()>16) {
				PhoneCaller.makeCall(person.getPhone());
			}
		}
	}
	
	static void callElgibleVoters() {
		List<Person> personList=gatherPersons();
		for(Person person: personList) {
			if(person.getAge()>18) {
				PhoneCaller.makeCall(person.getPhone());
			}
		}
	}
	
	static void callMalePersons() {
		List<Person> personList=gatherPersons();
		for(Person person: personList) {
			if(person.getGender()==Gender.MALE) {
				PhoneCaller.makeCall(person.getPhone());
			}
		}
	}
	
	static void callFemalePersons() {
		List<Person> personList=gatherPersons();
		for(Person person: personList) {
			if(person.getGender()==Gender.FEMALE) {
				PhoneCaller.makeCall(person.getPhone());
			}
		}
	}
	
	static void callMaleVoters() {
		List<Person> personList=gatherPersons();
		for(Person person: personList) {
			if(person.getGender()==Gender.MALE ) {
				if(person.getAge()>21)
					PhoneCaller.makeCall(person.getPhone());
			}
		}
	}
	
	static void callFemaleVoters() {
		List<Person> personList=gatherPersons();
		for(Person person: personList) {
			if(person.getGender()==Gender.FEMALE ) {
				if(person.getAge()>21)
					PhoneCaller.makeCall(person.getPhone());
			}
		}
	}
	

	public static void main(String[] args) {
		callElgibleDrivers();

	}

}
 