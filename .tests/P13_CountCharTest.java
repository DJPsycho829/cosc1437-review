public class P13_CountCharTest {
    public static void main(String[] args) {
        T.check("countChar(\"banana\", 'a')", 3, () -> P13_CountChar.countChar("banana", 'a'));
        T.check("countChar(\"banana\", 'b')", 1, () -> P13_CountChar.countChar("banana", 'b'));
        T.check("countChar(\"banana\", 'z')", 0, () -> P13_CountChar.countChar("banana", 'z'));
        T.check("countChar(\"\", 'a')", 0, () -> P13_CountChar.countChar("", 'a'));
        T.check("countChar(\"Mississippi\", 's')", 4, () -> P13_CountChar.countChar("Mississippi", 's'));
        T.check("countChar(\"Aardvark\", 'a')", 2, () -> P13_CountChar.countChar("Aardvark", 'a'));
        T.done();
    }
}
