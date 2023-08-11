package com.test.question.q101;

// 커피 음료를 제조하고 판매 결과를 출력
class Barista {
	// 에스프레소 단품 주문 메소드
	public Espresso makeEspresso(int bean) {
		Espresso espresso = new Espresso(bean); // 에스프레소 객체 생성
		Coffee.countCoffee(espresso); // 에스프레소 판매량, 원자재 소비량 누적
		
		return espresso;
	}

	// 에스프레소 여러 잔 주문
	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] espressoes = new Espresso[count]; // 에스프레소 배열 객체 생성
		for(int i = 0; i < espressoes.length; ++i) {
			Espresso espresso = new Espresso(bean); // 에스프레소 객체 생성
			Coffee.countCoffee(espresso); // 에스프레소 판매량, 원자재 소비량 누적
			espressoes[i] = espresso; // 배열에 에스프레소 객체 추가
		}
		
		return espressoes;
	}
	
	// 라테 단품 주문
	public Latte makeLatte(int bean, int milk) {
		Latte latte = new Latte(bean, milk); // 라테 객체 생성
		Coffee.countCoffee(latte); // 라테 판매량, 원자재 소비량 누적
		
		return latte;
	}

	// 라테 여러 잔 주문
	public Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] lattes = new Latte[count]; // 라테 배열 객체 생성
		
		for (int i = 0; i < lattes.length; ++i) {
			Latte latte = new Latte(bean, milk); // 라테 객체 생성
			Coffee.countCoffee(latte); // 라테 판매량, 원자재 소비량 누적
			lattes[i] = latte; // 배열에 라테 객체 추가
		}
		
		return lattes;
	}
	
	// 아메리카노 단품 주문
	public Americano makeAmericano(int bean, int water, int ice) {
		Americano americano = new Americano(bean, water, ice); // 아메리카노 객체 생성
		Coffee.countCoffee(americano); // 아메리카노 판매량, 원자재 소비량 누적
		
		return americano;
	}

	// 아메리카노 여러 잔 주문
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] americanos = new Americano[count]; // 아메리카노 배열 객체 생성
		
		for (int i = 0; i < americanos.length; ++i) {
			Americano americano = new Americano(bean, water, ice); // 아메리카노 객체 생성
			Coffee.countCoffee(americano); // 아메리카노 판매량, 원자재 소비량 누적
			americanos[i] = americano; // 배열에 아메리카노 객체 추가
		}
		
		return americanos;
	}
	
	// 결산
	public void result() {
		System.out.println("=================================");
		System.out.println("판매 결과");
		System.out.println("=================================");
		System.out.println("---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.printf("에스프레소 : %d잔\n", Coffee.getEspresso());
		System.out.printf("아메리카노 : %d잔\n", Coffee.getAmericano());
		System.out.printf("라테 : %d잔\n", Coffee.getLatte());
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,dg\n", Coffee.getBean());
		System.out.printf("물 : %,dml\n", Coffee.getWater());
		System.out.printf("얼음 : %,d개\n", Coffee.getIce());
		System.out.printf("우유 : %,dml\n", Coffee.getMilk());
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,d원\n", Coffee.getBeanTotalPrice());
		System.out.printf("물 : %,d원\n", Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원\n", Coffee.getIceTotalPrice());
		System.out.printf("우유 : %,d원\n", Coffee.getMilkTotalPrice());
		System.out.println();
	}
}
