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

    //make a method that adds nodes to linked list
    private void append(DecisionNode newNode){
        //this checks is the head node is null or not
        if(isEmpty() == true){
            this.Head = newNode;
            this.Tail = newNode;
            this.Tail.setLinkedNode(null);
        }

        this.Tail.setLinkedNode(newNode);
        this.Tail = newNode;
    }

    public void createUnorderedList(Scanner dataset){

        dataset.useDelimiter(",");
        do{
            String line = dataset.nextLine();
            DecisionNode node = makeNode(line);
            append(node);
        }
        while (dataset.hasNext());
        {
            dataset.close();
        }
    }

    public DecisionNode entryPoint() {
        return Head;
    }

    private boolean isEmpty() {
        return this.Head == null;
    }

}
