package acts.cdac.in;

import java.util.Arrays;

public class InsersionSort {

	public static void insersionsort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int j, temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {

				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 5, 3, 7, 8, 1, 4 };
		insersionsort(arr);
		System.out.println(Arrays.toString(arr));
		

	}
}
