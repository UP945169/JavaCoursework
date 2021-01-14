import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.text.Text;
import javafx.stage.Stage;



public class FX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        DecisionMap DM = new DecisionMap();
        DecisionNode node = DM.entryPoint();
        stage.setTitle("Java Coursework");

            Text desc = new Text(node.getDescription());
            desc.setX(200);
            desc.setY(250);
            Text quest = new Text(node.getQuestion());
            quest.setX(200);
            quest.setY(300);

            Button Right = new Button("RIGHT");
            Right.setTranslateX(300);
            Right.setTranslateY(350);
            Right.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      node.getYesNode();
                  }
            });

            Button Left = new Button("LEFT");
            Left.setTranslateX(150);
            Left.setTranslateY(350);
            Right.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    node.getNoNode();
                }
            });

            Group root = new Group();
            Scene scene = new Scene(root, 500, 500);
            root.getChildren().addAll(desc,quest,Right,Left);

            stage.setScene(scene);


            stage.show();
        }



}
