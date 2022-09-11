package codeup;

import java.util.Scanner;

public class _1076 {

	public static void main(String[] args) {
		// 문자 1개 입력받아 알파벳 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		char n = sc.next().charAt(0);
		char a = 'a';
		System.out.print(a + " ");
		
		while(a!=n) {
			++a;
			System.out.print(a + " ");

		}
		
		
		sc.close();

	}

}
