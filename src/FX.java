import javafx.application.Application;
import javafx.event.ActionEvent;
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

    DecisionNode node;

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        DecisionMap DM = new DecisionMap();
        node = DM.entryPoint();

        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);


        stage.setTitle("Java Coursework");

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

        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                right.setOnAction();
                node = node.getYesNode();
            }
        };

        right.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        right.addEventFilter(ActionEvent.ACTION, EventHandler);

        left = new Button();
        left.setText("LEFT");
        left.setTranslateX(250);
        left.setTranslateY(350);

        left.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                node = node.getNoNode();
            }
        });



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

            root.getChildren().addAll(desc,quest,options, right,left);

            stage.setScene(scene);

            stage.show();
    }
}
