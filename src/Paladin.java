public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		int bonus = Utility.Fibonacci(getBaseHp());
		if (bonus != 0) {
			return 1000 + bonus;
		}
		return getBaseHp() * 3.0D;
	}
}
