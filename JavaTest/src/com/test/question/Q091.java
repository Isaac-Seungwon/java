package com.test.question;

import java.util.Scanner;

public class Q091 {
	public static void main(String[] args) {
        /*
        ● 요구사항
        연산식을 입력받아 실제 연산을 하시오.

        ● 조건
        - 산술 연산자만 구현하시오.(+, -, *, /, %)
        - 연산식의 공백은 자유롭게 입력 가능합니다.
        - 산술 연산자가 반드시 존재하는지 체크하시오.
        - 피연산자의 갯수가 2개인지 체크하시오.

        ● 입력 1
        입력: 10 + 2

        ● 출력 1
        10 + 2 = 12

        ● 입력 2
        입력: 10 # 5

        ● 출력 2
        연산자가 올바르지 않습니다.

        ● 입력 3
        입력: 10 +

        ● 출력 3
        피연산자가 부족합니다.

        ● 입력 4
        입력: + 20

        ● 출력 4
        피연산자가 부족합니다.
        */

		Scanner scan = new Scanner(System.in);

		String txt = ""; // 연산식 입력
		String operator = ""; // 연산자
		String[] temp = new String[2]; // 연산식 좌항, 우항 숫자
		int n1 = 0; // 좌항 숫자
		int n2 = 0; // 우항 숫자
		int result = 0; // 연산 결과

		// 연산식 입력
		System.out.print("입력: ");
		txt = scan.nextLine().replaceAll(" ", ""); // 연산식 입력과 동시에 공백 제거

		// 연산자 검증
		operator = getOperator(txt);

		// 연산자가 있을 경우
		if (!operator.equals("")) {
			// 이스케이프(escape) 처리
			temp = txt.split("\\" + operator);

			if (temp.length == 2) {
				// 좌항 우항 숫자 부여
				n1 = Integer.parseInt(temp[0]);
				n2 = Integer.parseInt(temp[1]);
				result = getOperationResult(n1, n2, operator);

				System.out.printf("%d %s %d = %d\n", n1, operator, n2, result);
			} else {
				System.out.println("피연산자가 부족합니다.");
			}
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}

		scan.close();
	}

	// 연산자 검증
	private static String getOperator(String txt) {
		if (txt.contains("+")) {
			return "+";
		} else if (txt.contains("-")) {
			return "-";
		} else if (txt.contains("*")) {
			return "*";
		} else if (txt.contains("/")) {
			return "/";
		} else if (txt.contains("%")) {
			return "%";
		}
		return "";
	}

	// 연산식 계산
	private static int getOperationResult(int n1, int n2, String operator) {
		if (operator.equals("+")) {
			return n1 + n2;
		} else if (operator.equals("-")) {
			return n1 - n2;
		} else if (operator.equals("*")) {
			return n1 * n2;
		} else if (operator.equals("/")) {
			return n1 / n2;
		} else if (operator.equals("%")) {
			return n1 % n2;
		} else {
			return 0;
		}
	}
}
