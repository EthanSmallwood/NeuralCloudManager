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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(int totalExp) {
        this.totalExp = totalExp;
    }

    @Override
    public String toString() {
        return "LevelTable [level=" + level + ", exp=" + exp + ", totalExp=" + totalExp + "]";
    }

}
