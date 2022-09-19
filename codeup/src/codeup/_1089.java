package codeup;

import java.util.Scanner;

public class _1089 {

	public static void main(String[] args) {
		// 수 나열하기1
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		int s = a;
		
		for(int i=1; i<n; i++) {
			s += d;
		}
		
		System.out.print(s);
		
		sc.close();

	}

}
