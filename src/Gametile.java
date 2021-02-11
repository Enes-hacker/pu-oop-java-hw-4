package Game;
import java.awt.*;

public class Gametile {
    public static final int TILE_SIZE = 100;
    private int row;
    private int col;
    private int tileSize;

    public Gametile(int row, int col, int tileSize) {
        this.row = row;
        this.col = col;
        this.tileSize = 100;
    }
    public void render(Graphics g) {

        int tileX = this.col*this.tileSize;
        int tileY = this.row*this.tileSize;

        g.setColor(Color.red);
        g.fillRect(tileX, tileY, this.tileSize, tileSize);
    }
}
