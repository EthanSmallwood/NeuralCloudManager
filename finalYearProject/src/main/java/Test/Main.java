package Test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
private static List<Doll> dolls = new ArrayList<>();
private static List<LevelTable> levels = new ArrayList<>();
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
    public static void main(String[] args) {

        // print out all dolls
        //for (Doll doll : dolls) {
        //    System.out.println(doll);
        //}

        // print out all levels
        for (LevelTable level : levels) {
            System.out.println(level);
        }
    }




}



