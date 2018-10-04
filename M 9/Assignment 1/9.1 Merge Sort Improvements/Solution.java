import java.util.Scanner;
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
     * Main method.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Sort s = new Sort();
    	while (sc.hasNext()) {
    		String[] inp = sc.nextLine().split(",");
    		int[] data = new int[inp.length];
    		for (int i = 0; i < inp.length; i++) {
    			data[i] = Integer.parseInt(inp[i]);
            }
            s.sort(data);
            System.out.println(s);
    	}
    }
}
