package com.test.question.q93;

import java.text.DecimalFormat;

public class Note {
	DecimalFormat formatter = new DecimalFormat("###,###");
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price = 0;
	private int priceSum = 0;
	private String thickness;
	
	// 덤프 메소드 (노트 정보 출력 메소드)
	public String info() {
		// 문자열(null)
		// null은 객체가 아니다
		// if (owner != null) > 연산자 사용 > 주소값 비교
		
		// 문자열("")
		// if (owner.equals("")) > 메소드 사용 > 값 비교
		
		// 소유자 정보에 따라 출력
		if (this.owner != null) {
            return String.format("■■■■■■ 노트 정보 ■■■■■■\n"
                    + "소유자: %s\n"
                    + "특성: %s%s%s 노트\n"
                    + "가격: %s원\n"
                    + "■■■■■■■■■■■■■■■■■■■■■■■\r\n",
                    this.owner, this.color, this.thickness, this.size, formatter.format(this.price));
        } else {
            return "■■■■■■ 노트 정보 ■■■■■■\n"
                    + "주인 없는 노트\n"
                    + "■■■■■■■■■■■■■■■■■■■■■■■\r\n";
        }
		
		/*
		// 다른 방법
		if (this.owner != null) {
			return String.format("■■■■■■ 노트 정보 ■■■■■■\n"
								+ "소유자 : " + this.owner + "\n"
								+ "특성 : " + this.color
								+ (Integer.valueOf(this.page) <= 50 ?
										" 얇은 " : Integer.valueOf(this.page) <= 100 ?
										" 보통 " : Integer.valueOf(this.page) <= 200 ?
										" 두꺼운 ": "")
								+ this.size + "노트 \n"
								+ "가격: " + formatter.format(priceSum) + "원\n"
								+ "■■■■■■■■■■■■■■■■■■■■■■\r\n");
		} else {
			return String.format("■■■■■■ 노트 정보 ■■■■■■\n"
								+ "주인 없는 노트" + "\n"
								+ "■■■■■■■■■■■■■■■■■■■■■■\r\n");
		}
		*/
	}

	// 크기: A3, A4, A5, B3, B4, B5
	public void setSize(String size) {
		String[] sizeList = {"A3", "A4", "A5", "B3", "B4", "B5"};
		for (String s : sizeList) {
			if (size.equals(s)) {
                this.size = size;
            }
		}
		
		// 크기 추가요금
		if (this.size.equals("A5")) {
			this.price += 500; // 기본 요금
		} else {
			this.price += 500; // 기본 요금
			
			if (this.size.equals("A3")) {
				this.price += 400;
			} else if (this.size.equals("A4")) {
				this.price += 200;
			} else if (this.size.equals("B3")) {
				this.price += 500;
			} else if (this.size.equals("B4")) {
				this.price += 300;
			} else if (this.size.equals("B5")) {
				this.price += 100;
			}
		}
	}
	
	// 표지 색상: 검정색, 흰색, 노란색, 파란색
	public void setColor(String color) {
		String[] colorList = {"검정색", "흰색", "노란색", "파란색"};
        for (String c : colorList) {
            if (color.equals(c)) {
                this.color = color;
            }
        }
        
		// 표지 색상 추가 요금
		if (color.equals("검정색")) {
			this.price += 100;
		} else if (color.equals("노란색")) {
			this.price += 200;
		} else if (color.equals("파란색")) {
			this.price += 200;
		}
	}

	// 페이지수: 10 ~ 200페이지 이내
	// (+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
		}

		// 페이지수 추가요금
		this.price += (this.page - 10) * 10;
		
		// 두께 검증
		thickness = (page <= 50) ? " 얇은 " : (page <= 100) ? " 보통 " : (page <= 200) ? " 두꺼운 " : "";

		/*
		// 다른 방법: 조건에 맞지 않는 것을 찾음
		if (page < 10 || page > 200) {
			return;
		}
		*/
	}

	// 소유자이름: 한글 2~5자이내. 필수값
	public void setOwner(String owner) {
		// 유효성 검사
		// - 검사할 기준이 1개일 경우: 무관
		// - 검사할 기준이 N개일 경우: 잘못된 것을 찾는다.
		
		if (owner.length() >= 2 && owner.length() <= 5 && owner.matches("[가-힣]*")) {
            this.owner = owner;
        }

		/*
		// 다른 방법
		if (owner.length() < 2 || owner.length() > 5) {
			return;
		}
		
		for (int i=0; i<owner.length(); i++) {
			
			char c = owner.charAt(i);
			
			if (c < '가' || c > '힣') {
				return;
			}
			
		}
		*/
	}
}
