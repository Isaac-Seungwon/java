package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q119 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래의 조건에 따라 파일을 폴더별로 분류/이동하시오.
		
		● 조건
		- 1차: 직원 이름으로 폴더 생성
		- 2차: 년도별로 폴더 생성
		- 3차: 각 파일을 직원 > 년도 폴더에 이동
		
		● 리소스
		- 폴더 > 직원
		- 파일 다운로드
		
		● 출력
		분류가 완료되었습니다.
		*/

		String path = "C:\\Class\\code\\java\\file\\파일_디렉토리_문제\\직원";
		
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for (File f : list) {
			
			String[] temp = f.getName().split("_");
			
			// 아무게_2014__17
			// 아무게_2014__30
			
			String name = temp[0]; // 아무게
			String year = temp[1]; // 2014
			
			// 이름별 폴더 생성
			File nameDir = new File(dir.getAbsolutePath() + "\\" + name);
			nameDir.mkdir();
			
			// 이름별 폴더 아래에 년도별 폴더 생성
			File yearDir = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year);
			nameDir.mkdir();
			
			// 이름별 폴더 아래에 년도별 폴더 아래에 파일 이동
			File dest = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year + f.getName());
		
			f.renameTo(dest);
		}
	}
}
