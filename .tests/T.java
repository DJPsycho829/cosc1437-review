import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

public class T {
    private static int failures = 0;

    public static void check(String call, Object expected, Supplier<Object> actual) {
        Object got;
        try {
            got = actual.get();
        } catch (StackOverflowError e) {
            fail(call, show(expected), "StackOverflowError (missing or wrong base case?)");
            return;
        } catch (Throwable e) {
            fail(call, show(expected), e.getClass().getSimpleName() + " was thrown");
            return;
        }
        if (!same(expected, got)) {
            fail(call, show(expected), show(got));
        }
    }

    public static Throwable throwsEx(String call, Class<? extends Throwable> type, Runnable action) {
        try {
            action.run();
        } catch (Throwable e) {
            if (type.isInstance(e)) {
                return e;
            }
            fail(call, type.getSimpleName(), e.getClass().getSimpleName());
            return null;
        }
        fail(call, type.getSimpleName(), "no exception");
        return null;
    }

    public static void fail(String call, String expected, String got) {
        failures++;
        if (failures > 1) {
            return;
        }
        System.out.println("  " + call);
        System.out.println("    expected: " + expected);
        System.out.println("    got:      " + got);
    }

    public static char[][] board(String... rows) {
        char[][] b = new char[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            b[i] = rows[i].toCharArray();
        }
        return b;
    }

    public static void done() {
        if (failures > 1) {
            System.out.println("  (" + (failures - 1) + " more failing checks)");
        }
        System.exit(failures == 0 ? 0 : 1);
    }

    private static boolean same(Object expected, Object got) {
        if (expected instanceof Double && got instanceof Double) {
            return Math.abs((Double) expected - (Double) got) < 1e-9;
        }
        if (expected instanceof int[] && got instanceof int[]) {
            return Arrays.equals((int[]) expected, (int[]) got);
        }
        return Objects.equals(expected, got);
    }

    private static String show(Object value) {
        if (value instanceof String) {
            return "\"" + value + "\"";
        }
        if (value instanceof Character) {
            return "'" + value + "'";
        }
        if (value instanceof int[]) {
            return Arrays.toString((int[]) value);
        }
        return String.valueOf(value);
    }
}
