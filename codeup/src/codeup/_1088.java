package codeup;

import java.util.Scanner;

public class _1088 {

	public static void main(String[] args) {
		// 3의 배수는 통과?
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		
		sc.close();

	}

}
