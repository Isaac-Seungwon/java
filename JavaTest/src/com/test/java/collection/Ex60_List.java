package com.test.java.collection;

import java.util.ArrayList;

public class Ex60_List {

	public static void main(String[] args) {
		
		// Ex60_List.java
		
		/*
			컬렉션, Collection
			- JCF, Java Collection Framework
			- 컬렉션은 이름 그대로 무언가를 모아놓은 집합(배열)이다.
			- 컬렉션은 기존의 배열에서 향상된 배열이다.
				- 기존의 순수 배열에서 사용법을 개량하거나 용도에 따른 입출력 방식 또는 효율성을 높였다.
			- 컬렉션은 하나의 배열을 말하는 게 아니고 어떤 분야에서 배열을 특화시켰느냐에 따라 종류가 굉장히 많다.
			- 수업에서는 10개 정도의 컬렉션을 볼 예정이다.
			- 컬렉션은 클래스 + 내부 순수 배열을 가지고 있다.
			- 컬렉션의 길이는 가변적이다. > 방의 개수를 마음대로 늘이고 줄이는 게 가능하다.
			- 자료 구조이다.
		
		
			# 컬렉션 종류
			크게 3가지 계열이 있다.
			* 만약 면접에서 컬렉션에 대한 질문이 나오면 이 3가지를 물어볼 것이다.
			* 각각의 특징과 서로간의 장단점
			
			1. List 계열
				- ArrayList (***** 1등)
				- LinkedList
				- Queue
				- Stack
				- Vector (legacy)
		
			2. Set 계열
				- HashSet (*** 3등)
				- TreeSet
			
			3. Map 계열
				- HashMap (**** 2등)
				- TreeMap
				- Properties (lagacy)
				- HashTable (lagacy)
				
			- 컬렉션을 3종류로 나누었는데, List, Set, Map은 인터페이스이다.
				- lagacy: 너무 오래되거나 대체될 게 생겨서 언젠가 사라지지 않을까 싶은 것들을 lagacy라고 부른다.
				- 하늘이 무너져도 ArrayList와 HashMap은 알아야 한다.
				
			
			# Collection(I) 컬렉션 인터페이스
			- List(I)
			- Set(I)
			
			- Map(I)
			
			(그림)
			컬렉션에 List, Set이라는 인터페이스가 있고, 독립적으로 Map이라는 인터페이스가 있다.
			
			
			# Java® Platform, Standard Edition & Java Development Kit Version 11 API Specification
			> https://docs.oracle.com/en/java/javase/11/docs/api/index.html
			> 배우는 것에 대한 공식 도큐먼트를 보는 연습을 해야 한다. (자바, 오라클..)
			
			
			# ArrayList 클래스 ** 이건 잊어서는 안 된다.
			- ArrayList(C) -> List(I) -> Collection(I)
			- 순수 배열과 가장 유사하여 사용 빈도가 가장 높다.
			- 순수 배열은 첨자(index)를 사용하여 요소(element)에 접근하는데, ArrayList는 방식이 같다.
			- 배열보다 훨씬 편하다.
		
		*/
		
		m1();
		m2();
		m3();
		m4();
		m5();
		m6();
	}

	private static void m6() {

		// 컬렉션 초기 용량 > 내부 배열의 초기 길이
		// ArrayList는 낭비가 심하다.
		// Integer자료형의 크기가 4바이트이므로 4바이트 > 8바이트 > 16바이트 이전의 데이터를 버리고 크기를 늘리면서 작업이 늘어난다.
		// 그래서 처음부터 배열의 크기를 정해줄 수 있다.
		
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		
		for (int i=0; i<10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add(10); // 이젠 더 이상 추가 계획 없음(확신)
		list.trimToSize(); // 데이터가 들어있는 만큼의 길이로 재조정
		
	}

	private static void m5() {

		// 컬렉션의 특징 - ArrayList 특징
		// 1. 내부에 배열을 가지고 있다.
		// 2. ArrayList 클래스의 대부분의 기능이 내부 배열을 조작하는 기능으로 구성되어 있다.
		// 3. 길이가 가변적 > 데이터를 계속 넣으면.. 계속 공간이 늘어난다???
		// 배열의 길이는 불변한데, 배열의 길이가 점점 늘어나는 듯한 사용법을 구현한 것이다.
		
		
//		ArrayList<String> list = new ArrayList<String>();
//		
//		for (int i=0; i<1000; i++) {
//			list.add(i);
//		}
//		
//		System.out.println(list.size());
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		System.out.println(list);
		
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		list.add(50);
		System.out.println(list);
		
		
	}
		
	private static void m4() {

		// 성적표
		// 학생(이름, 국어, 영어, 수학, 총점, 평균)
		
		// Strudent[] list;
		ArrayList<Student> list = new ArrayList<Student>();
		
		// 선택
		// 순수 배열을 쓰는 게 나을까? 컬렉션을 쓰는 게 나을까?
		// -> 길이를 가지고 판단한다.
		// 배열은 길이가 고정되어 있고, ArrayList는 가변적이다.
		// 1. 학생이 몇 명인지를 확인해 본다.
		// 2. 학생이 늘어날 일도 줄어들 일도 없다면 배열을 쓸 수 있다.
		
		for (int i=0; i<10; i++) {
			
			int kor = (int)(Math.random() * 41) + 60; // 최소 60점에서 100점
			int eng = (int)(Math.random() * 41) + 60; // 최소 60점에서 100점
			int math = (int)(Math.random() * 41) + 60; // 최소 60점에서 100점
			
			Student s = new Student("학생" + i, kor, eng, math);
			
			list.add(s); // 배열에 학생 추가
			
		}
		// System.out.println(list);
		
		System.out.println("=============================================");
		System.out.println("                   성적표");
		System.out.println("=============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for (Student s : list) {
			
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total / 3.0;
			
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
								, s.getName()
								, s.getKor()
								, s.getEng()
								, s.getMath()
								, total
								, avg);
			
		}
		
	}

	private static void m3() {
		int[] 		ns1 = new int[3];
		int[][] 	ns2 = new int[3][3];
		int[][][]	ns3 = new int[3][3][3];
		
		// 1차원 배열
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		
		// 2차원 배열
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		
		// 3차원 배열
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
	}

	private static void m2() {

		// ArrayList 용법
		ArrayList<String> list = new ArrayList<String>();
		
		// ### CRUD
		// Create (쓰기)
		// Read (읽기)
		// Update (수정)
		// Delete (삭제)
		
		// 1. 요소 추가하기
		// - add() 메소드를 사용한다.
		// - boolean add(T value)
		// - append를 이용해 배열의 맨 마지막에 추가한다.
		
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("뀰");
		list.add("파인애플");

		
		// 2. 요소 개수 확인하기
		// - int size() 메소드
		
		System.out.println(list.size()); // 5
		// 배열의 length도 중요하지만, size는 훨씬 중요하다. 계속 길이가 변화하기 때문이다.
		
		
		// 3. 요소 접근하기
		// - T get(int index) 메소드
		
		System.out.println(list.get(0)); // 바나나
		System.out.println(list.get(1)); // 딸기
		System.out.println(list.get(2)); // 사과
		
		// IndexOutOfBoundsException
		// - 없는 방번호를 호출했을 경우
		// System.out.println(list.get(5));
		
		
		// 4. 요소 수정하기
		// -list[0] = 10; 대입 or 수정
		
		// String set(int index, T newValue)
		// - 사라지는 직전의 값을 return해준다는 특징이 있다.
		// - 평상시에는 리턴값을 받을 일이 없다.
		
		String temp = list.set(2, "포도");
		System.out.println(list.get(2));
		System.out.println(temp);
		System.out.println();
		
		// 5. 요소 삭제하기
		// - 순수 배열의 요소(방) 삭제 > 불가능
		// - 컬렉션은 요소 삭제가 가능하다
		// T remove(int index) > 방번호를 찾아서 삭제한다.
		// boolean remove(T value) > 값을 찾아서 삭제한다.
		
		System.out.println(list.get(1)); // 딸기
		System.out.println(list.get(2)); // 포도
		System.out.println(list.get(3)); // 뀰
		System.out.println();
		
		list.remove(2);
		// list.remove("포도");
		
		System.out.println(list.get(1)); // 딸기
		System.out.println(list.get(2)); // 뀰
		System.out.println(list.get(3)); // 파인애플
		System.out.println();
		
		// 지우기 전까지만 해도 3번째 방에는 뀰이 있었는데, 뀰 앞의 2번째 방의 포도를 지우자 뀰이 2번방으로 이동했다.
		// 비어져 있는 방을 채우기 위한 shift가 발생한 것이다.
		// 이걸 조심해야 하는 이유는 3번째 방에 뀰이 있다고 믿고 있었는데, 나도 모르게 어딘가에서 요소가 지워지면 뀰의 위치가 이동하기 때문이다.
		// *** shift가 발생한다!! > 삭제된 방 이후의 모든 요소는 모두 방번호가 -1씩 감소한다.
		
		// list.remove("포도")
		// 만약 포도가 2개 이상이면? 첫 번째 만나는 포도를 삭제한다.
		// 그럼 두 번째 포도를 지우고 싶다면? 그건 못 한다.
		// 그래서 주로 값을 지울 때에는 인덱스로 지우는 편이다.
		
		
		// 6. 탐색
		// - 루프
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("list.get(%d) = %s\n", i, list.get(i));
		}
		
		
		
		// 향상된 for문 (foreach문)
		
		/*
		for (변수 : 배열) {
			
		}
		*/
		
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		// 조건이 없고, 인덱스도 없다.
		// for보다 훨씬 단순하다. 처음에 list 집합을 찾아간다. 그 집합을 찾아본 다음에 무조건 첫번째 값을 찾아 item에 복사한다.
		// 그리고 다시 올라가 다음 값을 찾아 item에 복사하고 반복문 안에서 item을 사용한다.
		// 그렇게 아무것도 없으면 반복문을 나간다.
		
		
		// 7. 덤프
		// - Array.toString(배열)
		System.out.println(list.toString()); //[바나나, 딸기, 뀰, 파인애플]
		System.out.println(list); //[바나나, 딸기, 뀰, 파인애플]
		// toString을 재정의를 해두었기 때문에 오브젝트를 찍기만 하면 된다.
		// toString()을 붙이지 않아도 동일하다.
		
		
		// 8. 요소 추가
		// - 배열의 원하는 위치에 요소를 추가 > Insert
		// - void add(index index, T value) add()메소드에 오버로딩이 되어있다.
		// *** shift가 발생한다. > 삽입된 방 이후의 모든 요소의 방번호 +1
		
		list.add(2, "맹고");
		System.out.println(list); // [바나나, 딸기, 맹고, 뀰, 파인애플]
		
		
		
		// 9. 기타 등등
		System.out.println(list.indexOf("사과")); // -1
		System.out.println(list.indexOf("뀰")); // 3
		System.out.println(list.indexOf("맹고")); // 2
		// indexOf() 메소드로 값이 있는 위치를 반환할 수 있다.
		
		
		// 10. claer(), isEmpty() 메소드
		// - 값이 비어있는지 물어본다.
		// - 배열을 깨끗하게 비워준다.
		System.out.println(list.isEmpty()); // false : 데이터가 있음
		list.clear();
		System.out.println(list.isEmpty()); // true : 데이터가 없음
	}

	private static void m1() {

		// 순수 배열 선언
		// - 타입이 명시되어 있다. (int)
		// - 길이가 명시되어 있다. ([3])
		
		int[] num1 = new int[3];
		
		// 요소 접근 > 첨자(index) 사용 > Indexer 표기법을 사용한다.
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);

		System.out.println(num1.length);
		
	
		// 컬렉션
		// - 타입이 명시되어 있다. (<Integer>)
		// - 길이가 명시되어 있지 않다. > 가변적이다.
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		// ArrayList라는 배열을 만든 것이다.
		// 길이를 늘리고 줄일 수 있으므로 길이가 명시되어 있지 않다.
		// 이때 제네릭의 타입 변수를 이용해 배열의 방의 타입을 설정한다.
		
		
		// 요소 추가
		num2.add(10);
		
		// 배열에 값을 추가하라는 의미이다.
		// add() == append, append는 마지막에 추가한다는 뜻으로 차례대로 마지막 방에 넣으라는 뜻이다.
		// 처음 넣는 것은 0번째 방에 알아서 들어간다.
		
		num2.add(20);
		num2.add(30);
		
		// 집어 넣을 때마다 순차적으로 칸칸이 들어간다.
		// 방번호를 명시해서 집어 넣는 방법이 있긴 하다.
		
		System.out.println(num2.get(0)); // num1[0]
		System.out.println(num2.get(1)); // num1[0]
		System.out.println(num2.get(2)); // num1[0]
		// 집어 넣을 때는 방법호가 안 보였는데, 출력할 떄는 보인다.	
		
		System.out.println(num2.size()); // 길이 3 // 순수 배열 선언에서는 length의 기능을 한다.
	}
}
