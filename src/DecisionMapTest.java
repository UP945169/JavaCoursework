import java.io.FileNotFoundException;
import java.util.Scanner;


public class DecisionMapTest {
    public static void main(String[] args) throws FileNotFoundException{

        DecisionMapv2 DM;

        try {
            DM = new DecisionMapv2();
        }catch (FileNotFoundException FNF){
            System.out.println("FIle not found");
        }
    }
}
