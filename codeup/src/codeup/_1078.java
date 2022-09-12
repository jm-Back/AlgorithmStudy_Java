package codeup;

import java.util.Scanner;

public class _1078 {

	public static void main(String[] args) {
		// 짝수 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=a; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		
		System.out.println(sum);

		sc.close();

	}

}
