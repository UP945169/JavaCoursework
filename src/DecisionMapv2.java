import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DecisionMapv2 {

    DecisionNode head;
    DecisionNode tail;

    public DecisionMapv2() throws FileNotFoundException{
        Scanner file = findFile("src/CSVFiles/SimpleMap.csv");

        makeList(file);
        createOrderedMap();
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

    public void makeList(Scanner file){
        file.useDelimiter(",");
        do{
            String line = file.nextLine();
            DecisionNode node = makeNodes(line);
            addNodes(node);
        }
        while (file.hasNext());
            file.close();
    }

    public void addNodes(DecisionNode newNode){
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
            this.tail.setLinkedNode(null);
        }
        this.tail.setLinkedNode(newNode);
        this.tail = newNode;
    }

    private DecisionNode nodeFetch(int NodeID){
        DecisionNode node = head;

        while(node != null){
            if(node.getNodeID() == NodeID){
                break;
            }
            node = node.getLinkedNode();
        }
        return node;
    }

    private void createOrderedMap(){
        if(head == null){
            return;
        }
        else{
            DecisionNode node = head;

            while (node != null){
                int yesID = node.yesID;
                int noID = node.noID;

                DecisionNode YesNode = nodeFetch(yesID);
                DecisionNode NoNode = nodeFetch(noID);

                node = node.getLinkedNode();
            }
        }
    }

    public DecisionNode entryPoint() {
        return head;
    }

    private boolean isEmpty() {
        return this.head == null;
    }

}
