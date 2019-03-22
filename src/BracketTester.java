import java.util.ArrayList;

public class BracketTester {
	public static void main(String[] args) {
		ArrayList<Team> teams = new ArrayList<>();
		teams.add(new Team("Scituate", 1));
		teams.add(new Team("The Declans", 1));
		teams.add(new Team("AAAAAAAAAAAAAA", 1));
		teams.add(new Team("Oh No", 1));
		teams.add(new Team("<NO NAME>", 1));
		teams.add(new Team("Cancelled", 1));
		teams.add(new Team("Paper", 1));
		teams.add(new Team("Jeff", 1));

		Bracket bracket = new Bracket(teams, true);
		for (Round round : bracket) {
			System.out.println(round);
		}
	}
}
