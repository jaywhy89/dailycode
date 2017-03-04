/* PROBLEM: Given two integer arrays, find the intersection
// RUNTIME: O(N) with extra memory
//
// Returns new array of intersections
*/

import java.util.*;


class Intersection {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Array 1 size: ");
		Integer[] arrayA = new Integer[sc.nextInt()];
		System.out.print("Array 1 elements: ");
		insertElements(arrayA, sc);

		System.out.print("\nArray 2 size: ");
		Integer[] arrayB = new Integer[sc.nextInt()];
		System.out.print("Array 2 elements: ");
		insertElements(arrayB, sc);

		Integer[] inter = getIntersection(arrayA,arrayB);
		System.out.print("Intersections are [ ");
		printArray(inter);
		System.out.println("]");
	}

	public static Integer[] getIntersection(Integer[] arrA, Integer[] arrB) {
		int count = 0;
		HashSet<Integer> data = new HashSet<Integer>();
		List<Integer> inter = new ArrayList<Integer>();
		for (Integer i : arrA) {
			data.add(i);
		}

		for (Integer i : arrB) {
			if (data.contains(i)) {
				inter.add(i);
			}
		}

		/* Conver ArrayList to Array, then return */
		Integer[] intersect = new Integer[inter.size()];
		intersect = inter.toArray(intersect);
		return intersect;
	}

	public static void printArray (Integer[] arr) {
		for (Integer i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void insertElements (Integer[] arr, Scanner sc) {
		for (int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

}