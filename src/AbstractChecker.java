public abstract class AbstractChecker {
    protected AbstractChecker nextChecker;

    public void setNextChecker(AbstractChecker checker) {
        this.nextChecker = checker;
    }

    public void check(int incoming) {
        if (this.checkInt(incoming)) write();
        else if (nextChecker != null) {
            nextChecker.check(incoming);
        }
    }

    abstract protected boolean checkInt(int incoming);

    abstract protected void write();
}
