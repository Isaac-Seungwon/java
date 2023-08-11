package com.test.question;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Q114 {
	public static void main(String[] args) {
		/*
		● 요구사항
		이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
		
		● 조건
		- 새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
		- 'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
		
		● 리소스
		- 폴더 > 확장자별 카운트
		- 파일 다운로드
		
		● 출력
		.gif: 10개 
		.jpg: 5개 
		.png: 3개 

		// HashMap<String,Integer>를 이용한다.
		*/
		
		String path = "C:\\Class\\code\\java\\file\\파일_디렉토리_문제\\확장자별 카운트";
		
		// 파일 목록 불러오기
		File dir = new File(path);
		
		// 키 > 확장자
		// 값 > 카운트
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		File[] list = dir.listFiles();
		
		/*
		// 파일이 정상적으로 들어왔는지 확인
		for (File file : list) {
			System.out.println(file.getName());
		}
		*/
		
		for (File file : list) {
			
			String extension = getExtension(file.getName());
			
			/*
			if (확장자가 맵에 존재) {
				count.put(extension, 1); // 새로운 확장자 등록
			} else {
				count.put(extension, count.get(extension) + 1); // count = count + 1 누적
			}
			*/
			if (count.get(extension) == null) {
				count.put(extension, 1);
			} else {
				count.put(extension, count.get(extension) + 1);
			}
		}

		// System.out.println(count);
		
		Set<String> keys = count.keySet();
		
		for (String key : keys) {
			System.out.printf("*.%s: %d개\n", key, count.get(key));
		}
	}
	
	private static String getExtension(String name) {
		
		/*
		String[] temp = name.split(".");
		System.out.println(temp.length); // 0
		
		// 왜 length가 0으로 나오는가?
		// "."으로 쪼개지 못했기 때문이다. "\\."으로 작성해 주어야 한다. [ 정규표현식 ]
		*/
		
		String[] temp = name.split("\\.");
		String ext = temp[temp.length - 1].toLowerCase();
		// file.getName().substring(file.getName().lastIndexOf(".") + 1;
		
		// System.out.println(Arrays.toString(temp));
		// System.out.println(ext);
		
		return ext;
	}
}
