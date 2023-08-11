package com.test.question.q101;

class Espresso {
	private int bean; // // 에스프레소 생산 시 들어가는 원두량(g)

	Espresso(int bean){
		this.bean = bean;
	}
	
	public int getBean() {
		return bean;
	}

	public void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.\n", bean);
	}
}
