import java.awt.*;
import java.io.FileNotFoundException;

public class AWT {
    private static Button right;
    private static Button left;

    public static void application() throws FileNotFoundException {
        right = new Button();
        left = new Button();

        DecisionMap DM;

        DM = new DecisionMap();
        DecisionNode node = DM.entryPoint();

        Frame f = new Frame("Java Coursework");
        f.setSize(500, 500);

        //creating buttons
        right.setLabel("Yes");
        right.setBounds(200, 200, 50, 50);
        f.add(right);

        left.setLabel("NO");
        left.setBounds(100, 200, 50, 50);
        f.add(left);

        Label description = new Label();
        description.setText(node.getDescription());
        description.setBounds(100, 50, 150, 50);
        f.add(description);

        Label question = new Label();
        question.setText(node.getQuestion());
        question.setBounds(100, 75, 150, 50);
        f.add(question);

        Label options = new Label();
        options.setText(node.getOptions());
        options.setBounds(100, 150, 300, 50);
        f.add(options);

        right.addActionListener(e -> {
            f.remove(description);
            f.remove(question);
            f.remove(options);
            Label newDescription = new Label();
            newDescription.setText(node.getYesNode().getDescription());
            newDescription.setBounds(100, 50, 300, 50);
            Label newQuestion = new Label();
            newQuestion.setText(node.getYesNode().getQuestion());
            newQuestion.setBounds(100, 100, 300, 50);
            Label newoptions = new Label();
            newoptions.setText(node.getYesNode().getOptions());
            newoptions.setBounds(100, 150, 300, 50);
            f.add(newDescription);
            f.add(newQuestion);
            f.add(newoptions);
            f.setVisible(true);

        });

        left.addActionListener(e -> {
            f.remove(description);
            f.remove(question);
            f.remove(options);
            Label newDescription = new Label();
            newDescription.setText(node.getNoNode().getDescription());
            newDescription.setBounds(100, 50, 300, 50);
            Label newQuestion = new Label();
            newQuestion.setText(node.getNoNode().getQuestion());
            newQuestion.setBounds(100, 100, 300, 50);
            Label newOptions = new Label();
            newOptions.setText(node.getNoNode().getOptions());
            newOptions.setBounds(100, 150, 300, 50);
            f.add(newDescription);
            f.add(newQuestion);
            f.add(newOptions);
            f.setVisible(true);
        });
        f.setLayout(null);
        f.setVisible(true);
        }



    public static void main(String[] args) throws FileNotFoundException {
        application();
    }
}