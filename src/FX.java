import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;


public class FX extends Application implements EventHandler<ActionEvent>{
    Button right;
    Button left;

    DecisionNode node;
    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        DecisionMap DM = new DecisionMap();

        node = DM.entryPoint();
        stage.setTitle("Java Coursework");

        while (node != null){
            Text desc = new Text(node.getDescription());
            desc.setX(200);
            desc.setY(250);
            Text quest = new Text(node.getQuestion());
            quest.setX(200);
            quest.setY(300);
            Text options = new Text(node.getOptions());
            options.setX(200);
            options.setY(350);

            right = new Button();
            right.setText("RIGHT");
            right.setTranslateX(300);
            right.setTranslateY(350);

            left = new Button();
            left.setText("LEFT");

            Group root = new Group();
            Scene scene = new Scene(root, 500, 500);
            root.getChildren().addAll(desc,quest,options, right);

            stage.setScene(scene);

            stage.show();
        }
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == right){
            node = node.getYesNode();
        }
        if(event.getSource() == left){
            node = node.getYesNode();
        }
    }
}
