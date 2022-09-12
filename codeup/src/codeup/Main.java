package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 언제까지 더해야 할까?
		
		Scanner sc = new Scanner(System.in);
		
		//순서대로 더하다가, 입력된 정수와 같거나 커졌을 때 마지막에 더한 정수 출력
		
		int i = 0;
		int n = sc.nextInt();
		int sum = 0;
		
		for(i=1; sum<n; i++) {
			sum += i;
			
			if(sum<n) {
				continue;
			} else {
				break;
			}
		}
		
		System.out.println(i);
		
	
		sc.close();

	}

}