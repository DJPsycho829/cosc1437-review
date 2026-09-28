public class P08_SlicesPerPersonTest {
    public static void main(String[] args) {
        T.check("slicesPerPerson(8, 3)", 2, () -> P08_SlicesPerPerson.slicesPerPerson(8, 3));
        T.check("slicesPerPerson(12, 4)", 3, () -> P08_SlicesPerPerson.slicesPerPerson(12, 4));
        T.check("slicesPerPerson(0, 5)", 0, () -> P08_SlicesPerPerson.slicesPerPerson(0, 5));
        T.throwsEx("slicesPerPerson(8, 0)", IllegalArgumentException.class, () -> P08_SlicesPerPerson.slicesPerPerson(8, 0));
        T.throwsEx("slicesPerPerson(8, -2)", IllegalArgumentException.class, () -> P08_SlicesPerPerson.slicesPerPerson(8, -2));
        T.throwsEx("slicesPerPerson(-1, 4)", IllegalArgumentException.class, () -> P08_SlicesPerPerson.slicesPerPerson(-1, 4));
        T.done();
    }
}
