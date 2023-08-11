package com.test.question.q101;

class Americano {
	private int bean; // 아메리카노 생산 시 들어가는 원두량(g)
	private int water; // 아메리카노 생산 시 들어가는 물량(ml)
	private int ice; // 아메리카노 생산 시 들어가는 얼음 개수(개)
	
	Americano(int bean, int water, int ice){
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}

	public int getBean() {
		return bean;
	}

	public int getWater() {
		return water;
	}

	public int getIce() {
		return ice;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 라테를 마십니다.\n", bean, water, ice);
	}
}
