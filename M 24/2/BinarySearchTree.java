/**
 * Class for binary search tree.
 *
 * @param      <Key>    The key
 * @param      <Value1>  The Key
 * @param      <Value>  The value
 */
class BinarySearchTree<Key extends Comparable<Key>, Value1 extends Comparable<Key>, Value extends Comparable<Value>> {
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
        private Key key;
        /**
         * value of string type.
         */
        private Key value1;
        /**
         * value of integer type.
         */
        private Value value;
        /**
         * left and right nodes.
         */
        private Node left, right;
        /**
         * Constructs the object.
         *
         * @param      k     { key }
         * @param      v1   { key }
         * @param      v     { value }
         */
        Node(final Key k, final Key v1, final Value v) {
            this.key = k;
            this.value1 = v1;
            this.value = v;
        }
    }
    /**
     * put method.
     *
     * @param      key    The key
     * @param      value1    The value
     * @param      value  The value
     */
    public void put(final Key key, final Key value1, final Value value) {
         root = put(root, key, value1, value);
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
     final Key key, final Key value1, final Value value) {
        if (x == null) {
            return new Node(key, value1, value);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value1, value);
        }
        if (cmp > 0) {
            x.right = put(x.right, key, value1, value);
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


    /**
     * get method.
     *
     * @param      key   The key
     *
     * @return     { returns integer value }
     */
    public Key get1(final Value value) {
        Node x = root;
        while (x != null) {
            int cmp = value.compareTo(x.value);
                if (cmp < 0) {
                    x = x.left;
                }
                if (cmp > 0) {
                    x = x.right;
                }
                if (cmp == 0) {
                    return x.key;
                }
            } return null;
    }
    // /**
    //  * Gets the key.
    //  *
    //  * @param      valuea  The valuea
    //  * @param      valueb  The valueb
    //  *
    //  * @return     The key.
    //  */
    // public String getKey(final Value valuea, final Value valueb) {
    //     String str = "";
    //     for (Value i = valuea; i.compareTo(valueb) > 0; i += (Value) 0.1) {
    //         str = str + (Key) get1(i); 
    //     } return str;
    // }
}
