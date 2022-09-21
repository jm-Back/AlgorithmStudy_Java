package codeup;

import java.util.Scanner;

public class _1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[24];

		for (int i=0; i<n; i++) {
			data[sc.nextInt()] ++;
		}

		for (int i=1; i<=23; i++)
			System.out.print(data[i] + " ");
		
		sc.close();
	}
}
