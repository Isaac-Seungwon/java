package com.test.java.obj;

public class Person {

	private String name;	// 이름
	private int age;		// 나이
	private String gender;	// 성별
	
	// 관계 형성
	private Person father;	// 아빠
	private Person mother;	// 엄마
	
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String info() {
		String txt = "";
		
		txt += "아빠: " + this.father.getName() + "\n";
		txt += "엄마: " + this.mother.getName() + "\n";
		txt += "본인: " + this.getName() + "\n";
		
		return txt;
	}
}
