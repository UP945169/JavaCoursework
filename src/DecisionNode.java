

public class DecisionNode {

    int nodeID;
    int yesID;
    int noID;
    String description;
    String question;


    //the yesNode and noNode is going to be made
    //from the nodeID, yesID, noID, description and question
    //those are the linked nodes
    DecisionNode yesNode;
    DecisionNode noNode;



    DecisionNode linkedNode;

    public DecisionNode() {}

    public DecisionNode getLinkedNode(){
        return linkedNode;
    }
    public void setLinkedNode(DecisionNode linkedNode) {
        this.linkedNode = linkedNode;
    }

    public int getNodeID() {
        return nodeID;
    }
    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }
    public int getYesID(){
        return yesID;
    }
    public void setYesID(int yesID) {
        try{
            this.yesID = yesID;
        }catch (NumberFormatException e){

        }
    }
    public int getNoID() {
        return noID;
    }
    public void setNoID(int noID) {
        try{
            this.noID = noID;
        }catch (NumberFormatException e){

        }
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public DecisionNode getYesNode() {
        return yesNode;
    }
    public void setYesNode(DecisionNode yesNode) {
        this.yesNode = yesNode;
    }
    public DecisionNode getNoNode() {
        return noNode;
    }
    public void setNoNode(DecisionNode noNode) {
        this.noNode = noNode;
    }
}

