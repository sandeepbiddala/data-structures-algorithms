package io.sb.algorithms.dp;

public class FibonacciTabulation {
	
	public int calculateFibonacci(int n) {
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i= 2; i<=n; i++) {
			dp[i] = dp[i-1]+ dp[i-2];			
		}
		return dp[n];
	}

	
	public static void main(String[] args) {
		FibonacciTabulation fbTabulation = new FibonacciTabulation();
		System.out.println("8th Fibonacci:"+fbTabulation.calculateFibonacci(8));

	}

}
