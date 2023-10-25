package factory_method;

public class DemoFactoryMethod {

    private static Dialog  dialog;

    static void configure(){
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog=new WindowDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderButton();
    }

    public void testFactoryMethod(){
        configure();
        runBusinessLogic();
    }
}
