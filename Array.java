package Array;

public class Array {

	static void reverseArray(int arr[]) {

		System.out.println("-------Array before reverse-----");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int k = arr.length - 1, temp = 0;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
			k--;
		}

		System.out.println("\n-------Array after reverse-----");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 6, 33, 7 };
		reverseArray(arr);
	}

}
