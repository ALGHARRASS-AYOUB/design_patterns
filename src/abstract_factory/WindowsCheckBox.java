package abstract_factory;

public class WindowsCheckBox extends CheckBox{
    @Override
    public void renderCheckBox() {
        System.out.println("this is a windows Checkbox");
    }
}
