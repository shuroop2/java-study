package day01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour, min, cookTime, cookTimeHour, cookTimeMin;
		
		System.out.print("시간 입력 : ");
		hour = sc.nextInt();
		min = sc.nextInt();
		
		System.out.print("조리 시간 입력 : ");
		cookTime = sc.nextInt();
		
		if(cookTime >= 60) {
			cookTimeHour = cookTime / 60;
			cookTimeMin = cookTime % 60;
		}else {
			cookTimeHour = 0;
			cookTimeMin = cookTime;
		}
		
		if(hour + cookTimeHour >= 23 && min + cookTimeMin >= 60) 
			System.out.println((hour + cookTimeHour - 23) + " " + (min + cookTimeMin - 60));
		else if(hour + cookTimeHour >= 24 && min + cookTimeMin < 60)
			System.out.println((hour + cookTimeHour - 24) + " " + (min + cookTimeMin));
		else if(hour + cookTimeHour < 23 && min + cookTimeMin >= 60)
			System.out.println((hour + cookTimeHour + 1) + " " + (min + cookTimeMin - 60));
		else
			System.out.println((hour + cookTimeHour) + " " + (min + cookTimeMin));
		
		sc.close();	
	}

}
