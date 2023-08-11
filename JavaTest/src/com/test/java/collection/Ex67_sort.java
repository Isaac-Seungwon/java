package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {
	// 정렬 클래스에서 익명 클래스를 활용할 수 있다.
	public static void main(String[] args) {
		
		// Ex67_sort.java
		
		// 배열 or 컬렉션
		// - 오름차순 정렬, 내림차순 정렬
		// 1. 직접 알고리즘 구현
		// 2. JDK 제공 기능
		
		// JDK에서 제공하는 기능 + 커스터마이징 > 2 + 1 
		// JDK에서 어느정도 틀을 제공하면 거기서 하고 싶은 업무를 넣어서 구체적으로 무엇을 하고 싶은지를 정해줄 수 있다.
		// 이 과정에서 익명 클래스가 필수는 아니지만, 안 쓰면 코드가 지저분해져서 반드시 쓰게 되어있다.
		
		
		m1();
		m2();
		m3();
		m4();
		m5();
		m6();
	}

	private static void m6() {
//        List list = new ArrayList();
//
//        Collections.addAll(list, 1, 2, 3, 4, 5); // addAll 메서드 list 에 추가
//        System.out.println("addAll = " + list);
//
//        Collections.rotate(list, 2); // 오른쪽으로 보냄
//        System.out.println("rotate = " + list);
//
//        Collections.swap(list, 0, 2); // 스왑 위치바꾸기
//        System.out.println("swap = " + list);
//
//        Collections.shuffle(list); // 셔플 랜덤섞기
//        System.out.println("shuffle = " + list);
//
//        Collections.sort(list, Collections.reverseOrder()); // 역순정렬
//        System.out.println("reverseOrder = " + list);  // Collection.reverse 와같음
//
//        Collections.sort(list);  // 오름차순정렬
//        System.out.println("sort = " + list);
//
//        int idx = Collections.binarySearch(list, 3);  // key 가 저장된 위치 index 값 출력
//        System.out.println("binarySearch = " + idx);
//
//        System.out.println(Collections.max(list));  //최대값
//        System.out.println(Collections.min(list));  //최소값
//
//        Collections.fill(list, 9); //  리스트를 해당값으로 전부채우기
//        System.out.println("fill = " + list);
//
//        List newList = Collections.nCopies(list.size(), 2); // 해당리스트와 같은 사이즈의 리스트에 뒤에값으로채움
//        System.out.println("nCopies = " + newList);
//
//        System.out.println(Collections.disjoint(list, newList)); // 두 리스트에 값은값이 없으면 true 있으면 false
//
//        Collections.copy(list, newList);  // 앞에리스트 요소들을 뒤에꺼랑똑같이바꿈
//        System.out.println("copy = " + list);
//
//        Collections.replaceAll(list, 2, 1); // list 에 있는 2를 1로바꿈 다바꾸는듯?
//        System.out.println("replaceAll = " + list);		
	}

	private static void m5() {

		// 컬렉션의 정렬
		// 1. ArrayList > O
		// 2. HashMap > X
		// 3. Queue > X
		// 4. Stack > X // 들어온 순서가 중요해서 정렬을 안 한다.
		// 5. HashSet > X
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			list.add((int)(Math.random() * 100)); // 0~99
		}
		
		System.out.println(list);
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 내림차순 정렬
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(list);
		
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(list);
		
		System.out.println("인텔리제이");
		
		list.sort(Collections.reverseOrder());
		System.out.println(list);
	}

	private static void m4() {

		// 객체 정렬
		Score[] list = new Score[5];
		
		list[0] = new Score("Lee", 100, 90, 80);
		list[1] = new Score("Kim", 80, 55, 90);
		list[2] = new Score("Yu", 75, 65, 85);
		list[3] = new Score("Park", 85, 95, 75);
		list[4] = new Score("Hong", 90, 80, 90);
		
		System.out.println(Arrays.toString(list));
		
		
		// 이름순 정렬
		// Arrays.sort(list); // 오름차순 정렬 해줘. (뭐로 정렬할지 얘기를 해줘야 한다.)
		
		Arrays.sort(list, new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {
				
				// 정렬 기준을 이름으로 확실하게 정해주었다.
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(Arrays.toString(list)); // ClassCastException
	
		
		// 성적순 정렬
		
		Arrays.sort(list, new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {
				
				// return o2.getKor() - o1.getKor();
				return (o2.getKor() + o2.getEng() + o2.getMath()) - (o1.getKor() + o1.getEng() + o1.getMath());
			}
		});
		
		
		System.out.println(Arrays.toString(list));
	}

	private static void m3() {
		// 날짜형 정렬
		Calendar[] dates = new Calendar[5];
		
		for (int i=0; i<dates.length; i++) {
			dates[i] = Calendar.getInstance();
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);
		
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		Arrays.sort(dates);
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		
		Arrays.sort(dates, new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {
				// 위험한 방법 return (int)(o2.getTimeInMillis() - o1.getTimeInMillis());

				return o2.compareTo(o1);
			}
		});
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		
		// 요일순정렬
		Arrays.sort(dates, new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {
				// 일(1) ~ 토(7)
				return o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK);
			}
		});
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
	}

	private static void m2() {
		// 자료형별 정렬
		// 1. 숫자
		// 2. 문자(열) > 문자코드값
		// 3. 날짜시간
		// 4. 객체 ***
		
		
		// ### 문자열 비교
		String txt1 = "단풍나무";
		String txt2 = "조팝나무";
		
		// System.out.println(txt1 > txt2);
		// 문자열 > 문자열 : 불가능 (참조값)
		// 문자 > 문자 : 가능(값)
		
		System.out.println('A' > 'B');
		// 덩어리대 덩어리는 비교가 안 되지만, 글자(Character) 끼리의 비교는 가능하다!
		// > 문자끼리의 비교를 진행하면 된다.
		// > 첫글자끼리의 판가름이 나면 거기서 끝난거고, 안 되면 그 다음의 문자를 비교한다.
		
		int n = 0;
		
		for (int i=0; i<3; i++) {
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if (c1 > c2) {
				n = 1;
				break;
			} else if (c1 < c2) {
				n = -1;
				break;
			} // 두 글자가 똑같을 경우 판단을 보류, 두번째 글자 비교, 세번째 글자 비교
		}
		System.out.println(n);
		
		// 위의 과정을 거치지 않고 compareTo() 메소드를 사용할 수 있다.
		System.out.println(txt1.compareTo(txt2));
		
		// 영어와 관련된 기능
		txt1 = "AAA";
		txt2 = "aaa";
		System.out.println(txt1.compareToIgnoreCase(txt2));
		// 대소문자를 구분하지 않는 정렬
		
		
		// 가나다순으로 정렬
		String[] names = { "칠엽수", "단풍나무", "담쟁이덩굴", "쥐똥나무", "조팝나무", "은행나무", "벚나무"};
		
		// Arrays.sort(names); // 오름차순 정렬
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				// return o1.compareTo(o2); // 문자열 전용으로 비교 메소드가 만들어져 있으니, 이를 사용하면 된다.
				
				// return o2.compareTo(o1); // 내림차순
				
				// return o1.length() - o2.length(); // 글자수 정렬
				
				if (o1.length() > o2.length()) {
					return 1;
				} else if (o1.length() < o2.length()) {
					return -1;
				} else {
					// 2차 정렬 기준
					return o2.compareTo(o1);
				}
				
			}
		});

		System.out.println(Arrays.toString(names));
		

		/*
		// 람다식
		// 이 코드에는 감동이 있다.
		Comparator<String> s = (a, b) -> a.compareToIgnoreCase(b); // 대소문자 구문x

        Arrays.sort(names, s);
        System.out.println(Arrays.toString(names));
        */
        
	}

	private static void m1() {
		// int[] nums = {1, 5, 2, 4, 3};
		Integer[] nums = {1, 5, 2, 4, 3};
		// 타입 변수가 들어갔기 때문에 인티저 타입의 클래스를 넣어야 하므로 배열을 int가 아닌 Interger로 선언해준 것이다.
		
		System.out.println(Arrays.toString(nums));
		
		
		// 오름차순 정렬
		Arrays.sort(nums); // Quick Sort
		
		System.out.println(Arrays.toString(nums));
		
		
		// 내림차순 정렬 > 지원 안 함 > 직접 구현
		// Arrays.sort(배열, ㅊComparator)
		// Comparator (인터페이스 타입의 객체) > 업캐스팅을 이용해서 자식 클래스의 객체를 넣어달라는 의미이다.

		// Arrays.sort(null, null);
		// sort() 메소드 오버로딩 된 것 중에 Comparator가 있다. 이걸 사용해야 한다.
		// 내가 원하는 정렬을 할 수 있게끔 도와주는 메소드이다.
		
		
		// 오름차순
		Arrays.sort(nums, new MyComparator());
		
		System.out.println(Arrays.toString(nums));
		
		
		/*
		// 쓸모 없음..
		MyComparator mc1 = new MyComparator();
		System.out.println(mc1.compare(10, 20));
		*/
		
		
		Double[] num2 = { 2.5, 7.1, 4.5, 2.8, 6.4 };
		Arrays.sort(num2, new Comparator<Double>() {
			
			@Override
			public int compare(Double o1, Double o2) {
				
				/*
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
				*/
				
				return (int)Math.ceil(o2 - o1);
				// return (int)(o2 - o2);
				// 두 숫자를 빼도 결과는 같다.
			}

		});
		System.out.println(Arrays.toString(num2));

		// Arrays.sort(num2, new MyComparator());
		// 실수형이므로 정수형인 클래스에서 안 된다.
		
		// 클래스 수가 많아서 관리하기 힘든데, 이렇게 특정한 곳에 일회성인 클래스도 자리를 차지하게 되면 보기가 더 힘들어진다.
		// 이름 없는 클래스는 딱 해당 부분에서만 일을 하고 있다.
		
	}
}

// implements Comparator 컴페이레이터 상속, 타입 변수 작성
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {

		// o1 vs o2
		// 요소끼리의 비교를 해서 자리를 바꿀지 말지를 결정하는 부분
		// boolean은 2가지 상황밖에 판단을 못 해서 integer로 숫자형으로 반환하게 됨

		// 1. 오름차순
		// a. o1이 더 크면 > 양수 반환 > 1을 반환하는 경우가 많음
		// b. o2가 더 크면 > 음수 반환 > -1
		// c. 같으면 > 0 반환
		
		if (o1 > o2) {
			return 1;
		} else if (o1 < o2) {
			return -1;
		} else {
			return 0;
		}

		// 2. 내림차순
		// a. o1이 더 크면 > 음수 반환 > -1
		// b. o2가 더 크면 > 양수 반환 > 1
		// c. 같으면 > 0 반환

	}
}

// 객체 멤버 정렬
class Score {
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	// 생성자
	public Score(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
}
