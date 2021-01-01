import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecisionMapv2 {

    public DecisionMapv2() throws FileNotFoundException{
        findFile("src/CSVFiles/SimpleMap.csv");

        makeNodes()
    }


    //find file works
    public Scanner findFile(String path) throws FileNotFoundException {
        File CSV = new File(path);

        return new Scanner(CSV);
    }

    public DecisionNode makeNodes(String line){
        //split up line
        String[] lineArray = line.split(",");
        DecisionNode node = new DecisionNode();

        node.setNodeID(parseInt(lineArray[0]));
        node.setYesID(parseInt(lineArray[1]));
        node.setNoID(parseInt(lineArray[2]));
        node.setDescription(lineArray[3]);
        node.setQuestion(lineArray[4]);

        return node;
    }

    public void makeList(){

    }
}
