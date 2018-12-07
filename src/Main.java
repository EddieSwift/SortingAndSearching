public class Main {

	static int[] arr3;

	public static void main(String[] args) {

		int[] newArr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] newArr2 = { 3, 3, 3 };

		copyArr(newArr2, newArr1);

		printArr(newArr1);
		System.out.println("\n****************************\n");

		printArr(newArr2);
		System.out.println("\n****************************\n");

		int[] newArr5 = { 12, 9, 8, 7, 6, 14, 4, 78, 2, 1 };
		bubbleSort(newArr5);

		printArr(newArr5);
		System.out.println("\n****************************\n");

		seceltionSort(newArr5);

		printArr(newArr5);
		System.out.println("\n****************************\n");

		int[] arr4 = new int[1_000_000];

		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = i;
		}

		System.out.println("Binary: " + binarySearch(arr4, 1_000_000));
		binarySearch(newArr5, 8);

		System.out.println("Binary: " + binarySearch(newArr5, 2));

	}

	public static int binarySearch(int[] arr, int value) {

		int l = 0, r = arr.length - 1, mid;

		int count = 0;

		while (l <= r) {

			count++;

			mid = (l + r) / 2;

			if (arr[mid] == value) {
				return mid;
			} else if (arr[mid] < value) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}

		}

		System.out.println(count);
		return -1;
	}

	public static void selectionSortClassic(int[] arr) {

		int minIndex;

		for (int i = 0; i < arr.length; i++) {

			minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
	}

	public static void seceltionSort(int[] arr) {

		int maxIndx;

		for (int i = 0; i < arr.length; i++) {

			maxIndx = 0;

			for (int j = 1; j < arr.length - i; j++) {

				if (arr[maxIndx] < arr[j]) {

					maxIndx = j;

				}
			}

			int tmp = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[maxIndx];
			arr[maxIndx] = tmp;
		}
	}

	public static void bubbleSort(int[] arr) {

		boolean flag = false;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					flag = true;
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}

			if (flag) {
				flag = false;
			} else {
				break;
			}
		}
	}

	public static void copyArr(int[] out, int[] in) {

		if (out == null || in == null) {

			System.out.println("One of the arrays is Null!");
		}

		int size = 0;

		if (out.length < in.length) {

			size = out.length;

		} else {

			size = in.length;
		}

		for (int i = 0, j = 0; i < size; i++) {

			in[i] = out[j];

		}

		if (size < in.length) {

			for (int i = size; i < in.length; i++) {
				in[i] = 0;
			}

		}
	}

	public static void printArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print("[" + arr[i] + "]");
		}

		System.out.println();
	}
}

