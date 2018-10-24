/**
 * Class for dynamic median.
 */
class DynamicMedian {
    /**
     *the object to access of minheap.
     */
    private MinPQ<Double> minObj;
    /**
     *the object to access of maxheap.
     */
    private MaxPQ<Double> maxObj;
    /**
     *the constructor for initializing.
     */
    DynamicMedian() {
        minObj = new MinPQ<Double>();
        maxObj = new MaxPQ<Double>();
    }
    /**
     * the method will insert the element
     * to minheap.
     * The time complexity for this method is O(1), since
     * we are using insert method.
     * 
     * @param      item  The item
     */
    public void insertAtMin(final double item) {
        minObj.insert(item);
    }
    /**
     * the method will insert the element
     * to maxheap.
     * The time complexity for this method is O(1), since
     * we are using insert method.
     * 
     * @param      item  The item
     */
    public void insertAtMax(final double item) {
        maxObj.insert(item);
    }
    /**
     *this method gets the minimum element.
     * from minheap.
     * @return     The minimum.
     */
    public double getMin() {
        return minObj.min();
    }
    /**
     *this method gets the maximum element.
     * from maxheap.
     * @return     The minimum.
     */
    public double getMax() {
        return maxObj.max();
    }
    /**
     * this method delete the maximum element.
     * from maxheap.
     * The time complexity for this method is O(log N), since
     * we are using delMax() method.
     * 
     * @return     The minimum.
     */
    public double delMax() {
        return maxObj.delMax();
    }
    /**
     * this method delete the minimum element.
     * from maxheap.
     * The time complexity for this method is O(log N), since
     * we are using delMin() method.
     * 
     * @return     The minimum.
     */
    public double delMin() {
        return minObj.delMin();
    }
    /**
     *gets the size of minheap.
     *Time complexity for this method is O(1).
     *
     * @return     The minimum size.
     */
    public int getMinSize() {
        return minObj.size();
    }
    /**
     * Gets the maximum size of maxheap.
     * Time complexity for this method is O(1).
     *
     * @return     The maximum size.
     */
    public int getMaxSize() {
        return maxObj.size();
    }
}
