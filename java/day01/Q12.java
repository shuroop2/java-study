package day01;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int prize;

		System.out.println("주사위 눈 입력");
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();

		if (num[0] == num[1] && num[0] == num[2])
			prize = 10000 + num[0] * 1000;
		else if (num[0] == num[1] && num[0] != num[2])
			prize = 1000 + num[0] * 100;
		else if (num[0] == num[2] && num[0] != num[1])
			prize = 1000 + num[0] * 100;
		else if (num[1] == num[2] && num[0] != num[1])
			prize = 1000 + num[1] * 100;
		else {
			int max = 0;
			for (int i = 0; i < num.length; i++)
				if (max < num[i])
					max = num[i];
			prize = max * 100;
		}
		System.out.println(prize);

		sc.close();
	}

}
