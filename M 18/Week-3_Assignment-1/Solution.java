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
}
/**
 * Class for stock analysis.
 */
class StockAnalysis {
	/**
	 * Min object.
	 */
	MinPQ minObj;
	/**
	 * Max object.
	 */
	MaxPQ maxObj;
	/**
	 * Constructs the object.
	 */
	StockAnalysis() {
		minObj = new MinPQ();
		maxObj = new MaxPQ();
	}
    /**
     *this method gets the minimum element.
     * from minheap.
     * @return     The minimum.
     */
    public Object getMin() {
        return minObj.min();
    }
    /**
     *this method gets the maximum element.
     * from maxheap.
     * @return     The minimum.
     */
    public Object getMax() {
        return maxObj.max();
    }
    /**
     * Returns a string representation of the object.
     *
     * @param      stk   The stk
     *
     * @return     String representation of the object.
     */
    public String toString(final Stocks stk) {
    	String str = "";
    		str = stk.getName() + stk.getper();
    	return str;
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
		StockAnalysis sa = new StockAnalysis();
		Stocks stock;
		int n = Integer.parseInt(s.nextLine());
		final int six = 6;
		String str = new String();
		final int capacity = 10;
		String[] tokens = new String[capacity];
		for (int i = 0; i < six * n; i++) {
	        str = s.nextLine();
	        tokens = str.split(",");
	        stock = new Stocks(tokens[0], Double.parseDouble(tokens[1]));
		}
		final int five = 5;
		int count = five;
		while (count > 0) {
			sa.getMax().toString();
			sa.maxObj.delMax();
			count--;
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
						sa.getMax().toString();
					} else if (tokens1[1].equals("minST")) {
						sa.getMin().toString();
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
