import java.util.*;
import java.io.*;
/**
 * Class for solution.
 */
public class Solution {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String token = sc.nextLine();
		int sum = 0;
		for (int i = 0; i <= 8; i++) {
			Scanner scan = new Scanner(new File("E:\\ADS-1\\Remedial\\Exam question\\Files\\" + i + ".txt"));
			String[] temp = scan.nextLine().split(" ");
			int count = 0;
			int[] arr = new int[temp.length];
			int k = 0;
			for (int j = 0; j < temp.length; j++) {
				try {
					if (token.equals(temp[j])) {
						count++;
						arr[k] = j;
						k++;
					}
				} catch (Exception e) {}
			} //System.out.println(token + ":" + sum);
			if (count != 0) {
				sum = sum + count;
				int[] a = new int[count];
				int y = 0;
				for (int x = 0; x < arr.length; x++) {
					if (arr[x] != 0) {
						a[y] = arr[x];
						y++;
					}
				}
				// Object s = i + ", " + count + ", " + Arrays.toString(a);
				// Insertion.sort((Comparable[]) s);
				System.out.println(i + ", " + count + ", " + Arrays.toString(a));
			}
		} if (sum != 0) {
			System.out.println(token + ":" + sum);
		} else {
			System.out.println("word is not present in any file");
		}
	}
}
