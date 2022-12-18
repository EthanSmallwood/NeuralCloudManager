package Test;

    public class CharacterSheet {
        String dollName;
        int currentLevel;
        int goalLevel;
        int passiveSkillCurrent;
        int passiveSkillGoal;
        int autoSkillCurrent;
        int autoSkillGoal;
        int breakthroughCurrent;
        int breakthroughGoal;
        int starCurrent;
        int starGoal;
        Images dollClass;

    public CharacterSheet(String dollName, int currentLevel, int goalLevel, int passiveSkillCurrent, int passiveSkillGoal, int autoSkillCurrent, int autoSkillGoal, int breakthroughCurrent, int breakthroughGoal, int starCurrent, int starGoal, Images dollclass) {
        this.dollName = dollName;
        this.currentLevel = currentLevel;
        this.goalLevel = goalLevel;
        this.passiveSkillCurrent = passiveSkillCurrent;
        this.passiveSkillGoal = passiveSkillGoal;
        this.autoSkillCurrent = autoSkillCurrent;
        this.autoSkillGoal = autoSkillGoal;
        this.breakthroughCurrent = breakthroughCurrent;
        this.breakthroughGoal = breakthroughGoal;
        this.starCurrent = starCurrent;
        this.starGoal = starGoal;
        this.dollClass = dollclass;
    }

    public String getDollName() {
        return dollName;
    }

    public void setDollName(String dollName) {
        this.dollName = dollName;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getGoalLevel() {
        return goalLevel;
    }

    public void setGoalLevel(int goalLevel) {
        this.goalLevel = goalLevel;
    }

    public int getPassiveSkillCurrent() {
        return passiveSkillCurrent;
    }

    public void setPassiveSkillCurrent(int passiveSkillCurrent) {
        this.passiveSkillCurrent = passiveSkillCurrent;
    }

    public int getPassiveSkillGoal() {
        return passiveSkillGoal;
    }

    public void setPassiveSkillGoal(int passiveSkillGoal) {
        this.passiveSkillGoal = passiveSkillGoal;
    }

    public int getAutoSkillCurrent() {
        return autoSkillCurrent;
    }

    public void setAutoSkillCurrent(int autoSkillCurrent) {
        this.autoSkillCurrent = autoSkillCurrent;
    }

    public int getAutoSkillGoal() {
        return autoSkillGoal;
    }

    public void setAutoSkillGoal(int autoSkillGoal) {
        this.autoSkillGoal = autoSkillGoal;
    }

    public int getBreakthroughCurrent() {
        return breakthroughCurrent;
    }

    public void setBreakthroughCurrent(int breakthroughCurrent) {
        this.breakthroughCurrent = breakthroughCurrent;
    }

    public int getBreakthroughGoal() {
        return breakthroughGoal;
    }

    public void setBreakthroughGoal(int breakthroughGoal) {
        this.breakthroughGoal = breakthroughGoal;
    }

    public int getStarCurrent() {
        return starCurrent;
    }

    public void setStarCurrent(int starCurrent) {
        this.starCurrent = starCurrent;
    }

    public int getStarGoal() {
        return starGoal;
    }

    public void setStarGoal(int starGoal) {
        this.starGoal = starGoal;
    }

    public Images getDollClass() {
        return dollClass;
    }

    public void setDollClass(Images dollClass) {
        this.dollClass = dollClass;
    }

    @Override
    public String toString() {
        return "CharacterSheet{" +
                "dollName='" + dollName + '\'' +
                ", currentLevel=" + currentLevel +
                ", goalLevel=" + goalLevel +
                ", passiveSkillCurrent=" + passiveSkillCurrent +
                ", passiveSkillGoal=" + passiveSkillGoal +
                ", autoSkillCurrent=" + autoSkillCurrent +
                ", autoSkillGoal=" + autoSkillGoal +
                ", breakthroughCurrent=" + breakthroughCurrent +
                ", breakthroughGoal=" + breakthroughGoal +
                ", starCurrent=" + starCurrent +
                ", starGoal=" + starGoal +
                ", dollclass=" + dollClass +
                '}';
    }
}
