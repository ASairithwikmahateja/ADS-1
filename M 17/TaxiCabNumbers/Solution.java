import java.util.Scanner;
/**
 * Class for taxicab.
 */
class Taxicab implements Comparable<Taxicab> {
    final int i;
    final int j;
    final long sum;   
    /**
     * Constructs the object.
     *
     * @param      i     int
     * @param      j     int
     */
    public Taxicab(int i, int j) {
        this.sum = (long) i*i*i + (long) j*j*j;
        this.i = i;
        this.j = j;
    }

    // compare by i^3 + j^3, breaking ties by i
    public int compareTo(Taxicab obj) {
        if (this.sum < obj.sum) {
        	return -1;
        } else if (this.sum > obj.sum) {
        	return +1;
        } else if (this.i < obj.i) {
        	return -1;
        } else if (this.i > obj.i) {
        	return +1;
        } else {
           return  0;
    	}
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return sum + "";
    }
}
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String[] number = sc.nextLine().split(" ");
			int N = Integer.parseInt(number[0]);
			int M = Integer.parseInt(number[1]);
			int n = 200;
			MinPQ<Taxicab> pq = new MinPQ<Taxicab>();
	        for (int i = 1; i <= n; i++) {
	            pq.insert(new Taxicab(i, i));
        	}
        	int pair = 1;
        	Taxicab prev = new Taxicab(0, 0);
        	int count = 0;
        	while (!pq.isEmpty()) {
            	Taxicab curr = pq.delMin();
            	if (prev.sum == curr.sum) {
                	pair++;
                	if (pair == M) {
                		count = count+1;
                	}
                	if(count == N) {
	            		System.out.println(prev.sum);
	            		break;
            		}
            	}
            	else {
                	pair = 1;
            	}
            	prev = curr;
            	if (curr.j < n) pq.insert(new Taxicab(curr.i, curr.j + 1));
        	}
        }
    }
}