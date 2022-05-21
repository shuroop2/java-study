package day01;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m;
		
		System.out.print("입력 시간 : ");
		h = sc.nextInt();
		m = sc.nextInt();
		
		
		if(h >= 0 && m >= 45)
			System.out.println(h + " " + (m-45));
		else if(h >= 1 && m < 45)
			System.out.println((h-1) + " " + (m+15));
		else 
			System.out.println("23 " + (m+15));
		
		sc.close();
	}
}
