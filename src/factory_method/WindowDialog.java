package factory_method;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
