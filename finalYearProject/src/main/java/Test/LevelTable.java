package Test;

public class LevelTable {

    private int level;
    private int exp;
    private int totalExp;

    public LevelTable(int level, int exp, int totalExp) {
        this.level = level;
        this.exp = exp;
        this.totalExp = totalExp;
    }

    // getters for level, exp, and totalExp
    // (not shown)

    @Override
    public String toString() {
        return "LevelTable [level=" + level + ", exp=" + exp + ", totalExp=" + totalExp + "]";
    }

}
