import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		BinarySearchTree bst = new BinarySearchTree();
		String token = new String();
		for (int i = 0; i < n; i++) {
			token = sc.nextLine();	
			bst.put(token.split(",")[0], token);
			// System.out.println(token.split(",")[0] + token);
		}
		int m = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < m; j++) {
			String[] str = sc.nextLine().split(" ");
			System.out.println(bst.get(token.split(",")[0]));
			// switch(str[0]) {
			// 	case "BE":
			// 	System.out.println(temp.split(",")[1]);
			// 	if ((Double.parseDouble(str[1]) <= Double.parseDouble(temp.split(",")[2])) &&
			// 		(Double.parseDouble(str[2]) >= Double.parseDouble(temp))) {
			// 		System.out.println(temp.split(",")[1]);
			// 	}
				// break;
		// 			case "GE":
		// 			if (Double.parseDouble(str[1]) >= Double.parseDouble(temp[1])) {

		// 			}
		// 			break;
		// 			case "LE":
		// 			if (Double.parseDouble(str[1]) <= Double.parseDouble(temp[1])) {

		// 			}
		// 			break;
				// }
			}
		}
	}
