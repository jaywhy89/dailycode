import java.util.*;

class QuickSort {
	public static void main(String[] args) {
		Integer[] intArray= {5,12,64,1,37,90,91,50};
		System.out.println(Arrays.toString(intArray));
		sort(intArray,0,intArray.length-1);
		System.out.println(Arrays.toString(intArray));
	}


	public static void sort(Integer[] array, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivot = partition(array, startIndex, endIndex);
			sort(array, startIndex, pivot-1);
			sort(array, pivot+1, endIndex);
		}
	}

	public static int partition(Integer[] array, int startIndex, int endIndex) {
		int pivot = array[endIndex];
		int wall = startIndex;
		for (int i=wall; i<endIndex; i++) {
			if (array[i]<=pivot) {
				swap(array, i, wall);
				wall++;
			}
		}
		swap(array, wall, endIndex);
		return wall;
	}

	public static void swap (Integer[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}