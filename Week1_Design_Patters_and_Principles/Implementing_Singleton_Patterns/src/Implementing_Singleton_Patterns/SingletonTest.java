package Implementing_Singleton_Patterns;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verify that both logger1 and logger2 are the same instance
        System.out.println("Are both loggers the same instance? " + (logger1 == logger2));
    }
}
