package com.test.java.collection;

class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;
	

	
	// 계산된 값
	// 3가지 변수만 있으면 언제든 만들 수 있는 값
	// 3가지 변수 중에 일부가 바뀌면 다시 계산해야 하므로 잘 저장하지 않는다.
	// 그래서 만드는 사람이 있고, 안 만드는 사람이 있다. > 잘 안 만든다.
	// private int total;
	// private double avg;
	
	
	// 생성자 만들기 (field)
	public Student(String name, int kor, int eng, int math) {
		// super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
}
