import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BinarySearchST bst = new BinarySearchST(50);
		int[] count = new int[50];
		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			String[] token = str.split(",");
			int tmp = 0;
			if (!token[0].equals("JC")) {
				if (!bst.contains(token[1])) {
					count[Integer.parseInt(token[1])] = 1; 
					bst.put(token[1], count[Integer.parseInt(token[1])]);
					// System.out.println(token[1] + "-" + count[Integer.parseInt(token[1])]);
				} else {
					bst.put(token[1], count[Integer.parseInt(token[1])]++);
					// System.out.println(token[1] + "-" + count[Integer.parseInt(token[1])]);
					System.out.println(token[0] +"," + token[1]);
				}
			} else {
				if (bst.isEmpty()) {
					System.out.println("NO Registrations");
				} else {				
					bst.delete(bst.min());
					// bst.delete(Collections.min(Arrays.asList(count)));
				}
			}
		}
	}
}