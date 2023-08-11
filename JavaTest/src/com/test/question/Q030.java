package com.test.question;

import java.util.Scanner;

public class Q030 {
    public static void main(String[] args) {
        /*
        ● 요구사항
        영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.

        ● 조건
        - 유효성 검사를 하시오.(영문자만 입력 가능)

        ● 입력 1
        문자: a

        ● 출력 1
        'a'의 대문자는 'A'입니다.

        ● 입력 2
        문자: F

        ● 출력 2
        'F'의 소문자는 'f'입니다.

        ● 입력
        문자: 가

        ● 출력
        영문자만 입력하시오.
        */
    	
        Scanner scan = new Scanner(System.in);

        char inputEnglish; // 영문자 입력
        char changeEnglish = '\0'; // 영문자 변환 및 기본값 초기화
        
        // 문자 입력
        System.out.print("문자: ");
        inputEnglish = scan.nextLine().charAt(0);

        
        // 입력한 문자가 영문자인지 검증
        if (isEnglish(inputEnglish)) {
        	if ((char)inputEnglish >= 97 && (char)inputEnglish <= 122) {
        		// 소문자를 대문자로 변환
        		changeEnglish = (char)(inputEnglish - 32);

        	} else if((char)inputEnglish >= 65 && (char)inputEnglish <= 90) {
        		// 대문자를 소문자로 변환
                changeEnglish = (char)(inputEnglish + 32);
        	}
        	
        	System.out.printf("'%c'의 %s는 '%c'입니다.\n"
        			, inputEnglish
        			, (char)inputEnglish >= 97 && (char)inputEnglish <= 122 ? "대문자" : "소문자"
        			, changeEnglish);
        	/*
        	● Unresolved compilation problem: The local variable changeEnglish may not have been initialized"
        	
        	● 오류 원인
        	changeEnglish 변수가 초기화되지 않은 상태로 사용
        	
        	● 발생 과정
        	지역 변수는 선언될 때 명시적으로 초기화되어야 한다.
        	changeEnglish 변수는 조건문 내에서만 초기화되었는데, changeEnglish 변수를 사용하는 출력문이 조건문 밖에서 발생하였다.
        	컴파일러는 조건문 내부의 초기화 여부를 확인할 수 없으므로 오류가 발생하게 된다.
			
			● 해결 방법
			해당 오류를 해결하기 위해서는 changeEnglish 변수를 선언하는 동시에 초기화해주면 된다.
			초기화의 경우 조건문 내부에서 하지 않고, 적절한 기본 값을 할당하면 된다.
			이렇게 초기화하면 변수를 사용할 때 값이 보장되기 때문에 오류가 사라진다.
        	*/
        } else {
            // 예외 처리
            System.out.println("영문자만 입력하시오.");
        }
        
        /*
        ● toUpperCase, toLowerCase
        
        // 소문자를 대문자로 변환
        changeEnglish = Character.toUpperCase(inputEnglish);
        
        // 대문자를 소문자로 변환
        changeEnglish = Character.toLowerCase(inputEnglish);
        */
        
        scan.close();
    }

    // 영문자 검증 메소드
    private static boolean isEnglish(char input) {
    	// input이 a ~ z, A ~ Z일 경우 true 반환
        return ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'));
    }
}
