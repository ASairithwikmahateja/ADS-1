import java.util.Scanner;
/**
 * Class for stocks.
 */
class Stocks {
	/**
	 * Stockname.
	 */
	String stockname;
	/**
	 * Percentage change.
	 */
	double perchange;
	/**
	 * Constructs the object.
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
	private MinPQ minObj;
	/**
	 * Max object.
	 */
	private MaxPQ maxObj;
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
     * @return     String representation of the object.
     */
    public String toString() {
    	String str = "maha";
    	
    	return str;
    }
}
/**
 * Class for solution.
 */
class Solution {
	/**
	 * main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		StockAnalysis sa = new StockAnalysis();
		int n = Integer.parseInt(s.nextLine());
		final int six = 6;
		String str = new String();
		String[] tokens = new String[10];
		for (int i = 0; i < six * n; i++) {
	        str = s.nextLine();
	        tokens = str.split(",");
	        Stocks stk = new Stocks(tokens[0], Double.parseDouble(tokens[1]));
		}
		final int five = 5;
		int count = five;
		while (count > 0) {
			sa.getMax().toString();
			count--;
		}
		System.out.println();
		int m = Integer.parseInt(s.nextLine());
		while (m > 0) {
			String str1 = new String();
		    String[] tokens1 = new String[10];
		    for (int i = 0; i < n; i++) {
	            str1 = s.nextLine();
	            tokens1 = str1.split(",");
		    	switch(tokens1[0]) {
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
