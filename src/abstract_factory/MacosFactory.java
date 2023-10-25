package abstract_factory;

public class MacosFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacosButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacosCheckBox();
    }
}
