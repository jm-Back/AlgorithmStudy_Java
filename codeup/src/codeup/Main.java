package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 16진수 구구단?
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int m = Integer.valueOf(n, 16);
		
		for(int i=1; i<16; i++) {
			System.out.format("%X*%X=%X", m, i, m*i);
			System.out.println();
		}
		
		sc.close();

	}

}