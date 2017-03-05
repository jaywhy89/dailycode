import java.util.*;
class BubbleSort {

	static int[] sort(int[] list) {
		for (int i=0; i<list.length-1; i++) {
			for (int j=0; j<list.length-(i+1); j++) {
				if (list[j]>list[j+1]) {
					int temp = list[j+1];
					list[j+1]=list[j];
					list[j]=temp;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Intialize int array with size
		int size = sc.nextInt();
		int[] list = new int[size];

		// Initialize list
		while (size-- > 0) {
			list[(list.length-1)-size]=sc.nextInt();
		}

		// Print Unordered/Ordered List
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(sort(list)));
	}
}