package codeup;

import java.util.Scanner;

public class _1090 {

	public static void main(String[] args) {
		// 수 나열하기2
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long r = sc.nextLong();
		long n = sc.nextLong();
		
		long s = a;
		
		for(int i=1; i<n; i++) {
			s *= r;
		}
		
		System.out.print(s);
		
		sc.close();

	}

}
