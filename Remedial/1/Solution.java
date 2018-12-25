import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		// System.out.println(n);
		SeparateChainingHashST sc = new SeparateChainingHashST(n);
		SeparateChainingHashST sc1 = new SeparateChainingHashST(n);
		for(int i = 0; i < n; i++) {
			String[] token = scan.nextLine().split(",");
			sc.put(token[0], token[1]);
			sc1.put(token[1], token[2]);
		}
		int m = Integer.parseInt(scan.nextLine());
		// System.out.println(m);
		for (int j = 0; j < m; j++) {
			String[] token1 = scan.nextLine().split(" ");
			switch (token1[2]) {
				case "1":
					System.out.println(sc.get(token1[1]));	
				break;
				case "2":
					System.out.println(sc1.get(token1[2]));
			}
		}
	}
}