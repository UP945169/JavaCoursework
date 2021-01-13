import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.io.FileNotFoundException;

public class DecisionMapUI extends Application{

    DecisionMap DM = new DecisionMap();

    public DecisionMapUI() throws FileNotFoundException {
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaCoursework");

        Button button = new Button();

        button.setText("Left");

        button.setTranslateX(100);
        button.setTranslateY(500);

        Button button2 = new Button();

        button2.setText("Right");

        button2.setTranslateX(200);
        button2.setTranslateY(500);


        Group root = new Group(button,button2);
        Scene scene = new Scene(root, 1024, 768, Color.BEIGE);

        stage.setScene(scene);
        stage.show();
    }
}
