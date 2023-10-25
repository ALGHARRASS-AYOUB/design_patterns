package factory_method;

public class HTMLButton implements Button{


    @Override
    public void render() {
        System.out.println("<Button> click me </Button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("clicked button. hello the f work");
    }
}
