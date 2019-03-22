import java.util.ArrayList;

public class Bracket extends ArrayList<Round> {
	public Bracket(Round firstRound) {
		add(firstRound);
		Round round = firstRound.advance();
		while (!round.isSingleton()) { // add rounds until there's one team left
			add(round);
			round = round.advance();
		}
		add(round); // the final singleton round
	}

	public Bracket(ArrayList<Team> teams, boolean shuffle) {
		this(new Round(teams, shuffle));
	}
}
