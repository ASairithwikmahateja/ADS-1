import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Team t = new Team();
		while (scan.hasNext()) {
			String inp = scan.nextLine();
			String team = inp.split(" ")[0];
			String win = inp.split(" ")[1];
			String loss = inp.split(" ")[2];
			String draw = inp.split(" ")[3];
			CricketTeam ct = new CricketTeam(team, win, loss, draw);
			t.addCricketTeam(ct);
		}
		t.selectionSort();
		System.out.println(t);
	}
}