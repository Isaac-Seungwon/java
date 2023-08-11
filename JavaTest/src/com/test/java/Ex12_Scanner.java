package com.test.java;

import java.util.Scanner;

public class Ex12_Scanner {

	public static void main(String[] args) {
		
		// Ex12_Scanner.java

		try {
			Scanner scan = new Scanner(System.in); // Wrapper Class
			
			System.out.println("문자열: ");
			String line = scan.nextLine(); // scan.nextLine()은 reader.readLine()과 동일하다.
			System.out.println(line);
			
			System.out.println("숫자: ");
			int num = scan.nextInt(); // 변환 기능이 포함되어 있어 Integer.parseInt("100")을 하지 않아도 된다.
			System.out.println(num);
		} catch(Exception ex)
		{
		}
	}
}
