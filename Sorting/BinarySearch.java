/* Advance Binary Search

   Given array of integers, it will return index of the target.
   If target is not found, it will return the closest number
*/

import java.util.*;

class BinarySearch {
	static boolean found = false;
	
	public static void main(String[] args) {
		int[] array = {1,2,4,6,7,9,10,11,14,18,19,50};
		System.out.println(Arrays.toString(array));
		System.out.print("Enter target number: ");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int index = binarySearch(array, target);
		if (found) {
			System.out.println("\n"+target+" is located at index "+index);
		}
		else{
			System.out.println("\n"+target+" could not be found. Closest number is \""+array[index]+"\" at index "+index);
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int first = 0;
		int last = arr.length-1;
		int mid = (first+last)/2;
		int lastIndex = arr.length-1;

		while (first<= last) {
			if (arr[mid]==target) {
				found = true;
				return mid;
			} else if (arr[mid]>target){
				last = mid-1;

			} else if (arr[mid]<target){
				first = mid+1;
			} 

			// Special case when every item is larger than target
			if (last<0) {
				return 0;
			}

			// It no number matches, 'first' will equal 'last'
			// Compare with 1 index before/after values, return the closest
			if (first==last) {
				int before = Math.abs(target-arr[last-1]);
				int value = Math.abs(target-arr[last]);

				// if pointer is at very last index, no need to calculate last+1
				if (lastIndex==last) {
					return before<value ? last-1 : last;
				}

				else {
					int after = Math.abs(target-arr[last+1]);
					int closest = Math.min(Math.min(before,value),after);
					if (closest == before) {
						return last-1;
					} else if (closest == value) {
						return last;
					} else if (closest == after) {
						return last+1;
					}
				}
			}
			mid = (first+last)/2;
		}
		return -1;
	}
}