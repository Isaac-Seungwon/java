package com.test.question;

public class Q055 {
	public static void main(String[] args) {
		/*
		● 요구사항
		1부터 100사이의 완전수를 구하시오.
		
		● 조건
		- 완전수: 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
		- 약수: 어떤 수나 식을 나누어 나머지가 없이 떨어지는 수

		● 출력
		6 = [1, 2, 3,]
		28 = [1, 2, 4, 7, 14,]
		*/
		
		int aliquot = 0; // 약수 합계 누적
		String aliquotList; // 약수 리스트
		
		// 1 ~ 100 사이의 수
		for (int i = 1; i <= 100; i++) {
			aliquotList = "";
			aliquot = 0;
					
			for (int j = 1; j < i; j++) {
				// 약수 계산
				if (i % j == 0) {
					aliquot = aliquot + j;
					aliquotList = aliquotList + j + ",";
					
					if (i / j != 2) {
						aliquotList = aliquotList + " ";
					}
				}
			}
			
			// 완전수 출력
			if (i == aliquot) {
				System.out.printf("%d = [%s]\n", i, aliquotList);
			}
		}
	}
}
