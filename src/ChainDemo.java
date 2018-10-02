public class ChainDemo {

    private static AbstractChecker getChainOfCheckers(){

        AbstractChecker firstHalf = new FirstHalfChecker();
        AbstractChecker firstQuarter = new FirstQuarterChecker();
        AbstractChecker thirdQuarter = new ThirdQuarterChecker();

        firstQuarter.setNextChecker(firstHalf);
        firstHalf.setNextChecker(thirdQuarter);

        return firstQuarter;
    }

    public static void main(String[] args) {
        AbstractChecker checkerChain = getChainOfCheckers();

        System.out.println("Checking 71");
        checkerChain.check(71);

        System.out.println("Checking 21");
        checkerChain.check(21);

        System.out.println("Checking 41");
        checkerChain.check(41);

        System.out.println("Checking 91");
        checkerChain.check(91);
    }
}
