package h0;

public final class w {

    public static final w f6474a = new w();

    public static b2.r a(b2.r rVar, float f3) {
        if (f3 <= 0.0d) {
            i0.a.a("invalid weight; must be greater than zero");
        }
        if (f3 > Float.MAX_VALUE) {
            f3 = Float.MAX_VALUE;
        }
        return rVar.V(new c1(f3, true));
    }
}
