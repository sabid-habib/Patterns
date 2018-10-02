public abstract class AbstractChecker {
    protected AbstractChecker checker;

    public void setNextChecker(AbstractChecker checker){
        this.checker=checker;
    }

    public void check(){
        if (checker != null) {
            if(checker.checkInt()) write();
            else checker.check();
        }
    }

    abstract protected boolean checkInt();

    abstract protected void write();
}
