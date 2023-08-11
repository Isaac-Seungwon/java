package com.test.question;

import java.io.File;

public class Q115 {
	public static void main(String[] args) {
		/*
		● 요구사항
		파일의 크기가 0byte인 파일만 삭제하시오.
		
		● 리소스
		- 폴더 > 파일 제거
		- 파일 다운로드
		
		● 출력
		총 34개의 파일을 삭제했습니다.
		*/
		
		// 삭제할 파일들이 있는 폴더 경로
		String path = "C:\\Class\\code\\java\\file\\파일_디렉토리_문제\\파일 제거";
		
		// 폴더 경로를 이용해 File 객체 생성
		File dir = new File(path);
		int count = 0;
		
		// 폴더 내의 파일들을 배열로 가져오기
		File[] list = dir.listFiles();
		
		// 폴더 내의 파일들을 순회하며 크기가 0byte인 파일 삭제
		for (File file : list) {
			if (file.length() == 0) {
				file.delete(); // 파일 삭제
				count++; // 삭제한 파일 개수 증가
			}
		}
		
		// 삭제된 파일 개수 출력
		System.out.printf("총 %d개의 파일을 삭제했습니다.\n", count);
	}
}
