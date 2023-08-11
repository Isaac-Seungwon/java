package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q126 {
	
	public static final String FILE = "C:\\Class\\code\\java\\file\\파일_입출력_문제\\출결.dat";
	
	public static void main(String[] args) {
		/*
		● 요구사항
		직원들의 지각과 조퇴를 카운트하시오.
		
		● 조건
		- 출근 : 오전 9시
		- 퇴근 : 오후 6시
		
		● 입력
		파일 > 출결.dat
		
		● 출력
		[이름]    [지각]    [조퇴] 
		홍길동      4회       0회 
		아무개      0회       0회 
		하하하      2회       3회 
		*/

		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE));
			
			ArrayList<Employee> list = new ArrayList<Employee>();

			String line = null;

			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				Employee e = getEmployee(list, temp[1]);
				
				if (e == null) {
					e = new Employee(temp[1], 0, 0);
					list.add(e);
				}
				
				if (temp[2].compareTo("9:00") > 0) {
					e.in++;
				}
				
				if (temp[3].compareTo("18:00") < 0) {
					e.out++;
				}
			}
			
			System.out.println("[이름]\t[지각]\t[조퇴]");

			for (Employee e : list) {
				System.out.printf("%s\t%4d회\t%4d회\n", e.name, e.in, e.out);
			}
			
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static Employee getEmployee(ArrayList<Employee> list, String name) {
		
		for (Employee e : list) {
			if (e.name.equals(name)) {
				return e;
			}
		}
		
		return null;
	}
}

class Employee {
	
	public String name;
	public int in;
	public int out;
	
	public Employee(String name, int in, int out) {
		this.name = name;
		this.in = in;
		this.out = out;
	}
	
	@Override
	public String toString() {
		return "{name=" + name + ", in=" + in + ", out=" + out + "}";
	}
}