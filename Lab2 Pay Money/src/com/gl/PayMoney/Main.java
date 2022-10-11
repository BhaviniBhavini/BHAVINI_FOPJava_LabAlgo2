package com.gl.PayMoney;

import java.util.Scanner;

import com.gl.transaction.Transaction;

public class Main {

	public static void main(String[] args) {

		Transaction transaction=new Transaction();

		Scanner sc=new Scanner(System.in);

		int sizeOfArray;
		System.out.println("Enter the size of transaction array");
		sizeOfArray=sc.nextInt();
		System.out.println("Enter the value of Array");

		int[] array=new int [sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			array[i]=sc.nextInt();

		}

		System.out.println("Enter the total number of targets that needs to be achieved");

		int target=sc.nextInt();
		for(int i=0;i<target;i++);
		System.out.println("Enter the value of target");

		int value=sc.nextInt();
		transaction.isTargetAchievable(value,array);
		sc.close();
	
	}

}

