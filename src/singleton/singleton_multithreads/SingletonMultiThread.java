package singleton.singleton_multithreads;

public class SingletonMultiThread {
    private static SingletonMultiThread instance;
    public String value;

    private SingletonMultiThread(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonMultiThread getInstance(String value) {
        if (instance == null) {
            instance = new SingletonMultiThread(value);
        }
        return instance;
    }
}
