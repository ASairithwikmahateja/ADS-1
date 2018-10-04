import java.util.Arrays;
/**
 * Class for sort.
 */
class Sort {
	int[] aux;
	int[] a;
	/**
	 * Sort method.
	 *
	 * @param      a     int[]
	 */
	public void sort(int[] a) {
		this.a = a;
		aux = new int[a.length];
		sort(a, 0, a.length - 1);
	}
	/**
	 * Overloading Sort method.
	 *
	 * @param      a     int[]
	 * @param      l     int
	 * @param      h     int
	 */
	public void sort(int[] a, int l, int h) {
		if (h <= l) {
			return;
		}
		int mid = l + (h - l) / 2;
		sort(a, l, mid);
		sort(a, mid + 1, h);
		merge(a, l, mid, h);
	}
	/**
	 * Merge method.
	 * The time Complexity is O(N).
	 *
	 * @param      a     { parameter_description }
	 * @param      l     { parameter_description }
	 * @param      mid   The middle
	 * @param      h     { parameter_description }
	 */
	public void merge(int[] a, int l, int mid, int h) {
		int i = l;
		int j = mid + 1;

		for (int m = l; m <= h; m++) {
			aux[m] = a[m];
		}
		for (int k = l; k <= h; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > h) {
				a[k] = aux[i++];
			} else if(less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k]= aux[i++];
			}
		}
	}
	/**
	 * Less method.
	 *
	 * @param      i     int
	 * @param      j     int
	 *
	 * @return     boolean
	 */
	public boolean less(int i, int j) {
		return j > i;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		System.out.println(Arrays.toString(a));
		return "";
	}
}
