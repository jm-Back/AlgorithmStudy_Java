package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		for(int i=1; i<=b; i++) {
			a *= 2;
		}
		
		System.out.println(a);
		
		sc.close();

	}

}
