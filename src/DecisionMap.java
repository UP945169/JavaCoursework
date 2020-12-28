import java.io.*;
import java.util.Scanner;


import static java.lang.Integer.*;

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

    private DecisionNode makeNode(String line){
        String[] stringOfArrays = line.split(",");
        DecisionNode node = new DecisionNode();

        node.setNodeID(valueOf(stringOfArrays[0]));
        node.setYesID(valueOf(stringOfArrays[1]));
        node.setNoID(valueOf(stringOfArrays[2]));

        node.setDescription(stringOfArrays[3]);
        node.setQuestion(stringOfArrays[4]);

        return node;
    }

    

}
