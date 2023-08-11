package com.test.java;

import java.util.Scanner;

public class Ex34_String {

	public static void main(String[] args) {
		
		// 34_String.java
		
		// 문자열, String
		// - JDK 제공하는 문자열 조작 기능
		
		
		// 버전 관리 시스템
		// CVS (Concurrent Versions System)
		// SVN (Subversion)
		// Git
		
		
		// m1();
		m2();
		// m3();
		m4();
		m5();
		m6();
		m7();
		m8();
		m9();
		m10();
		m11();
		m12();
		m13();
	}// main

	private static void m13() {

		// 문자열 분리
		// - String[] split(String) 
		// 구분자를 기준으로 쪼개는 메소드로, 하나의 문자열을 조각내어 모을 수 있는 게 문자열 뿐이므로, 문자열을 사용한다.
		
		String name = "가가,나나,다다,라라,마마";
		
		String[] temp = name.split(","); // split 결과 구분자는 사라지게 된다.
		
		for (int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		/*
		가가
		나나
		다다
		라라
		마마
		*/
		
		temp = name.split("다다");
		
		for (int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		/*
		가가,나나,
		,라라,마마
		*/
	}

	private static void m12() {
		
		// 문자열 치환(바꾸기)
		// - String replace(Stringold, String new)
		// - 문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드
		
		String txt = "안녕하세요. Isaac입니다.";
		
		int index = txt.indexOf("Isaac");
		
		String temp1 = txt.substring(0, index); // 안녕하세요.
		String temp2 = txt.substring((index + 5)); // 입니다.
		
		System.out.println(temp1 + "Isaac" + temp2); // 안녕하세요. Isaac입니다.
		
		System.out.println(txt.replace("Isaac", "Sopia")); // 안녕하세요. Sopia입니다.
		
		
		String txt2 = "       하나      둘       셋";
		
		System.out.printf("[%s]\n", txt2); // [       하나      둘       셋]
		System.out.printf("[%s]\n", txt2.trim()); // [하나      둘       셋]
		System.out.println(txt2.replace(" ", "")); // 하나둘셋
		
		// replace로 무언가를 삭제하고 싶으면 찾아서 ""로 교체하면 된다.
	}

	private static void m11() {

		// 문자열 검색
		// - indexOf(), lastIndexOf()
		// - startsWith(), endsWith()
		// - boolean contains(String)
		
		String txt = "안녕하세요. Isaac입니다.";
		
		System.out.println(txt.contains("Isaac")); // true
		System.out.println(txt.contains("Sopia")); // false
	}

	private static void m10() {

		// 문자열 추출
		// String substring(int beginIndex, int endIndex)
		// String substring(int beginIndex)
		
		// beginIndex: 포함(inclusive)
		// endIndex: 미포함(exclusive)
		
		// *** 자바에서는 범위를 나타낼 때, 시작 값은 포함하며 끝 값은 포함하지 않는다.
		
		// charAt은 한글자를 뽑아오지만, substring은 여러 글자를 한꺼번에 추출할 수 있다는 차이점이 있다.
		
		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3, 7)); // 라마바사
		System.out.println(txt.charAt(5)); // '바' > 문자코드값 변환 가능
		System.out.println(txt.substring(5, 6)); // "바" > 문자코드값 변환 불가능
		
		
		// 주민번호
		String jumin = "970728-2012345";
		
		// 성별?
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
		
		// 몇년생?
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1)); // 97
		System.out.println(jumin.substring(0, 2)); // 97
		
		
		// 파일 경로
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		// 1. 파일명 추출 > "Ex34_String.java"
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index + 1);
		System.out.println(filename); // Ex34_String.java
		
		// 2. 확장자 없는 파일명 추출 > "Ex34_String"
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0, index);
		System.out.println(filenameWithoutExtension); // Ex34_String
		
		// 3. 확장자 추출 > ".java"
		String extension = filename.substring(index);
		System.out.println(extension); //.java
		
	}

	private static void m9() {

		// 패턴 검색
		// - boolean startsWith(String)
		// - boolean endsWith(String)
		
		// 찾으면 true, 못 찾으면 false를 반환한다.
		
		String txt = "자바 프로그래밍";
		
		System.out.println(txt.startsWith("자바")); // 문자열이 자바로 시작하는가?
		System.out.println(txt.endsWith("프로그래밍")); // 문자열이 프로그래밍으로 끝나는가?
		
		
		String name = "홍길동";
		
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf("동") == 0);
		
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf("동") == name.length()-1);
		System.out.println();
		
		
		// 파일 경로
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		// 해당 파일이 '자바 소스 파일'입니까? > 확장자 검사
		if (path.endsWith(".java")) {
			System.out.println("자바 소스 파일");
		} else {
			System.out.println("다른 파일");
		}
	}

	private static void m8() {

		// 대소문자 변경 메소드
		// - String toUpperCase()
		// - String toLowerCase()
		
		String content = "오늘 수업은 Java입니다.";
		String word = "java";
		
		System.out.println(content);
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		// 대소문자 구분(Case sensitive)
		// 정확도가 높지만 검색률이 낮아진다.
		if (content.indexOf(word) > -1) {
			System.out.println("결과 O");
		} else {
			System.out.println("결과 X");
		}
		
		// 대소문자 구분 X (Case insensitive)
		// 이를 해결하는 방법은 모든 문자를 대문자로 만들거나 소문자로 만들어서 한 쪽에 몰아버리는 것이다.
		// 찾는 대상과 찾을 대상 모두 대문자로 바꿔버린다. (대소문자를 구분하지 않게 된다.)
		// 정확도는 낮지만 검색률은 높아진다.
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("결과 O");
		} else {
			System.out.println("결과 X");
		}
	}

	private static void m7() {

		// 주민등록번호 > '-' 기입
		String jumin = "970728-2012345";
		
		// 위치를 가지고 글자 검색하기 (6번 위치에 '-'가 있는가?)
		// 글자 하나 단위로밖에 취급을 못 하므로 활용도가 낮다.
		if (jumin.charAt(6) == '-') {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		// 글자를 가지고 위치 검색하기 ('-'가 6번 위치에 있는가?)
		// 문자 단위로 취급을 할 수 있으므로 활용도가 높다.
		if (jumin.indexOf("-") == 6) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		
		// 게시판 글쓰기 > 관리자 > 금지어
		String word = "바보";
		String content = "당신만을 바라보는 바보가 되어버렸습니다.";
		
		// content에서 word를 찾은 경우 (금지어가 발견된 경우)
		if (content.indexOf(word) > -1) {
			System.out.println("금지어 발견");
		} else {
			System.out.println("금지어 발견 못 함");
		}
		
		// 금지어가 여러 개인 경우
		String[] words = {"바보", "ㅂㅏㅂㅗ", "멍청이", "해삼", "말미잘"};
		
		for (int i=0; i<words.length; i++) {
			if (content.indexOf(words[i]) > -1) {
				System.out.println("금지어 발견");
				break;
			}
			/*else {
				System.out.println("금지어 발견 못 함");
			} 금지어를 모두 검색해야 하므로 else는 사용하지 않는다. 대신 break를 사용한다.*/
		}
		
	}

	private static void m6() {

		// 문자열 조작
		// 1. int length()
		// 2. char charAt(int)
		// 3. String trim()
		
		// 문자열 검색 <굉장히 자주 사용한다.>
		// - int indexOf(char)
		// - int indexOf(String)
		// - int indexOf(char, int)
		// - int indexOf(String, int)
		
		
		String txt = "안녕하세요. Isaac입니다.";
		
		int index = -1; // 존재하지 않는 위치 값으로 0보다 하나 적은 값인 -1을 이용한다. (애초에 인덱스에 존재할 수 없는 숫자이기 때문에)
		// 무심결에 0으로 초기화하지 않도록 한다.
		
		// 문자
		index = txt.indexOf('안');
		System.out.println(index); // 0 인덱스의 처음 시작은 0이다.
		
		index = txt.indexOf('I');
		System.out.println(index); // 7
		
		index = txt.indexOf('김');
		System.out.println(index); // -1 문자가 없을 경우 -1을 반환한다.
		
		
		// 문자열
		index = txt.indexOf("Isaac");
		System.out.println(index); // 7 문자열일 경우 첫 번째 글자의 인덱스를 반환한다.
		
		
		// 찾는 단어가 중복 사용되었을 경우
		txt = "안녕하세요. Isaac입니다. 반갑습니다. Isaac입니다. 안녕히가세요. Isaac입니다.";
		
		index = txt.indexOf("Isaac");
		System.out.println(index); // 7 첫 번째 Isaac만을 찾는다. 한계가 있다.
		// index = txt.indexOf("Isaac", 0); 뒤에 0이 들어있다고 생각하면 된다. 0은 찾기 시작할 위치이다.
		
		index = txt.indexOf("Isaac", 10);
		System.out.println(index); // 24 두 번째 Isaac을 찾는다.

		index = txt.indexOf("Isaac", 25);
		System.out.println(index); // 42 세 번째 Isaac을 찾는다.
		
		
		index = 0;
		
		for (int i=0; i<3; i++) {
			
			index = txt.indexOf("Isaac", index);
			System.out.println("for" + index);
			
			index += 3;
		}
		// 하지만 Isaac이 얼마나 들어있을지는 알 수 없다. 때문에 while로 고친다.

		index = 0;
		
		while (true) {
			index = txt.indexOf("Isaac", index);
			
			if (index == -1) { // Isaac을 못 찾은 경우
				break;
			}
			
			System.out.println("while" + index);
			
			index += 3;
		}
		
		
		txt = "안녕하세요. Isaac입니다. 반갑습니다. Isaac입니다. 안녕히가세요. Isaac입니다.";
		
		
		// indexOf와 lastIndexOf의 차이
		
		// 검색 방향: 왼쪽 > 오른쪽
		System.out.println(txt.indexOf("Isaac")); // 7
		
		// 검색 방향: 오른쪽 > 왼쪽
		System.out.println(txt.lastIndexOf("Isaac")); // 42
		System.out.println(txt.lastIndexOf("Isaac", 21)); // 7
	}

	private static void m5() {

		// 공백 제거
		// - String trim()
		// - 문자열 내의 공백 (Whitespace > 스페이스, 탭, 개행) 문자를 제거
		// - 문자열의 시작과 끝에 존재하는 공백을 제거한다. (***)
		
		String txt = "       하나      둘       셋";
		
		System.out.printf("[%s]\n", txt); // [       하나      둘       셋]
		System.out.printf("[%s]\n", txt.trim()); // [하나      둘       셋] 맨 앞의 공백을 사용자가 실수로 입력했다고 판단한다.
	}

	private static void m4() {
		
		// 주민번호: 970727-100001
		
		String jumin = "970727-100001";
		
		System.out.println(jumin);
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
			
			if (jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
		} else {
			System.out.println("올바르지 않은 주민번호");
		}
	}

	private static void m3() {
		
		Scanner scan = new Scanner(System.in);
		
		// 요구사항) 회원가입 > 아이디 입력 > 영어 소문자만 입력
		
		System.out.print("아이디: ");
		
		String id = scan.nextLine();
		
		// ID: hong > 'h', 'o', 'n', 'g'
		
		for (int i=0; i<id.length(); i++) {
			char c = id.charAt(i);
			
			// System.out.println(c);

			// 소문자 검증
			if (c < 'a' || c > 'z') {
				System.out.println("잘못된 문자가 발견되었습니다.");
				break;
			}
		}
		
		System.out.println("종료");
		
	}

	private static void m2() {
		
		// 문자열 추출
		// - char charAt(int index)
		// - 자바: Zero-based Index (0부터 시작)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		char c = txt.charAt(3); // 세
		System.out.println(c);
		
		c = txt.charAt(7); // 홍
		System.out.println(c);
		
		c = txt.charAt(13); // .
		System.out.println(c);
		
		
	}

	private static void m1() {
		
		// 문자열(String), 문자(char)
		// 문자열 == 문자의 집합
		// String == char[] 스트링은 캐릭터 배열이다. 완전히 동일하진 않지만 80~90% 동일하다.
		
		// 문자열 조작 기능 == 배열 조작 기능 유사
		
		// 문자열 길이
		// - int length()
		// 문자열의 글자수
	
		// 홍길동입니다.
		char[] clist = { '홍', '길', '동' };
		System.out.println(clist.length); // 3
		
		String str = "홍길동입니다.";
		System.out.println(str.length()); // 7
		
		System.out.println("홍길동".length()); // 3
		
		System.out.println("A1가$".length()); // 4
		
		
		// 요구사항) 회원가입 > 이름 입력 > 2~5자 이내로 작성
		// 유효성 검사
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("올바른 이름입니다.");
		} else {
			System.out.println("이름을 2~5자 이내로 작성하세요.");
		}
		
		
	}
}
