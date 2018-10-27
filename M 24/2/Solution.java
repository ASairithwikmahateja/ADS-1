import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
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
		BinarySearchTree<String, String, Double> bst =
		new BinarySearchTree<String, String, Double>();
		for (int i = 0; i < n; i++) {
			String[] tokens = s.nextLine().split(",");
			bst.put(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
		}
		int m = Integer.parseInt(s.nextLine());
		for (int j = 0; j < m; j++) {
			String[] chips = s.nextLine().split(" ");
			switch (chips[0]) {
				case "BE":
					System.out.println(
						bst.getKey(Double.parseDouble(chips[1]),
						Double.parseDouble(chips[2])));
				break;
				case "LE":
					System.out.println(
						bst.getKey(Double.parseDouble(chips[1])));
				break;
				case "GE":
					System.out.println(
						bst.getKey(Double.parseDouble(chips[1])));
				break;
				default:
				break;
			}
		}
	}
}