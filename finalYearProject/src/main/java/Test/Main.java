package Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
private static List<Doll> dolls = new ArrayList<>();
private static List<LevelTable> levels = new ArrayList<>();
private static List<Skill> skillTable = new ArrayList<>();
private static List<Images> roleImage = new ArrayList<>();
private static List<DollAlgorithmTable> dollAlgorithmTable = new ArrayList<>();
private static List<Images> algorithmImages = new ArrayList<>();
private static List<Stars> starTable = new ArrayList<>();
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

            String star = values[0];
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
        }





    }




}



