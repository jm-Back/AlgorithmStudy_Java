package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 월 입력 받아 계절 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		switch (n) {
		case "12":
		case "1":
		case "2":
			System.out.println("winter"); break;
		case "3":
		case "4":
		case "5":
			System.out.println("spring"); break;
		case "6":
		case "7":
		case "8":
			System.out.println("summer"); break;
		case "9":
		case "10":
		case "11":
			System.out.println("fall"); break;
		
		}
		
		
		sc.close();

	}

}