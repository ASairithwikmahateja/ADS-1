import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
/**
 * Merit class.
 */
class Merit {
    /**
     * students array.
     */
    Student[] students;
    /**
     * students1 array.
     */
    Student[] students1;
    /**
     * size variable.
     */
    int size;
    /**
     * Constructs the object.
     */
    Merit() {
        students = new Student[50];
        students1 = new Student[50];
        size = 0;
    }
    /**
     * Adds a student.
     *
     * @param      st    student object
     */
    public void addStudent(final Student st) {
        students[size++] = st;
    }
    /**
     * Gets the size.
     *
     * @return     The size.
     */
    public int getSize() {
        return size;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += students[i].name + "," + students[i].total
            + "," + students[i].category + "\n";
        }
        return str;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString1() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += students[i].name + "," + students[i].total
            + "," + students[i].category + "\n";
        }
        return str;
    }
    /**
     * Method to swap.
     *
     * @param      students  The students
     * @param      i         The index
     * @param      j         The index
     */
    public void exch(final Student[] students, final int i, final int j) {
        Student stu = students[j];
        students[j] = students[i];
        students[i] = stu;
    }
    /**
     * check if it is in the array.
     *
     * @param      obj   The object
     *
     * @return     true or false
     */
    public boolean contains(final Student obj) {
        for (Student stu : students1) {
            try {
                if(stu.equals(obj)) {
                    return true;
                }
            } catch (Exception e) {

            }
            
        }
        return false;
    }
    /**
     * copy into array based on reservation and vacancies.
     *
     * @param      noOfvacancies  No ofvacancies
     * @param      noOfunres      No ofunres
     * @param      noOfBC         No of bc
     * @param      noOfSC         No of sc
     * @param      noOfST         No of st
     */
    public void sort(final int noOfvacancies, final int noOfunres,
    	final int noOfBC, final int noOfSC, final int noOfST) {
        int z = 0;
        for (int i = 0; i < noOfunres; i++) {
            students1[z++] = students[i];
        }
        int bc = 0;
        if (noOfBC != 0) {
            for (int i = noOfunres; i < students.length; i++ ) {
                try {
                    if (students[i].category.equals("BC")) {
                        students1[z++] = students[i];
                        bc++;
                        if(bc == noOfBC){
                            break;
                        }
                    }   
                } catch(Exception e) {

                }
            }
        }
        int sc = 0;
        if (noOfSC != 0) {
            for (int i = noOfunres ; i < size; i++ ) {
                if (students[i].category.equals("SC")) {
                    students1[z++] = students[i];
                    sc++;
                    if(sc == noOfSC) {
                        break;
                    }
                }
            }
        }
        int st = 0;
        if (noOfST != 0) {
            for (int i = noOfunres ; i < size; i++ ) {
                if (students[i].category.equals("ST")) {
                    students1[z++] = students[i];
                    st++;
                    if(st == noOfST) {
                        break;
                    }
                }
            }
        }
        if (bc != noOfBC) {
            for (int i = noOfunres; i < students.length; i++ ) {
                if (!contains(students[i])){
                    students1[z++] = students[i];
                    bc++;
                    if(bc == noOfBC){
                        break;
                    }
                }
            }
        }
        if (sc != noOfSC) {
            for (int i = noOfunres; i < students.length; i++ ) {
                if (!contains(students[i])) {
                    students1[z++] = students[i];
                    sc++;
                    if(sc == noOfSC) {
                        break;
                    }
                }
            }
        }
        if(st != noOfST) {
            for (int i = noOfunres; i<students.length; i++ ) {
                if (!contains(students[i])) {
                    students1[z++] = students[i];
                    st++;
                    if(st == noOfST) {
                        break;
                    }
                }
            }
        }
        students1 = Arrays.copyOf(students1, z);
        Arrays.sort(students1, Collections.reverseOrder());
    }
    /**
     * Inssertion sort.
     */
    public void InsertionSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (!less(students, j - 1, j)) {
                    break;
                } else {
                    exch(students, j - 1, j);
                }
            } 
        }
    }
    /**
     * compare two objects.
     *
     * @param      arr   The arr
     * @param      i     The index
     * @param      j     The index
     *
     * @return     true or false
     */
    public boolean less(final Student[] arr, final int i, final int j) {
        return  arr[i].compareTo(arr[j]) < 0;
    }
}
