package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q122 {
	
	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\성적.dat";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		
		● 조건
		- 합격 조건: 3과목 평균 60점 이상
		- 과락 조건: 1과목 40점 미만
		
		● 리소스
		파일 > 성적.dat
		
		● 데이터
		//이름,국어,영어,수학
		홍길동,50,60,70
		아무개,100,80,50
		하하하,98,48,56
		
		● 출력
		[합격자]
		홍길동 
		하하하 
		아무개 
		
		[불합격자]
		호호호 
		후후후 
		*/

		try {
			Scanner scan = new Scanner(System.in);
			BufferedReader reader = new BufferedReader(new FileReader(FILE));

			String line = null;
			
			LinkedList<String> pass = new LinkedList<String>();
			LinkedList<String> fail = new LinkedList<String>();

			while ((line = reader.readLine()) != null) {
				// 한 줄을 ',' 기준으로 나누어 배열로 저장
				String[] temp = line.split(",");
				int result = (Integer.parseInt(temp[1]) + Integer.parseInt(temp[2]) + Integer.parseInt(temp[3])) / 3;
				
				// 평균 점수에 따라 합격 또는 불합격 리스트에 추가
				if (result >= 60) {
					pass.add(temp[0]);
				} else {
					fail.add(temp[0]);
				}
			}

			System.out.println("[합격자]");
			while (true) {
				if (!pass.isEmpty()) {
				    System.out.println(pass.poll());
				} else {
					break;
				}
			}
			
			System.out.println("\n[불합격자]");
			while (true) {
				if (!fail.isEmpty()) {
				    System.out.println(fail.poll());
				} else {
					break;
				}
			}
			
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
