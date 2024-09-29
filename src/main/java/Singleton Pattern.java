class Logger {
    private static Logger instance;

    private Logger() { }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

// Test class
public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        // Both logger1 and logger2 point to the same instance
        System.out.println(logger1 == logger2);  // true
    }
}
