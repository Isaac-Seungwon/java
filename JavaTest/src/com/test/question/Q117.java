package com.test.question;

import java.io.File;
import java.util.HashMap;

public class Q117 {
	public static void main(String[] args) {
		/*
		● 요구사항
		내용물이 있는 'delete' 폴더를 삭제하시오.
		
		● 조건
		- 재귀 메소드 사용
		- 삭제된 파일과 자식 폴더 개수를 출력하시오.
		
		● 리소스
		- 폴더 > 폴더 삭제
		- 파일 다운로드
		
		● 출력
		폴더를 삭제했습니다. 
		삭제된 폴더는 3개이고, 파일은 6개입니다.
		*/
		
		// 삭제할 폴더의 경로
		String path = "C:\\Class\\code\\java\\file\\파일_디렉토리_문제\\폴더 삭제";
		
		// 폴더 객체 생성
		File dir = new File(path);

		// 삭제할 요소 탐색
		// 재귀 메소드를 호출하여 폴더 내의 파일과 폴더를 모두 삭제
		delete(dir);
		
		System.out.println("종료");
	}
	
	private static void delete(File dir) {
		// 폴더 내의 파일들과 폴더들을 배열로 가져오기
		File[] list = dir.listFiles();
		
		// 폴더 내의 파일들을 삭제
		for (File f : list) {
			if (f.isFile()) {
				f.delete();
			}
		}
		
		// 폴더 내의 하위 폴더들을 순회하며 재귀적으로 삭제 메소드 호출
		for (File d : list) {
			if(d.isDirectory()) {
				delete(d); // 재귀메소드
			}
		}
	}
}

//public class Q117 {
//	public static void main(String[] args) {
//		/*
//		● 요구사항
//		내용물이 있는 'delete' 폴더를 삭제하시오.
//		
//		● 조건
//		- 재귀 메소드 사용
//		- 삭제된 파일과 자식 폴더 개수를 출력하시오.
//		
//		● 리소스
//		- 폴더 > 폴더 삭제
//		- 파일 다운로드
//		
//		● 출력
//		폴더를 삭제했습니다. 
//		삭제된 폴더는 3개이고, 파일은 6개입니다.
//		*/
//		
//		String path = "C:\\Class\\code\\java\\file\\파일_디렉토리_문제\\폴더 삭제";
//		
//		HashMap<String,Integer> count = new HashMap<String,Integer>();
//		count.put("file", 0);
//		count.put("directory", 0);
//		
//		File dir = new File(path);
//		
//		deleteFile(dir, count);
//		
//		System.out.printf("폴더를 삭제했습니다.\r\n"
//						+ "삭제된 폴더는 %d개이고, 파일은 %d개입니다.\n", count.get("directory"), count.get("file"));
//	}
//	
//	private static void deleteFile(File dir, HashMap<String,Integer> count) {
//		
//		File[] list = dir.listFiles();
//		
//		for (File file : list) {
//			if (file.isFile()) {
//				count.put("file", count.get("file") + 1);
//				file.delete();
//			}
//		}
//		
//		for (File subdir : list) {
//			if (subdir.isDirectory()) {
//				deleteFile(subdir, count); // 재귀 구조
//			}
//		}
//		
//		count.put("directory", count.get("directory") + 1);
//		
//		dir.delete();
//	}
//}
