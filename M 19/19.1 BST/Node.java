/**
 * Class for node.
 *
 */
class Node {
    /**
     * Book object.
     */
    private Book key;
    /**
     * value.
     */
    private String value;
    /**
     * left node, right node.
     */
    private Node left, right;
    /**
     * count.
     */
    private int count;
    /**
     * Constructs the object.
     *
     * @param      key1    book
     * @param      value1   The value
     * @param      count1     count
     */
    Node(final Book key1, final String value1, final int count1) {
        this.key = key1;
        this.value = value1;
        this.count = count1;
    }
    /**
     * Gets the key.
     *
     * @return     The key.
     */
    public Book getKey() {
        return key;
    }
    /**
     * Gets the value.
     *
     * @return     The value.
     */
    public String getValue() {
        return value;
    }
    /**
     * Gets the left.
     *
     * @return     The left.
     */
    public Node getLeft() {
        return left;
    }
    /**
     * Gets the right.
     *
     * @return     The right.
     */
    public Node getRight() {
        return right;
    }
    /**
     * Gets the count.
     *
     * @return     The count.
     */
    public int getCount() {
        return count;
    }
    /**
     * Sets the left.
     *
     * @param      l  The left
     */
    public void setLeft(final Node l) {
        this.left = l;
    }
    /**
     * Sets the right.
     *
     * @param      r  The right
     */
    public void setRight(final Node r) {
        this.right = r;
    }
    /**
     * Sets the value.
     *
     * @param      val   The value
     */
    public void setValue(final String val) {
        this.value = val;
    }
    /**
     * Sets the count.
     *
     * @param      c     { parameter_description }
     */
    public void setCount(final int c) {
        this.count = c;
    }
}
