import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame window;
    public static void main(String[] args) {
        new Game();
    }
    public void Game(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
    }

}
