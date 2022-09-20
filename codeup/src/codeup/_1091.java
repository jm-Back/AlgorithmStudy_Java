package codeup;

import java.util.Scanner;

public class _1091 {

	public static void main(String[] args) {
		// -2를 곱한 다음 1을 더해 다음수를 만든다.
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long m = sc.nextLong();
		long d = sc.nextLong();
		long n = sc.nextLong();
		
		for(int i=1; i<n; i++) {
			a = a * m + d;
		}
		
		System.out.print(a);
		
		sc.close();

	}

}
