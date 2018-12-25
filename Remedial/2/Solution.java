import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		BinarySearchTree bst = new BinarySearchTree();
		String[] token = new String[10];
		for (int i = 0; i < n; i++) {
			token = sc.nextLine().split(",", 2);	
			bst.put(token[0], token[1]);
		}
		int m = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split(" ");
		switch(str[0]) {
			case "BE":
			String[] temp = token[1].split(",");
			System.out.println(temp[0]);
			if (Double.parseDouble(str[1]) <= Double.parseDouble(temp[1]) & Double.parseDouble(str[2]) >= Double.parseDouble(temp[1])) {
				System.out.println(temp[0]);
			}
			break;
		// 	case "GE":
		// 	if (str[1] > token) {

		// 	}
		// 	break;
		// 	case "LE":
		// 	if (str[1] > token) {

		// 	}
		// 	break;
		}
	}
}