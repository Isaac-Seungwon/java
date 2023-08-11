package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q116 {
	public static void main(String[] args) {
		/*
		● 요구사항
		MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
		
		● 조건
		- 중복 파일을 찾아내시오.
		
		● 리소스
		- 폴더 > 동일 파일
		- 파일 다운로드
		
		● 출력
		BAAM - 모모랜드 (MOMOLAND).mp3 
		Dejavu - 볼빨간사춘기.mp3 
		SoulMate (Feat. 아이유) - 지코 (ZICO).mp3 
		..
		*/
		
		// 비교할 두 폴더 경로
		String path1 = "C:\\Class\\code\\java\\file\\파일_디렉토리_문제\\동일 파일\\MusicA";
		String path2 = "C:\\Class\\code\\java\\file\\파일_디렉토리_문제\\동일 파일\\MusicB";
		
		// 폴더 경로를 이용해 File 객체 생성
		File dir1 = new File(path1);
		File dir2 = new File(path2);
		
		// 각 폴더 내의 파일들을 배열로 가져오기
		File[] list1 = dir1.listFiles();
		File[] list2 = dir2.listFiles();
		
		// 양쪽 폴더에 모두 존재하는 파일을 저장할 ArrayList 생성
		ArrayList<File> flist = new ArrayList<File>();
		
		// MusicA 폴더의 파일과 MusicB 폴더의 파일을 비교하여 중복 파일을 찾아냄
		for (File file1 : list1) {
			for (File file2 : list2) {
				if (file1.getName().equals(file2.getName())) {
					flist.add(file1);
				}
			}
		}
		
		// 중복된 파일들의 이름 출력
		for (File file : flist) {
			System.out.println(file.getName());
		}
	}
}
