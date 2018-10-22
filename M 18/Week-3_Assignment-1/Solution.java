import java.util.Scanner;
/**
 * Class for stocks.
 */
class Stocks {
	/**
     * Stockname.
     */
    private String stockname;
    /**
	 * Percentage change.
	 */
	private double perchange;
    /**
     * Constructs the object.
     *
     * @param      stocknamee  The stocknamee
     * @param      perchangee  The perchangee
     */
	Stocks(final String stocknamee, final double perchangee) {
		this.stockname = stocknamee;
		this.perchange = perchangee;
	}
	/**
	 * Constructs the object.
	 *
	 * @param      stocknam  The stocknam
	 */
	Stocks(final String stocknam) {
		this.stockname = stocknam;
	}
    /**
	 * getstockname method.
	 *
	 * @return     String
	 */
	public String getName() {
		return stockname;
	}
    /**
	 * getpercentage method.
	 *
	 * @return     double
	 */
	public double getper() {
		return perchange;
	}
    // /**
    //  *this method gets the minimum element.
    //  * from minheap.
    //  * @return     The minimum.
    //  */
    // public Object getMin() {
    //     return minObj.min();
    // }
    // /**
    //  *this method gets the maximum element.
    //  * from maxheap.
    //  * @return     The minimum.
    //  */
    // public Object getMax() {
    //     return maxObj.max();
    // }
    /**
     * Returns a string representation of the object.
     *
     * @param      stk   The stk
     *
     * @return     String representation of the object.
     */
    public String toString(final Stocks stk) {
    	String str = "";
    	    str = stk.getName() + " "  + stk.getper();
    	return str;
    }
    /**
     * CompareTo method.
     */
    public int compareTo(Stocks stck) {
    	return 0;
    }
}
/**
 * Class for solution.
 */
class Solution {
	/**
	 * Constructs the object.
	 */
	Solution() {
	}
    /**
	 * main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		final int six = 6;
		String str = new String();
		final int capacity = 10;
		String[] tokens = new String[capacity];
		MaxPQ<Stocks> maxObj = new MaxPQ<Stocks>();
		MinPQ<Stocks> minObj = new MinPQ<Stocks>();
		for (int i = 0; i < six; i++) {
			for (int k = 0; k < n; k++ ) {
				 str = s.nextLine();
	        tokens = str.split(",");
	        Stocks stock = new Stocks(tokens[0],
	        	Double.parseDouble(tokens[1]));
	        maxObj.insert(new Stocks(tokens[0]));
	        minObj.insert(new Stocks(tokens[0]));
	        //minpq(stock)
	        //maxpq(stock)
			}
			final int five = 5;
			int count = five;
			while (count > 0) {
				maxObj.max().toString();
				maxObj.delMax();
				minObj.min().toString();
				minObj.delMin();
				count--;
			}
		}
		System.out.println();
		int m = Integer.parseInt(s.nextLine());
		while (m > 0) {
			String str1 = new String();
			final int capacity1 = 10;
		    String[] tokens1 = new String[capacity1];
		    for (int i = 0; i < n; i++) {
	            str1 = s.nextLine();
	            tokens1 = str1.split(",");
		    	switch (tokens1[0]) {
				case "get":
					if (tokens1[1].equals("maxST")) {
						maxObj.max().toString();
					} else if (tokens1[1].equals("minST")) {
						minObj.min().toString();
					}
				break;
				case "intersection":
				break;
				default :
				break;
	   			}
	    	 } m--;
	    }
	}
}
