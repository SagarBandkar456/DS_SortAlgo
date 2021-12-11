
public class QuickSort {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void sort(int a[], int l, int r) {
		if (l < r) {
			int p = partition(a, l, r);

			sort(a, l, p - 1);
			sort(a, p + 1, r);
		}
	}

	static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 0, 5, 50, 20, 100 };
		sort(a, 0, a.length - 1);
		print(a);
	}

}
