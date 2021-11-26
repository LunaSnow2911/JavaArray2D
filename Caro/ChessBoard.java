import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

public class ChessBoard extends JPanel {
    private static final int N = 3;
    private static final int M = 3;

    private Image imgX;
    private Image imgO;

    private Cell[][] matrix = new Cell[N][M];

    public ChessBoard() {
        this.initMaxtrix();

        setPreferredSize(new Dimension(300, 300));

        addMouseListener(new MouseInputAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                super.mousePressed(e);
                int x = (e.getX());
                int y = (e.getY());
                // System.out.println(x + " , " + y);
                // if (y < 100) {
                // }
                // find locate x , y in board
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        Cell cell = matrix[i][j];
                        System.out.println(cell.getX() + " " + cell.getY());
                    }
                }
            }
        });

        try {
            imgX = ImageIO.read(getClass().getResource("X.png"));
            imgO = ImageIO.read(getClass().getResource("O.png"));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    private void initMaxtrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Cell cell = new Cell();
                matrix[i][j] = cell;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        int w = getWidth() / 3;
        int h = getHeight() / 3;
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int x = i * w;
                int y = j * h;

                // Update matrix
                Cell cell = matrix[i][j];
                cell.setX(x);
                cell.setY(y);
                cell.setW(w);
                cell.setH(h);

                Color color = k % 2 != 0 ? Color.BLUE : Color.RED;
                Graphics2D graphics2D = (Graphics2D) g;
                graphics2D.setColor(color);
                graphics2D.fillRect(x, y, w, h);

                // Image img = k % 2 == 0 ? imgX : imgO;
                // graphics2D.drawImage(img, x, y, w, h, this);
                k++;
            }
        }

    }
}
