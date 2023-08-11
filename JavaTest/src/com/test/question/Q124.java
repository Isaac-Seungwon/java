package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q124 {
	
	public static final String GUEST_FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\검색_회원.dat";
	public static final String ORDER_FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\검색_주문.dat";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		이름을 입력받아 회원 주문 정보를 검색 후 출력하시오.
		
		● 조건
		- 파일 > 검색_회원.dat
		- 파일 > 검색_주문.dat
		
		● 입력
		이름: 홍길동 
		
		● 출력
		==== 구매내역 ==== 
		[번호]    [이름]    [상품명]    [개수]    [배송지]
		     3    홍길동     마우스          3    서울시 강동구 천호동
		*/
		
		try {
			Scanner scan = new Scanner(System.in);
			BufferedReader guestReader = new BufferedReader(new FileReader(GUEST_FILE));
			BufferedReader orderReader = new BufferedReader(new FileReader(ORDER_FILE));

			System.out.print("이름: "); // 정재재, 황길돈, 길형수...
			String name = scan.nextLine();

			String line = null;
			String num = "";
			String address = "";

			while ((line = guestReader.readLine()) != null) {

				String[] temp = line.split(",");
				
				if (temp[1].equals(name)) {
					num = temp[0];
					address = temp[2];
					break;
				}
			}

			if (!num.equals("")) {

				System.out.println("==== 구매내역 ====");
				System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");

				while ((line = orderReader.readLine()) != null) {

					String[] temp = line.split(",");

					if (temp[3].equals(num)) {
						System.out.printf("%s\t%s\t%s\t\t%s\t%s\r\n", temp[0], name, temp[1], temp[2], address);
					}
				}

			}

			scan.close();
			guestReader.close();
			orderReader.close();
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
