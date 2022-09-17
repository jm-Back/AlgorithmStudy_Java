package codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1084_1 {

	public static void main(String[] args) throws IOException {
		// 빛 섞어 색 만들기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] a = br.readLine().split(" ");
		
		int count = 0;

		for(int i=0; i<Integer.valueOf(a[0]); i++) {
			for(int j=0; j<Integer.valueOf(a[1]); j++) {
				for(int z=0; z<Integer.valueOf(a[2]); z++) {
					bw.write(i + " " + j + " " + z + "\n");
					count++;
				}
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();

	}

}
