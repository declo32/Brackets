import java.util.ArrayList;

public class RoundTester {
	public static void main(String[] args) {
		ArrayList<Team> teams1 = new ArrayList<>();
		teams1.add(new Team("The Declans", 1));
		teams1.add(new Team("Jeff", 1));
		teams1.add(new Team("Annie's Team", 1));
		teams1.add(new Team("Iets Anders", 1));
		teams1.add(new Team("AAAAAAAAAAAA", 1));

		ArrayList<Team> teams2 = new ArrayList<>();
		teams2.add(new Team("Pocket Sized Drone", 1));
		teams2.add(new Team("Flashlights", 1));
		teams2.add(new Team("Cancelled", 1));
		teams2.add(new Team("To make it even", 1));

		Round[] rounds = {
				new Round(teams1, false),
				new Round(teams1, true),
				new Round(teams2, false),
				new Round(teams2, true)
		};

		for (Round round : rounds) {
			System.out.println(round);
			System.out.println(round.advance());
			System.out.println();
		}
	}
}
