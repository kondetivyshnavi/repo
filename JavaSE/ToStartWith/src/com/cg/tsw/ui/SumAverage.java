package com.cg.tsw.ui;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, sum = 0, count = 0;
		double  avg = 0;
		System.out.println("Enter numbers [0 to stop] : ");
		
		for( ; ; ) {
			num = scan.nextInt();
			if (num == 0) {
				break;
			}
			count++;
			sum += num;
		}
		
		avg = (double) sum / count;
		
		System.out.println("Sum : " + sum);
		// System.out.format("Average : %.1f", avg);
		System.out.printf("Average : %.1f", avg);
		
		
		scan.close();

	}

}
