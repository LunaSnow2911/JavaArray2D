import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Panel extends JPanel {
    ChessBoard board;
    BottomPane bottom;

    public Panel() {

        BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(box);

        board = new ChessBoard();
        bottom = new BottomPane();
        add(board);
        add(bottom);
    }
}
