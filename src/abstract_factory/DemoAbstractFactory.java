package abstract_factory;

public class DemoAbstractFactory {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacosFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public void testAbstractFactory(){
        Application app=configureApplication();
        app.render();
    }




}
