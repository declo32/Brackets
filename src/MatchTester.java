public class MatchTester {
	public static void main(String[] args) {
		Match match1 = new Match(new Team("The Declans", 1));
		Match match2 = new Match(new Team("Jeff", 1), new Team("Annie", 1));
		System.out.println(match1);
		System.out.println(match2);
	}
}
