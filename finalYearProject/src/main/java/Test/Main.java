package Test;
import javafx.scene.image.Image;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.*;

public class Main {
private static List<Doll> dolls = new ArrayList<>();
private static List<LevelTable> levels = new ArrayList<>();
private static List<Skill> skillTable = new ArrayList<>();
private static List<Images> roleImage = new ArrayList<>();
private static List<DollAlgorithmTable> dollAlgorithmTable = new ArrayList<>();
private static List<Images> algorithmImages = new ArrayList<>();
private static List<Stars> starTable = new ArrayList<>();
private static List<Breakthrough> breakthroughTable = new ArrayList<>();
//turns Algorithm into arrayList
static {
    String csvFile = "src/main/resources/CSVFiles/Algorithms.csv";
    String line = "";
    String csvSplitBy = ",";


    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        // read the header line
        String headerLine = br.readLine();

        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] values = line.split(csvSplitBy);

            String name = values[0];
            String image = values[1];

            Images tempImage = new Images(name, image);
            algorithmImages.add(tempImage);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//turns Doll csv into arrayList
static {
    String csvFile = "src/main/resources/CSVFiles/Dolls.csv";
    String line = "";
    String csvSplitBy = ",";


    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        // read the header line
        String headerLine = br.readLine();

        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] values = line.split(csvSplitBy);

            int id = Integer.parseInt(values[0]);
            String name = values[1];
            String role = values[2];
            String image = values[3];

            Doll doll = new Doll(id, name, role, image);
            dolls.add(doll);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//turns EXP csv into arrayList
static {
    String csvFile = "src/main/resources/CSVFiles/Exp.csv";
    String line = "";
    String csvSplitBy = ",";


    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        // read the header line
        String headerLine = br.readLine();

        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] values = line.split(csvSplitBy);

            int level = Integer.parseInt(values[0]);
            int exp = Integer.parseInt(values[1]);
            int totalExp = Integer.parseInt(values[2]);

            LevelTable levelTable = new LevelTable(level, exp, totalExp);
            levels.add(levelTable);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//turns RoleImg csv into arrayList
static {
    String csvFile = "src/main/resources/CSVFiles/RoleImg.csv";
    String line = "";
    String csvSplitBy = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        // read the header line
        String headerLine = br.readLine();

        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] values = line.split(csvSplitBy);

            String role = values[0];
            String image = values[1];


            Images roleImages = new Images(role, image);
            roleImage.add(roleImages);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//turns skills csv into arrayList
static {
    String csvFile = "src/main/resources/CSVFiles/Skills.csv";
    String line = "";
    String csvSplitBy = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        // read the header line
        String headerLine = br.readLine();

        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] values = line.split(csvSplitBy);

            int skillLevel = Integer.parseInt(values[0]);
            int skillSample = Integer.parseInt(values[1]);
            int skillSampleTotal = Integer.parseInt(values[2]);
            int diggCoins = Integer.parseInt(values[3]);
            int diggCoinsTotal = Integer.parseInt(values[4]);
            int skillPivot = Integer.parseInt(values[5]);
            int skillPivotTotal = Integer.parseInt(values[6]);

            Skill skill = new Skill(skillLevel, skillSample, skillSampleTotal, diggCoins, diggCoinsTotal,skillPivot,skillPivotTotal);
            skillTable.add(skill);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//turns DollAlgorithms csv into arrayList
static {
    String csvFile = "src/main/resources/CSVFiles/DollAlgorithms.csv";
    String line = "";
    String csvSplitBy = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        // read the header line
        String headerLine = br.readLine();

        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] values = line.split(csvSplitBy);

            String character = values[0];
            String offenseMainstat = values[1];
            String offenseSubstat = values[2];
            String offenseSetNameOne = values[3];
            String offenseSetNameTwo = values[4];
            String stabilityMainstat = values[5];
            String stabilitySubstat = values[6];
            String stabilitySetNameOne = values[7];
            String stabilitySetNameTwo = values[8];
            String specialMainstat = values[9];
            String specialSubstat = values[10];
            String specialSetNameOne = values[11];
            String specialSetNameTwo = values[12];


            DollAlgorithmTable doll = new DollAlgorithmTable(character, offenseMainstat,offenseSubstat,offenseSetNameOne,offenseSetNameTwo,stabilityMainstat,stabilitySubstat,stabilitySetNameOne,stabilitySetNameTwo,specialMainstat,specialSubstat,specialSetNameOne,specialSetNameTwo);
            dollAlgorithmTable.add(doll);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//turns star csv into arrayList
static {
    String csvFile = "src/main/resources/CSVFiles/Star.csv";
    String line = "";
    String csvSplitBy = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        // read the header line
        String headerLine = br.readLine();

        while ((line = br.readLine()) != null) {
            // use comma as separator
            String[] values = line.split(csvSplitBy);

            double star = Double.parseDouble(values[0]);
            int fragment = Integer.parseInt(values[1]);
            int fragmentTotal = Integer.parseInt(values[2]);
            int diggcoin = Integer.parseInt(values[3]);
            int diggcoinTotal = Integer.parseInt(values[4]);



            Stars stars = new Stars(star,fragment,fragmentTotal,diggcoin,diggcoinTotal);
            starTable.add(stars);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//creates breakthrough arrayList
static {
    breakthroughTable.add(new Breakthrough(0,0,0,0,0,0,0,0));
    breakthroughTable.add(new Breakthrough(1,10,0,0,0,0,0,500));
    breakthroughTable.add(new Breakthrough(2,10,15,0,0,0,0,2000));
    breakthroughTable.add(new Breakthrough(3,0,15,20,0,0,0,5000));
    breakthroughTable.add(new Breakthrough(4,0,0,15,25,0,0,10000));
    breakthroughTable.add(new Breakthrough(5,0,0,0,20,30,0,20000));
    breakthroughTable.add(new Breakthrough(6,0,0,0,0,25,35,12000));
}
    public static void main(String[] args) throws IOException {

        //print arrayLists
        {
            // print out all dolls
            //for (Doll doll : dolls) {
            //    System.out.println(doll);
            //}

            // print out all levels
//        for (LevelTable level : levels) {
//            System.out.println(level);
//        }
            // print out all skills
//       for (Skill skill : skillTable) {
//            System.out.println(skill);
//        }
            // print out all roles
//        for (Images roleImages : roleImage) {
//            System.out.println(roleImages);
//        }
            // print out all algorithms
//        for (DollAlgorithmTable dollAlgorithmTable : dollAlgorithmTable) {
//            System.out.println(dollAlgorithmTable);
//        }
            //print out all algoritms
//        for(Images images : algorithmImages){
//            System.out.println(images);
//        }
            //print out all star
//        for(Stars stars : starTable){
//            System.out.println(stars);
//        }
            //print out all breakthrough
//            for(Breakthrough breakthrough : breakthroughTable){
//                System.out.println(breakthrough);
//            }
        }

        //System.out.println(breakthroughToNext(2,4));
        //System.out.println(skillToNext(2,10));
        //System.out.println(starToNext(1.5,4.5));
        //System.out.println(levelToNext(10,60));
        mainFunction("Kuro",10,60,3,7,3,7,1,5,3,5);
    }

    public static Breakthrough breakthroughToNext(int currentLevel,int goalLevel) {
        Breakthrough breakthrough = new Breakthrough(0,0,0,0,0,0,0,0);
        for(int i = currentLevel + 1 ; i <= goalLevel; i++) {
            breakthrough.setSimplified(breakthrough.getSimplified()+breakthroughTable.get(i).getSimplified());
            breakthrough.setStandard(breakthrough.getStandard()+breakthroughTable.get(i).getStandard());
            breakthrough.setAdvanced(breakthrough.getAdvanced()+breakthroughTable.get(i).getAdvanced());
            breakthrough.setPremium(breakthrough.getPremium()+breakthroughTable.get(i).getPremium());
            breakthrough.setPioneering(breakthrough.getPioneering()+breakthroughTable.get(i).getPioneering());
            breakthrough.setRainbow(breakthrough.getRainbow()+breakthroughTable.get(i).getRainbow());
            breakthrough.setDiggcoins(breakthrough.getDiggcoins()+breakthroughTable.get(i).getDiggcoins());
        }
        return breakthrough;
    }
    public static Skill skillToNext(int currentLevel,int goalLevel) {
        Skill skill = new Skill(0,0,0,0,0,0,0);
        Skill currentSkill = skillTable.get(currentLevel-1);
        Skill goalSkill = skillTable.get(goalLevel-1);
        skill.setSkillSampleTotal(goalSkill.getSkillSampleTotal()-currentSkill.getSkillSampleTotal());
        skill.setDiggCoinsTotal(goalSkill.getDiggCoinsTotal()-currentSkill.getDiggCoinsTotal());
        skill.setSkillPivotTotal(goalSkill.getSkillPivotTotal()-currentSkill.getSkillPivotTotal());
        return skill;
    }
    public static Stars starToNext(double currentStar,double goalStar) {
        int currentIndex = 0;
        int goalIndex = 0;
        Stars temp = new Stars(0,0,0,0,0);
        for(int i = 0; i < starTable.size(); i++) {
            if(starTable.get(i).getStar() == currentStar) {
                currentIndex = i;
            }
            if(starTable.get(i).getStar() == goalStar) {
                goalIndex = i;
            }
        }
        temp.setFragmentTotal(starTable.get(goalIndex).getFragmentTotal()-starTable.get(currentIndex).getFragmentTotal());
        temp.setDiggcoinsTotal(starTable.get(goalIndex).getDiggcoinsTotal()-starTable.get(currentIndex).getDiggcoinsTotal());
        return temp;
    }
    public static int levelToNext(int currentLevel, int goalLevel) {
        return (levels.get(goalLevel-1).getTotalExp()-levels.get(currentLevel-1).getTotalExp());
    }
    public static Images getcharacterImage(String doll){
        for(int i = 0; i < dolls.size();i++){
            if(dolls.get(i).getName().equals(doll)){
                String role = dolls.get(i).getRole();
                String img = dolls.get(i).getImage();
                return new Images(role,img);
            }
        }
        return null;
    }
    public static String getRoleImage(String role){
        for(int i = 0; i < roleImage.size();i++){
            if(roleImage.get(i).getRole().equals(role)){
                return roleImage.get(i).getImage();
            }
        }
        return null;
    }

    public static void mainFunction(String dollName,int currentLevel,int goalLevel,int passiveSkillCurrent, int passiveSkillGoal,int autoSkillCurrent,int autoSkillGoal,int breakthroughCurrent,int breakthroughGoal,int starCurrent, int starGoal){
        Breakthrough tempBreakthrough = breakthroughToNext(breakthroughCurrent,breakthroughGoal);
        Skill autoSkillTemp = skillToNext(autoSkillCurrent,autoSkillGoal);
        Skill passiveSkillTemp = skillToNext(passiveSkillCurrent,passiveSkillGoal);
        Stars starsTemp = starToNext(starCurrent,starGoal);
        Images characterImage = getcharacterImage(dollName);
        System.out.println(dollName +" "+ characterImage.getImage() +" "+  characterImage.getRole() +" "+  getRoleImage(characterImage.getRole()) );
        System.out.println("Resource");
        System.out.println("Simplified Widget "+ tempBreakthrough.getSimplified());
        System.out.println("Standard Widget "+ tempBreakthrough.getStandard());
        System.out.println("Advanced Widget "+ tempBreakthrough.getAdvanced());
        System.out.println("Premium Widget "+ tempBreakthrough.getPremium());
        System.out.println("Pioneering Widget "+ tempBreakthrough.getPioneering());
        System.out.println("Rainbow Widget "+ tempBreakthrough.getRainbow());
        System.out.println("Skill Sample "+ (autoSkillTemp.getSkillSampleTotal()+passiveSkillTemp.getSkillSampleTotal()));
        System.out.println("Skill Pivots "+ (autoSkillTemp.getSkillPivotTotal()+passiveSkillTemp.getSkillPivotTotal()));
        System.out.println("DG Coins "+ ((autoSkillTemp.getDiggCoinsTotal()+passiveSkillTemp.getDiggCoinsTotal())+ (tempBreakthrough.getDiggcoins()) + starsTemp.getDiggcoinsTotal() ));
        System.out.println("EXP Needed "+ levelToNext(currentLevel,goalLevel) );
        System.out.println("Fragments "+ starsTemp.getFragmentTotal());
    }
    



}



