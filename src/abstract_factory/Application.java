package abstract_factory;

public class Application {
    private Button button;
    private  CheckBox checkBox;

    public Application(GUIFactory factory){

        button=factory.createButton();
        checkBox=factory.createCheckBox();
    }

    public void render(){
        button.renderButton();
        checkBox.renderCheckBox();
    }
}
