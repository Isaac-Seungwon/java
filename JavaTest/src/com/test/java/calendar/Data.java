package com.test.java.calendar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//Item.txt를 조작하는 클래스 *****
//1. static으로 ArrayList<Item> 배열 껍데기를 만든다.
//2. static으로 만든 이유는 객체를 생성하지 않아도 되므로 언제든지 쉽게 접근할 수 있기 때문이다.
//3. (정적)생성자에서 배열을 만든다.

public class Data {
	public static ArrayList<Item> list; // 전체 일정
	
	//(정적)생성자
	//static 멤버 전용 초기화하는 역할을 한다.
	//main() 메소드가 실행되기 전에 실행된다.
	static {
		Data.list = new ArrayList<Item>();
	}

	public static void load() {

		//item.txt > ArrayList<Item>
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("data\\item.txt"));
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				//System.out.println(line);
				
				String[] temp = line.split(",");
				Item item = new Item(temp[0], temp[1], temp[2]);
				Data.list.add(item);
			}
		
			reader.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
