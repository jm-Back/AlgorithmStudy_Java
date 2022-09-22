package codeup;

import java.util.Scanner;

public class _1094 {

	public static void main(String[] args)  {
		// 이상한 출석 번호 부르기 2
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			System.out.print(a[n-1-j] + " ");
		}
	
		sc.close();
	}

}
