/**
 * Class for binary st.
 *
 */
class BinaryST<Key extends Comparable<Key>, value> {
    /**
     * Root node.
     */
    private Node root;
    /**
     * Constructs the object.
     */
    BinaryST() {
    }
    /**
     * Determines if empty.
     * time complexity of this method is O(1)
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return count() == 0;
    }
    /**
     * return count.
     * Time complexity of this method is O(1)
     *
     * @return    count
     */
    public int count() {
        return count(root);
    }
    /**
     * count of keys.
     *
     * @param      x     node
     *
     * @return     count
     */
    private int count(final Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.getCount();
        }
    }
    /**
     * returns true or false.
     *
     * @param      key   The key
     *
     * @return    true or false
     */
    public boolean contains(final Book key) {
        return get(key) != null;
    }
    /**
     * Method to insert the key.
     * Time complexity is O(1).
     * @param      key    The key
     * @param      value  The value
     */
    public void put(final Book key, final String value) {
        root = put(root, key, value);
    }
    /**
     * Method to insert the keys.
     * Time complexity is O(N) in worst case.
     * @param      x      The node.
     * @param      key    The key
     * @param      value  The value
     * @return     The node.
     */
    public Node put(final Node x, final Book key, final String value) {
        if (x == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.getName().compareTo(x.getKey().getName());
        if (cmp < 0) {
            x.setLeft(put(x.getLeft(), key, value));
        }
        if (cmp > 0) {
            x.setRight(put(x.getRight(), key, value));
        }
        if (cmp == 0) {
            x.setValue(value);
        }
        x.setCount(1 + count(x.getLeft()) + count(x.getRight()));
        return x;
    }
    /**
     * Method to get value of the key.
     * Time complexity of this method is O(N).
     * @param      key   The key
     * @return     The value of the key
     */
    public String get(final Book key) {
        Node x = root;
        while (x != null) {
            int cmp = key.getName().compareTo(x.getKey().getName());
            if (cmp < 0) {
                x = x.getLeft();
            }
            if (cmp > 0) {
                x = x.getRight();
            }
            if (cmp == 0) {
                return x.getValue();
            }
        }
        return null;
    }
    /**
     * Returns the smallest key in the symbol table.
     * time complexity of this method is O(1)
     * @return the smallest key in the symbol table
     */
    public Book min() {
        return min(root).getKey();
    }
    /**
     * returns minimum node.
     * time complexity of this method is O(N) in worst case.
     *
     * @param      x    node
     *
     * @return  node
     */
    private Node min(final Node x) {
        if (x.getLeft() == null) {
            return x;
        } else {
            return min(x.getLeft());
        }
    }
    /**
     * Returns the largest key in the symbol table.
     * time complexity of this method is O(1)
     * @return the largest key in the symbol table
     */
    public Book max() {
        return max(root).getKey();
    }
    /**
     * returns maximum node.
     * time complexity of this method is O(N) in worst case.
     * @param      x    node
     * @return    node
     */
    private Node max(final Node x) {
        if (x.getRight() == null) {
            return x;
        } else {
            return max(x.getRight());
        }
    }
    /**
     * Returns the largest key in the symbol table
     * time complexity of this method is O(N) in worst case.
     * less than or equal to {@code key}.
     * @param  key the key
     * @return the largest key in the symbol table
     * less than or equal to {@code key}
     */
    public Book floor(final Book key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        } else {
            return x.getKey();
        }
    }
    /**
     * returns largest key less than key or equal to key.
     * time complexity of this method is O(N) in worst case.
     * @param      x     node
     * @param      key   The key
     * @return   node
     */
    private Node floor(final Node x, final Book key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp == 0) {
            return x;
        }
        if (cmp <  0) {
            return floor(x.getLeft(), key);
        }
        Node t = floor(x.getRight(), key);
        if (t != null) {
            return t;
        } else {
            return x;
        }
    }
    /**
     * Returns the smallest key in the symbol table
     * time complexity of this method is O(1).
     * greater than or equal to {@code key}.
     * @param  key the key
     * @return the smallest key in the symbol table
     * greater than or equal to {@code key}
     */
    public Book ceiling(final Book key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        } else {
            return x.getKey();
        }
    }
    /**
     * returns the smallest key equal to the key or less than key.
     * time complexity of this method is O(N) in worst case.
     *
     * @param      x     node
     * @param      key   The key
     * @return     node
     */
    private Node ceiling(final Node x, final Book key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            Node t = ceiling(x.getLeft(), key);
            if (t != null) {
                return t;
            } else {
                return x;
            }
        }
        return ceiling(x.getRight(), key);
    }
    /**
     * Return the key in the symbol table whose rank is {@code k}.
     * time complexity of this method is O(N) in worst case.
     * This is the (k+1)st smallest key in the symbol table.
     * @param  k the order statistic
     * @return the key in the symbol table of rank {@code k}
     */
    public Book select(final int k) {
        Node x = select(root, k);
        //System.out.println(x);
        return x.getKey();
    }
    /**
     * Return key of rank k.
     * time complexity of this method is O(N) in worst case.
     * @param      x  node
     * @param      k  integer
     * @return     node
     */
    private Node select(final Node x, final int k) {
        if (x == null) {
            return null;
        }
        //System.out.println(x.toString());
        int t = count(x.getLeft());
        //System.out.println(t);
        if (t > k) {
            return select(x.getLeft(),  k);
        }
        if (t < k) {
            return select(x.getRight(), k - t - 1);
        }
        return x;
    }
    /**
     * Removes the smallest key and associated value from the symbol table.
     * time complexity of this method is O(N) in worst case.
     *
     *
     */
    public void deleteMin() {
        root = deleteMin(root);
    }
    /**
     * removes smallest element.
     *
     * @param      x     node
     *
     * @return   node
     */
    private Node deleteMin(final Node x) {
        if (x.getLeft() == null) {
            return x.getRight();
        }
        x.setLeft(deleteMin(x.getLeft()));
        x.setCount(count(x.getLeft()) + count(x.getRight()) + 1);
        return x;
    }
    /**
     * Removes the largest key and associated value from the symbol table.
     * time complexity of this method is O(N) in worst case.
     *
     *
     */
    public void deleteMax() {
        root = deleteMax(root);
    }
    /**
     * removes largest element.
     *
     * @param      x     node
     *
     * @return     node
     */
    private Node deleteMax(final Node x) {
        if (x.getRight() == null) {
            return x.getLeft();
        }
        x.setRight(deleteMax(x.getRight()));
        x.setCount(count(x.getLeft()) + count(x.getRight()) + 1);
        return x;
    }
    /**
     * Removes the specified key and its associated
     * value from this symbol table
     * (if the key is in this symbol table).
     * time complexity of this method is O(N) in worst case.
     *
     * @param  key the key
     *
     */
    public void delete(final Book key) {
        root = delete(root, key);
    }
    /**
     * delete the key.
     *
     * @param      x     node
     * @param      key   The key
     *
     * @return    node
     */
    private Node delete(final Node x, final Book key) {
        /**
         * @param n node
         */
        Node n = x;
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if  (cmp < 0) {
            x.setLeft(delete(x.getLeft(),  key));
        }
        if (cmp > 0) {
            x.setRight(delete(x.getRight(), key));
        } else {
            if (x.getRight() == null) {
                return x.getLeft();
            }
            if (x.getLeft()  == null) {
                return x.getRight();
            }
            Node t = x;
            n = min(t.getRight());
            x.setRight(deleteMin(t.getRight()));
            x.setLeft(t.getLeft());
        }
        x.setCount(count(x.getLeft()) + count(x.getRight()) + 1);
        return n;
    }
}
