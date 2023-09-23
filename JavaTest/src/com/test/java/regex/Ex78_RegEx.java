package com.test.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex78_RegEx {

	public static void main(String[] args) {

		// 정규표현식 +자바 >적용
		// -검색(+치환)
		// -분리 > split()
		// -유효성 검사 > Pattern, Matcher

		// 1.정규 표현식 객체
		// 2.다른 객체의 기능 중 > 일부 정규 표현식 지원
		
		m1();
		m2();
		m3();
		m4();
		m5();
	}// main

	private static void m5() {

		//유효성 검사
		
		//회원 가입 > 유효성 검사
		//1. 이름 > 필수, 한글, 2~5자 이내
		//2. 이메일 > 필수, 이메일 형식
		//3. 나이 > 필수, 숫자, 18세 이상 ~ 100세 이하
		//4. 아이디 > 필수, 영어+숫자+_ 조합, 숫자로 시작 불가능, 4~12자 이내
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[회원 가입]");
		
		String name = getData(scan, "이름");
		String email = getData(scan, "이메일");
		String age = getData(scan, "나이");
		String id = getData(scan, "아이디");
		
		// 일괄 유효성 검사
		if (isValid(name, email, age, id)) {
			System.out.println("가입 완료");
		} else {
			System.out.println("가입 실패");
		}
	}

	private static boolean isValid(String name, String email, String age, String id) {
		// 유효성 검사
		String regex = ""; // 정규식
		Pattern p1 = null; // 정규식 객체
		Matcher m1 = null; // 결과 객체
		
		
		// 1. 이름 > 필수, 한글, 2~5자 이내
		regex = "^[가-힣]{2,5}$"; //^:대상이 반드시 [가-힣]로 시작해야 한다. $: 이 대상이 이 글자들로 끝나야 한다.
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(name); // 사용자가 입력한 이름에서 패턴 검색
		
		if (!m1.find()) {
			System.out.println("이름 > 필수, 한글, 2~5자 이내");
			return false;
		}
		
		
		// 2. 이메일 > 필수, 이메일 형식
		regex = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(email);
		
		if (!m1.find()) {
			System.out.println("이메일 > 필수, 이메일 형식");
			return false;
		}
		
		// 3. 나이 > 필수, 숫자, 18세 이상 ~ 100세 이하
		regex = "^[0-9]{2,3}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(age);
		
		if (!m1.find()
				|| (Integer.parseInt(age) < 18 || Integer.parseInt(age) > 100)) {
			System.out.println("나이 > 필수, 숫자, 18세 이상 ~ 100세 이하");
			return false;
		}
		
		// 4. 아이디 > 필수, 영어+숫자+_ 조합, 숫자로 시작 불가능, 4~12자 이내
		regex = "^[A-Za-z_][A-Za-z0-9]{4,12}$";
		regex = "^[A-Za-z_]\\w{4,12}$";
		
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(id);
		
		if (!m1.find()) {
			System.out.println("아이디 > 필수, 영어+숫자+_ 조합, 숫자로 시작 불가능, 4~12자 이내");
			return false;
		}
		
		
		return true;
	}
	
	private static String getData(Scanner scan, String label) {
		System.out.print(label + ": ");
		return scan.nextLine();
	}

	private static void m4() {

		String txt = "안녕하세요. 홍길동입니다."
				+ "네? 당신 이름도 길동이라구요?"
				+ "아~ 김길동이요. 저쪽에 최길동도 있습니다."
				+ "그리고 남궁길동도 있습니다.";
		
		//요구사항) 모든 길동이 찾기
//		String regex = "[홍김최(남궁)]?길동";
		// choice는 한글자만을 대상으로 하기 때문에 2글자를 찾으려고 할 경우 원하는 결과가 나오지 않는다.
		// (남궁)으로 괄호로 묶더라도 (, )를 따로 문자로 인식한다.
		
		String regex = "(홍|김|최|남궁)?길동";
		
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
		
		while (m1.find()) {
			System.out.println("찾은 이름: " + m1.group());
			System.out.println("성씨: " + m1.group(1));
			System.out.println();
		}
	}

	private static void m3() {
		// 정규 표현식 객체
		String txt = "제 연락처는 010-1234-5678입니다. 추가 연락처는 010-1111-1111입니다.";
		
		
		// 정규표현식 객체 생성
		// String regex = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
		String regex = "(\\d{3})-(\\d{3,4})-\\d{4}";
		
		// p1 > 정규표현식 객체
		Pattern p1 = Pattern.compile(regex);
		
		// txt을 대상으로 p1의 패턴을 검색
		p1.matcher(txt);
		
		// 문자열을 뒤져서 전화번호가 있는지 없는지를 검색한다.
		
		// txt을 대상으로 p1의 패턴을 검색
		Matcher m1 = p1.matcher(txt);
		
//		System.out.println(m1.fine()); // 검색 결과
		
//		if (m1.find()) {
//			System.out.println("txt에서 전화번호 발견 O");
//		} else {
//			System.out.println("txt에서 전화번호 발견 X");
//		}
		
//		System.out.println(m1.find()); // 010-1234-5678
//		System.out.println(m1.find()); // 010-1111-1111
//		System.out.println(m1.find()); // X
		
		// 전화번호 > 총 몇 번 발견되었는가?
//		int count = 0;
//		
//		while (m1.find()){
//			count++;
//		}
//		
//		System.out.printf("전화번호가 총 %d회 발견되었습니다.\n", count);
		
		while (m1.find()) {
			
			System.out.println("[전화번호 발견]");
			System.out.println("전화번호: " + m1.group(0));
			System.out.println("통신사: " + m1.group(1));
			System.out.println();
		}
		
	}

	private static void m2() {

		String name = "홍길동,아무개;하하하,,테스트 이순신"; // CSV
		
		String[] list = name.split("[,; ]{1,2}");
		
		for (String item : list) {
			System.out.println(item);
		}
		
		/*
		csv 파일을 만들다가 ,를 찍어야 하는데 ;를 찍은 경우가 생겼을 수 있다.
		*/
	}

	private static void m1() {
		
		// 게시판 > 개인 정보 기재 불가(전화번호) > 마스킹
		String txt = "안녕하세요. 홍길동입니다.\r\n"
				+ "제 연락처는 010-1234-5678입니다.\r\n"
				+ "제 메일은 hong@gmail.com입니다.\r\n"
				+ "추가 연락처는 010-9876-5432입니다.\r\n";

		// # 마스킹 작업
		
		// 모든 전화번호 마스킹
		System.out.println(txt.replaceAll("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX"));
		
		// 이메일 마스킹
		System.out.println(txt.replaceAll("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}", "OOOOO@OOO.com"));
		
		// 문장 내 모든 개인 연락처와 이메일 마스킹
		System.out.println(txt.replaceAll("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX").replaceAll("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}", "OOOOO@OOO.com"));
		
		// 첫 번쨰 전화번호만 마스킹
		System.out.println(txt.replaceFirst("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX"));
	}
}