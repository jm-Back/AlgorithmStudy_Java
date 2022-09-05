package codeup;

import java.util.Scanner;

public class _1064 {

	public static void main(String[] args) {
		// 정수 3개를 입력받아 가장 작은 수 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("%d", (a>b ? b:a)>c ? c : (a>b ? b:a) );
		
		
		
		sc.close();

	}

}
