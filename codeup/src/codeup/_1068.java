package codeup;

import java.util.Scanner;

public class _1068 {

	public static void main(String[] args) {
		// 정수 1개 입력받아 평가 출력하기
		 Scanner sc = new Scanner(System.in);
		 
		 int a = sc.nextInt();
		 
		 if(a>=90) {
			 System.out.println("A");
		 } else if(a>=70) {
			 System.out.println("B");
		 } else if(a>=40) {
			 System.out.println("C");
		 } else if(a>=0) {
			 System.out.println("D");
		 } 

		 sc.close();

	}

}
