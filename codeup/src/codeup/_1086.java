package codeup;

import java.util.Scanner;

public class _1086 {

	public static void main(String[] args) {
		// 그림 파일 저장용량 계산하기
		
		Scanner sc = new Scanner(System.in);
		
		//w , h, b 가 입력
		
		float w = sc.nextFloat();
		float h = sc.nextFloat();
		float b = sc.nextFloat();
		
		float result = (((w * h * b)/8/1024)/1024);
		
		System.out.printf("%.2f MB", result);
		
		sc.close();

	}

}
