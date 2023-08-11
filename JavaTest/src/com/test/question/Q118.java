package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q118 {
	public static void main(String[] args) {
		/*
		● 요구사항
		폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
		
		● 조건
		- 자식 폴더내의 파일도 모두 검색하시오.
		- 부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.
		
		● 리소스
		- 폴더 > 크기 정렬
		- 파일 다운로드
		
		● 출력
		[파일명]      [크기]     [파일이 들어있는 폴더]
		aaa.exe    57KB    AAA 
		bbb.exe    50KB    BBB 
		ccc.dat     41KB    AAA 
		ddd.txt     20KB    CCC 
		..
		*/
		
		// 크기를 비교하고 정렬할 폴더의 경로
		String path = "C:\\Class\\code\\java\\file\\파일_디렉토리_문제\\크기 정렬";
		
		// 폴더 객체 생성
		File dir = new File(path);
		
		// 폴더 내의 파일들을 저장할 ArrayList 생성
		ArrayList<File> flist = new ArrayList<File>();
		
		// 폴더 내의 모든 파일들을 재귀적으로 찾아 fileList에 추가
		addFile(dir, flist);
		
		// 파일 크기에 따라 정렬 (버블 정렬)
		for (int i = 0; i < flist.size() - 1; i++) {
			for (int j = 0; j < flist.size() - i - 1; j++) {
				if (flist.get(j).length() < flist.get(j + 1).length()) {
					File temp = flist.get(j);
					flist.set(j, flist.get(j + 1));
					flist.set(j + 1, temp);
				}
			}
		}
		
		// 정렬된 파일 목록 출력
		System.out.printf("%-33s%s\t%10s\n", "[파일명]", "[크기]", "[파일이 들어있는 폴더]");
		
		for (File file : flist) {
			System.out.printf("%-30s\t%10s\t%s\n"
								, file.getName()
								, getSize(file.length())
								, file.getParentFile().getName());
		}
	}

	private static String getSize(long length) {
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
	
	private static void addFile(File dir, ArrayList<File> flist) {
		// 폴더 내의 파일들과 폴더들을 배열로 가져오기
		File[] list = dir.listFiles();
		
		// 폴더 내의 파일들을 fileList에 추가
		for (File file : list) {
			if (file.isFile()) {
				flist.add(file);
			}
		}
		
		// 폴더 내의 하위 폴더들을 순회하며 재귀적으로 파일을 fileList에 추가
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				addFile(subdir, flist);
			}
		}
	}
}
