import java.util.Iterator;
/**
 *  @param <Item> the generic type of an item in this queue
 */
class Queue<Item> implements Iterable<Item> {
    private Node<Item> first;    // beginning of queue
    private Node<Item> last;     // end of queue
    private int n;               // number of elements on queue

    // helper linked list class
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    /**
     * Initializes an empty queue.
     */
    public Queue() {
        first = null;
        last  = null;
        n = 0;
    }

    /**
     * Adds the item to this queue.
     *
     * @param  item the item to add
     */
    public void enqueue(Item item) {
        Node<Item> oldlast = last;
        last = new Node<Item>();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        n++;
    }


    /**
     * Returns true if this queue is empty.
     *
     * @return {@code true} if this queue is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this queue.
     *
     * @return the number of items in this queue
     */
    public int size() {
        return n;
    }

    /**
     * Returns the item least recently added to this queue.
     *
     * @return the item least recently added to this queue
     */
    public Item peek() {
        return first.item;
    }

    /**
     * Returns an iterator that iterates over the items in this queue in FIFO order.
     *
     * @return an iterator that iterates over the items in this queue in FIFO order
     */
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);  
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  {
            return current != null;
        }
        public Item next() {
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }
}
/**
 * Class for binary search tree.
 *
 * @param      <Key>    The key
 * @param      <Value1>  The Key
 * @param      <Value>  The value
 */
class BinarySearchTree<Key extends Comparable<Key>,
Value1 extends Comparable<Key>, Value extends Comparable<Value>> {
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

    /**
     * Returns the smallest key in the symbol table.
     * @return the smallest key in the symbol table
     */
    public Key min() {
        return min(root).key;
    }
    /**
     * returns minimum node.
     *
     * @param      x    node
     *
     * @return  node
     */
    private Node min(final Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }
    /**
     * Returns the largest key in the symbol table.
     * @return the largest key in the symbol table
     */
    public Key max() {
        return max(root).key;
    }
    /**
     * returns maximum node.
     * @param      x    node
     * @return    node
     */
    private Node max(final Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }

    /**
     * Returns all keys in the symbol table as an {@code Iterable}.
     * To iterate over all of the keys in the symbol table named {@code st},
     * use the foreach notation: {@code for (Key key : st.keys())}.
     *
     * @return all keys in the symbol table
     */
    public Iterable<Key> keys() {
        return keys(min(), max());
    }

    /**
     * Returns all keys in the symbol table in the given range,
     * as an {@code Iterable}.
     *
     * @param  lo minimum endpoint
     * @param  hi maximum endpoint
     * @return all keys in the symbol table between {@code lo} 
     *         (inclusive) and {@code hi} (inclusive)
     * @throws IllegalArgumentException if either {@code lo} or {@code hi}
     *         is {@code null}
     */
    public Iterable<Key> keys(Key lo, Key hi) {
        Queue<Key> queue = new Queue<Key>();
        keys(root, queue, lo, hi);
        return queue;
    }

    private void keys(Node x, Queue<Key> queue, Key lo, Key hi) { 
        if (x == null) return; 
        int cmplo = lo.compareTo(x.key);
        int cmphi = hi.compareTo(x.key); 
        if (cmplo < 0) keys(x.left, queue, lo, hi); 
        if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key); 
        if (cmphi > 0) keys(x.right, queue, lo, hi); 
    }

    /**
     * Gets the key.
     *
     * @param      valuea  The valuea
     * @param      valueb  The valueb
     *
     * @return     The key.
     */
    public String getKey(final Value valuea, final Value valueb) {
        String str = "";
        Value i = valuea;
        while (i.compareTo(valueb) > 0) {
            str = str + (Key) get1(i); 
        } return str;
    }
    /**
     * Gets the key.
     *
     * @param      valuea  The valuea
     * @param      valueb  The valueb
     *
     * @return     The key.
     */
    public String getKey(final Value valuea) {
        String str = "";
        Value i = valuea;
        while (max().compareTo(get1(i)) > 0) {
            str = str + (Key) get1(i); 
        } return str;
    }
}
