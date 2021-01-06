import java.io.FileNotFoundException;
import java.util.Scanner;


public class DecisionMapTest {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        DecisionMapv2 DM;
        try {
             DM = new DecisionMapv2();
        } catch(FileNotFoundException fe){
            System.out.println("File not file");
        }


    }

    public static void navigateMap(DecisionMapv2 DM){

    }
}
