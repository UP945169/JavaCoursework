import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    JFrame window;
    JPanel title, Start, mainTextPanel, choiceButtonPanel;
    JLabel titleName;
    JButton StartButton, RIGHT, LEFT;
    JTextArea mainTextArea;

    TitleScreenHandler TSH = new TitleScreenHandler();
    public static void main(String[] args) {
        new Game();
    }
    public Game(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        window.getContentPane();

        title = new JPanel();
        title.setBounds(100,100,600, 150);
        title.setBackground(Color.BLACK);
        window.add(title);

        titleName = new JLabel("Monster Hunt");
        titleName.setForeground(Color.white);

        Start = new JPanel();
        Start.setBounds(300,400, 200,100);
        Start.setBackground(Color.BLACK);

        StartButton = new JButton("start");
        StartButton.setBackground(Color.BLACK );
        StartButton.setForeground(Color.white);
        StartButton.addActionListener(TSH);
        Start.add(StartButton);
        window.add(Start);
        title.add(titleName);
        window.add(title);
    }

    public void createGameScreen(){

        title.setVisible(false);
        Start.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.blue);
        window.add(mainTextPanel);

        //so main text area is where all the text goes
        mainTextArea = new JTextArea("Hello");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLUE);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.red);
        window.add(choiceButtonPanel);


        RIGHT = new JButton("RIGHT");
        RIGHT.setBackground(Color.BLACK);
        RIGHT.setForeground(Color.white);
        choiceButtonPanel.add(RIGHT);

        LEFT = new JButton("LEFT");
        LEFT.setBackground(Color.BLACK);
        LEFT.setForeground(Color.white);
        choiceButtonPanel.add(LEFT);
    }

    public class TitleScreenHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            createGameScreen();
        }
    }

}
