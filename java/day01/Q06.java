package day01;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;

		System.out.print("�� ���ڸ� �Է����ּ��� : ");
		A = sc.nextInt();
		B = sc.nextInt();

		if (A < B)
			System.out.println("<");
		else if (A > B)
			System.out.println(">");
		else
			System.out.println("==");

		sc.close();
	}
}
