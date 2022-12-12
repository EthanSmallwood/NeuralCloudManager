package Test;

public class Skill {
    private int skillLevel;
    private int skillSample;
    private int skillSampleTotal;
    private int diggCoins;
    private int diggCoinsTotal;
    private int skillPivot;
    private int skillPivotTotal;

    public Skill(int skillLevel, int skillSample, int skillSampleTotal, int diggCoins, int diggCoinsTotal, int skillPivot, int skillPivotTotal) {
        this.skillLevel = skillLevel;
        this.skillSample = skillSample;
        this.skillSampleTotal = skillSampleTotal;
        this.diggCoins = diggCoins;
        this.diggCoinsTotal = diggCoinsTotal;
        this.skillPivot = skillPivot;
        this.skillPivotTotal = skillPivotTotal;
    }


    @Override
    public String toString() {
        return "Skill{" +
                "skillLevel=" + skillLevel +
                ", skillSample=" + skillSample +
                ", skillSampleTotal=" + skillSampleTotal +
                ", diggCoins=" + diggCoins +
                ", diggCoinsTotal=" + diggCoinsTotal +
                ", skillPivot=" + skillPivot +
                ", skillPivotTotal=" + skillPivotTotal +
                '}';
    }
}
