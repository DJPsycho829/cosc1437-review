public class P12_HarmonicTest {
    public static void main(String[] args) {
        T.check("harmonic(1)", 1.0, () -> P12_Harmonic.harmonic(1));
        T.check("harmonic(2)", 1.5, () -> P12_Harmonic.harmonic(2));
        T.check("harmonic(3)", 1.0 + 1.0 / 2 + 1.0 / 3, () -> P12_Harmonic.harmonic(3));
        T.check("harmonic(4)", 1.0 + 1.0 / 2 + 1.0 / 3 + 1.0 / 4, () -> P12_Harmonic.harmonic(4));
        T.done();
    }
}
