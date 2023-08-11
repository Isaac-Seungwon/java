package com.test.question;

public class Q060 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 조건
		- 마지막 숫자가 100이 넘기 전까지 출력하시오.
		
		● 출력
		1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 +  = 232
		  0   1   1   2   3   5    8    13   21   44
		*/
		
		int sum = 0; // 피보나치 수열 누적 합계
		
        for (int i = 1; i < 100; i++) {
            // 수열의 숫자가 100 초과
            if (getFibonacci(i) > 100) {
            	// 피보나치 수열 누적 합계 출력
                System.out.printf(" = %d", sum);
            	break;
            }
            
            // 피보나치 수열 누적 합계 저장
            sum = sum + getFibonacci(i);
            
            // 피보나치 수열 출력
            System.out.printf(" %d +", getFibonacci(i));
        }
	}
	
	/*
	int num = 1;
	int sum = 1;
	// num에 더해줄 값 > num - temp
	int temp = 0;
	      
	System.out.print(num + " + ");
	      
	// 피보나치 수열
	while (num < 100) {
		System.out.print(num + " + ");
		sum += num;
		temp = num - temp;
		num += temp;
	}
	System.out.println("= " + sum);
	*/
	
	/*
	피보나치 수열 공식: 이전 두 항의 값을 더하여 다음 항을 만들어내는 수열
	Fn = Fn-1 + Fn-2
	
	F(0) = 0
	F(1) = 1
	F(2) = F(1) + F(0) = 1 + 0 = 1
	F(3) = F(2) + F(1) = 1 + 1 = 2
	F(4) = F(3) + F(2) = 2 + 1 = 3
	F(5) = F(4) + F(3) = 3 + 2 = 5
	
	이전 항과 두 번째 이전항을 더해가며 피보나치 수열 완성
	*/
	
	// 피보나치 수열 계산
    private static int getFibonacci(int n) {

    	int result = 0; // 피보나치 수열 계산 결과
    	int num1 = 0; // 이전 항
    	int num2 = 1; // 두 번째 이전 항
    	
    	// 0과 1일 경우 그대로 출력
    	if (n == 0 || n == 1) {
    		return n;
    	}
    	else {
    		// 0과 1이 아닐 경우 피보나치 수열 공식 적용
    		for (int i = 2; i <= n; i++) {
    			result = num1 + num2;
    			num1 = num2;
    			num2 = result;
    		}
    		
    		return result;
    	}
    }
}
