package day01;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("ÁÂÇ¥ ÀÔ·Â");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0 && y>0)
			System.out.println("1");
		else if(x<0 && y>0)
			System.out.println("2");
		else if(x<0 && y<0)
			System.out.println("3");
		else
			System.out.println("4");
		
		sc.close();
	}

}
