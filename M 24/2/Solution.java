import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * Main function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		BinarySearchTree<String, String> bst =
		new BinarySearchTree<String, String>();
		BinarySearchTree<String, Double> bst1 =
		new BinarySearchTree<String, Double>();
		for (int i = 0; i < n; i++) {
			String[] tokens = s.nextLine().split(",");
			bst.put(tokens[0], tokens[1]);
			bst1.put(tokens[0], Double.parseDouble(tokens[2]));
		}
		int m = Integer.parseInt(s.nextLine());
		for (int j = 0; j < m; j++) {
			String[] chips = s.nextLine().split(" ");
			switch (chips[0]) {
				case "BE":
					bst.get(chips[1]);
				break;
				case "LE":
				break;
				case "GE":
				break;
				default:
				break;
			}
		}
	}
}