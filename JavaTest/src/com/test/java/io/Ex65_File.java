package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex65_File {

	public static final String FILE = "C:\\Class\\code\\java\\file\\list.txt";
	
	public static void main(String[] args) {
		
		// Ex65_File.java
		
		/*
			파일 입출력
			- 응용프로그램 <- (데이터) -> 저장장치
		
			저장장치
			- 데이터 1, 0으로 저장
			- 데이터의 자료형 존재 X > 모두 다 문자로 생각하면 된다.
		
		
			# 인코딩, Encoding
			- 문자 코드(자바 데이터)를 부호화(1,0)하는 작업
			- 부호화란 1과 0으로 바꾸는 작업을 의미한다.
			- 예) 자바 프로그램에서 "홍길동"을 저장하려고 할 때, 텍스트 파일을 1001010101100110으로 바꾼다. 
			
			# 디코딩, Decoding
			- 부호화 데이터를 문자 코드로 변환하는 작업
			- 1과 0으로 된 데이터를 읽어서 우리가 쓰는 데이터로 바꾸는 작업을 의미한다.
			
			
			# 인코딩 / 디코딩 규칙
			- 문자를 1과 0로 바꾸려면 어떤 문자를 1과 0으로 바꿀건지 규칙을 만들어야 하는데,
			국가마다 쓰는 표현이나 관계들이 복잡하게 얽혀있다보니 많은 규칙이 만들어지게 되었다.
			- 99% 이상의 일반적인 개발자는 대략적인 특징에 대해 알고 있으면 된다.
			- ***** byte 수를 기억하자!
			
			- 우리나라와 관련된 규칙
			1. ISO-8859-1
			2. EUC-KR
			3. ANSI
			4. MS949 (CP949)
			5. UTF-8
			6. UTF-16
			7. ASCII
			
			ANSI (ISO-8859-1, EUC-KR, MS949)
			1. 영어(숫자, 특수문자, 서유럽어): 1byte
			2. 한글(한자, 일본어 등): 2byte
			
			UTF-8
			1. 영어: 1byte
			2. 한글: 3byte
			
			UTF-16
			1. 영어: 2byte
			2. 한글: 2byte
			
			1. 인코딩 / 디코딩 규칙 중에 하나를 선택한다.
			
			
			국제 표준으로 UTF-8을 사용하고 있다.
			저장할 때 방식하고 읽을 때 방식이 서로 어긋날 때, 서로 바이트 수가 달라지면 데이터가 깨져버리는 현상이 발생한다.
			과거에 이러한 현상은 웹 메일에서 많이 발생하곤 했다.
			
			
		*/
		
		m1();
		m2();
		m3();
		m4();
		m5();
		m6();
		m7();
		m8();
	}

	private static void m8() {
		// "C:\Class\code\java\JavaTest\src\com\test\java\collection\Ex61_Stack.java"
		
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Class\\code\\java\\JavaTest\\src\\com\\test\\java\\collection\\Ex61_Stack.java"));

			String line = null;
			int n = 1;
			
			while ((line = reader.readLine()) != null) {
				System.out.printf("%3d: %s\n", n, line);
				n++;
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		
	}

	private static void m7() {

		// 메모장 쓰기
		try {
		    Scanner scan = new Scanner(System.in);

		    System.out.print("저장할 파일명: ");
		    String filename = scan.nextLine();

		    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Class\\code\\java\\file\\memo.txt" + filename + ".txt"));

		    boolean loop = true;

		    while (loop) {
		        System.out.print("입력: ");
		        String line = scan.nextLine();

		        if (line.equals("exit")) {
		            break;
		        }

		        writer.write(line); // 한 줄 입력(scan) > 한 줄 쓰기(writer)
		        writer.write("\r\n");
		    }

		    writer.close();

		} catch (Exception e) {
		    System.out.println("Error");
		    e.printStackTrace();
		}

	}

	private static void m6() {
		// 읽기
		// FileInputStream > FileReader > BufferedReader
		try {
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력을 받는 스트림
			
			BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Class\\code\\java\\file\\memo.txt"));
			
			// String line = reader2.readLine();
			// System.out.println(line);
			
			String line = null;
			
			while ((line = reader2.readLine()) != null) {
				System.out.println(line);
			} // 라인 단위로 읽을 수 있다. -> 선호도가 높음
			
			// 스트림 닫기
			reader1.close();
			reader2.close();

			System.out.println("종료");

		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	private static void m5() {

		// 쓰기
		// FileOutputStream > FileWriter > BufferedWriter
		
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Class\\code\\java\\file\\memo.txt"));

			writer.write("하나");
			writer.write('A');
			writer.write("\r\n");
			writer.write("둘");
			writer.newLine(); // BufferedWriter에만 있는 기능
			writer.write("셋");
			
			// 스트림 닫기
			writer.close();

			System.out.println("종료");

		} catch (Exception e) {

			System.out.println("Error");
			e.printStackTrace(); 

		}
		
	}

	private static void m4() {

		try {
			
			FileReader reader = new FileReader("C:\\Class\\code\\java\\file\\member.txt");
			
//			int code = reader.read();
//			System.out.println((char)code);

			int code = -1;
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			// 스트림 닫기
			reader.close();
			
			System.out.println("종료");
			
		} catch (Exception e) {
			
			System.out.println("Error");
			e.printStackTrace();
			
		}
	}

	private static void m3() {

		// 쓰기
		// FileOutputStream > FileWriter
		
		try {
			
			FileWriter writer = new FileWriter("C:\\Class\\code\\java\\file\\member.txt");
			
			// writer.write(65);
			// writer.write("Isaac");

			writer.write("아이작");
			
			// 스트림 닫기
			writer.close(); // 한 번 닫혔으면 쓰기 위해서 다시 열어야 한다.
			
			/*
			FileWriter writer = new FileWriter("C:\\Class\\code\\java\\file\\member.txt");
			writer.write("Isaac");
			writer.close();
			*/
			
			System.out.println("종료");
			
		} catch (Exception e) {
			
			System.out.println("Error");
			e.printStackTrace();
			
		}
		
		// 읽기
		// FileInputStream > FileReader
	}

	private static void m2() {

		try {
			// 파일 읽기
			// - FileOutputStream
			// - FileInputStream
			
			// 읽기 스트림 객체 
			FileInputStream stream = new FileInputStream(Ex65_File.FILE); // Ex65_File. 경로 관리
			
			int code = -1;
			
			// *********** 이 코드는 외워야 함 진짜 많이 쓴다!
			while ((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			System.out.println();
			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
//
//			code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	
	}

	private static void m1() {

		// 파일 쓰기
		// - 스트림 객체 만들기
		
		// 우리가 쓰는 대부분의 스트림은 일방통행이며, 내뱉기만 하는 빨대가 따로 있고, 들이마시는 빨대가 따로 있다.
		// 양방향인 스트림보다 단방향인 스트림이 더 안정적이기 때문에 구분하여 사용하는 편이다.
		
		
		// 쓰기 스트림 객체
		// 1. 생성 모드, Create mode > 덮어쓰기
		//	- 실행할 때마다 기존에 파일이 있든 말든 새로 만들고 새로운 내용을 추가한다.
		//	- 기본값이다.
		//	a. 파일이 존재하지 않으면 자동으로 생성한다.
		//	b. 파일이 존재하면 항상 덮어쓰기를 한다.
		
		// 2. 추가 모드, Append mode > 기존 내용
		//	- 기존 내용을 내버려 두고 그 다음에 이어쓴다.
		//	a. 파일이 존재하지 않으면 자동으로 생성한다.
		//	b. 파일이 존재하면 항상 이어쓰기를 한다.
		
		try {
			File file = new File("C:\\Class\\code\\java\\file\\list.txt");
			
			// 스트림 객체를 생성하는 행위를 '스트림을 연다(open)'고 표현한다.
			// - stream을 가지고 쓰기 작업을 하면 file에 적용이 된다.
			// - 현재 경로에 list.txt 파일은 없지만, 쓰기 작업을 하면 자동으로 파일이 생성된다.
			// - 바이트 단위 쓰기(1byte)
			FileOutputStream stream = new FileOutputStream(file); // 추가 모드
			
			/*
			stream.write(65); // A
			stream.write(66); // B
			stream.write(67); // C
			*/
			
			/*
			stream.write('A'); // A
			stream.write('B'); // B
			stream.write('C'); // C
			*/
			
			// stream.write('이');
			
			
			String txt = "Hello~ Hong!!";
			
			for (int i = 0; i < txt.length(); i++) {
				stream.write(txt.charAt(i));
			}
			
			
			// 스트림 닫기
			// 스트림을 썼으면 반드시 닫아줘야 한다. 닫지 않으면 저장이 안 되고 잠긴 파일이 되는 현상이 일어날 수 있다.
			// 작성할 수 있는 참조객체를 열고 작성을 한다. 그런데 write() 메소드가 실시간으로 작성하는 게 아니다.
			// 실제 파일이 아닌 메모리 임시 버퍼에 저장을 해 두었다가 close()메소드가 실행되는 순간 텍스트 파일에 기록하기 때문이다.
			// 이러한 작업 과정을 거치는 이유는 성능 문제 때문이다.
			// 버퍼가 왔다갔다 하는 속도가 주기억장치보다 훨씬 빠르기 때문에 입력 버퍼와 출력 버퍼가 만들어진 것이다.
			stream.close();
			
			System.out.println("종료");
		
		} catch (Exception e) {
			System.out.println("at Ex_File.m1");
			e.printStackTrace();
		}
		
		
		
		
	}
}
