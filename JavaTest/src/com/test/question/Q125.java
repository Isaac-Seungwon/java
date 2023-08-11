package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Q125 {
	
	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\괄호.java";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		모든 괄호가 서로 짝이 맞는지 검사하시오.
		
		● 조건
		- 대상 괄호: (), {}
		- Stack 사용
		
		● 리소스
		파일 > 괄호.dat
		
		● 출력
		올바른 소스입니다.
		
		● 출력
		올바르지 않은 소스입니다.
		*/
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE));

			Stack<Character> stack = new Stack<Character>();
			
			String line = null;
			String text = "";
			
			while ((line = reader.readLine()) != null) {

				text += line + "\r\n";
				// System.out.println(line);
			}

			reader.close();
			
			for (int i=0; i<text.length(); i++) {
				
				char c = text.charAt(i);
				
				if (c == '(' || c == '{') {
					stack.push(c);
				}
				
				if (c == ')' || c == '}') {
					stack.pop();
				}
			}
			
			if (stack.size() == 0) {
				System.out.println("올바른 소스입니다.");
			} else {
				System.out.println("올바르지 않은 소스입니다.");
			}
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
