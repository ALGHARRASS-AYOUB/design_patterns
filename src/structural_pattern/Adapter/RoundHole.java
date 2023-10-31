package structural_pattern.Adapter;

public class RoundHole {
    private double radius;

    RoundHole(double radius){
        this.radius=radius;
    }
    public RoundHole(){}

    public double getRaduis(){
        return  this.radius;
    }

    public boolean fits(RoundPeg peg){
        return (peg.getRaduis()>=this.radius -1 && peg.getRaduis()<=this.radius+1)?true:false;
    }
}
