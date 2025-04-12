public class C2ToC3Adapter {

    // Metodă statică care face conversia de la C2Nr la C3Nr
    public static C3Nr convert(C2Nr c2Nr) {
        return new C3Nr(c2Nr.getN1(), c2Nr.getN2(), 0); // al treilea număr este 0
    }
}