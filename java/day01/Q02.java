package day01;

public class Q02 {
	public static void main(String[] args) {
		int sum = 0;

		while (true) {
			for (int i = 1; i < 1001; i++) {
				if (i % 3 == 0)
					sum += i;
			}
			break;
		}

		System.out.println(sum);
	}
}
