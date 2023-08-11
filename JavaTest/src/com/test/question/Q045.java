package com.test.question;

import java.util.Scanner;

public class Q045 {
	public static void main(String[] args) {
		/*
		● 요구사항
		사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
		
		● 조건
		- 최대 3자리까지만 입력하시오.
		
		● 입력
		최대 숫자: 50 
		
		● 출력
		1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 
		21 22 짝 24 25 짝 27 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 
		41 42 짝 44 45 짝 47 48 짝 50
		
		3으로 나누어지거나,
		
		3 6 9 13 16 19 23 26 29 30 31 32 33 34 35 36 37 38 39
		*/
		
		// 사용자로부터 숫자를 입력받기 위한 Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        // 최대 숫자 입력
        System.out.print("최대 숫자: ");
        int num = scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
        	
        	if (0 < getclap(i)) {
		        for (int j = 0; j < getclap(i); j++) {
		        	System.out.printf("짝");
		        }
        	}
        	else {
        		System.out.printf("%d", i);
        	}
        	System.out.printf(" ");
        }
        
        scan.close();
    }

    private static int getclap(int num) {
    	int stac = 0; // 박수 스택
    	int digit; // num을 10으로 나눈 나머지 값
    	
    	// num이 0이 될 때까지 무한루프
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            // 369 > 36 > 3 > 0
            // 한 자리씩 제거하면서 입력한 숫자 중 3, 6, 9가 있는지 판단
            
            if (digit == 3) {
            	stac++;
            }
            if (digit == 6) {
            	stac++;
            }
            if (digit == 9) {
            	stac++;
            }
        }
        return stac;
    }
}
