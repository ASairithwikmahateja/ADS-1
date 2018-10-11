import java.util.Scanner;
/**
 * Class for book.
 */
class Book {
    /**
     * name of the book.
     */
    private String name;
    /**
     * name of the author.
     */
    private String author;
    /**
     * price of the book.
     */
    private float price;
    /**
	 * Constructs the object.
	 *
	 * @param      namee    The namee
	 * @param      authorr  The authorr
	 * @param      pricee   The pricee
	 */
	Book(String namee, String authorr, float pricee) {
		this.name = namee;
		this.author = authorr;
		this.price = pricee;
	}
	/**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
}
/**
 * Class for binary search tree.
 *
 * @param      <Key>    The key
 * @param      <Value>  The value
 */
class BinarySearchTree<Key extends Comparable<Key>, Value> {
    /**
     * Constructs the object.
     */
    BinarySearchTree() {

    }
    /**
     * root node.
     */
    private Node root;
    /**
     * Class for node.
     */
    private class Node {
        /**
         * key of book type.
         */
        private Book key;
        /**
         * value of integer type.
         */
        private int value;
        /**
         * left and right nodes.
         */
        private Node left, right;
        /**
         * Constructs the object.
         *
         * @param      k     The Book
         * @param      v     The Value
         */
        Node(final Book key, final int value) {
            this.key = key;
            this.value = value;
        }
    }
    /**
     * put method.
     *
     * @param      key    The key
     * @param      value  The value
     */
    public void put(final Book key, final int value) {
         root = put(root, key, value);
    }
    /**
     * put overloaded method.
     *
     * @param      x      The Node
     * @param      key    The key
     * @param      value  The value
     *
     * @return     Node
     */
    private Node put(final Node x,
     final Book key, final int value) {
        if (x == null) {
            return new Node(key, value);
        }
        int cmp = key.getName().compareTo(x.key.getName());
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        }
        if (cmp > 0) {
            x.right = put(x.right, key, value);
        }
        if (cmp == 0) {
            x.value = value;
        }
        return x;
    }
    /**
     * get method.
     *
     * @param      key   The key
     *
     * @return     Integer
     */
    public Integer get(final Book key) {
        Node x = root;
        while (x != null) {
            int cmp = key.getName().compareTo(x.key.getName());
                if (cmp < 0) {
                    x = x.left;
                }
                if (cmp > 0) {
                    x = x.right;
                }
                if (cmp == 0) {
                    return x.value;
                }
            }
            return null;
        }
    }
/**
 * Class for solution.
 */
class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {

    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        final int three = 3, four = 4;
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(",");
            switch (tokens[0]) {
                case "put":
                    Book key = new Book(
                    tokens[1], tokens[2],
                    Float.parseFloat(tokens[three]));
                    int value =
                     Integer.parseInt(tokens[four]);
                    bst.put(key, value);
                    break;
                case "get":
                    key = new Book(tokens[1], tokens[2],
                     Float.parseFloat(tokens[three]));
                    System.out.println(bst.get(key));
                    break;
                default:
            }
        }
    }
}
