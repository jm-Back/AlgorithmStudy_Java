package codeup;

import java.util.Scanner;

public class _1085 {

	public static void main(String[] args)  {
		// 소리 파일의 용량을 저장하자 
		// h : 
		// b : 
		// c : 
		// s : 
		// 모두 MB 단위로 바꾸어 출력. 소수점 둘째 자리에서 반올림하여 첫째 자리까지 표현
		// h * b * c * s / 8 비트로 나누면 byte 값이 되고 또 1024 byte 로 나누면 kb. 1024kb 로 나누면 MB!
		
		Scanner sc = new Scanner(System.in);
		
		float h = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float s = sc.nextFloat();
		
		float pcm = ((((h * b * c * s)/8)/1024)/1024);
		
		System.out.printf("%.1f MB", pcm);

		
		sc.close();

	}

}
