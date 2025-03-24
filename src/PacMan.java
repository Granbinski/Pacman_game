import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import javax.swing.*;

public class PacMan extends JPanel{
    private int rowCount = 21;
    private int columnCount = 19;
    private int tileSize = 32;
    private int boardWidth = columnCount * tileSize;
    private int boardHeight = rowCount * tileSize;

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpimage;
    private Image pacmandowimage;
    private Image pacmanLeftimage;
    private Image pacmanRightimage;

    PacMan(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);

        wallImage = new ImageIcon(getClass().getResource("./wall.png")).getImage();
    }

}
