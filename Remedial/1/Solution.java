import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		// System.out.println(n);
		SeparateChainingHashST sc = new SeparateChainingHashST(n);
		for(int i = 0; i < n; i++) {
			String[] token = scan.nextLine().split(",", 2);
			sc.put(token[0], token[1]);
		}
		int m = Integer.parseInt(scan.nextLine());
		// System.out.println(m);
		for (int j = 0; j < m; j++) {
			String[] token1 = scan.nextLine().split(" ");
			String str = sc.get(token1[1])+"";
			switch (token1[2]) {
				case "1":
				System.out.println(sc.get(str));
				if (sc.get(str) == null) {
					System.out.println("Student doesn't exists...");
			    } else {
					System.out.println(str.split(",")[0]);	
				} break;
				case "2":
				if (sc.get(str) == null) {
					System.out.println("Student doesn't exists...");
				} else {
					System.out.println(str.split(",")[1]);
				}
				break;
			}
		}
	}
}