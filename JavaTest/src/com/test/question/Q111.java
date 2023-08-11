package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {
	public static void main(String[] args) {
		/*
		● 요구사항
		지정한 폴더의 특정 파일(확장자)만을 출력하시오.
		
		● 조건
		- 확장자 대소문자 구분없이 검색 가능
		
		● 입력 1
		폴더: C:\class\eclipse
		확장자: exe 
		
		● 출력 1
		eclipse.exe 
		eclipsec.exe
		
		● 입력 2
		폴더: C:\class\eclipse 
		확장자: xml 
		
		● 출력 2
		artifacts.xml
		구글.XML
		*/
		
		Scanner scan = new Scanner(System.in);
		
		// 찾을 폴더와 확장자 입력
		System.out.print("폴더 : ");
		String path = scan.nextLine().trim();
		
		System.out.print("확장자 : ");
		String extension = scan.nextLine().trim();
		
		// 폴더 경로 지정
		File dir = new File(path);
		
		// 폴더 경로의 리스트 생성
		File[] list = dir.listFiles();
		
		for (File file : list) {
            if (file.isFile() && hasExtension(file, extension)) {
                System.out.println(file.getName());
            }
        }
		
		/*
		// Another Way
		for (File f : list) {
			if(f.isFile()) {
				String fileName = f.getName();
				
				// 폴더 이름을 소문자로 통일한 뒤, 확장자를 포함하는 데이터를 출력
				if (fileName.toLowerCase().endsWith(extension.toLowerCase())) {
		            System.out.println(fileName);
		        }
			}
		}
		*/
		
		scan.close();
	}
	
	// 파일의 확장자가 지정한 확장자와 일치하는지 확인하는 메소드
    private static boolean hasExtension(File file, String extension) {

    	String fileName = file.getName(); // 파일 이름
        String fileExtension = fileName.substring(fileName.lastIndexOf('.') + 1).toLowerCase(); // 파일 확장자(소문자)
        
        return fileExtension.equals(extension.toLowerCase());
    }
}
