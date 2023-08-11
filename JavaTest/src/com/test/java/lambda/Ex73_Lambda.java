package com.test.java.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex73_Lambda {
	
	public static void main(String[] args) {
		
		// Ex73_Lambda
		
		/*
		
			람다식 > 익명 객체의 (구현된) 추상 메소드 > 인터페이스 변수에 저장 > 람다식은 반드시 인터페이스가 필요하다!!

			함수형 인터페이스, Functional Interface
			- 람다식을 사용하기 위한 자격
			- 다른 용도(일반적인 인터페이스)로 사용하지 않는다.
			
			- 함수형 인터페이스는 2가지로 나눈다.
			- 1. 표준 API 함수형 인터페이스 > JDK에서 제공하는 것 > 압도적으로 많이 사용
			- 2. 사용자 정의 함수형 인터페이스 > 개발자가 선언한 것
		
			
			표준 API 함수형 인터페이스
			- 공통점: 추상 메소드가 1개밖에 없다.
			- 차이점: 추상 메소드의 생김새가 다르다.
			
			1. Consumer > 매개변수 O, 반환값 X
				- 데이터를 받아서 소비만 하고 돌려주지 않는 메소드를 구현하는 용도
				- Consumer<T>
				- BiConsumer<T>
				- IntConsumer
				- ... 
			
			2. Supplier > 매개변수 X, 반환값 O
				- 건네주는 매개변수는 없는데 공급만 해주며, Consumer와 반대되는 행동을 할 때 사용
				- Supplier<T>
				- ...
			
			3. Function > 매개변수 O, 반환값 O
				- 매개변수도 있고 반환값도 있는 추상메소드를 가지고 있다. (input과 output이 둘 다 있다.)
				- Function<T,R>
				- BiFunction<T,U,R>
				- ...
				
			4. Operator > 매개변수 O, 반환값 O
				- Function이랑 겹친다. Function의 하위 셋이다. Function의 특정일을 할 수 있도록 특화시켰다.
				- BinaryOperator<T>
				- ...
				
			5. Predicate > 매개변수 O, 반환값 O
				- 정보를 전달해 주면 판단의 결과값을 전달해준다. Function의 하위셋이다.
				- Predicate<T>
			
		*/
		
		Test t1 = () -> System.out.println("aaa");
		t1.aaa(); // aaa
		// 상속받은 클래스를 구현하면서 구현하라고 만든 추상 메소드를 구현
		
		m1();
		m2();
		m3();
		m4();
		m5();
		m6();
		
	}// main

	private static void m6() {

		// 표준 API 함수형 인터페이스 > 정적 / 디폴트 메소드
		// - 람다 객체들의 연산자 역할
		
		Student s1 = new Student("Isaac", 100, 90, 80);
		
		// 업무 1.
		Consumer<Student> c1 = s -> System.out.println("총점: " + s.getTotal());
		c1.accept(s1); // 총점: 270
		
		// 업무 2.
		Consumer<Student> c2 = s -> System.out.println("이름: " + s.getName());
		c2.accept(s1); // 이름: Isaac
		
		// 업무 3.
		Consumer<Student> c3 = s -> System.out.println("평균: " + s.getTotal()/3);
		c3.accept(s1); // 평균: 90
		
		// 요구사항) 업무 1과 업무 2를 동시에 실행 > 메소드를 만든다
		test(s1, c1, c2, c3);
		/*
		총점: 270
		이름: Isaac
		평균: 90
		*/
		
		// 이 작업을 Consumer에서 더 쉽게 할 수 있도록 해준다.
		// c1() + c2() = test()
		
		// c3() = c1() + c2()
		Consumer<Student> c4 = c1.andThen(c2).andThen(c3);
		c4.accept(s1);
		/*
		총점: 270
		이름: Isaac
		평균: 90
		*/
		
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10)); // true
		
		Function<Boolean, String> f2 = flag -> flag ? "성공" : "실패";
		System.out.println(f2.apply(true)); // 성공
		
		// Function = Function + Function
		// f3() = f1() + f2();
		Function<Integer, String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10)); // 성공

		
		Function<Integer, String> f4 = num -> num > 0 ? "참" : "거짓";
		Function<String, Integer> f5 = str -> str.length();
		
		Function<Integer, Integer> f6 = f4.andThen(f5); // f4 + f5
		System.out.println(f6.apply(-10)); // 2
		
		Function<Integer, Integer> f7 = f5.compose(f4); // f5 + f4
		System.out.println(f7.apply(-10)); // 2
		
		
		// 2의 배수
		Predicate<Integer> p1 = num -> num % 2 == 0;
		
		// 3의 배수
		Predicate<Integer> p2 = num -> num % 3 == 0;
		
		int a = 10;
		System.out.println(p1.test(a)); // true
		System.out.println(p2.test(a)); // false
		
		// a가 2와 3의 공배수인가?
		System.out.println(p1.test(a) && p2.test(a)); // false
		
		// p1 && p2
		Predicate<Integer> p3 = p1.and(p2);
		System.out.println(p3.test(a)); // false
		
		// p1 || p2
		System.out.println(p1.test(a) || p2.test(a)); // true
		Predicate<Integer> p4 = p1.or(p2);
		System.out.println(p4.test(a)); // true
		
		
		System.out.println(!p1.test(a)); // false
		Predicate<Integer> p5 = p1.negate();
		System.out.println(p5.test(a)); // false
		
	}

	private static void test(Student s1, Consumer<Student> c1, Consumer<Student> c2, Consumer<Student> c3) {
		c1.accept(s1);
		c2.accept(s1);
		c3.accept(s1);
	}

	private static void m5() {

		// Predicate
		// - 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현한다.
		// - 매개변수 O, 반환값 O
		// - testXXX() 추상 메소드를 제공한다.
		// - Function의 하위셋이다.
		// - 매개변수를 전달받아 반드시 Boolean을 반환한다. (리턴값이 고정되어있다.)

		Function<Integer, Boolean> f1 = num -> num > 0;
		Predicate<Integer>			p1 = num -> num > 0;
		
		System.out.println(f1.apply(10)); // true
		System.out.println(f1.apply(-10)); // false
		
		System.out.println(p1.test(10)); // true
		System.out.println(p1.test(-10)); // false
		
		BiPredicate<Integer, Integer> bp2 = (a, b) -> a > b;
		System.out.println(bp2.test(10, 20)); // false
		System.out.println(bp2.test(20, 10)); // true
	}

	private static void m4() {

		// Operator
		// - 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현
		// - 매개변수 O, 반환값 O
		// - applyXXX() 추상 메소드를 제공한다.
		// - Function의 하위셋이다.
		// - 매개변수와 반환값의 타입이 같은 경우(연산자의 느낌이 나는 경우)를 모아두었다.
		
		// - 왜 Function의 기능을 빼왔는가?
		// - 연산자의 특징 (모든 연산자가 그런 건 아님)
		// - 10 + 10 = 20
		
		
		BinaryOperator<Integer> bol = (a, b) -> a + b;
		System.out.println(bol.apply(10, 20));
		
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(10, 20));
		// BiFunction을 써도 결과는 똑같지만, 매개변수와 반환값을 타입이 같다면 BinaryOperator를 쓰면 더 간결해져서 좋다.

		
		// Function<T,T>
		UnaryOperator<Integer> uo1 = num -> num * num;
		System.out.println(uo1.apply(10)); // 100
		
		
	}

	private static void m3() {

		// Function
		// - 매개변수를 전달하면 처리 후, 반환값을 돌려주는 업무를 구현해야 할 때 사용한다.
		// - input과 output이 동시에 존재한다.
		// - 가장 많이 사용한다.
		// - applyXXX() 추상 메소드를 제공한다.
		
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10)); // true
		System.out.println(f1.apply(-10)); // false
		
		
		Function<String, Integer> f2 = str -> str.length();
		System.out.println(f2.apply("Isaac")); // 5
		System.out.println(f2.apply("안녕하세요")); // 5
		
		
		Function<Student, Boolean> f3 = s -> {
			return s.getTotal() >= 180 ? true : false;
		};
		if (f3.apply(new Student("Isaac", 80, 95, 85))) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(10, 20)); // 30
		
		DoubleToIntFunction f4 = num -> (int)num;
		System.out.println(f4.applyAsInt(3.14)); // 3
		
	}
	
	private static void m2() {

		// Supplier
		// - 매개변수 없이 반환값을 돌려주는 업무를 구현한다.
		// - getXXX() 형태의 추상 메소드를 제공한다.
		
		Supplier<Integer> s1 = () -> 100;
		System.out.println(s1.get()); // 100
		
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get()); // 0.6329740582208209
		
		
		Supplier<String> s3 = () -> "Isaac";
		System.out.println(s3.get()); // Isaac
		
		
		Supplier<Student> s4 = () -> new Student("Isaac", 100, 90, 80);
		System.out.println(s4.get()); //Student [name=Isaac, kor=100, eng=90, math=80]

		
		IntSupplier s5 = () -> 200;
		System.out.println(s5.getAsInt()); // 200
	}

	private static void m1() {

		// Consumer
		// - 매개변수를 받아서 소비하는 업무를 구현한다.
		// - 매개변수 O, 반환값 X > 추상메소드
		// - acceptXXX() 추상 메소드 제공
		
		// 사용자 정의 함수형 인터페이스
		MyConsumer m1 = num -> System.out.println(num * num);
		m1.test(10); // 100
		
		// 표준 API 함수형 인터페이스
		Consumer<Integer> c1 = num -> System.out.println(num * num);
		c1.accept(10); // 100
		// 사용자 정의 함수형 인터페이스를 만드는 비용을 줄일 수 있게 되었다.
		
		Consumer<String> c2 = str -> System.out.println(str.length());
		c2.accept("Isaac"); // 5
		
		Consumer<Integer> c3 = count -> {
			for (int i=0; i<count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c3.accept(5);
		/*
		0
		1
		2
		3
		4
		*/
		
		Consumer<Student> c4 = s -> {
			System.out.println("이름: " + s.getName());
			System.out.println("국어: " + s.getKor());
			System.out.println("영어: " + s.getEng());
			System.out.println("수학: " + s.getMath());
			System.out.println("총점: " + s.getTotal());
		};
		c4.accept(new Student("Isaac", 100, 90, 80));
		/*
		이름: Isaac
		국어: 100
		영어: 90
		수학: 80
		총점: 270
		*/
		
		
		BiConsumer<String, Integer> bc1 = (name, age) -> {
			System.out.printf("이름: %s, 나이: %d세\n", name, age);
		};
		bc1.accept("Isaac", 24); // 이름: Isaac, 나이: 24세
		
		
		// 일반 인터페이스이다.
		IntConsumer ic1 = num -> System.out.print(num * num);
		ic1.accept(5); // 25
		
		
		IntConsumer ic2 = System.out::print;
		
	}
}

@FunctionalInterface
interface MyConsumer {
	void test(int num);
}
// 람다식을 저장할 것이기 때문에 어노테이션을 붙여주었다.

// 함수형 인터페이스, functional interface
// - 함수형 인터페이스는 추상 메소드를 딱 1개만 가질 수 있다.
// - 그 1개의 추상 메소드가 곧 람다식이 되기 때문이다.

// # 람다식을 저장하는 목적의 인터페이스 vs 일반적인 인터페이스
// - 문법적으로 차이가 없다.
// - 차이가 있는 부분이 딱 하나가 있다.
//	- 메소드를 하나 더 만든다. (void bbb())
//	- 위에서 오류가 발생했다. 람다식은 메소드를 하나를 표현하기 때문에 t1이 소유하고 있는 2개의 메소드 중에 무엇을 매칭햏야 할지 애매해진다.
//	- (functional interface, 함수형 인터페이스)
//	- 람다식을 저장하려고 만든 Test라는 인터페이스가 그냥 인터페이스이지, 함수형 인터페이스가 아니기 때문에 사용할 수 없다는 말이다.

// 람다식을 위해 만든 인터페이스라는 것을 증명하기 위해 어노테이션을 붙인다.
// 이걸 붙이면 이클립스나 컴파일러가 경고를 준다. (Invalid '@FunctionalInterface' annotation; Test is not a functional)
// 추상메소드를 2개 만들면 안 된다는 것을 알게 된다.

@FunctionalInterface
interface Test {
	void aaa();
	// void bbb();
}

interface Test2 {
	
	// 일반적인 인터페이스 멤버
	// - 추상 멤버
	void aaa();
	
	// 자바의 인터페이스 멤버
	// - 추상 멤버
	// - 구현 멤버 (***)
	// 일반적으로 구현부를 가질 수 없는데, 자바의 인터페이스는 그게 가능하다.
	
//	public int a;
//	public void bbb() {
//		
//	}
	
	// 여젼히 이건 안 되는데, 객체 멤버가 값을 가질 수 있게 되었다.
	// 일반 인터페이스에서는 상상도 못 하던 것이다.
	// 변수는 생성이 되는 그 자체를 구현되었다고 표현하고, 메소드는 {} 중괄호를 가질 때 구현되었다고 표현을 한다.
	// 인터페이스가 자바에서는 이런식으로 구현 멤버를 가질 수 있다!!

	final public int b = 20;
	final static public int c = 30;
	
	public static void ccc() {
		
	}
	
	default void ddd() {
		
	}
}