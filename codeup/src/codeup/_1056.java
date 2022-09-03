package codeup;

import java.util.Scanner;

public class _1056 {

	public static void main(String[] args) {
		// 참 거짓이 서로 다를 때에만 참 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		//1 또는 0 입력시 참/거짓이 서로 다를 때만 참 출력
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a!=b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
		
		sc.close();
		

	}

}
