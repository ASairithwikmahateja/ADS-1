import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
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
        SeparateChainingHashST<String, String> scst =
        new SeparateChainingHashST<String, String>();
        SeparateChainingHashST<String, Double> scst1 =
        new SeparateChainingHashST<String, Double>();
        for (int i = 0; i < n; i++) {
            String[] tokens = s.nextLine().split(",");
            scst.put(tokens[0], tokens[1]);
            scst1.put(tokens[0], Double.parseDouble(tokens[2]));
        }
        int m = Integer.parseInt(s.nextLine());
        for (int j = 0; j < m; j++) {
            String[] chips = s.nextLine().split(" ");
            switch (chips[2]) {
                case "1":
                if (scst.get(chips[1]) != null) {
                    System.out.println(scst.get(chips[1]));
                } else {
                    System.out.println("Student doesn't exists...");
                }
                break;
                case "2":
                if (scst1.get(chips[1]) != null) {
                    System.out.println(scst1.get(chips[1]));
                } else {
                    System.out.println("Student doesn't exists...");
                }
                break;
                default:
                break;
            }
        }
    }
}
