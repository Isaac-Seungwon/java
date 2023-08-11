package com.test.question.q96;

import java.util.Random;

class Box {
	private Macaron[] list = new Macaron[10]; // 마카롱 담을 배열
	private int index = 0; // 마카롱 배열의 인덱스 관리

	// 마카롱 생성
	public void cook() {
		String[] colorList = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
		Random random = new Random();
		
		for (int i=0; i<list.length; i++) {
			Macaron macaron = new Macaron();
			
			macaron.setSize(random.nextInt(11) + 5); // 5~15 사이의 크기
			macaron.setColor(colorList[random.nextInt(colorList.length)]); // colorList 배열의 랜덤한 색상
			macaron.setThickness(random.nextInt(20) + 1); // 1~20 사이의 두께
			
			this.list[i] = macaron; // 생성한 마카롱을 배열에 저장
		}
		
		System.out.printf("마카롱을 %d개 만들었습니둥\n\n", this.list.length);
	}

	// 마카롱 배열을 검사하고 합격과 불합격 개수를 출력
	public void check() {
		int pass = 0;
		int fail = 0;
		
		for (int i=0; i<list.length; i++) {
			Macaron macaron = this.list[i];
			
			if (check(macaron)) {
				pass++; // 합격 개수 증가
			} else {
				fail++; // 불합격 개수 증가
			}
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n", pass);
		System.out.printf("QC 불합격 개수 : %d개\n", fail);
		System.out.println();
	}

	// 마카롱 배열을 출력하고 각 마카롱의 합격 여부를 출력
	public void list() {
		System.out.println("[마카롱 목록]");
		
		for (int i=0; i<list.length; i++) {
			Macaron macaron = list[i];
			
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n",
                    i, macaron.getSize(), macaron.getColor(), macaron.getThickness(), check(macaron) ? "합격" : "불합격");
		}
		System.out.println();
	}
	
	private boolean check(Macaron macaron) {
		int macaronSize = macaron.getSize();
        String macaronColor = macaron.getColor();
        int macaronThickness = macaron.getThickness();
        
		if ((macaronSize < 8 || macaronSize > 14)
			|| macaronColor.equals("black")
			|| (macaronThickness < 3 || macaronThickness > 18)) {
			return false;
		}
		
		return true;
	}
}

class Macaron {
	private int size;		// 마카롱 크기
	private String color;	// 마카롱 색상
	private int thickness;	// 마카롱 두께
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
}
