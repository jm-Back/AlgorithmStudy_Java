package codeup;

import java.util.Scanner;

public class _1051 {

	public static void main(String[] args) {
		// 두 정수 입력받아 비교하기3
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b>=a) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
		sc.close();
		

	}

}
