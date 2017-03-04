/* 
	Problem: A child is running up a staircase with n steps and can hop either 1 step,
			 2 steps, or 3 steps at a time. Implement a method to count how many possible
			 ways the child can run up the stairs.
*/

import java.util.*;

class TripleStep {

	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println("possible path: "+computeStep(n));
	}

	/* Memoization Approach (top-down approach) */

	public static int computeStep(int n) {
		int[] arr = new int[n+1];
		Arrays.fill(arr,-1);
		return computeStep(n, arr);
	}

	public static int computeStep(int n, int[] arr) {
		if (n==0) {
			return 1;
		} else if (n<0) {
			return 0;
		} 
		if (arr[n]>-1) {
			return arr[n];
		} else {
			arr[n]=computeStep(n-1,arr)+computeStep(n-2,arr)+computeStep(n-3,arr);
			return arr[n];
		}

	}

}