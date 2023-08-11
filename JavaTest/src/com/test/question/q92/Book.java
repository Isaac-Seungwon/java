package com.test.question.q92;

import java.text.DecimalFormat;

public class Book {
	// DecimalFormat: 숫자를 원하는 형식으로 포맷팅하는데 사용하는 클래스
	DecimalFormat formatter = new DecimalFormat("###,###");

	// 멤버 변수
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;
   
	// 덤프 메소드: 책 정보 문자열을 반환
	public String info() {
		String msg = "";
		msg += "제목: " + this.title + "\n";
		msg += "가격: " + formatter.format(this.price) + "원\n";
		msg += "저자: " + this.author+ "\n";
		msg += "출판사: " + this.publisher+ "\n";
		msg += "발행년도: " + this.pubYear+ "년\n";
		msg += "ISBN: " + this.isbn + "\n";
		msg += "페이지: " + formatter.format(this.page) + "장\n";
		
		return msg;
	}

	public String getTitle() {
		return title;
	}

	// 제목: 최대 50자 이내(한글, 영어, 숫자, 공백)
	public void setTitle(String title) {
		if (title.length() <= 50) {
			// 정규표현식을 활용하여 문자열 유효성 검사
			/*
			문자열이 한글, 영어 대소문자, 숫자, 공백 문자로만 구성되어 있는지 검증
			[가-힣]: 한글 유니코드 범위, 한글 글자들을 포함
			[A-Za-z]: 알파벳 대소문자를 포함
			[0-9]: 숫자를 포함
			\\s: 공백 문자(space, tab 등)를 포함
			*: 앞의 문자 클래스([가-힣A-Za-z0-9\\s])가 0번 이상 반복될 수 있다는 의미
			*/
            if (title.matches("[가-힣A-Za-z0-9\\s]*")) {
                this.title = title;
            }
        }
		
		/*
		// 다른 방법
		if (title.length() <= 50) {
			
			for (int i=0; i<title.length(); i++) {
				char c = title.charAt(i);
				
				if ((c < '가' || c  > '힣') &&
					(c < 'A' || c > 'Z' ) &&
					(c < 'a' || c > 'z') &&
					(c < '0' || c > '9') &&
					(c != ' ')) {
					return;
				}
			}
		}
		
		this.title = title;
		*/
	}

	public int getPrice() {
		return price;
	}

	// 가격: 0 ~ 1000000원
	public void setPrice(int price) {
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		}
	}

	public String getAuthor() {
		return author;
	}

	// 저자: 제한 없음
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	// 페이지수: 1~무제한
	public void setPage(int page) {
		if (page >= 1) {
			this.page = page;
		}
		
		/*
		// 다른 방법
		if (page < 1) {
			return;
		}

		this.page = page;
		*/
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	// 발행년도: 2019년
	public String getPubYear() {
		return pubYear;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
