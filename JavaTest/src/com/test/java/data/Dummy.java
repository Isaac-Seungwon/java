package com.test.java.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Dummy {

	public static void main(String[] args) throws Exception {
		
		//학생 데이터 생성
		//- 학년: 1학년~3학년
		//- 반: 1학급~5학급
		//- 번호: 10명
		
		int n = 1;
		String[] name1 = { "하", "권", "박", "허", "강" };
		String[] name2 = { "곽", "의", "철", "중", "석", "대", "필", "쌍", "우", "돈" };
		Random rnd = new Random();

		BufferedWriter writer = new BufferedWriter(new FileWriter("data\\student.txt"));
		
		for (int i=1; i<=3; i++) { //학년
			
			for (int j=1; j<=5; j++) { //반
				
				for (int k=1; k<=10; k++) { //번호 == 학생
					//데이터 구성
					//일련번호,학생명,학년,반,번호
					String name = name1[rnd.nextInt(name1.length)]
								+ name2[rnd.nextInt(name2.length)]
								+ name2[rnd.nextInt(name2.length)];
					String s = String.format("%d,%s,%d,%d,%d\r\n", n, name, i, j, k);
					n++;
					// System.out.println(s);
					writer.write(s);
				}//k
			}//j
		}//i
		
		/*
			1,하돈곽,1,1,1
			2,허의돈,1,1,2
			3,박대우,1,1,3
			4,강필의,1,1,4
			5,강쌍필,1,1,5
		*/
		
		writer.close();
	}
}
