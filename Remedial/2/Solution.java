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
     * main method that drives the program.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree<Student, String> bst =
            new BinarySearchTree();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] token = sc.nextLine().split(",");
            bst.put(new Student(token[0], token[1],
                Double.parseDouble(token[2])), token[0]);
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < m; j++) {
            String[] tokens = sc.nextLine().split(" ");
            switch (tokens[0]) {
            case "BE":
                for (Student s : bst.keys()) {
                    if (s.getTotalMarks() >= Double.parseDouble(tokens[1])
                    && s.getTotalMarks() <= Double.parseDouble(tokens[2])) {
                        System.out.println(s.getStudentName());
                    }
                }
                break;
            case "GE":
                for (Student s : bst.keys()) {
                    if (s.getTotalMarks() >= Double.parseDouble(tokens[1])) {
                        System.out.println(s.getStudentName());
                    }
                }
                break;
            case "LE":
                for (Student s : bst.keys()) {
                    if (s.getTotalMarks() <= Double.parseDouble(tokens[1])) {
                        System.out.println(s.getStudentName());
                    }
                }
                break;
            default:
                break;
            }
        }
    }
}