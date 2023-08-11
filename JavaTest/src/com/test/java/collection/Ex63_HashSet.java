package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex63_HashSet {

	public static void main(String[] args) {
		
		// Ex63_HashSet.java 

		/*
		
		1. List
			- 순서가 있는 데이터 집합
			
		2. Set
			- 순서가 없는 데이터 집합
			- 요소를 구분하는 식별자가 없다.
			-> 방을 식별하는 번호나 식별자가 없다는 말은 똑같은 데이터가 2개 들어 있으면 데이터를 구분할 수 있는 방법이 없다는 의미이다. 따라서 Set은 데이터 중복을 허용하지 않는다.
			
		3. Map
			- 순서가 없는 데이터 집합
			- 키 + 값
			- 데이터 중복을 허용
		*/
		
		m1();
		m2();
		m3();
	}

	private static void m3() {
		HashSet<Person> name = new HashSet<Person>();
		
		name.add(new Person("홍길동", 20));
		name.add(new Person("홍길동", 20));
		
		System.out.println(name);
		System.out.println();
		
		
		
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 20));
		set.add(new Person("아무개", 25));
		set.add(new Person("이순신", 23));
		
		set.add(new Person("홍길동", 20)); // set > 중복값 배제 > 동명이인으로 본다.
		
		System.out.println(set);
		System.out.println();
		
		
		
		// p1과 p2를 같은 사람이라고 인식해보도록 하자 > 수정 > 가끔씩 구현하곤 한다.
		// 해시코드 재정의
		
		
		
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		System.out.println(p1.equals(p2)); // false
		// new가 붙으면 오브젝트가 새로 만들어지기 때문이다. (서로 다른 인스턴스가 된다.)
		// p1이 직접적으로 가지고 있는 값과 p2가 직접적으로 가지고 있는 값을 비교한다. 즉, 주소값을 비교한 것이다. 두 값이 같지 않다고 하는 이유가 이 때문이다.
		
		System.out.println("p1: " + p1.hashCode()); // p1: 237852351
		System.out.println("p2: " + p2.hashCode()); // p2: 608188624
		
		// 해시코드 출력 결과만 봐도 서로 다른 것을 확인할 수 있다.
		
		
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		// 주소값 비교 
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true
		
		System.out.println(s1.hashCode()); // 54150062
		System.out.println(s2.hashCode()); // 54150062
		System.out.println(s3.hashCode()); // 54150062
		
	}

	private static void m2() {
		// 하지만 중복값을 자동으로 배제하는 특성때문에 set 인터페이스는 사용할만한 이유가 된다.
		
		// HashSet 클래스 활용
		
		// 중복값 제거 > 로또 번호 > 중복되지 않는 난수 발생
		// 중복값이 발생하면 안 되는 배열을 만들 때, HashSet 클래스를 활용할 수 있다.
		// 난수를 6개 발생하는 로또 소스코드를 작성해보며, HashSet이 가지는 장점을 알아보도록 하자.
		
		// Case 1. ArrayList
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for (int i=0; i<6; i++) {
			int n = (int)(Math.random() * 45) + 1;
			boolean flag = false;
			
			for (int j=0; j<i; j++) {
				if (lotto.get(j) == n) {
					flag = true;
					break;
				}
			}
			
			if (!flag) {
				lotto.add(n);
			} else {
				i--;
			}
		}
		
		System.out.println(lotto); // [4, 5, 38, 24, 41, 10]
		// 문제점: 동일한 값을 발생시킬 수 있다. 따라서 이러한 문제에 대한 사전 처리를 개발가 직접 구현해야 한다.
		
		
		// Case 2. HashSet
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while (lotto2.size() < 6) {
			int n = (int)(Math.random() * 45) + 1;
			lotto2.add(n);
		}
		
		System.out.println(lotto2); // [26, 41, 38, 33, 11, 6]
		// HashSet 클래스는 중복값는 넣고 싶어도 애초에 넣을 수가 없다. 따라서 위에서 ArrayList로 난수를 생성했을 때 했던 중복 검사를 할 필요가 없다.
		// 중복이 되면 값을 배열에 넣지 않으므로, 만들 배열의 길이가 6개일 경우 반복문을 빠져나오게 하고 그 전까지는 배열에 계속 난수를 생성시키면 된다.

		// 보편적으로 중복값을 혀용하지 않을 때에는 Set 인터페이스를 사용한다.
		
		
		// Set의 탐색 방법
		
		// foreach (향상된 for문)
		for (int num : lotto2) {
			System.out.println(num);
		}
		// 배열에 있는 값을 하나씩 꺼내와서 사용할 수 있다.
		// 향상된 for문은 Iterator 동작을 편리하게 구현할 수 있게 해준다.
		
		
		// Iterator 지원 > 탐색 도구
		//****** List 계열과 Set계열 모두 지원하는 방식
		Iterator<Integer> iter = lotto2.iterator();
		
		// Iterator 인터페이스를 지원한다.
		// 어떤 집합을 탐색하는 데 사용하는 기본적인 도구 중에 하나이다.
		// Iterator 인터페이스를 사용하면 Set 안에 들어있는 데이터를 하나씩 접근할 수 있게 된다.
		
		System.out.println(iter.hasNext()); // true
		System.out.println(iter.next()); // 26
		
		// hasNext() 메소드 : 요소의 존재 유무를 리턴한다. 반환할 수 있는 값이 있으면 true, 없으면 false를 리턴한다.
		// next() 메소드: 요소를 리턴한다.
		
		System.out.println(iter.hasNext()); // true
		System.out.println(iter.next()); // 41
		
		System.out.println(iter.hasNext()); // true
		System.out.println(iter.next()); // 38
		
		System.out.println(iter.hasNext()); // true
		System.out.println(iter.next()); // 33
		
		System.out.println(iter.hasNext()); // true
		System.out.println(iter.next()); // 11
		
		System.out.println(iter.hasNext()); // true
		System.out.println(iter.next()); // 6
		
		System.out.println(iter.hasNext()); // false
		// System.out.println(iter.next()); // NoSuchElementException
		
		// 배열 안에 들어있는 값을 순서대로 가져온다.
		// 만약 가져올 값이 없으면 NoSuchElementException 오류가 발생한다.
		
		// Iterator는 생성된 후 첫 번째 값, BOF를 가리킨다.
		// 명령을 내리면 이동을 하는데, 이동을 하면 그 위치에 데이터가 있는지를 검사하는 게 hasNext() 메소드이다.
		// 그래서 데이터가 있으면 true를 반환한다.
		// next는 Iterator가 가리키는 방향을 내리고, 그 위치의 데이터를 반환한다.
		
		// BOF (Begin of File) 여기서 File은 어떤 데이터가 모여있는 집합을 의미한다. 따라서 BOF는 배열의 시작이라고 한다.
		// EOF (End of File) 배열의 끝을 의미한다.
		
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// 이를 while문으로 바꿔보면 이렇게 할 수 있다.
	}

	private static void m1() {
		
		// ArrayList 클래스와 HashSet 클래스의 비교
		
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		
		list.add("강아지");
		list.add("고양이");
		list.add("거북이");
		
		set.add("강아지");
		set.add("고양이");
		set.add("거북이");
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		System.out.println(list); // [강아지, 고양이, 거북이]
		System.out.println(set); // [고양이, 거북이, 강아지]
		
		/*
		ArrayList 클래스는 순서가 있는 컬렉션이다. 내가 넣은 요소를 순서대로 관리하는 반면에,
		HashSet 클래스는 순서가 없는 컬렉션이므로, 순서에 관계없이 데이터가 출력된다.
		*/
		
		// 데이터 중복 발생
		list.add("고양이"); // 중복
		System.out.println(list); // [강아지, 고양이, 거북이, 고양이]
		
		set.add("고양이"); // 중복
		System.out.println(set); // [고양이, 거북이, 강아지]
		// HashSet 클래스는 데이터가 들어가지 않았다.
		
		System.out.println(set.add("고양이")); // false
		// 이를 boolean형으로 출력해보면 데이터가 들어갈 수 없으므로 false가 출력되는 것을 볼 수 있다.
		
		
		// 데이터 삭제
		list.remove(1);
		list.remove("거북이");
		System.out.println(list); // [강아지, 고양이]
		
		set.remove("거북이");
		System.out.println(list); // [강아지, 고양이]
		// 방번호가 없기 때문에 데이터를 지울 때에는 인덱스가 아닌 값으로 밖에 지울 수 없다.
		// 마찬가지로 indexOf, 데이터 삽입 등의 기능이 제한적이다.
		
		// 데이터 찾기
		System.out.println(set.contains("고양이")); // true
	}
}


class Person {
	
	private String name;
	private int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	// 값이 동일하면 객체가 동일하게 처리하도록
	// 1. hashCode() 오버라이드 (해시코드 재정의)
	// 2. equals() 오버라이드
	
	@Override
	public int hashCode() {
		
		// 원래 > 자신의 메모리 주소값 반환하는 것 대신에
		// 멤버값을 합쳐서 만들어진 문자열에 해시코드를 돌려주도록 한다.
		
		// p1 > "홍길동, 20 > "홍길동20" > 100번지
		// p2 > "아무개, 25 > "아무개25" > 200번지
		// p3 > "홍길동, 20 > "홍길동20" > 100번지
		
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// p1.eqauls(p2)
		
		return this.hashCode() == obj.hashCode();
		
		// 본인의 해시코드와 오브젝트의 해시코드가 같은지를 반환한다.
		// 이름하고 나이가 같으면 같은 해시코드를 반환하도록 수정했으므로 두 값은 같게 된다.
		// 이런 작업을 거치면 주소값을 비교하는 게 아니라 내부 멤버 변수를 비교하는 방식으로 바뀌게 된다.
		// 그래서 상태값 비교를 하게 되어 같은 사람으로 인식하게 된다.
	}
	
}