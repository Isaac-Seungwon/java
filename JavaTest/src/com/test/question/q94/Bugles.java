package com.test.question.q94;

import java.util.Calendar;

public class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;

	// 남은 유통기한 검증
	public void eat() {
		if (getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
	}
	
	public int getPrice() {
		return price;
	}
	/*
	// 다른 방법
	public String getPrice() {
		return String.format("%,d", price);
	}
	*/

	// 용량별 가격 850원(300g), 1200원(500g), 1950원(850g)
	public void setWeight(int weight) {
		if (weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;
		}

		if (weight == 300) {
			this.price = 850;
		} else if (weight == 500) {
			this.price = 1200;
		} else if (weight == 850) {
			this.price = 1950;
		}
	}

	public void setCreationTime(String date) {
		// 생산일자 추출
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7)) - 1;
		int day = Integer.parseInt(date.substring(8));

		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		this.creationTime = c;
	}

	// 남은 유통기한 7일(300g), 10일(500g), 15일(850g)
	public int getExpiration() {
		Calendar now = Calendar.getInstance();

		// 유통기한 계산
		if (this.weight == 300) {
			expiration = 7;
		} else if (this.weight == 500) {
			expiration = 10;
		} else if (this.weight == 850) {
			expiration = 15;
		}

		// 남은 유통기한 계산
		return this.expiration - (int) ((now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24);
	}
}