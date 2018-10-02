public class ChainDemo {

    private static AbstractChecker getChainOfCheckers(){

        AbstractChecker errorLogger = new FirstHalfChecker(AbstractLogger.ERROR);
        AbstractChecker fileLogger = new FirstQuarterChecker(AbstractLogger.DEBUG);
        AbstractChecker consoleLogger = new ThirdQuarterChecker(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractChecker checkerChain = getChainOfCheckers();

        checkerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        checkerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        checkerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
