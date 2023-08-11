package com.test.question.q101;

// 커피 정보 및 판매 정보 관리
class Coffee {
	private static int bean;	// 원두량(g)
	private static int water;	// 물량(ml)
	private static int ice;		// 얼음 개수(개)
	private static int milk;	// 우유량(ml)
	
	private static int beanUnitPrice;		// 원두 단가(원) 1g:1원
	private static double waterUnitPrice;	// 물 단가(원) 1ml:0.2원
	private static int iceUnitPrice;		// 얼음 단가(원) 1개:3원
	private static int milkUnitPrice;		// 우유 단가(원) 1ml:4원
	
	private static int beanTotalPrice;		// 원두 총 판매액(원)
	private static int waterTotalPrice;		// 물 총 판매액(원)
	private static int iceTotalPrice;		// 얼음 총 판매액(원)
	private static int milkTotalPrice;		// 우유 총 판매액(원)
	
	private static int americano;	// 아메리카노 총 판매 개수(잔)
	private static int latte;		// 라테 총 판매 개수(잔)
	private static int espresso;	// 에스프레소 총 판매 개수(잔)
	
	static {
		// 정적 변수 초기화
		Coffee.beanUnitPrice = 1;
		Coffee.waterUnitPrice = 0.2;
		Coffee.iceUnitPrice = 3;
		Coffee.milkUnitPrice = 4;
		
		Coffee.bean = 0;
		Coffee.water = 0;
		Coffee.ice = 0;
		Coffee.milk = 0;
		
		Coffee.beanTotalPrice = 0;
		Coffee.waterTotalPrice = 0;
		Coffee.iceTotalPrice = 0;
		Coffee.milkTotalPrice = 0;
		
		Coffee.americano = 0;
		Coffee.latte = 0;
		Coffee.espresso = 0;
	}

	// 에스프레소 판매량 누적
	public static void countCoffee(Espresso espresso) {
		Coffee.espresso++;
		Coffee.bean += espresso.getBean();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * espresso.getBean();
	}

	// 라테 판매량 누적
	public static void countCoffee(Latte latte) {
		Coffee.latte++;
		Coffee.bean += latte.getBean();
		Coffee.milk += latte.getMilk();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * latte.getBean();
		Coffee.milkTotalPrice += Coffee.milkUnitPrice * latte.getMilk();
	}
	
	// 아메리카노 판매량 누적
	public static void countCoffee(Americano americano) {
		Coffee.americano++;
		Coffee.bean += americano.getBean();
		Coffee.water += americano.getWater();
		Coffee.ice += americano.getIce();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * americano.getBean();
		Coffee.waterTotalPrice += Coffee.waterUnitPrice * americano.getWater();
		Coffee.iceTotalPrice += Coffee.iceUnitPrice * americano.getIce();
	}
	
	public static int getBean() {
		return bean;
	}

	public static int getWater() {
		return water;
	}

	public static int getIce() {
		return ice;
	}

	public static int getMilk() {
		return milk;
	}

	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}

	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}

	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}

	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}

	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}

	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}

	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}

	public static int getAmericano() {
		return americano;
	}

	public static int getLatte() {
		return latte;
	}

	public static int getEspresso() {
		return espresso;
	}
}
