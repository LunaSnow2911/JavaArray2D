import java.awt.Dimension;

import javax.swing.JFrame;

public class GuiMain extends JFrame {
    Panel mainPanel;

    public GuiMain() {
        mainPanel = new Panel();
        add(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new GuiMain();
    }
}
