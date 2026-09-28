public class P10_WithdrawTest {
    public static void main(String[] args) {
        T.check("withdraw(100.0, 30.0)", 70.0, () -> P10_Withdraw.withdraw(100.0, 30.0));
        T.check("withdraw(50.0, 50.0)", 0.0, () -> P10_Withdraw.withdraw(50.0, 50.0));
        T.throwsEx("withdraw(100.0, 0.0)", IllegalArgumentException.class, () -> P10_Withdraw.withdraw(100.0, 0.0));
        T.throwsEx("withdraw(100.0, -5.0)", IllegalArgumentException.class, () -> P10_Withdraw.withdraw(100.0, -5.0));
        Throwable e = T.throwsEx("withdraw(20.0, 25.0)", InsufficientFundsException.class, () -> P10_Withdraw.withdraw(20.0, 25.0));
        if (e != null && (e.getMessage() == null || e.getMessage().isEmpty())) {
            T.fail("withdraw(20.0, 25.0)", "InsufficientFundsException with a message", "no message");
        }
        T.done();
    }
}
