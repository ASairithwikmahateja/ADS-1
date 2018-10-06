class Seat {
	/**
	 * SeatAllotment array.
	 */
	private SeatAllotment[] seats;
	/**
	 * Size.
	 */
	private int size;
	/**
	 * Constructs the object.
	 */
	Seat() {
		seats = new SeatAllotment[100];
		size = 0;
	}
	/**
	 * Adds a seats team.
	 * The time complexity is O(1), since we increment and
	 * assign the team to array.
	 * @param      t     Cricket team
	 */
	public void seatAllot(SeatAllotment s) {
		seats[size++] = s;
		//System.out.println("Mahateja" + t);
	}
	/**
	 * Returns a string representation of the object.
	 * The time complexity is O(N), since the seats array is converted
	 * and appended to the String.
	 * @return     String representation of the object.
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++) {
			s += seats[i].name + "," + seats[i].totalmarks
			+ "," + seats[i].cate + "\n";
		}
		return s.substring(0, s.length() - 1);
	}
	/**
	 * Sorts the seats.
	 * The time Complexity is O(1), since we assign the team to array
	 * and exchange.
	 * @param      seats  The seats
	 * @param      i      int
	 * @param      j      int
	 */
	public void exch(SeatAllotment[] seats, int i, int j) {
		SeatAllotment ct = seats[j];
		seats[j] = seats[i];
		seats[i] = ct;
	}
	/**
	 * Selection method.
	 * The time Complexity is O(N^2), since we run the Selection sort
	 * algorithm on the array of seats. 
	 */
	public void selectionSort() {
		for (int i = 0; i < size - 1; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (less(seats, j, min)) {
					min = j;
				} 
			}
			exch(seats, i, min);
        }
	}
	/**
	 * Compare the seats.
	 * The time Complexity is O(1), since return statement takes value
	 * from compareTo.
	 * @param      arr   The arr
	 * @param      i     int
	 * @param      j     int
	 *
	 * @return     boolean
	 */
	boolean less(SeatAllotment[] arr, int i, int j) {
		return  arr[i].compareTo(arr[j]) < 0;
	}
}
