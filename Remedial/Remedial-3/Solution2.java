import java.util.*;
import java.lang.*;
class StudentArray {
	private Student[] stuar;
	private int size;
	StudentArray() {
		stuar = new Student[20];
		size = 0;
	}
	public void addStudent(Student s) {
		stuar[size++]  = s;
	}
	public int getSize() {
		return size;
	}
	public Student getStudent(int i) {
		return stuar[i];
	}
	public void exch(Student[] stuar, int i, int j) {
		Student ct = stuar[j];
		stuar[j] = stuar[i];
		stuar[i] = ct;
	}
	public void InsertionSort() {
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (less(stuar, j - 1, j)) {
					exch(stuar, j -1, j);
				} 
			}
        }
	}
	boolean less(Student[] arr, int i, int j) {
		return  arr[i].compareTo(arr[j]) < 0;
	}
}
class Student implements Comparable<Student> {
	int rollno;
	String name;
	double marks;
	Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public double getMarks() {
		return marks;
	}
	public String toString() {
		return getRollno() + "," + getName() + "," + getMarks();
	}
	public int compareTo(Student s) {
		if (this.name.compareTo(s.name) > 0) {
			return -1;
		}
		if (this.name.compareTo(s.name) < 0) {
			return 1;
		}
		return 0;
	}
}
public class Solution2 {
	public static void main(String[] args) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		StudentArray stuar = new StudentArray();
		// System.out.println(n);
		for (int i = 1; i <= n; i++) {
			String s = sc.nextLine();
			Student stu = new Student(Integer.parseInt(s.split(",")[0]), s.split(",")[1], Double.parseDouble(s.split(",")[2]));
			stuar.addStudent(stu);
		}
		stuar.InsertionSort();
		int m = Integer.parseInt(sc.nextLine());
		// System.out.println(m);
		for (int i = 1; i <= m; i++) {
			double num = Double.parseDouble(sc.nextLine());
			int flag = 0;
			for (int j = 0; j < stuar.getSize(); j++) {
				if (num != stuar.getStudent(j).getMarks()) {
					flag++;
					System.out.println(flag);
				} else if (num > stuar.getStudent(j).getMarks()) {
					System.out.println(num);
				} else if (num == stuar.getStudent(j).getMarks()) {
					System.out.println(stuar.getStudent(j).toString());
				}
			} if (flag == stuar.getSize()) {
				System.out.println("This marks are not awarded to any student");
			}
		}
	}
}
