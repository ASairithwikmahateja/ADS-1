class Team {
	/**
	 * Cricket team array.
	 */
	private CricketTeam[] teams;
	/**
	 * Size.
	 */
	private int size;
	/**
	 * Constructs the object.
	 */
	Team() {
		teams = new CricketTeam[100];
		size = 0;
	}
	/**
	 * Adds a cricket team.
	 * The time complexity is O(1), since we increment and
	 * assign the team to array.
	 * @param      t     Cricket team
	 */
	public void addCricketTeam(CricketTeam t) {
		teams[size++] = t;
		//System.out.println("Mahateja" + t);
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
			s += teams[i].name+" ";
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
	public void exch(CricketTeam[] teams, int i, int j) {
		CricketTeam ct = teams[j];
		teams[j] = teams[i];
		teams[i] = ct;
	}
	/**
	 * Selection method.
	 * The time Complexity is O(N^2), since we run the Selection sort
	 * algorithm on the array of teams. 
	 */
	public void selectionSort() {
		for (int i = 0; i < size - 1; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (less(teams, j, min)) {
					min = j;
				} 
			}
			exch(teams, i, min);
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
	boolean less(CricketTeam[] arr, int i, int j) {
		return  arr[i].compareTo(arr[j]) > 0;
	}
}
