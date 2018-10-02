public class FirstQuarterChecker extends AbstractChecker {
    @Override
    protected boolean checkInt(int incoming) {
        if (incoming >= 1 && incoming <= 25) {
            return true;
        }
        return false;
    }

    @Override
    protected void write() {
        System.out.println("It's in first quarter");
    }
}
