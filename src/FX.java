import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;


public class FX extends Application{
    Button right;
    Button left;

    DecisionMap DM;
    DecisionNode node;
    Text desc;
    Text quest;
    Text options;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        DM = new DecisionMap();
        node = DM.entryPoint();

        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);


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
                mapUI();
                root.getChildren().addAll(desc,quest,options, right,left);

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
                root.getChildren().addAll(desc,quest,options, right,left);

/*                stage.setScene(scene);

                stage.show();*/
            }
        });


        root.getChildren().addAll(desc,quest,options, right,left);

        stage.setScene(scene);

        stage.show();

/*            stage.EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e) {
                    if (e.getSource() == right) {
                        node = node.getYesNode();
                    }
                    if (e.getSource() == left) {
                        node = node.getNoNode();
                    }
                }
            };

            // when button is pressed
            right.setOnAction(event);
            left.setOnAction(event);*/


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
