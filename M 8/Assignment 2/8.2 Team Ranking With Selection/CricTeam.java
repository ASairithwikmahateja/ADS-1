class CricTeam implements Comparable<CricTeam>{
	String name;
	int wins;
	int losses;
	int draws;
	/**
	 * Constructs the object.
	 *
	 * @param      name    The name
	 * @param      wins    The wins
	 * @param      losses  The losses
	 * @param      draws   The draws
	 */
	CricTeam(String name, String wins, String losses, String draws) {
		this.name = name;
		this.wins = Integer.parseInt(wins);
		this.losses = Integer.parseInt(losses);
		this.draws = Integer.parseInt(draws);
	}
	/**
	 * Gets the name.
	 *
	 * @return     The name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Gets the wins.
	 *
	 * @return     The wins.
	 */
	public int getWins() {
		return wins;
	}
	/**
	 * Gets the losses.
	 *
	 * @return     The losses.
	 */
	public int getLosses() {
		return losses;
	}
	/**
	 * Gets the draws.
	 *
	 * @return     The draws.
	 */
	public int getDraws() {
		return draws;
	}
	/**
	 * CompareTo method.
	 *
	 * @param      c     Cricket team.
	 *
	 * @return     int
	 */
	public int compareTo(CricTeam c) {
		if (this.wins > c.wins) {
			return 1;
		}
		if (this.wins < c.wins) {
			return -1;
		}
		if (this.losses < c.losses) {
			return 1;
		}
		if (this.losses > c.losses) {
			return -1;
		}
		if (this.draws > c.draws) {
			return 1;
		}
		if (this.draws < c.draws) {
			return -1;
		}
		return 0;  
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return this.name + " " + this.wins + " " + this.losses + " " + this.draws;
	}
}