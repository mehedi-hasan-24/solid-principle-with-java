package dip.not;
// Understand the concept of DI, IoC, DIP
// https://medium.com/@inzuael/solid-dependency-inversion-principle-part-5-f5bec43ab22e
class ConsoleLogger {
    public void log(String message) {
        System.out.println("Console log: " + message);
    }
}

class OrderProcessor {
    private final ConsoleLogger logger = new ConsoleLogger();

    public void processOrder() {
        logger.log("Processing order...");
        // order processing logic
    }
}

