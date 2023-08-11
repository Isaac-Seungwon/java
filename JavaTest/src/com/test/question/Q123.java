package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q123 {

	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\단일검색.dat";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		이름을 입력받아 회원 정보를 검색 후 출력하시오.
		
		● 리소스
		파일 > 단일검색.dat
		
		● 입력
		이름: 홍길동 
		
		● 출력
		[홍길동]
		번호: 33 
		주소: 서울시 강남구 역삼동 
		전화: 010-2345-6789 
		*/
		
		try {
			Scanner scan = new Scanner(System.in);
			BufferedReader reader = new BufferedReader(new FileReader(FILE));

			System.out.print("이름: "); // 유게무, 이형석, 홍길석...
			String name = scan.nextLine();

			String line = null;

			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				//System.out.println(temp[1]);
				
				if (temp[1].equals(name)) {
					System.out.printf("[%s]\n", temp[1]);
					System.out.printf("번호: %s\n", temp[0]);
					System.out.printf("주소: %s\n", temp[2]);
					System.out.printf("전화: %s\n", temp[3].trim());
					break;
				}
			}

			reader.close();
			scan.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
