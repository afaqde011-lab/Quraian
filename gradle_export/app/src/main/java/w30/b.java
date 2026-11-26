package w30;

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
                x30.a b = (x30.a) obj2;
                kotlin.jvm.internal.m.e(b, "b");
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, b.a));
            case 1:
                x30.a b2 = (x30.a) obj2;
                kotlin.jvm.internal.m.e(b2, "b");
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, b2.a));
            case 2:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, obj2));
            case 3:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, obj2));
            case 4:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, obj2));
            case 5:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, obj2));
            case 6:
                x30.a b3 = (x30.a) obj2;
                kotlin.jvm.internal.m.e(b3, "b");
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, b3.a));
            default:
                x30.a b4 = (x30.a) obj2;
                kotlin.jvm.internal.m.e(b4, "b");
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, b4.a));
        }
    }
}
