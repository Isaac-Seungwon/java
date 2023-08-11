package com.test.java.dummy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Ex75 {
	
	public static void main(String[] args) {
		
		// Ex75.java
		
		/*
			프로그램 제작 > 데이터
			1. 테스트용 데이터 > 10%
			 - 진짜 데이터
			 - 사람이 직접 기입한다.
			 
			2. 더미 데이터 > 90%
			 - 양만 채우는 용도
			 - 프로그램으로 작성한다.
			 
			둘 다 데이터인데, 더미 데이터는 양만 채우기 위한 데이터이다.
			
			
			게시판
			- "게시판입니다." x 200개
		
		
			회원 가입 + 목록
			a. JavaTest > data > "member.txt"
			b. 1,홍길동,20,010-0000-0000, 서울시 강남구 역삼동 > 규칙
			c. 데이터 생성
		
		*/
		
		Random rnd = new Random();
		
		// 이름
		String[] name1 = { "김", "이", "박", "최", "정", "현", "길", "조", "신", "허" };
		String[] name2 = { "진", "민", "인", "지", "명", "정", "석", "길", "원", "현", "동", "덕" };
		
		// 주소
		String[] address1 = { "서울시", "부산시", "대전시", "광주시", "제주시" };
		String[] address2 = { "강동구", "강남구", "강서구", "강북구", "중구" };
		String[] address3 = { "역삼동", "대치동", "압구정동", "천호동", "방배동" };
		
		
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("data\\member.txt"));

			for (int i = 0; i < 100; i++) {
				// 회원 번호
				int no = i + 1;

				// 회원명 
				String name = name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name2.length)]
						+ name2[rnd.nextInt(name2.length)];

				// 나이 (20 ~ 60)
				int age = rnd.nextInt(41) + 20;

				// 연락처
				String tel = "010-" + (rnd.nextInt(8999) + 1000) + "-" + (rnd.nextInt(8999) + 1000);

				// 주소
				String address = address1[rnd.nextInt(address1.length)] + " " + address2[rnd.nextInt(address2.length)]
						+ " " + address3[rnd.nextInt(address3.length)] + " " + (rnd.nextInt(100) + 20) + "번지";

				writer.write(String.format("%d,%s,%d,%s,%s\r\n", no, name, age, tel, address));

			} //for
			
			writer.close();
			System.out.println("더미 데이터 생성 완료");
			
		} catch (Exception e) {
			System.out.println("at Ex75.main");
			e.printStackTrace();
		}
		
	}
}
