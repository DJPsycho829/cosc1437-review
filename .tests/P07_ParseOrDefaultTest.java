public class P07_ParseOrDefaultTest {
    public static void main(String[] args) {
        T.check("parseOrDefault(\"42\", 0)", 42, () -> P07_ParseOrDefault.parseOrDefault("42", 0));
        T.check("parseOrDefault(\"-7\", 0)", -7, () -> P07_ParseOrDefault.parseOrDefault("-7", 0));
        T.check("parseOrDefault(\"4x2\", -1)", -1, () -> P07_ParseOrDefault.parseOrDefault("4x2", -1));
        T.check("parseOrDefault(\"42.5\", 99)", 99, () -> P07_ParseOrDefault.parseOrDefault("42.5", 99));
        T.check("parseOrDefault(\"\", 5)", 5, () -> P07_ParseOrDefault.parseOrDefault("", 5));
        T.check("parseOrDefault(null, 3)", 3, () -> P07_ParseOrDefault.parseOrDefault(null, 3));
        T.done();
    }
}
