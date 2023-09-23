package com.test.java.auth.admin;

import java.util.Scanner;

import com.test.java.auth.auth.Auth;

public class Admin {

	public static void something() {

		if (Auth.auth == null || Auth.auth.getLv().equals("1")) {
			
			System.out.println("관리자만 접근 가능합니다.");
			
			return;
		}
		
		System.out.println("관리자 전용 기능입니다.");
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}
}
