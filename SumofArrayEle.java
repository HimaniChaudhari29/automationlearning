package assignment.array;

import java.util.Scanner;
//class name change
public class SumofArrayElements {
//This file is on test branch
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		int[] arr = new int[5];
		System.out.println("Enter the elements in array :");
		for (int a : arr) {

			a = sc.nextInt();
			System.out.println(a);

			sum = sum + a;

		}

		System.out.println("Sum of array elements " +sum);

	}

}
