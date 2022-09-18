package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 여기까지! 이제 그만~
		
		Scanner sc = new Scanner(System.in);
		
		// 정수 1개를 입력받고, 1~5 계속 더하다가 입력된 정수보다 커지거나 같아지는 경우, 그때 합 출력
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			if(sum>=n) {
				break;
			}
			sum += i;
		}
		
		System.out.println(sum);
		
		sc.close();
	
	}

}