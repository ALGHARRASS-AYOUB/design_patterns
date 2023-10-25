package factory_method;

public abstract class Dialog {

    public void renderButton(){

        Button newbutton=createButton();
        newbutton.render();

    }

    public abstract Button createButton();

}
