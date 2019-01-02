import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		Seat seat = new Seat();
		int noofstu = Integer.parseInt(sc.nextLine());
		int vac = Integer.parseInt(sc.nextLine());
		int unresvac = Integer.parseInt(sc.nextLine());
		int cateA = Integer.parseInt(sc.nextLine());
		int cateB = Integer.parseInt(sc.nextLine());
		int cateC = Integer.parseInt(sc.nextLine());
		final int size = 10;
		String[] str = new String[size];
		for (int i = 0; i < noofstu; i++) {
			str = sc.nextLine().split(",");
			SeatAllotment s = new SeatAllotment(str[0], str[1], Integer.parseInt(str[2]),
			Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), str[6]);
			seat.seatAllot(s);
		}
		seat.selectionSort();
		System.out.println(seat + "\n");
		String st = seat + "";
		String[] str1 = st.split("\n");
		while (vac > 0) {
			while (unresvac > 0) {
				System.out.println();	
				unresvac--;
			}
			vac--;
		}
	}		
}
