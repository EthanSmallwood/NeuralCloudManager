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
