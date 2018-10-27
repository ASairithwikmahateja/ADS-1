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
    public class Node {
        /**
         * key of book type.
         */
        public Key key;
        /**
         * value of integer type.
         */
        public Value value;
        /**
         * left and right nodes.
         */
        public Node left, right;
        /**
         * Constructs the object.
         *
         * @param      k     { book }
         * @param      v     { value }
         */
        Node(final Key k, final Value v) {
            this.key = k;
            this.value = v;
        }
    }
    /**
     * put method.
     *
     * @param      key    The key
     * @param      value  The value
     */
    public void put(final Key key, final Value value) {
         root = put(root, key, value);
    }
    /**
     * put overloaded method.
     *
     * @param      x      { Node }
     * @param      key    The key
     * @param      value  The value
     *
     * @return     { returns the node }
     */
    private Node put(final Node x,
     final Key key, final Value value) {
        if (x == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(x.key);
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
     * @return     { returns integer value }
     */
    public Value get(final Key key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
                if (cmp < 0) {
                    x = x.left;
                }
                if (cmp > 0) {
                    x = x.right;
                }
                if (cmp == 0) {
                    return x.value;
                }
            } return null;
    }

    public Key getKey(final Key key, final Value value) {
        return key;
    }
}
