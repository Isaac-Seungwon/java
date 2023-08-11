package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
		/*
		● 요구사항
		파일의 경로를 입력받아 파일 정보를 출력하시오.
		
		● 조건
		- 파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB
		
		● 입력 1
		파일 경로 : D:\class\java\file\test.txt 
		
		● 출력 1
		파일명 : test.txt
		종류 : txt 파일 
		파일 크기 : 45B 
		
		● 입력 2
		파일 경로 : C:\movie\SpriderMan.mp4

		● 출력 2
		파일명 : SpriderMan.mp4
		종류 : mp4 파일 
		파일 크기 : 2.54TB 
		*/
		
		Scanner scan = new Scanner(System.in);

		// 파일 경로 입력
		System.out.print("파일 경로 : ");
		String path = scan.nextLine().trim();

		File file = new File(path);

		// 출력
		System.out.printf("파일명 : %s\n", file.getName());
		System.out.printf("종류: %s 파일\n", file.getName().substring(file.getName().lastIndexOf(".") + 1));
		System.out.printf("파일 크기 : %s\n", getFileSize(file.length()));

		scan.close();
		
		/*
		// 다른 방법
		int dot = 0; // '.' 위치

		// 확장자 검색
		for(int i=0; i<path.length(); i++) {
			char c = path.charAt(i);
		    
	        if (c == '.') {
	            dot = i + 1;
	        }
	    }

		// 파일 경로
		File file = new File(path);
		
		// 출력
		System.out.printf("파일명 : %s\n", file.getName());
		System.out.printf("종류: %s 파일\n", path.substring(dot, path.length()));
		System.out.printf("파일 크기 : %dB", file.length());
		*/
	}

	// 파일 크기 단위 변환 출력
	private static String getFileSize(long length) {
		String[] units = { "B", "KB", "MB", "GB", "TB" };
		double fileSize = length;
		int unitIndex = 0;

		while (fileSize >= 1024 && unitIndex < units.length - 1) {
			fileSize /= 1024;
			unitIndex++;
		}

		return String.format("%.1f%s", fileSize, units[unitIndex]);
	}

    /*
    // Another way
	private static String getFileSize(long length) {
		if (length < 1024) {
			return length + "B";
		} else if (length < 1024 * 1024) {
			return String.format("%.1f", length / 1024.0) + "KB";
		} else if (length < 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0) + "MB";
		} else if (length < 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0 / 1024.0) + "GB";
		} else if (length < 1024 * 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0 / 1024.0 / 1024.0) + "TB";
		}
		return 0 + "B";
	}
	*/
}
