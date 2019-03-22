public class Team {
	private String name;
	private int seed;

	public Team(String name, int seed) {
		this.name = name;
		this.seed = seed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
	}

	@Override
	public String toString() {
		return "Team{" +
				"name='" + name + '\'' +
				", seed=" + seed +
				'}';
	}
}
