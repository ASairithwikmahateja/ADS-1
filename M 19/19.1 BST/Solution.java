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
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryST bst = new BinaryST();
        final int three = 3;
        final int four = 4;
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            String[] tokens = data.split(",");
            switch (tokens[0]) {
                case "put":
                Book book = new Book();
                book = new Book(tokens[1], tokens[2],
                    Double.parseDouble((tokens[three])));
                bst.put(book, tokens[four]);
                break;
                case "get":
                book = new Book(tokens[1], tokens[2],
                    Double.parseDouble(tokens[three]));
                System.out.println(bst.get(book));
                break;
                case "max":
                System.out.println(bst.max());
                break;
                case "min":
                System.out.println(bst.min());
                break;
                case "select":
                System.out.println(bst.select(Integer.parseInt(tokens[1])));
                break;
                case "floor":
                book = new Book(tokens[1], tokens[2],
                    Double.parseDouble(tokens[three]));
                System.out.println(bst.floor(book));
                break;
                case "ceiling":
                book = new Book(tokens[1], tokens[2],
                    Double.parseDouble(tokens[three]));
                System.out.println(bst.ceiling(book));
                break;
                default:
                break;
            }
        }
    }
}
