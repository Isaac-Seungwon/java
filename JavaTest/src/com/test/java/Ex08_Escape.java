package com.test.java;

public class Ex08_Escape {

	public static void main(String[] args) {
		
		// Ex08_Escape.java
		// 보조적으로 자주 쓰인다. 중요함!
		
		// 특수문자 > Escape Sequence
		// - 컴파일러가 번역을 할 때, 소스상에 있는 문자를 그대로 출력하지 않고,
		// 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		// 패턴: \가 앞에 오고 알파벳이 뒤에 온다.

		/*
		회사에 나가서 자바는 그렇게 어렵지 않다. 다른 일이 더 힘들다.
		증권팀에 파견이 되면 증권에 대해 모든 것을 알아야 한다.
		이런 업무에 적응하는 게 2~3년 걸린다. 그래서 분야를 바꾸기가 되게 힘들다.
		다른 데에 이직하려면 노력을 굉장히 많이 해야 한다.
		-> 하지만 나는 다양한 분야를 전문화해야 한다고 생각해.
		*/
		
		
		// 1. \n
		// - new line, line feed
		// - 개행 문자(엔터): 라인을 바꾸는 역할을 한다.
		
		char c1 = '\n'; // 자바는 이것을 한 글자로 취급한다.
		String s1 = "\n";
		
		// *** 요구사항: "안녕하세요. Isaac입니다."를 출력해 주세요."
		
		System.out.println("안녕하세요. Isaac입니다.");
		
		String msg = "\n안녕하세요.\nIsaac입니다.\n";
		System.out.println(msg);
		
		
		// 2. \r
		// carriage return
		// - 캐럿의 위치를 현재 라인의 맨 앞으로 이동한다.
		// - 키보드 > Home 키 역할
		
		msg = "안녕하세요.\rIsaac님";
		System.out.println(msg);
		
		// \r을 했는데도 \n을 한 것처럼 개행이 된다.
		// 이것은 이클립스의 문제이며, \r이 제대로 동작이 되지 않는다.
		// \r은 기존의 문자를 덮어쓰기한다.
		
		// 운영체제의 엔터: 운영체제마다 엔터를 저장하는 방법이 다르다.
		// 1. 윈도우: \r\n	(캐리지 리턴(CR)과 라인 피드(LF)가 합쳐진 게 Enter이다.)
		// 2. 맥OS: \r
		// 3. 리눅스: \n
		
		System.out.println("하나\r\n둘"); // 제대로 하려면 이렇게 하는 게 좋긴 하다.
		System.out.println("하나\n둘");
		
		
		// 3. \t
		// - tab, 탭문자
		// - 탭이 뭐에요? > 4칸씩 띄는거요. > X
		// - 탭 > 행동 (X) > 약속된 표시 (O)
		// 서식 작업 (열 맞추기)
		
		msg = "하나\t둘\t셋";
		System.out.println(msg);
		
		msg = "하나	둘	셋";	// 권장 (X) 가독성 낮음
		System.out.println(msg);
		
		
		// 4. \b
		// - backspace
		// - 이클립스 콘솔에서는 동작 안 함
		msg = "Isaac\b입니다.";
		System.out.println(msg);
		
		
		// 5. \", \', \\
		// - (", ', \) 이미 역할을 가지고 있는 문자를 출력하기 위해 의미없게 만드는 작업
		
		msg = "Isaac: \"안녕하세요\"";
		System.out.println(msg);
		
		// 요구사항) 수업 폴더의 경로를 출력하세요.
		// C:\Class\code\java
		
		System.out.println("수업폴더 > C:\\Class\\code\\java");
	}
}
