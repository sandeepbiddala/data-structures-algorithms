package io.sb.algorithms.dp;

public class FibonacciMemoization {
	
	
	public int calculateFebonaci(int n) {
		int memoize[] = new int[n+1];
		return calculateFibonacciMemoize(memoize,n);
		
	}
	
	public int calculateFibonacciMemoize(int[] memoize, int n) {
		if (n < 2)
			return n;
		
		if(memoize[n]!=0)
		return memoize[n];
		
		memoize[n] = calculateFibonacciMemoize(memoize, n-1) + calculateFibonacciMemoize(memoize, n-2);
		return memoize[n];
	}

	public static void main(String[] args) {
		
		FibonacciMemoization fbmemoize = new FibonacciMemoization();
		System.out.println("8th Febonacci:"+ fbmemoize.calculateFebonaci(8));
		
	}

}
