package prototype;

public abstract class Shape {

    int x,y;
    String color;

    public Shape(Shape target) {
       if(target!=null) {
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }
    };


    public abstract Shape clone();


}
