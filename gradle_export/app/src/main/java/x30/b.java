package x30;

import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

public final class b extends n implements u00.n {
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public final int A;

    static {
        int i = 2;
        B = new b(i, 0);
        C = new b(i, 1);
        D = new b(i, 2);
        E = new b(i, 3);
        F = new b(i, 4);
        G = new b(i, 5);
        H = new b(i, 6);
        I = new b(i, 7);
    }

    public b(int i, int i2) {
        super(i);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                a a = (a) obj;
                a b = (a) obj2;
                m.e(a, "a");
                m.e(b, "b");
                return Boolean.valueOf(m.a(a.a, b.a));
            case 1:
                a a2 = (a) obj;
                a b2 = (a) obj2;
                m.e(a2, "a");
                m.e(b2, "b");
                return Boolean.valueOf(m.a(a2.a, b2.a));
            case 2:
                a a3 = (a) obj;
                m.e(a3, "a");
                return Boolean.valueOf(m.a(a3.a, obj2));
            case 3:
                a a4 = (a) obj;
                m.e(a4, "a");
                return Boolean.valueOf(m.a(a4.a, obj2));
            case 4:
                a a5 = (a) obj;
                a b3 = (a) obj2;
                m.e(a5, "a");
                m.e(b3, "b");
                return Boolean.valueOf(m.a(a5.a, b3.a));
            case 5:
                a a6 = (a) obj;
                a b4 = (a) obj2;
                m.e(a6, "a");
                m.e(b4, "b");
                return Boolean.valueOf(m.a(a6.a, b4.a));
            case 6:
                a a7 = (a) obj;
                m.e(a7, "a");
                return Boolean.valueOf(m.a(a7.a, obj2));
            default:
                a a8 = (a) obj;
                m.e(a8, "a");
                return Boolean.valueOf(m.a(a8.a, obj2));
        }
    }
}
