public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        if (Utility.isSquare(Battle.GROUND)) {
        	return getBaseHp()*2.0D;
        }
        else {
        	return getWp() == 1? getBaseHp() : getBaseHp()/10.0D;
        }
    }
}
