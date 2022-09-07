package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		if(a==Math.abs(a)) {
			if(a%2==0) {
				System.out.println("plus");
				System.out.println("even");
			} else {
				System.out.println("plus");
				System.out.println("odd");
			}
		} else {
			if(a%2==0) {
				System.out.println("minus");
				System.out.println("even");
			} else {
				System.out.println("minus");
				System.out.println("odd");
			}
		}
		
		
		sc.close();

	}

}