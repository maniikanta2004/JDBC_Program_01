package com.test;
import java.util.Scanner;
public class Program_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value: ");
		int n = sc.nextInt();
		System.out.print("Square of "+n+" is "+(n*n));
		sc.close();

	}

}
