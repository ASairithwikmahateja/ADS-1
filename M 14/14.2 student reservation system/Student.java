/**
 * Student class.
 */
class Student implements Comparable<Student> {
    /**
     * name of the student.
     */
    String name;
    /**
     * date of birth.
     */
    String dob;
    /**
     * subject1.
     */
    int s1;
    /**
     * subject2.
     */
    int s2;
    /**
     * subject3.
     */
    int s3;
    /**
     * total marks.
     */
    int total;
    /**
     * reservation category.
     */
    String category;
    /**
     * Constructs the object.
     *
     * @param      name      The name
     * @param      dob       The dob
     * @param      s1        The s 1
     * @param      s2        The s 2
     * @param      s3        The s 3
     * @param      total     The total
     * @param      category  The category
     */
    Student(final String namef, final String dobf, final String s1f,
        final String s2f, final String s3f, final String totalf,
        final String categoryf) {
        this.name = namef;
        this.dob = dobf;
        String[] date = dob.split("-");
        int year = Integer.parseInt(date[2]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[0]);
        this.s1 = Integer.parseInt(s1f);
        this.s2 = Integer.parseInt(s2f);
        this.s3 = Integer.parseInt(s3f);
        this.total = Integer.parseInt(totalf);
        this.category = categoryf;
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
     * Gets the total.
     *
     * @return     The total.
     */
    public int getTotal() {
        return total;
    }
    /**
     * Gets the category.
     *
     * @return     The category.
     */
    public String getCategory() {
        return category;
    }
    /**
     * Gets the year.
     *
     * @return     The year.
     */
    public int getYear() {
        String[] date = dob.split("-");
        int year = Integer.parseInt(date[2]);
        return year;
    }
    /**
     * Gets the month.
     *
     * @return     The month.
     */
    public int getMonth() {
        String[] date = dob.split("-");
        int month = Integer.parseInt(date[1]);
        return month;
    }
    /**
     * Gets the day.
     *
     * @return     The day.
     */
    public int getDay() {
        String[] date = dob.split("-");
        int day = Integer.parseInt(date[0]);
        return day;
    }
    /**
     * Method to compare two objects.
     *
     * @param      s    student object
     *
     * @return     integer value
     */
    public int compareTo(final Student s) {
        if (this.total > s.total) {
            return 1;
        }
        if (this.total < s.total) {
            return -1;
        }
        if (this.s3 > s.s3) {
            return 1;
        }
        if (this.s3 < s.s3) {
            return -1;
        }
        if (this.s2 > s.s2) {
            return 1;
        }
        if (this.s2 < s.s2) {
            return -1;
        }
        if (this.getYear() > s.getYear()) {
            return 1;
        }
        if (this.getYear() < s.getYear()) {
            return -1;
        }
        if (this.getMonth() > s.getMonth()) {
            return 1;
        }
        if (this.getMonth() < s.getMonth()) {
            return -1;
        }
        if (this.getDay() > s.getDay()) {
            return 1;
        }
        if (this.getDay() < s.getDay()) {
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
        return this.name + "," + this.total + "," + this.category;
    }
}
