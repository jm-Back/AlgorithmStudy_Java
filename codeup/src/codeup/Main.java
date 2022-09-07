package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 정수 3개 입력 받아 짝수만 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a);
		} 
		
		if (b%2==0) {
			System.out.println(b);
		} 
		
		if (c%2==0){
			System.out.println(c);
		}
		
		
		sc.close();

	}

}