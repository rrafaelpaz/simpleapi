package au.com.simpleapi.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name;
	private String lastName;
	private int age;
	
	public Person(String name, String lastName, int age){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	public Person(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
