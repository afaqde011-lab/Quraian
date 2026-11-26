package y30;

import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

public final class b extends n implements u00.n {
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public final int A;

    static {
        int i = 2;
        B = new b(i, 0);
        C = new b(i, 1);
        D = new b(i, 2);
        E = new b(i, 3);
    }

    public b(int i, int i2) {
        super(i);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                m.e((a) obj, "<anonymous parameter 0>");
                m.e((a) obj2, "<anonymous parameter 1>");
                break;
            case 1:
                m.e((a) obj, "<anonymous parameter 0>");
                m.e((a) obj2, "<anonymous parameter 1>");
                break;
            case 2:
                m.e((a) obj, "<anonymous parameter 0>");
                m.e((a) obj2, "<anonymous parameter 1>");
                break;
            default:
                m.e((a) obj, "<anonymous parameter 0>");
                m.e((a) obj2, "<anonymous parameter 1>");
                break;
        }
        return Boolean.TRUE;
    }
}
