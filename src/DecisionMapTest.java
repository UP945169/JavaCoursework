import java.io.FileNotFoundException;
import java.util.Scanner;


public class DecisionMapTest {

    public static void main(String[] args) throws FileNotFoundException{

        DecisionMapv2 DM = new DecisionMapv2();

        try {
            DM = new DecisionMapv2();
        }catch (FileNotFoundException FNF){
            System.out.println("FIle not found");
        }

        //navigateMap(DM);

        compileLine(DM);
    }

    public static void navigateMap(DecisionMapv2 DM) throws FileNotFoundException {
        DecisionNode node = DM.entryPoint();

        while(node != null){



            if (node.getDescription() == "-"){
                System.out.println(node.getQuestion());
            }
            else if(node.getQuestion() == "-"){
                System.out.println(node.getDescription());
            }
            else{
                System.out.println(node.getDescription());
                System.out.println(node.getQuestion());
            }


        }

    }

    public static void compileLine(DecisionMapv2 DM){
        DecisionNode node = DM.entryPoint();

        System.out.println("---------------");
        System.out.println(node.getDescription());
        System.out.println(node.getQuestion());

        System.out.println("OPTIONS");

        

    }
}
