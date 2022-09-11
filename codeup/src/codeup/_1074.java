package codeup;

import java.util.Scanner;

public class _1074 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 카운트다운 출력하기1
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		while(a!=0) {			
			System.out.println(a);
			--a;
			continue;
		}

	}

}
