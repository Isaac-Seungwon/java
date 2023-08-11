package com.test.java.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Random;

public class Ex72_Lambda {

	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\성적.dat";
	
	public static void main(String[] args) {
		
		// Ex72_Lambda
		
		/*
			람다식, Lambda Expression
			- 함수형 프로그래밍에 지원해왔던 기술이다.
			- 컬렉션 조작(=스트림)을 위해서 자바에 도입되었다.
			- 기존에 하던 작업을 더욱 편리하고 관리하게 쉽게 만들어준다.
			- 람다식을 사용하면 코드가 간결해진다.
			- 람다식은 자바 메소드의 다른(간결한) 표현이다.
			- 람다식은 매개변수를 가지는 코드블럭이다. (=메소드)
			- 자바에서는 람다식을 쓰고 싶으면 람다식을 추측하기 위한 인터페이스가 필요하다. (자바 람다식의 한계이자 특징)
				- 자바의 람다식은 인터페이스를 사용해서 만든다.
			
			
			람다식 형식
			- 인터페이스 변수 = 람다식;
				- ex) MyInterface m1 = () -> {};
				- 인터페이스 변수를 만들고, 거기에 람다식을 저장할 수 있다.
			
			
			- (매개변수) -> {실행코드}
				- 실행 과정은 다르지만, 람다식은 겉으로 보기에 메소드를 표현하는 다른 방식으로 생각할 수 있다.
				- a. (매개변수): 메소드의 매개변수 리스트와 동일하다.
				- b. ->: 화살표(Arror): 코드블럭을 호출하는 역할을 한다.
				- c. {실행코드}: 메소드의 구현부와 동일하다.
				
		*/
		
		// m1();
		m2();
		m3();
		
	}

	private static void m3() {

		// 1. 파일 읽기
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE));
			ArrayList<Student> list = new ArrayList<Student>();
			String line = null;
			
			
			while ((line = reader.readLine()) != null) {
				
				// System.out.println(line);
				// 텍스트 1줄 > Student 객체 1개
				// 홍길동,47,61,73
				
				String[] temp = line.split(",");
				
				Student s = new Student(
								temp[0],
								Integer.parseInt(temp[1]),
								Integer.parseInt(temp[2]),
								Integer.parseInt(temp[3])
							);
				list.add(s);
			}
				
			System.out.println(list);
			System.out.println();
			
			
			// 성적순 > 정렬
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o2.getTotal() - o1.getTotal();
				}
			});
			
			for (Student s : list) {
				System.out.println(s.getName() + ":" + s.getTotal());
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("at Ex72_Lambda.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {

		// 람다식 활용 == 익명 클래스(객체) 활용

		// Math.random() // 0 ~ 1 > 실수 난수
		Random rnd = new Random();
		
		System.out.println(rnd.nextInt(10)); // 0~9
		
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			nums.add(rnd.nextInt(10) + 1);
		}
		System.out.println(nums); // [3, 10, 1, 8, 4, 10, 1, 2, 8, 4]
		
		// 익명 클래스 활용
		nums.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println(nums); // [1, 1, 2, 3, 4, 4, 8, 8, 10, 10]
		
		// 람다식 활용
		nums.sort((Integer o1, Integer o2) -> {
			return o1 - o2;
		});
		
		nums.sort((o1, o2) -> o1 - o2);
		System.out.println(nums); // [1, 1, 2, 3, 4, 4, 8, 8, 10, 10]
		
	}

	private static void m1() {
		// 요구사항) MyInterface를 구현한 객체를 1개 만드시오.
		
		// 실명 클래스에서 구현
		MyInterface m1 = new MyClass();
		m1.test(); // 실명 클래스에서 구현한 메소드
		
		
		// 익명 클래스에서 구현
		MyInterface m2 = new MyInterface() {
			@Override
			public void test() {
				System.out.println("익명 클래스에서 구현한 메소드");
			}
		};
		m2.test(); // 익명 클래스에서 구현한 메소드
		
		
		// 람다식에서 구현
		MyInterface m3 = ()->{
			System.out.println("람다식에서 구현한 메소드");
		};
		m3.test(); // 람다식에서 구현한 메소드
		
		// 인터페이스를 선언하는 것부터 클래스를 만들기 위한 구문이 없더라도 MyInterface만 알고 있으면 컴파일러가 추측하도록 할 수 있다.
		// 람다식은 익명 객체를 편하게 만드는 표현식이라고 할 수 있다.
		
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call(); // pr2
		
		
		// NoParameterNoReturn pr3 = () -> { System.out.println("pr3") };
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		// 람다식은 코드를 쉽게 만들려고 쓰는 것이다. 그래서 한 줄일 때에는 무조건 안 적는다.

		parameterNoReturn pr4 = (int num) -> {
			System.out.println(num);
		};
		pr4.call(100); // 100
		pr4.call(200); // 200
		pr4.call(300); // 300
		
		
		// *** 매개변수의 자료형 생략할 수 있다.
		parameterNoReturn pr5 = (num) -> System.out.println(num);
		// parameterNoReturn <- 이걸 알면 자료형을 충분히 추측할 수 있기 때문이다.
		pr5.call(400); // 400
		pr5.call(500); // 500
		
		
		// *** 매개변수의 ()를 생략할 수 있다.
		// 줄일 수 있는 최대한 줄인 것
		parameterNoReturn pr6 = num -> System.out.println(num);
		pr6.call(600); // 600
		pr6.call(700); // 700
		
		
		MultiParameterNoReturn pr7 = (String name, int age) -> {
			System.out.println(name + "," + age);
		};
		pr7.call("Isaac", 24); // Isaac,24
		
		
		// MultiParameterNoReturn pr8 = name, age -> System.out.println(name + "," + age);
		MultiParameterNoReturn pr8 = (name, age) -> System.out.println(name + "," + age);
		// 매개변수의 소괄호는 매개변수가 1개일 때만 생략할 수 있다.
		pr8.call("Sopia", 25); // Sopia,25
		
		
		NoParameterReturn pr9 = () -> {
			return 100;
		};
		System.out.println(pr9.call()); // 100
		
		
		// NoParameterReturn pr10 = () -> return 100; 
		NoParameterReturn pr10 = () -> 100; 
		// return문이 하나만 있을 때에는 return문 마저 생략을 해야 한다.
		System.out.println(pr10.call());
		
		
		parameterReturn pr11 = name -> name.length();
		System.out.println(pr11.call("Isaac"));
	}
}

interface MyInterface {
	void test();
}

class MyClass implements MyInterface{
	@Override
	public void test() {
		System.out.println("실명 클래스에서 구현한 메소드");
	}
}


// 파라미터도 없고 리턴도 없는 경우
interface NoParameterNoReturn {
	void call();
}

interface parameterNoReturn {
	void call(int num);
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface NoParameterReturn {
	int call();
}

// 파라미터도 있고 리턴도 있는 경우
interface parameterReturn {
	int call(String name);
}



class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 생성자
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return this.kor + this.eng + this.math;
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
