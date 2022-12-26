package Test;

public class DollAlgorithmTable {
    private String character;
    private String offensiveMainstat;
    private String offensiveSubstat;
    private String offensiveSetNameOne;
    private String offensiveSetNameTwo;
    private String stabilityMainstat;
    private String stabilitySubstat;
    private String stabilitySetNameOne;
    private String stabilitySetNameTwo;
    private String specialMainstat;
    private String specialSubstat;
    private String specialSetNameOne;
    private String specialSetNameTwo;

    public DollAlgorithmTable(String character, String offensiveMainstat, String offensiveSubstat, String offensiveSetNameOne, String offensiveSetNameTwo, String stabilityMainstat, String stabilitySubstat, String stabilitySetNameOne, String stabilitySetNameTwo, String specialMainstat, String specialSubstat, String specialSetNameOne, String specialSetNameTwo) {
        this.character = character;
        this.offensiveMainstat = offensiveMainstat;
        this.offensiveSubstat = offensiveSubstat;
        this.offensiveSetNameOne = offensiveSetNameOne;
        this.offensiveSetNameTwo = offensiveSetNameTwo;
        this.stabilityMainstat = stabilityMainstat;
        this.stabilitySubstat = stabilitySubstat;
        this.stabilitySetNameOne = stabilitySetNameOne;
        this.stabilitySetNameTwo = stabilitySetNameTwo;
        this.specialMainstat = specialMainstat;
        this.specialSubstat = specialSubstat;
        this.specialSetNameOne = specialSetNameOne;
        this.specialSetNameTwo = specialSetNameTwo;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getOffensiveMainstat() {
        return offensiveMainstat;
    }

    public void setOffensiveMainstat(String offensiveMainstat) {
        this.offensiveMainstat = offensiveMainstat;
    }

    public String getOffensiveSubstat() {
        return offensiveSubstat;
    }

    public void setOffensiveSubstat(String offensiveSubstat) {
        this.offensiveSubstat = offensiveSubstat;
    }

    public String getOffensiveSetNameOne() {
        return offensiveSetNameOne;
    }

    public void setOffensiveSetNameOne(String offensiveSetNameOne) {
        this.offensiveSetNameOne = offensiveSetNameOne;
    }

    public String getOffensiveSetNameTwo() {
        return offensiveSetNameTwo;
    }

    public void setOffensiveSetNameTwo(String offensiveSetNameTwo) {
        this.offensiveSetNameTwo = offensiveSetNameTwo;
    }

    public String getStabilityMainstat() {
        return stabilityMainstat;
    }

    public void setStabilityMainstat(String stabilityMainstat) {
        this.stabilityMainstat = stabilityMainstat;
    }

    public String getStabilitySubstat() {
        return stabilitySubstat;
    }

    public void setStabilitySubstat(String stabilitySubstat) {
        this.stabilitySubstat = stabilitySubstat;
    }

    public String getStabilitySetNameOne() {
        return stabilitySetNameOne;
    }

    public void setStabilitySetNameOne(String stabilitySetNameOne) {
        this.stabilitySetNameOne = stabilitySetNameOne;
    }

    public String getStabilitySetNameTwo() {
        return stabilitySetNameTwo;
    }

    public void setStabilitySetNameTwo(String stabilitySetNameTwo) {
        this.stabilitySetNameTwo = stabilitySetNameTwo;
    }

    public String getSpecialMainstat() {
        return specialMainstat;
    }

    public void setSpecialMainstat(String specialMainstat) {
        this.specialMainstat = specialMainstat;
    }

    public String getSpecialSubstat() {
        return specialSubstat;
    }

    public void setSpecialSubstat(String specialSubstat) {
        this.specialSubstat = specialSubstat;
    }

    public String getSpecialSetNameOne() {
        return specialSetNameOne;
    }

    public void setSpecialSetNameOne(String specialSetNameOne) {
        this.specialSetNameOne = specialSetNameOne;
    }

    public String getSpecialSetNameTwo() {
        return specialSetNameTwo;
    }

    public void setSpecialSetNameTwo(String specialSetNameTwo) {
        this.specialSetNameTwo = specialSetNameTwo;
    }

    @Override
    public String toString() {
        return "DollAlgorithmTable{" +
                "character='" + character + '\'' +
                ", offensiveMainstat='" + offensiveMainstat + '\'' +
                ", offensiveSubstat='" + offensiveSubstat + '\'' +
                ", offensiveSetNameOne='" + offensiveSetNameOne + '\'' +
                ", offensiveSetNameTwo='" + offensiveSetNameTwo + '\'' +
                ", stabilityMainstat='" + stabilityMainstat + '\'' +
                ", stabilitySubstat='" + stabilitySubstat + '\'' +
                ", stabilitySetNameOne='" + stabilitySetNameOne + '\'' +
                ", stabilitySetNameTwo='" + stabilitySetNameTwo + '\'' +
                ", specialMainstat='" + specialMainstat + '\'' +
                ", specialSubstat='" + specialSubstat + '\'' +
                ", specialSetNameOne='" + specialSetNameOne + '\'' +
                ", specialSetNameTwo='" + specialSetNameTwo + '\'' +
                '}';
    }
}
