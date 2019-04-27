package io.sb.algorithms.dp;
/*
 * Fibonacci Series - 1 1 2 3 5 8 13 21 ......
 */
public class FibonacciRecursive {

	
	public int calculateFibonacci(int n) {
		if(n < 2)		
		return n;
		return calculateFibonacci(n-1) + calculateFibonacci(n-2);
	}

	public static void main(String[] args) {
		FibonacciRecursive fbRecurrsive = new FibonacciRecursive();
		
		System.out.println("8th Fibonacci: "+ fbRecurrsive.calculateFibonacci(8));
//		System.out.println("6th Fibonacci: "+ fbRecurrsive.calculateFibonacci(6));
//		System.out.println("7th Fibonacci: "+ fbRecurrsive.calculateFibonacci(7));
		System.out.println("Fibonacci Series:");
		for(int i =0; i<=8; i++) {			
			System.out.println(fbRecurrsive.calculateFibonacci(i));
		}
	}

}
