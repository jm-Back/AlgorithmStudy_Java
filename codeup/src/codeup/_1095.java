package codeup;

import java.util.Scanner;

public class _1095 {

	public static void main(String[] args) {
		// 이상한 출석 번호 부르기3
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		int min=23;
		for(int j=0; j<n; j++){
			if(min>num[j]) {
				min = num[j];
	
				}
		}
		
		System.out.println(min);
		
		
		
		sc.close();

	}

}
