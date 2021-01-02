import java.io.FileNotFoundException;
import java.util.Scanner;


public class DecisionMapTest {
    public static void main(String[] args) throws FileNotFoundException{

        DecisionMap DM;

        try {
            DM = new DecisionMap();
        }catch (FileNotFoundException FNF){
            System.out.println("FIle not found");
        }
    }
}
