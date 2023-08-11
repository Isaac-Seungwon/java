package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q120 {
	
	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\이름수정.dat";
	public static final String REVISE_FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\이름수정_변환.dat";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.
		
		● 조건
		- '유재석' → '메뚜기'
		- 저장할 파일명: 이름수정_변환.dat
		
		● 리소스
		파일 > 이름수정.dat
		
		● 출력
		변환 후 다른 이름으로 저장하였습니다.
		*/

		try {
			// 입력 파일 읽기 위한 BufferedReader 생성
			BufferedReader reader = new BufferedReader(new FileReader(FILE));
			
			// 수정 후의 내용을 저장할 BufferedWriter 생성
			BufferedWriter writer = new BufferedWriter(new FileWriter(REVISE_FILE));

			String line;

			// 파일에서 한 줄씩 읽어서 수정 후 파일에 쓰기
			while ((line = reader.readLine()) != null) {
				// 수정 전
				// System.out.println(line);

				// 이름 변경
				line = line.replace("유재석", "메뚜기");
				writer.write(line);
				// writer.newLine(); // 줄 바꿈 추가

				// 수정 후
				// System.out.println(line);
			}

			System.out.println("변환 후 다른 이름으로 저장하였습니다.");

			// 스트림 닫기
			reader.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
