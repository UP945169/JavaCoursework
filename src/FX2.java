import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.concurrent.Task;

import java.io.FileNotFoundException;


public class FX2 extends Application{
    Button right;
    Button left;

    DecisionMap DM;
    DecisionNode node;
    Text desc;
    Text quest;
    Text options;
    Group root;
    Scene scene;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        DM = new DecisionMap();
        node = DM.entryPoint();

        root = new Group();
        scene = new Scene(root, 500, 500);


        stage.setTitle("Java Coursework");

        mapUI();

        right = new Button();
        right.setText("RIGHT");
        right.setTranslateX(300);
        right.setTranslateY(350);


        right.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                node = node.getYesNode();
                Text newQuestion = new Text(node.getYesNode().getOptions());
                newQuestion.setX(100);
                newQuestion.setY(200);



/*                stage.setScene(scene);

                stage.show();*/
            }
        });


        left = new Button();
        left.setText("LEFT");
        left.setTranslateX(250);
        left.setTranslateY(350);

        left.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                node = node.getNoNode();


                mapUI();

                /*
                root.getChildren().addAll(desc,quest,options, right,left);

                stage.setScene(scene);

                stage.show();
                */
            }
        });




        root.getChildren().addAll(desc,quest,options, right,left);

        stage.setScene(scene);

        stage.show();


    }

    public void mapUI(){

        desc = new Text(node.getDescription());
        desc.setX(200);
        desc.setY(250);
        quest = new Text(node.getQuestion());
        quest.setX(200);
        quest.setY(300);
        options = new Text(node.getOptions());
        options.setX(200);
        options.setY(350);
    }

}
