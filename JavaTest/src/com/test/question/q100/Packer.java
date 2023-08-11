package com.test.question.q100;

class Text <T extends Product>{
	StringBuilder txt = new StringBuilder(); // 제품 검수 결과 메시지
	boolean isresult = false; // 제품 검수 결과

	// 제품 검수 조건
	String[] pencilHardnessList = { "4B", "3B", "2B", "B", "HB", "H", "2H", "3H", "4H" };
	String[] eraserSizeList = { "Large", "Medium", "Small" };
	double[] ballPointPenThicknessList = { 0.3, 0.5, 0.7, 1, 1.5 };
	String[] ballPointPenColorList = { "red", "blue", "green", "black" };
	int[] rulerLengthList = { 30, 50, 100 };
	String[] rulerShapeList = { "줄자", "운형자", "삼각자" };

	// 정수형 타입 제품 검수 메서드
	void productInspect(int product, int[] list) {
		isresult = false;
		txt.setLength(0);

		txt.append("포장 전 검수 : ");
		for (int i = 0; i < list.length; i++) {
			if (product == list[i]) {
				isresult = true;
				break;
			}
		}
	}

	// 실수형 타입 제품 검수 메서드
	void productInspect(double product, double[] list) {
		isresult = false;
		txt.setLength(0);

		txt.append("포장 전 검수 : ");
		for (int i = 0; i < list.length; i++) {
			if (product == list[i]) {
				isresult = true;
				break;
			}
		}
	}

	// 문자형 타입 제품 검수 메서드
	void productInspect(String product, String[] list) {
		isresult = false;
		txt.setLength(0);

		txt.append("포장 전 검수 : ");
		for (int i = 0; i < list.length; i++) {
			if (product.equals(list[i])) {
				isresult = true;
				break;
			}
		}
	}
	
	int productInspectResult(T product, int productcount) {
	    if (isresult) {
	    	productcount++;
	        txt.append(product.info()).append("입니다.\n");
	        txt.append("포장을 완료했습니다.");
	    } else {
	        txt.append("포장을 실패했습니다.");
	    }
		
		return productcount;
	}
}

interface Product {
    String info();
}

class Packer extends Text {
	private static int pencilCount = 0; // 연필 포장 개수(개)
	private static int eraserCount = 0; // 지우개 포장 개수(개)
	private static int ballPointPenCount = 0; // 볼펜 포장 개수(개)
	private static int rulerCount = 0; // 자 포장 개수(개)

	void packing(Pencil pencil) {
		// 연필 흑연 등급 검수
		productInspect(pencil.getHardness(), pencilHardnessList);
		
		// 제품 검수 결과에 따른 개수 누적
		pencilCount = productInspectResult(pencil, pencilCount);
		
		/*
		if (isresult) {
			pencilCount++;
			txt.append(pencil.info() + "입니다.\n");
			txt.append("포장을 완료했습니다.");
		} else {
			txt.append("포장을 실패했습니다.");
		}
		*/
		
		System.out.println(txt);
	}

	void packing(Eraser eraser) {
		// 지우개 크기 검수
		productInspect(eraser.getSize(), eraserSizeList);
		
		// 제품 검수 결과에 따른 개수 누적
		eraserCount = productInspectResult(eraser, eraserCount);
		
		System.out.println(txt);
	}

	void packing(BallPointPen ballPointPen) {
		// 볼펜 심 두께 검수
		productInspect(ballPointPen.getThickness(), ballPointPenThicknessList);

		// 볼펜 색상 검수
		productInspect(ballPointPen.getColor(), ballPointPenColorList);

		// 제품 검수 결과에 따른 개수 누적
		ballPointPenCount = productInspectResult(ballPointPen, ballPointPenCount);
	
		System.out.println(txt);
	}

	void packing(Ruler ruler) {
		// 자 길이 검수
		productInspect(ruler.getLength(), rulerLengthList);

		// 자 형태 검수
		productInspect(ruler.getShape(), rulerShapeList);

		// 제품 검수 결과에 따른 개수 누적
		rulerCount = productInspectResult(ruler, rulerCount);

		System.out.println(txt);
	}

	void countPacking(int type) {
		txt.setLength(0);
		txt.append("=====================\n");
		txt.append("포장 결과\n");
		txt.append("=====================\n");

		if (type == 0) {
			txt.append("연필 " + pencilCount + "회\n");
			txt.append("지우개 " + eraserCount + "회\n");
			txt.append("볼펜 " + ballPointPenCount + "회\n");
			txt.append("자 " + rulerCount + "회\n");
		} else if (type == 1) {
			txt.append("연필 " + pencilCount + "회\n");
		} else if (type == 2) {
			txt.append("지우개 " + eraserCount + "회\n");
		} else if (type == 3) {
			txt.append("볼펜 " + ballPointPenCount + "회\n");
		} else if (type == 4) {
			txt.append("자 " + rulerCount + "회\n");
		}

		System.out.println(txt);
	}
}
