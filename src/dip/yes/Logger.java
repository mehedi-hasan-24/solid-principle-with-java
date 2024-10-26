package dip.yes;

public class Logger {
}

interface ILogger {
    void log(String message);
}

class ConsoleLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("Console log: " + message);
    }
}

class ConsoleLogger1 implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("Console log: " + message);
    }
}

class OrderProcessor {
    
    private final ILogger logger;

    public OrderProcessor(ILogger logger) {
        this.logger = logger;
    }

    public void processOrder() {
        logger.log("Processing order...");
        // order processing logic
    }
}

//What is the advantage while Testing????
//Now we can inject a mock object while testing instead of the real expensive object
