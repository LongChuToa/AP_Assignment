public class Warrior extends Fighter {
    public Warrior(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        if (Utility.isPrime(Battle.GROUND)) {
        	return getBaseHp()*2.0D;
        }
        else {
        	return getWp() == 1? getBaseHp() : getBaseHp()/10.0D;
        }
    }
}
