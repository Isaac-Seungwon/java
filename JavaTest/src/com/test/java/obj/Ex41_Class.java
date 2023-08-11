package com.test.java.obj;

public class Ex41_Class {

	public static void main(String[] args) {
		
		// Ex41_Class.java
		
		// Pencil, PencilCase
		
		PencilCase pcase = new PencilCase(); // 필통 생성
		pcase.setColor("파란색");
		
		/*
		// 가독성과 직관성이 떨어지는 사용법
		// 연필 생성
		for (int i=0; i<5; i++) {
			Pencil p1 = new Pencil();
			p1.setHardness("HB");
			p1.setColor("검은색");
			
			// [index]: 인덱서(Indexer) - 표기법
			pcase.getPencil()[i] = p1;
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(pcase.getPencil()[i].info());
		}
		*/
		
		for (int i=0; i<6; i++) {
			Pencil p = new Pencil();
			p.setHardness("HB");
			p.setColor("파란색");
			
			pcase.add(p);
		}

		System.out.println(pcase.info());
		// [com.test.java.obj.Pencil@73a28541, com.test.java.obj.Pencil@6f75e721, com.test.java.obj.Pencil@69222c14, com.test.java.obj.Pencil@606d8acf, com.test.java.obj.Pencil@782830e]
				
		Pencil p2 = pcase.get(2);
		System.out.println(pcase.info());
		// [com.test.java.obj.Pencil@73a28541, com.test.java.obj.Pencil@6f75e721, com.test.java.obj.Pencil@606d8acf, com.test.java.obj.Pencil@782830e, null]
	}
}	
