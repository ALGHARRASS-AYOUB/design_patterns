package singleton;

public class Singleton {
    // Private static variable to hold the single instance
    private static Singleton instance;
    private String name;

    // Private constructor to prevent external instantiation
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance(String s) {
        // Lazy initialization: create the instance when it's first requested
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and attributes of the Singleton class can be added here

    public void someMethod() {
        System.out.println("This is a method of the Singleton class.");
    }

    public String getName(){return name;}
}
