package codeup;

import java.util.Scanner;

public class _1072 {

	public static void main(String[] args) {
		// 정수 입력받아 계속 출력하기
		// 첫 줄에 정수의 개수 n이 입력되고, 두번째 줄에 n개의 정수가 공백 두고 입력된다.

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			System.out.println(a);
		}
		
		sc.close();
		
	}

}
