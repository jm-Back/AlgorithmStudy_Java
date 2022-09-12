package codeup;

import java.util.Scanner;

public class _1079 {

	public static void main(String[] args) {
		// 문자가 입력될 때까지 반복 출력하기
		Scanner sc = new Scanner(System.in);
		
		char n = sc.next().charAt(0);
		System.out.print(n + " ");
		
		while(n!='q') {
			n = sc.next().charAt(0);
			System.out.print(n + " ");
		}

		sc.close();
		
	}

}
