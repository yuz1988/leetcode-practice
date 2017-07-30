package sort;

public class InsertionSort {
	public void insertionSort(int[] a) {
		for (int i=1; i<a.length; i++) {
			for (int j=i; j>=1; j--) {
				if (a[j-1] > a[j]) {
					swap(a, j-1, j);
				}
			}
		}
	}
	
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{3, 1, 4, 2, 5, 7, 6};
		InsertionSort is = new InsertionSort();
		is.insertionSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
