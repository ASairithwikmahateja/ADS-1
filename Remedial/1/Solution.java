import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		SeparateChainingHashST sc = new SeparateChainingHashST(n);
		for(int i = 0; i <= n; i++) {
			String[] token = scan.nextLine().split(",");
			sc.put(token[0], token[1]);
		}
		int m = Integer.parseInt(scan.nextLine());
		for (int j = 0; j <= m; j++) {
			String[] token1 = scan.nextLine().split("");
			System.out.println(sc.get(token1[1]));	
		}
	}
}