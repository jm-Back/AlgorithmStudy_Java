package codeup;

import java.util.Scanner;

public class _1081 {

	public static void main(String[] args) {
		//주사위를 2개 던지면?
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				System.out.println(i + " " + j);
			}
		}
		
		
		sc.close();

	}

}
