package com.Prime;

public class Pime {
	public static void main(String[] args) {
		int n = 50; // Change this to the desired maximum number
		System.out.println("Prime numbers between 2 and " + n + ":");
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}
		}
	}

}
