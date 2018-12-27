import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = Integer.parseInt(scan.nextLine());
		int v = Integer.parseInt(scan.nextLine());
		int ur = Integer.parseInt(scan.nextLine());
		int bc = Integer.parseInt(scan.nextLine());
		int sc = Integer.parseInt(scan.nextLine());
		int st = Integer.parseInt(scan.nextLine());
		while(scan.hasNext()) {
			String[] token = scan.nextLine().split(",");
			System.out.println(token[0]+token[1]+token[2]+token[3]+token[4]);
		}
	}
}