package com.test.java.obj;

public class Ex40_Class {

	public static void main(String[] args) {

		// Ex40_Class.java

		// Person.java

		Person isaac = new Person();
		
		isaac.setName("Isaac");
		isaac.setAge(20);
		isaac.setGender("남자");
		
		Person father = new Person();
		
		father.setName("Lee");
		father.setAge(50);
		father.setGender("남자");
		
		Person mother = new Person();
		
		mother.setName("Park");
		mother.setAge(48);
		mother.setGender("여자");
		
		isaac.setFather(father);
		isaac.setMother(mother);
		
		System.out.println(isaac.info());
		
		// ***** java.lang.NullPointerException
		// System.out.println(father.info());
	}
}
