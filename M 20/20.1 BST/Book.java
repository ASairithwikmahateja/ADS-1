/**
 * Class for book.
 */
class Book implements Comparable<Book> {
    /**
     * book name.
     */
    private String name;
    /**
     * author name.
     */
    private String author;
    /**
     * price of the book.
     */
    private double price;
    /**
     * Constructs the object.
     */
    Book() {
    }
    /**
     * Constructs the object.
     *
     * @param      n    The name
     * @param      au  The author
     * @param      pr   The price
     */
    Book(final String n, final String au, final double pr) {
        this.name = n;
        this.author = au;
        this.price = pr;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return name;
    }
    /**
     * Gets the author.
     *
     * @return     The author.
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Gets the price.
     *
     * @return     The price.
     */
    public double getPrice() {
        return price;
    }
    /**
     * Method to compare.
     *
     * @param      that  The that
     *
     * @return     integer value +1,-1,0
     */
    public int compareTo(final Book that) {
        return this.name.compareTo(that.name);
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return getName() + ", " + getAuthor() + ", " + getPrice();
    }
}
