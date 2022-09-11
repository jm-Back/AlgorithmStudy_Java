package codeup;

import java.util.Scanner;

public class _1077 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 그 수까지 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int zero = 0;
			
		while(zero!=n+1) {
			System.out.println(zero);
			++zero;
		}
		
		
		
		sc.close();

	}

}
