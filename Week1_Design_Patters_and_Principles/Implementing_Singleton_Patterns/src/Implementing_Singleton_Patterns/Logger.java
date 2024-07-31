package Implementing_Singleton_Patterns;
public class Logger {
    // Private static instance of the Logger class
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {}

    // Public static method to get the instance of the Logger class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method for logging messages
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
