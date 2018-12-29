import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Team t = new Team();
		while (scan.hasNext()) {
			String inp = scan.nextLine();
			CricketTeam ct = new CricketTeam(inp.split(" ")[0],
				inp.split(" ")[1], inp.split(" ")[2], inp.split(" ")[3]);
			t.addCricketTeam(ct);
		}
		t.selectionSort();
		System.out.println(t);
	}
}