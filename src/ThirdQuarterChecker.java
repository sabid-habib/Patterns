public class ThirdQuarterChecker extends AbstractChecker {
    @Override
    protected boolean checkInt(int incoming) {
        if (incoming >= 51 && incoming <= 75) {
            return true;
        }
        return false;
    }

    @Override
    protected void write() {
        System.out.println("It's in third quarter");
    }
}
