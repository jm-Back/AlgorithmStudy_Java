package codeup;

import java.util.Scanner;

public class _1092 {

	public static void main(String[] args) {
		// 함께 문제 푸는 날
		//같은 날 동시에 가입한 3명이 규칙적으로 방문하는, 방문 주기가 공백을 두고 입력된다.
		// 모두 함께 방문해 문제를 푸는 날(동시가입/등업 후 며칠후)를 출력한다.
		
		try (Scanner sc = new Scanner(System.in)) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			
			int day = 1;
			while(true) {
				if(day%n1==0 && day%n2==0 && day%n3==0 ) {
					System.out.println(day);
					return;
				}
				day++;
			}
		}
		
		

	}

}
