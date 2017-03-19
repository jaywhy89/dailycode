import java.util.*;

class CountingSort {

	public static void main(String[] args) {
		int[] input = {19,17,13,16,-16,-2,-5,5,5,0};

		//Edge case: if array is empty or single element, nothing needs to be done
		if (input.length <= 1) {
			System.out.println(Arrays.toString(input));
		} else {
		int[] sorted = new int[input.length];
		int min = findMin(input);
		int max = findMax(input);
		int arrSize = (max-min)+1;
		int[] arr = new int[arrSize];
		Arrays.fill(arr,0);

		// Create array ranging (max-min+1) size and set value as counteres of each int 
		countArr(input,arr, min);

		// Build new sorted Array using arr 
		sort(arr, sorted, min);

		System.out.println(Arrays.toString(sorted));
	}
	}

	public static void sort(int[] arr, int[] sorted, int min) {
		int sortedIndex = 0;

		for (int i=0; i<arr.length; i++) {
			while (arr[i] != 0) {
				sorted[sortedIndex++] = i+min;
				arr[i]--;
			}
		}
	}

	public static void countArr(int[] arr, int[] counter, int min) {
		for (int i : arr) {
			counter[i-min]++;
		}
	}

	public static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i : arr){
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i : arr){
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}