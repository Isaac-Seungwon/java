package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.util.MyFile;

public class Ex74_Stream {

	public static void main(String[] args) {
		
		// Ex74_Stream
		
		/*
			자바 스트림
			1. 입출력 스트림
				- 파일 입출력, 콘솔 입출력, 네트워크 입출력..
			2. 스트림
				- Java 8(JDK 1.8)
				- 람다식 + 함수형 인터페이스
				- 배열(컬렉션)의 탐색(조작)을 지원한다.
				- 파일 입출력을 지원한다.
				- 디렉토리 탐색을 지원한다.
			
			배열, 컬렉션 탐색
			1. for문(루프변수)
			2. 향상된 for문
			3. Iterator
			4. Stream
		
		
			함수형 인터페이스
			1. Consumer
				- (매개변수) -> {구현부}
			
			2. Supplier
				- () -> {return 값}
			
			3. Function
				- (매개변수) -> {return 값}
				
			4. Operator
				- (매개변수) -> {return 값}
				- 매개변수와 반환값의 자료형이 동일하다.
				
			5. Predicate
				- (매개변수) -> {return 값}
				- 반환값이 boolean이다.
				
				
			stream()
			
			.filter(Predicate)
			.map(Function
			.sorted(Comparator)
			.distinct()
			
			.count(), max(), min(), average(), sum()
			.allMatch, anyMatch(), noneMatch()
			.forEach()
		*/
		
		
		String path = "test.java";
		
		// 배포
		// - 개발자 자바 소스 > (전달) > 다른 개발자
		// 1. 소스 자체 전달 > MyFile.java
		// 2. 컴파일한 실행 파일을 전달 > MyFile.class > 압축(1개 파일) > *.jar
		
		// import > 같은 프로젝트 내에서만 가능하다.
		MyFile mf = new MyFile();
		
		System.out.println(mf.getFileNameWithoutExtension(path)); // test
		System.out.println(mf.getExtension(path)); // java
		
		// m1();
		// m2();
		m3();
		m4();
		m5();
		m6();
		m7();
		m8();
		m9();
		m10();
	}

	private static void m10() {

		// 집계, 통계, Reduce
		// - count(), max(), min(), // 전용 스트림 반드시 숫자일 때에만 할 수 있다.- sum(), avg()
		// - 최종 파이프
		// 요소들을 가공해서 통계값을 낸다.
		
		System.out.println(Data.getIntList().stream().count());
		
		
		// Optional<Integer>
		System.out.println(Data.getIntList().stream().max((a, b) -> a - b).get()); // 99
		System.out.println(Data.getIntList().stream().min((a, b) -> a - b).get()); // 0
		
	}

	private static void m9() {

		// 매칭
		// - allMatch(), anyMatch(), nonMatch() 메소드 3가지가 있다.
		// - 최종 파이프이다.
		// - 스트림 요소가 제시하는 조건을 만족하는지, 만족하지 않는지를 판단한다.
		// - 최종 파이프라서 stream을 돌려주지 않으며, boolean을 돌려준다.
		// 형식: a. boolean allMatch(Predicate) > 모든 요소가 조건을 100% 만족하면 true를 반환한다. And(&&) 연산자로 이해할 수 있다. 
		//		 b. boolean anyMatch(Predicate) > 일부 요소가 조건을 만족하면 true를 반환한다. OR(||) 연산자로 이해할 수 있다.
		// 		 c. boolean noneMatch(Predicate) > 모든 요소가 조건을 만족하지 않을 때 true를 반환한다.
		
		
		// 요구사항) 배열 > 짝수만 있는지를 판단
		int[] nums = { 1, 2, 3, 4, 5 };
		
		boolean result = false;
		
		for (int n : nums) {
			if (n % 2 == 1) {
				result = true;
				break;
			}
		}
		
		if (result) {
			System.out.println("홀수 발견");
		} else {
			System.out.println("짝수 배열입니다.");
		}
		
		
		// Match() 메소드
		System.out.println(Arrays.stream(nums).allMatch(n -> n % 2 == 0)); // false
		System.out.println(Arrays.stream(nums).anyMatch(n -> n % 2 == 0)); // true
		System.out.println(Arrays.stream(nums).noneMatch(n -> n % 2 == 0)); // false
		
		
		
		// mapToInt() 메소드
		int sum = Data.getIntList().stream()
						.mapToInt(n -> n) // Stream<Integer>(X) IntStream(O)
						.sum();
		System.out.println(sum); // 4746
		
		double avg = Data.getIntList().stream()
						.mapToInt(n -> n)
						.average().getAsDouble();
		System.out.println(avg); // 47.46
		
	}

	private static void m8() {

		// 정렬
		// - sorted()
		// - 중간 파이프이다.
		// - 배열/컬렉션의 sort() 메소드와 사용법이 동일하다. Comparator를 구현하는 방식으로 사용한다.
		
		Data.getIntList(10)
			.stream()
			.sorted((a, b) -> a - b)
			.forEach(n -> System.out.print(n + " ")); // 1 12 24 32 36 36 65 85 86 86 
			
	}

	private static void m7() {

		// 매핑
		// - map(), mapXXX() 형태를 가진다.
		// - 중간 파이프
		// - 변환 작업
		
		// filter와 forEach 작업
		List<String> list = Data.getStringList(10);
		System.out.println(list); // [애플아케이드, 국내, 서비스, 열흘, 기존, 모바일게임, 경험, 다른, 새로운, 경험]
		System.out.println();
		
		list.stream()
				.filter(word -> word.length() <= 3)
				.forEach(word -> System.out.print(word + " ")); // 국내 서비스 열흘 기존 경험 다른 새로운 경험
		System.out.println();
		
		// map
		list.stream()
				.map(word -> word.length())
				.forEach(num -> System.out.print(num + " ")); // 6 2 3 2 2 5 2 2 3 2
		System.out.println();
		
		// map이 받아오는 데이터는 word.length()로 integer가 된다.
		// 이처럼 넘겨받는 값을 가공하여 전혀 다른 값으로 변환하면서 단어가 아닌 숫자가 반환되므로, map() 메소드를 변환 메소드라고도 부른다.
		// map을 쓰면 중간에 자유롭게 변환하여 처리하는 게 가능하다. 다만 map을 쓰면 코드가 복잡해질 가능성이 있다.
		
		
		
		String[] names = { "시몬", "안드레", "야고보", "요한", "빌립", "바돌로매", "도마", "마태", "야고보", "다대오", "시몬", "가룟 유다" };
		
		// 이름 추출
		Arrays.stream(names)
				.map(name -> name.substring(1))
				.forEach(name -> System.out.print(name + " ")); // 몬 드레 고보 한 립 돌로매 마 태 고보 대오 몬 룟 유다
		System.out.println();
		
		
		
		List<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student("시몬", 100, 80, 90));
		slist.add(new Student("안드레", 60, 50, 60));
		slist.add(new Student("야고보", 70, 80, 90));
		slist.add(new Student("요한", 80, 90, 40));
		
		slist.stream()
				.map(s -> {
					if (s.getTotal() >= 180) {
						return s.getName() + ": 합격";
					} else {
						return s.getName() + ": 불합격";
					}
				}) // Stream<Student> -> Stream<String>
				.forEach(result -> System.out.println(result));
		/*
		시몬: 합격
		안드레: 불합격
		야고보: 합격
		요한: 합격
		*/
		
		
		// Result Class 활용
		slist.stream()
				.map(s -> {
					if (s.getTotal() >= 180) {
						Result r = new Result();
						r.setName(s.getName());
						r.setResult("합격");
						return r;
					} else {
						Result r = new Result();
						r.setName(s.getName());
						r.setResult("불합격");
						return r;
					}
				})
				.forEach(r -> {
					System.out.println("이름: " + r.getName());
					System.out.println("결과: " + r.getResult());
				});
		/*
		이름: 시몬
		결과: 합격
		이름: 안드레
		결과: 불합격
		이름: 야고보
		결과: 합격
		이름: 요한
		결과: 합격
		*/
		
		// Result 객체 생성
		// map으로 객체를 반환할 수도 있다. 이렇게 하면 이름과 점수 결과를 따로 분리하여 체계적으로 분리할 수 있게 된다.
		
	}

	private static void m6() {

		// 중복 제거
		// - distince()
		// - 중간 파이프
		// - 앞의 스트림에서 중복 요소를 제거하고 유일한 요소만 남은 새로운 스트림을 다시 반환한다.
		// - 필터는 조건부를 만족하는 것만 가능하지, 중복을 걸러내지는 못하므로 하는 행동이 같은 건 아니다.
		
		List<Integer> list = Data.getIntList();
		
		System.out.println(list.size()); // 100
		
		// 요구사항) 위의 배열에서 중복값 제거
		// Case 1. Set을 이용한 작업
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		for (int n : list) {
			set1.add(n); // 중복값 제거
		}
		
		System.out.println(set1.size()); // 61
		// 배열에서 100개에서 중복값을 제거하니 61개만 남았다.
		
		
		// Case 2. Set의 생성자를 이용한 작업
		Set<Integer> set2 = new HashSet<Integer>(list);
		// Set을 정렬하고 싶은데, Set은 정렬을 못 하니까, 정렬할 수 있는 ArrayList로 바꿔서 정렬할 수 있었다.
		// 이번에는 반대로 ArrayList를 Set으로 변환한 것이다. 생성자에 list를 넣었다.
		// Set은 중복이 허용되지 않으므로 중복값이 제거된다.
		System.out.println(set2.size()); // 61
		
		
		// Case 3. distinct를 이용한 중복 제거
		// list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println(list.stream().count()); // 100
		System.out.println(list.stream().distinct().count()); // 61
		
		// count(): 최종 파이프 중에 하나이다. return 값이 있음.
		// disticnt(): 중복을 제거하는데, 개수를 찍어야 하는데 return 값이 없어서 count()를 사용했다.
		// 중복값이 없어진 Integer Stream
		

		// 사람 이름이 들어 있는 배열
		String[] names = { "시몬", "안드레", "야고보", "요한", "빌립", "바돌로매", "도마", "마태", "야고보", "다대오", "시몬", "가룟 유다" };
		
		Arrays.stream(names)
				.distinct() // 중복값 제거
				.filter(name -> name.length() == 3) // 이름이 3글자인 인물
				.forEach(name -> System.out.println(name));
		// 파이프의 개수가 늘어나면 배치에 따라 결과가 달라질 수 있으므로 유의한다.
		/*
		안드레
		야고보
		다대오
		*/
		System.out.println();
		System.out.println();
		
		
		List<Cup> clist = new ArrayList<Cup>();
		
		clist.add(new Cup(Cup.BLACK, 200)); // 중복
		clist.add(new Cup(Cup.BLACK, 200)); // 중복
		clist.add(new Cup(Cup.BLUE, 300));
		clist.add(new Cup(Cup.WHITE, 400));
		clist.add(new Cup(Cup.RED, 400));
		clist.add(new Cup(Cup.YELLOW, 300));
		
		// Set, distinct() > 중복 객체를 제거하려면?
		// 1. hashCode() 재정의
		// 2. equals() 재정의
		
		// 주소값을 비교하므로 두 BLACK, 200 컵이 중복처럼 보이지만, 실제로는 다른 컵으로 인식한다.
		// 상태가 똑같은 컵을 진짜로 같은 컵으로 인식하도록 해 보자.
		clist.stream()
			.distinct()
			.forEach(cup -> System.out.println(cup));
		System.out.println();
		System.out.println();
		
		
	}

	private static void m5() {

		/*
			스트림
			- 데이터 소스로부터 탐색/조작 가능한 도구
			- list.stream().forEach()
			
			forEach() 같은 메소드를 파이프, Pipe라고 부른다.
			
			파이프, Pipe
			- 스트림 객체 메소드
			
			1. 중간 파이프
				- 반환값 O + 스트림 반환
				
			2. 최종 파이프
				- 반환값 X + void
				- 반환값 O + 다른 자료형 반환
			
			요소 처리
			- forEach()
			- 최종 파이프
			
			필터링
			- filter()
			- 중간 파이프
			- Predicate (Predicate의 특성이 받은 요소를 가지고 true, false를 판단하는 역할을 제공하므로 필터로 적합하다고 판단되었다.)
		*/
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list); // [36, 12, 36, 86, 24, 1, 32, 65, 85, 86, 78, 16, 57, 7, 65, 34, 11, 37, 99, 12]
		
		// 요구사항) 짝수만 출력
		for (int n : list) {
			if (n % 2 == 0) {
				System.out.printf("%4d", n); // 36  12  36  86  24  32  86  78  16  34  12
			}
		}
		System.out.println();
		// -> 스트림으로 바꿔보자
		
		list.stream().forEach(num -> {
			if (num % 2 == 0) {
				System.out.printf("%-4d", num); // 36  12  36  86  24  32  86  78  16  34  12  
			}
		});
		System.out.println();
		// -> 좀 더 스트림의 기능을 활용하여 작성해보자. (forEach라는 파이프만 쓰는게 아니라 filter 파이프도 써보자)
		
		// filter(num -> false): 걸러내는 역할 (진짜 필터이다.)
		// 숫자 20개를 전달받고 검사를 한다.
		// 중간에 있는 파이프를 거쳐 최종 파이프까지 숫자가 전달되는 과정에서 중간에 걸러낸다고 해서 중간 파이프라고 한다.
		
		list.stream().filter(num -> num % 2 == 0).forEach(num -> {
			System.out.printf("%-4d", num);
		});
		System.out.println();
		System.out.println();
		
		
		
		
		// 데이터 리스트에서 길이가 5 이상인 데이터만 출력
		Data.getStringList().stream()
			.filter(word -> word.length() >= 5)
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		

		// 유저 리스트에서 몸무게가 1이고 성별이 남자인 사람만 출력 + 키가 180 이상인 사람
		Data.getUserList().stream()
		//  .filter(user -> user.getWeight() >= 70 && user.getGender() == 1)
			.filter(user -> user.getWeight() >= 70)
			.filter(user -> user.getGender() == 1)
			.filter(user -> user.getHeight() >= 180)
			.forEach(user -> System.out.println(user));
		System.out.println();
		
	}

	private static void m4() {

		// 스트림을 얻어오는 방법
		// 1, 2가 흔한 방법

		// 1. 배열로부터
		// 2. 컬렉션으로부터
		// 3. 숫자범위로부터
		// 4. 파일로부터
		// 5. 디렉토리로부터
		
		
		// 1. 배열로부터 얻어오는 방법
		int[] nums1 = { 10, 20, 30 };
		
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		
		// 2. 컬렉션으로부터 얻어오는 방법
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		
		
		// 3. 숫자범위로부터 얻어오는 방법
		
		// Stream<Integer>  : 범용 스트림 > forEach > Consumer<Integer>
		// IntStream		: 전용 스트림 > forEach > IntConsumer
		
		IntStream.range(1, 10).forEach(num -> System.out.println(num));
		
		
		
		try {
			// 4. 파일로부터 얻어오는 방법
			// - 스트림 > 파일 읽기
			
			// Paths.get("C:\\Class\\java\\code\\JavaTest\\data\\numbr.txt")
			// Paths.get(".\\data\\number.txt");
			
			// # 상대 절대 경로
			// '.'이 짧게 한다. -> 예약(약속)이다.
			// '.': 현재 실행파일이 있는 폴더
			// - 자바 폴더에서는 '.'이 프로젝트 루트 폴더를 가리킨다.
			
			Path path = Paths.get("data\\number.txt");
			
			Files.lines(path).forEach(line -> System.out.printf(line)); // 하나둘셋넷다섯
			System.out.println();
			
			
			// 5. 디렉토리로부터 얻어오는 방법
			// - 목록보기 > dir.listFiles()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				System.out.println(p.toFile().isFile());
				System.out.println();
			});
			
		} catch (Exception e) {
			System.out.println("at Ex74_Stream.m4");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		// 함수형 프로그래밍 == 의식의 흐름대로
		Data.getIntList().stream().forEach(num -> System.out.printf("%4d", num));
		System.out.println();
	
		Data
			.getIntList()
			.stream()
			.forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		//  36  12  36 ...
		
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println("[회원정보");
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("성별: " + user.getGender());
			System.out.println();
		});
		/*
		[회원정보
		이름: 테스트
		나이: 23
		성별: 2
		*/
		
		
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getColor());
			System.out.println();
		});
		/*
		마우스
		RED
		*/
	}

	private static void m2() {

		// 배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10); // 애플아케이드 국내 서비스 열흘 기존 모바일게임 경험 다른 새로운 경험
		
		// 1. for문
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 2. 향상된 for문
		for (String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 3. Iterator
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// 4. Stream
		Stream<String> stream = list.stream();
		
		Consumer<String> c1 = str -> System.out.print(str + " ");
		
		// forEach 메소드
		// 1. stream으로부터 얻어낸 데이터를 1개씩 가져온다. (향상된 for문처럼)
		// 2. 가져온 데이터를 Consumer.accept() 메소드의 인자로 전달하고 메소드를 호출한다.
		// 3. 요소만큼 반복한다.
		stream.forEach(c1);
		
		stream = list.stream();
		stream.forEach(c1); // 스트림을 뽑아내면 다시 쓸 수 없다. (1회용이다.)	
		
		
		// 메소드 체이닝 > 함수형 프로그래밍 방식
		list.stream().forEach(str -> System.out.println(str));
	}

	private static void m1() {

		int[] nums1 = Data.getIntArray();
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums1.length);
		
		int[] nums2 = Data.getIntArray(5);
		System.out.println(Arrays.toString(nums2));
		
		// List<Integer>
		// 업캐스팅
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3.size());
		
		List<Integer> nums4 = Data.getIntList(5);
		System.out.println(nums4);
		
		String[] txt = Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		
		Item[] item = Data.getItemArray();
		System.out.println(Arrays.toString(item));
		
		User[] list = Data.getUserArray();
		System.out.println(Arrays.toString(list));
	}
}


// m6();
// 이전에 Set 수업할 때 했던 내용이다.
class Cup {
	
	public final static int BLACK = 1;
	public final static int WHITE = 2;
	public final static int RED = 3;
	public final static int YELLOW = 4;
	public final static int BLUE = 5;
	
	private int color;
	// "빨강, 파랑.." 데이터를 나열을 해 놓고, 이중에 선택하는 이런 값들을 열거값이라고 하는데 이런 열거값을 만들 때,
	// 흔하게 할 수 있는 것 중에 하나가 final static 변수로 만드는 것이 있다.
	// final 변수로 만들었기 때문에 값이 불변하며, 상수이기 때문에 가독성도 높다.
	// String 변수로 만들 수도 있지만, 이렇게 되면 주관식으로 데이터를 받아야 하므로 오타가 날 위험이 있다. -> 오타 처리를 해야 하므로 불편하다.
	// 주관식은 개발자 손을 많이 타야 하고, 사용자가 실수를 할 확률이 높은 반면, 객관식은 알아보기도 쉬울 뿐더러 실수를 할 확률도 낮아진다.
	private int size;
	
	// 생성자
	public Cup(int color, int size) {
		this.color = color;
		this.size = size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", size=" + size + "]";
	}
	
	
	
	// 개발자의 의도(중복값 제거)대로 객체를 비교하기 위해 hashCode() 오버라이드
	@Override
	public int hashCode() {
		return ("" + this.color + this.size).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
}


// m7();
// Stream<Student> -> map() -> Stream<Result>
class Result {

	private String name;
	private String result;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
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