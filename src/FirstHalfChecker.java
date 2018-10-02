public class FirstHalfChecker extends AbstractChecker {
    @Override
    protected boolean checkInt(int incoming) {
        if (incoming >= 1 && incoming <= 50) {
            return true;
        }
        return false;
    }

    @Override
    protected void write() {
        System.out.println("It's in first half");
    }
}
