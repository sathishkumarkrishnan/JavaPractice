package TestJava;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int[] a = {-2, 2, 4, 5, 9 };
		 int[] missing = new int[3];
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int i = a[0] + 1;
		for (int j = 1; j < a.length; j++) {
			if (a[j] != i) {
				for (int k = i; k < a[j]; k++) {
					System.out.println("Iteration" + i + " " + k);
				}
				// break;
			}
			i = a[j] + 1;
		}
	}
}
