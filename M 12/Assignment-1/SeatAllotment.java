/**
 * Class for seat allotment.
 */
class SeatAllotment implements Comparable<SeatAllotment> {
	/**
	 * Constructs the object.
	 */
	String name;
	String dob;
	int marks1;
	int marks2;
	int marks3;
	int totalmarks;
	String cate;
	/**
	 * Constructs the object.
	 *
	 * @param      name        The name
	 * @param      dob         The dob
	 * @param      marks1      The marks 1
	 * @param      marks2      The marks 2
	 * @param      marks3      The marks 3
	 * @param      totalmarks  The totalmarks
	 * @param      cate        The cate
	 */
	SeatAllotment(String name, String dob, int marks1, int marks2,
		int marks3, int totalmarks, String cate) {
		this.name = name;
		this.dob = dob;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.totalmarks = totalmarks;
		this.cate = cate;
	}
	/**
	 * totalmarks method.
	 *
	 * @return     int
	 */
	public int totalmarks() {
		return totalmarks;
	}
	/**
	 * dob method.
	 *
	 * @return     int
	 */
	public String dob() {
		return dob;
	}
	/**
	 * getname method.
	 *
	 * @return     int
	 */
	public String getname() {
		return name;
	}
	/**
	 * getcate method.
	 *
	 * @return     int
	 */
	public String cate() {
		return cate;
	}
	/**
	 * getmarks method.
	 *
	 * @return     int
	 */
	public int getmarks1() {
		return marks1;
	}
	/**
	 * getmarks method.
	 *
	 * @return     int
	 */
	public int getmarks2() {
		return marks2;
	}
	/**
	 * getmarks method.
	 *
	 * @return     int
	 */
	public int getmarks3() {
		return marks3;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		String s = "";
		return s;
	}
	public int compareTo(SeatAllotment s) {
		if (this.totalmarks > s.totalmarks) {
			return 1;
		}
		if (this.marks3 > s.marks3) {
			return 1;
		}
		if (this.marks2 == this.marks2) {
			return 1;
		}
		if (this.dob.equals(s.dob)){
			return 1;
		}
		return 0;
	}
}
