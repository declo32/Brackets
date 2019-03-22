import java.util.Arrays;

public class Match {
	private Team[] teams = new Team[2];
	private int winner;

	public Match(Team team1, Team team2) {
		teams[0] = team1;
		teams[1] = team2;
		winner = (int) (Math.random() + 0.5);
	}

	public Match(Team team) {
		teams[0] = teams[1] = team;
		winner = 0;
	}

	public Team[] getTeams() {
		return teams;
	}

	public Team getWinner() {
		return teams[winner];
	}

	public Team getLoser() {
		return teams[1 - winner]; // works because there are only two
	}

	@Override
	public String toString() {
		return "Match{" +
				"teams=" + Arrays.toString(teams) +
				", winner=" + winner +
				'}';
	}
}
