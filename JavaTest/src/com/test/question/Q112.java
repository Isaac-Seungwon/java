package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {
	public static void main(String[] args) {
		/*
		● 요구사항
		지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
		
		● 조건
		- C:\class\java\file\AAA\test.txt → C:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
		- BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
		
		● 입력 1
		파일 이동을 실행합니다.
		같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) y 
		
		● 출력 1
		y. 파일을 덮어썼습니다.
		
		● 입력 2
		파일 이동을 실행합니다.
		같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) n 
		
		● 출력 2
		n. 작업을 취소합니다.
		*/
		
		Scanner scan = new Scanner(System.in);

		File file1 = new File("C:\\Class\\code\\java\\file\\AAA\\test.txt");
		File file2 = new File("C:\\Class\\code\\java\\file\\BBB\\test.txt");

		System.out.println("파일 이동을 실행합니다.");
		
		if (!file2.exists()) {
			
			// 대상 폴더에 동일한 파일명의 파일이 존재하지 않는 경우 바로 이동
			file1.renameTo(file2);
			System.out.println("파일 이동을 완료했습니다.");

		} else {
			
			// 대상 폴더에 이미 동일한 파일명의 파일이 존재하는 경우 덮어쓸지 묻기
			System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) ");
			
			// String answer = scan.nextLine(); // 대답을 저장하는 변수 skip
			
			if (scan.nextLine().equals("y")) {
				// 덮어쓰기를 선택한 경우 기존 파일 삭제 후 이동
				file2.delete();
				file1.renameTo(file2);
				System.out.print("y. 파일을 덮어썼습니다.");
			} else {
				System.out.print("n. 작업을 취소합니다.");
			}
		}
		
		scan.close();
	}
}
