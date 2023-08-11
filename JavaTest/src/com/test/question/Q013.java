package com.test.question;

import java.util.Scanner;

public class Q013 {
	public static void main(String[] args) {
		/*
		● 요구사항
		국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		
		● 조건
		- String test(int kor, int eng, int math)
		- 평균 점수 60점 이상은 '합격'이다.
		- 평균 점수 60점 미만은 '불합격'이다.
		- 과락: 한 과목 이상 40점 미만이면 불합격이다.
		
		● 입력 1
		국어: 80 
		영어: 75 
		수학: 60 
		
		● 출력 1
		합격입니다.
		
		● 입력 2
		국어: 55 
		영어: 35 
		수학: 60 
		
		● 출력 2
		불합격입니다.
		*/
		
		// 객체 생성
		Scanner scan = new Scanner(System.in);
		
		int scoreKorean; // 국어 점수
		int scoreEnglish; // 영어 점수
		int scoreMathematic; // 수학 점수
		
		// 국어 점수 입력
		System.out.printf("국어: ");
		scoreKorean = scan.nextInt();

		// 영어 점수 입력
		System.out.printf("영어: ");
		scoreEnglish = scan.nextInt();

		// 수학 점수 입력
		System.out.printf("수학: ");
		scoreMathematic = scan.nextInt();
		
		// 합격, 불합격 결과 출력
		System.out.printf("%s입니다.", test(scoreKorean, scoreEnglish, scoreMathematic));
		
		scan.close();
	}
	
	public static String test(int kor, int eng, int math) {
		boolean isFailed; // 과락 판단
		int averageScore; // 과목 평균 계산
		
		// 과락 판단
		isFailed = kor > 40 ? eng > 40 ? math > 40 ? true : false : false : false;

		// 과목 평균 계산
        averageScore = (kor + eng + math) / 3;
        
        // 합격, 불합격 판단
        String result = averageScore >= 60 ? isFailed == false ? "불합격" : "합격" : "불합격";
        
        // String result = averageScore < 60 ? "불합격" : (kor < 40 || eng < 40 || math < 40) ? "불합격" : "합격";
        
        return result;
	}
}
