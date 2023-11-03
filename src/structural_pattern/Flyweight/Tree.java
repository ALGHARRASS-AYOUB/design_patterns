package structural_pattern.Flyweight;

import java.awt.*;

public class Tree {
    int x;
    int y;
    TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x=x;
        this.y=y;
        this.type=type;
    }

    public void draw(Graphics g,int x ,int y) {
        type.draw(g,x,y);
    }
}
