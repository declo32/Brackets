import java.util.ArrayList;
import java.util.Collections;

public class Round extends ArrayList<Match> {
	private boolean singleton;

	public Round(ArrayList<Team> teams, boolean shuffle) {
		if (shuffle)
			Collections.shuffle(teams);

		singleton = teams.size() == 1;

		for (int i = 0; i < teams.size()-1; i += 2)
			add(new Match(teams.get(i), teams.get(i+1))); // add teams into matches two at a time
		if (teams.size() % 2 == 1)
			add(new Match(teams.get(teams.size() - 1))); // if there's one left over, add it alone
	}

	public Round advance() {
		ArrayList<Team> teams = new ArrayList<>();
		for (Match match : this)
			teams.add(match.getWinner()); // add all the winners of the matches to a roster
		return new Round(teams, false); // make a new Round from the roster
	}

	public boolean isSingleton() {
		return singleton;
	}
}
