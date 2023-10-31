package structural_pattern.Adapter;

public class SquarePegAdapter extends RoundPeg {
    SquarePeg peg;

    SquarePegAdapter(SquarePeg peg){
        this.peg=peg;
    }

    @Override
    public double getRaduis(){
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
