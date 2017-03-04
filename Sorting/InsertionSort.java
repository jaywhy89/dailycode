import java.util.*;

class InsertionSort {
	public static void main (String[] args) {
		Integer[] intArray= {5,12,64,1,37,90,91,97};
		System.out.println(Arrays.toString(intArray));
		sort(intArray);
		System.out.println(Arrays.toString(intArray));
	}

	public static void sort(Integer[] arr) {
		for (int i=1; i<arr.length; i++) {
			int j=i;
			while (j>0 && arr[j]<arr[j-1]) {
				swap(arr, j, j-1);
				j--;
			}
		}
	}

	public static void swap(Integer[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}