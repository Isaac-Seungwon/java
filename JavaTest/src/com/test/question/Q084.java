package com.test.question;

import java.util.Scanner;

public class Q084 {
	public static void main(String[] args) {
		/*
		● 요구사항
		특정 단어가 문장내에 몇회 있는지 수를 세시오.
		
		● 조건
		- 대상 문자열: String content = "안녕~ 길동아~ 잘가~ 길동아~";
		- 검색 문자열: String word = "길동";
		
		● 출력
		'길동'을 총 2회 발견했습니다.
		*/

		String content = "안녕~ 길동아~ 잘가~ 길동아~"; // 대상 문자열
		String word = "길동"; // 검색 문자열

		int sum = 0; // 발견 횟수
		int index = 0;

		while ((index = content.indexOf(word, index)) != -1) {
			sum++;
			index += word.length(); // word 글자 수
		}

		/*
		// 다른 방법
		while (true) {
			index = content.indexOf(word, index);
			
			if (index == -1) { // 대상 문자열에서 검색 문자열을 못 찾은 경우
				break;
			} else {
				sum++;
			}
			index += 2; // word 글자 수
		}
		*/
		
		// 출력
		System.out.printf("'%s'을 총 %d회 발견했습니다.", word, sum);
	}
}
