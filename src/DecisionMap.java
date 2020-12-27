import java.io.*;
import java.util.Scanner;

public class DecisionMap {


    DecisionNode Head;
    DecisionNode Tail;

    DecisionMap() throws FileNotFoundException {
        findFile("src/CSVFiles/SimpleMap.csv");
    }

    public Scanner findFile(String path) throws FileNotFoundException {
        File csvFile = new File(path);

        return new Scanner(csvFile);
    }

    private DecisionMap makeNode(String line){

    }

}
