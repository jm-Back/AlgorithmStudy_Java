package codeup;

import java.util.Scanner;

public class _1084 {

	public static void main(String[] args) {
		// 빛 섞어 색 만들기
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int [] rgb = new int[3];
		
		for(int i=0; i<3; i++) {
			rgb[i] = sc.nextInt();
		}
		
		for(int i=0; i<rgb[0]; i++) {
			for(int j=0; j<rgb[1]; j++) {
				for(int z=0; z<rgb[2]; z++) {
					System.out.println(i +" " + j + " " + z);
					count++;
				}
			}
		}
		
		System.out.println(count);

		sc.close();

	}

}
