package com.test.java.io;

import java.io.File;
import java.util.Calendar;

public class Ex64_File {
	
	// 누적 변수
	private static int count = 0; // 파일 개수
	private static int dcount = 0; // 폴더 개수
	private static long length = 0; // 폴더 크기
	
	public static void main(String[] args) {
		
		/*
			1. 파일/디렉토리 조작
				- 윈도우 탐색기로 하는 모든 행동
				- 파일 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기, 삭제하기
				- 폴더 > 정보 확인, 새로 만들기, 이름 바꾸기, 이동하기, 삭제하기
				
			2. 파일 입출력
				- 파일 > 읽기 / 쓰기
				- 메모장 기능
		*/
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		//m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
//		m13();
		
		m14();
		m15(); // ***** 잘 기억해 두기!!
		
	} // main

	private static void m15() {

		// 특정 폴더 > 파일 개수 세기

		File dir = new File("C:\\이승원\\Isaac portfolio\\8 AWS 클라우드 & Elasticsearch\\eclipse");
		
		if (dir.exists()) {
			countFile(dir);
			
			System.out.printf("총 파일 개수: %,d개\n", count); // 총 파일 개수: 12,020개
			System.out.printf("총 폴더 개수: %,d개\n", dcount); // 총 폴더 개수: 2,632개
			System.out.printf("폴더 크기: %,dbyte\n", length); // 폴더 크기: 756,135,133byte
		}
	}

	private static void countFile(File dir) {
		// 1. 목록 가져오기
		File[] list = dir.listFiles();
		
		// 2. 파일 개수
		for (File subfile : list) {
			if (subfile.isFile()) {
				count++; // 파일 카운트
				
				length += subfile.length(); // 파일 크기를 누적
			}
		}
		
		// 3. 자식 폴더를 대상으로 1~2번을 반복
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				
				dcount++; // 폴더 카운트
				
				// 1~2번 실행 > 3번 > 손자 폴더
				countFile(subdir); // 자식 폴더 > 반복
			}
		}
	}

	private static void m14() {
		
		// 특정 폴더 > 파일 개수 세기
		
		File dir = new File("C:\\이승원\\Isaac portfolio\\8 AWS 클라우드 & Elasticsearch\\eclipse");
		
		int count = 0; // 누적 변수
		
		if (dir.exists()) {
			File[] list = dir.listFiles();
			
			for (File subfile : list) {
				// 파일 검증
				if (subfile.isFile()) {
					count++;
				}
			}
			
			for (File subdir : list) {
				// 폴더 검증
				if (subdir.isDirectory()) {
					
					// 자식 폴더의 내용을 가져옴
					File[] sublist = subdir.listFiles();
					
					for (File subsubfile : sublist) {
						// 파일 검증
						if (subsubfile.isFile()) {
							count++;
						}
					}
					
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							
							// 손자 폴더의 내용을 가져옴
							File[] subsublist = subsubdir.listFiles();
							
							for (File subsubsubfile : subsublist) {
								if (subsubsubfile.isFile()) {
									count++;
								}
							}
						}
					}
				}
			}
			
			System.out.printf("총 파일 개수: %,d개\n", count);
		}// if
		
		
		
	}

	private static void m13() {

		// 폴더의 내용 보기(자식 폴더, 파일)
		
		String path = "C:\\이승원\\Isaac portfolio\\8 AWS 클라우드 & Elasticsearch\\eclipse";
		
		File dir = new File(path);
		
		/*
		if (dir.exists()) {
			
			// list() 메소드
			dir.list();
			
			// listFiles() 메소드
			dir.listFiles();
			
			String[] list = dir.list();
			
			for (String f : list) {
				// 파일명, 폴더명
				System.out.println(f);
				
				File file = new File(path + "\\" + f);
				System.out.println(f + " > " + (file.isFile() ? "파일" : "폴더"));
			}
		}
		*/
		
		/*
		dir.listFiles();
		
		File[] list = dir.listFiles(); // 디렉토리를 조작할 때 가장 많이 쓴다.
		
		for (File f : list) {
			
			System.out.printf("%s - %s\n"
								, f.getName()
								, f.isDirectory());
		}
		*/
		
		// 탐색기 느낌
		File[] list = dir.listFiles();
		
		for (File d : list) {
			
			if (d.isDirectory()) {
				System.out.printf("[%s]\n", d.getName());
			}
		}
		
		for (File f :list) {
			if(f.isFile()) {
				System.out.println(f.getName());
			}
		}
	}

	private static void m12() {

		// 폴더 > 삭제하기
		// - 빈 폴더일 때에만 가능하다.
		// - 내용물(파일, 자식 폴더)이 있으면 삭제가 불가능하다.
		File dir = new File("C:\\class\\code\\java\\aaa");
		
		if (dir.exists()) {
			System.out.println(dir.delete());
		}
		
	}

	private static void m11() {

		// 폴더 > 이름 바꾸기
		File dir = new File("C:\\Class\\code\\java\\file\\할일");
		File dir2 = new File("C:\\Class\\code\\java\\move\\할일");
		
		if (dir.exists()) {
			
			System.out.println(dir.renameTo(dir2));
			
		}
		
	}
	
	private static void m10() {

		// 폴더 > 이름 바꾸기
		File dir = new File("C:\\Class\\code\\java\\file\\날짜");
		File dir2 = new File("C:\\Class\\code\\java\\file\\할일");
		
		if (dir.exists()) {
			
			System.out.println(dir.renameTo(dir2));
			
		}
		
	}

	private static void m9() {

		// 요구사항) 날짜별 폴더 > 2023-01-01 ~ 2023-12-31
		
		Calendar c = Calendar.getInstance();
		c.set(2023, 0, 1);
		
		// 최대값 최소값 가져오기
		// 우리가 알고 있는 최대값, 최소값과 다르다.
		System.out.println(c.getActualMaximum(Calendar.MONTH)); // 11
		System.out.println(c.getActualMinimum(Calendar.MONTH)); // 0
		System.out.println(c.getActualMaximum(Calendar.DATE)); // 31 2023년 1월달이 최대 며칠까지 있습니까?
		
		int max = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		for (int i = 0; i < max; i++) {
			// "2023-01-01"
			String name = String.format("%tF", c);
			// System.out.println(name);
			
			File dir = new File("C:\\Class\\code\\java\\file\\날짜\\" + name);
			dir.mkdirs();
			
			c.add(Calendar.DATE, 1);
		}
		
	}

	private static void m8() {

		// 요구사항) 회원 > 회원명으로 개인 폴더 생성
		
		String[] member = {"홍길동", "아무개", "이순신", "권율", "유관순"};
		
		for (int i = 0; i < member.length; i++) {
			String path = String.format("C:\\class\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			
			File dir = new File(path);
			
			System.out.println(dir.mkdirs());
		}
	}

	private static void m7() {

		// 폴더 > 만들기
		// File dir = new File("C:\\Class\\code\\java\\aaa");
		File dir = new File("C:\\Class\\code\\java\\bbb\\ccc"); // ccc 경로에 bbb가 없어서 false가 된다. 최종 대상을 만들 때 앞에 실존해야 한다.
		
		if (!dir.exists()) {
			
			System.out.println(dir.mkdir());
			System.out.println(dir.mkdirs());
			
		}
		// mkdir 폴더 1개
		// mkdirs // 연관된 폴더 모두 함께
	}

	private static void m6() {

		File file = new File("C:\\Class\\code\\java\\file\\data.txt");

		// 휴지통으로 가지 않는다.
		if (file.exists()) {
			System.out.println(file.delete());
		}
	}

	private static void m5() {

		// 파일 > 이동하기
		// - C:\\class\\code\\java\\file\\data.txt
		// - C:\\class\\code\\java\\move\\data.txt
		File file = new File("C:\\Class\\code\\java\\file\\data.txt");
		//File file2 = new File("C:\\Class\\code\\java\\move\\data.txt");
		File file2 = new File("C:\\Class\\code\\java\\move\\data.txt");
		
		// 이처럼 renameTo() 메소드는 경로나 이름을 한꺼번에 바꿀 수 있는 메소드이다. (폴더를 바꾼다는 뜻이 이동을 한다는 뜻)
		if (file.exists()) {
			
			System.out.println(file.renameTo(file2));
		}
		
	}

	private static void m4() {

		// 파일 > 파일명 바꾸기
		File file = new File("C:\\Class\\code\\java\\file\\data.txt");
		File file2 = new File("C:\\Class\\code\\java\\file\\데이터.txt");
		
		// 수정하기 전
		// 수정한 후

		// 파일 이름 바꾸기 (data -> 데이터)
		// 동일한 파일이 2개 있을 경우 안된다. (프로그램에서 생성하고 바꾸기 이전에 이미 파일이 있음)
		if (file.exists()) {
			System.out.println(file.renameTo(file2));
		}
	}

	private static void m3() {

		// 파일 > 생성하기
		File file = new File("C:\\Class\\code\\java\\file\\hello.txt"); // + png, mp4도 만들어지긴 하지만, 비어있는 파일만 만들어지므로 의미가 없다.
		
		// 파일이 없니?!
		if (!file.exists()) {
			
			// Unhandled exception type IOException
			try {
				
				System.out.println(file.createNewFile());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("이미 동일한 파일이 존재합니다.");
		}
		
	}

	private static void m2() {

		// 폴더 > 정보
		// - 폴더(Folder), 디렉토리(Directory)
		
		// - C:\Class\code\java\file
		
		// 폴더 참조 객체
		// - 폴더는 파일이다.
		// - 폴더는 물리적인 공간의 개념으로 존재하는 게 아니다.
		// - 쉽게 말해서 그냥 이름만 있는 것이다. (자신만의 데이터를 가지고 있는 게 아니라 식별자인 폴더 이름만 가지고 있으므로 크기가 존재하지 않는다.)
		
		File dir = new File("C:\\Class\\code\\java\\file");
		
		if (dir.exists()) {
			
			System.out.println("폴더가 있습니다.");
			// 업무
			System.out.println(dir.getName()); // file
			System.out.println(dir.isFile()); // false
			System.out.println(dir.isDirectory()); // true
			System.out.println(dir.length()); // 0 <- 폴더 본연의 크기를 나타내므로 항상 0이 나온다.
			System.out.println(dir.getAbsolutePath()); // C:\Class\code\java\file
			System.out.println(dir.lastModified()); // 1691379524913
			System.out.println(dir.isHidden()); // false
			
						
		} else {
			
			System.out.println("폴더가 없습니다.");
			
		}
		
	}

	private static void m1() {

		// 파일 > 정보
		// 파일의 정보를 확인하는 방법을 알아보도록 하자.
		// - C:\Class\code\java\file > 폴더 생성
		// - C:\Class\code\java\file\data.txt > 텍스트 파일 생성
		
		// 자바 프로그램에서 외부의 파일을 접근
		// 외부의 자원에 접근하는 방법
		// 1. 외부 파일을 참조하는 참조 객체를 생성한다 (대리자, 위임자)
		// 2. 참조하는 객체를 조작 > 그 행동의 결과가 알아서 외부 파일에 적용이 된다.
		
		// # 개념
		// 텍스트 파일은 자바 프로그램의 외부 파일이다.
		// 바로 가져오려면 난이도가 많이 올라가고 코드가 복잡해진다.
		// 그래서 중간에 자바와 외부 파일을 이어주는 중개인을 만든다.
		
		
		// 파일 참조 클래스 > 객체 > java.io.File
		File file = new File("C:\\Class\\code\\java\\file\\data.txt");
		
		System.out.println(file.exists());
		
		if(file.exists()) {
			System.out.println("파일이 있습니다.");
			
			// 업무
			System.out.println(file.getName()); // data.txt
			System.out.println(file.isFile()); // true
			System.out.println(file.isDirectory()); // false
			System.out.println(file.length()); // 32
			System.out.println(file.getAbsolutePath()); // C:\Class\code\java\file\data.txt
			System.out.println(file.lastModified()); // 1691379563506
			System.out.println(file.isHidden()); // false
			
			/*
				getName 파일의 이름 반환
				isFile 이게 파일인지, 폴더인지를 나타냄. 파일일 경우 true, 아닐 경우 false 반환
				isDirectory 이게 폴더인지, 파일인지를 나타냄. 폴더일 경우 true, 아닐 경우 false 반환
				length 파일의 크기 (byte)
				getAbsolutePath 파일의 경로
				lastModified 수정한 날짜
				isHidden 이 파일이 숨김파일인지, 아닌지를 나타냄. 숨긴 파일일 경우 true, 아닐 경우 false 반환
			*/
			
			// tick > 년월일시분초
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis());
			c1.setTimeInMillis(file.lastModified());
			
			System.out.printf("%tF %tT\n", c1, c1); // 2023-08-07 12:39:23
			
		} else {
			System.out.println("파일이 없습니다.");
		}
	}
}
