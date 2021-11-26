import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomPane<FlowLayout> extends JPanel {
    public BottomPane() {
        JLabel timLabel = new JLabel("00:00");

        JButton startButton = new JButton("Start");

        add(timLabel);
        add(startButton);

    }
}
