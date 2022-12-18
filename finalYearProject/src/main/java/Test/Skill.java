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

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getSkillSample() {
        return skillSample;
    }

    public void setSkillSample(int skillSample) {
        this.skillSample = skillSample;
    }

    public int getSkillSampleTotal() {
        return skillSampleTotal;
    }

    public void setSkillSampleTotal(int skillSampleTotal) {
        this.skillSampleTotal = skillSampleTotal;
    }

    public int getDiggCoins() {
        return diggCoins;
    }

    public void setDiggCoins(int diggCoins) {
        this.diggCoins = diggCoins;
    }

    public int getDiggCoinsTotal() {
        return diggCoinsTotal;
    }

    public void setDiggCoinsTotal(int diggCoinsTotal) {
        this.diggCoinsTotal = diggCoinsTotal;
    }

    public int getSkillPivot() {
        return skillPivot;
    }

    public void setSkillPivot(int skillPivot) {
        this.skillPivot = skillPivot;
    }

    public int getSkillPivotTotal() {
        return skillPivotTotal;
    }

    public void setSkillPivotTotal(int skillPivotTotal) {
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
