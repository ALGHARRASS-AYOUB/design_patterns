package singleton;

public class DemoSingletonSingleThread {

    public static void testDemoSingletonSingleThread() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.getName());
        System.out.println(anotherSingleton.getName());
    }
}
