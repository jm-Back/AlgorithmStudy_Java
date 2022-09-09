package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 0 입력될 때까지 무한 출력하기 2
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			if(a!=0) {
				System.out.println(a);
			}else {
				break;
			}
		}

		sc.close();

	}

}