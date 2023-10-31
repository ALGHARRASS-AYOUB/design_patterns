package structural_pattern.Adapter;

public class SquarePeg {

    double width;

    SquarePeg(double width){
        this.width=width;
    }
    SquarePeg(){}

    public double getWidth(){return this.width;}
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
