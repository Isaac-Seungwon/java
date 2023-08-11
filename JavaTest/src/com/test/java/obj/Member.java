package com.test.java.obj;

public class Member {

	private String id;
	private String pw;
	private String name;
	private int lv;
	
	// 생성자 vs Setter
	// 1. 생성자 > 초기화 역할
	// 2. Setter > 초기화 이후 수정하는 역할
	
	/*
	public Member(String id, String pw, String name, int lv) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.lv = lv;
	}
	*/
	
	// 생성자, Constructor
	// 이클립스 기능 > Source > Generate Constructor using fields
	public Member(String id, String pw, String name, int lv) {
		// super(); 상속을 할 때 언급
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.lv = lv;
	}
	
	// Dump Method
	public String info() {
		return String.format("아이디(%s), 암호(%s), 이름(%s), 등급(%d)"
							, this.id
							, this.pw
							, this.name
							, this.lv);
	}

}
