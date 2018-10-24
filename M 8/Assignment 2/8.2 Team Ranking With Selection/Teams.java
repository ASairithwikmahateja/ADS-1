class Teams {
	/**
	 * Cricket team array.
	 */
	private CricTeam[] teams;
	/**
	 * Size.
	 */
	private int size;
	/**
	 * Constructs the object.
	 */
	Teams() {
		teams = new CricTeam[10];
		size = 0;
	}
	/**
	 * Adds a cricket team.
	 * The time complexity is O(1), since we increment and
	 * assign the team to array.
	 * @param      t     Cricket team
	 */
	public void addCricketTeam(CricTeam t) {
		teams[size++] = t;
	}
	/**
	 * Returns a string representation of the object.
	 * The time complexity is O(N), since the teams array is converted
	 * and appended to the String.
	 * @return     String representation of the object.
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++) {
			s += teams[i].name+",";
		}
		return s.substring(0, s.length() - 1);
	}
	/**
	 * Sorts the Cricket teams.
	 * The time Complexity is O(1), since we assign the team to array
	 * and exchange.
	 * @param      teams  The teams
	 * @param      i      int
	 * @param      j      int
	 */
	public void exch(CricTeam[] teams, int i, int j) {
		CricTeam ct = teams[j];
		teams[j] = teams[i];
		teams[i] = ct; 
	}
	/**
	 * Selection method.
	 * The time Complexity is O(N^2), since we run the Selection sort
	 * algorithm on the array of teams. 
	 */
	public void InsertionSort() {
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (less(teams, j - 1, j)) {
					exch(teams, j -1, j);
				} 
			}
        }
	}
	/**
	 * Compare the Cricket teams.
	 * The time Complexity is O(1), since return statement takes value
	 * from compareTo.
	 * @param      arr   The arr
	 * @param      i     int
	 * @param      j     int
	 *
	 * @return     boolean
	 */
	public boolean less(CricTeam[] arr, int i, int j) {
		return  arr[i].compareTo(arr[j]) < 0;
	}
}
