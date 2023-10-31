package structural_pattern.Composite;

import java.awt.*;

public interface Shape {
    public void draw();

    public int getX();
    public int getY();
    public int getWidth();
    public int getHeight();
    public void move(int x, int y) ;
    public boolean isInsideBounds(int x, int y);
    public void select() ;
    public void unSelect();
    public boolean isSelected();

    public void enableSelectionStyle(Graphics graphics);

    public void disableSelectionStyle(Graphics graphics);


    public void paint(Graphics graphics);

}
