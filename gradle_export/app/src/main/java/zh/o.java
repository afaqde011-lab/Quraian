package zh;

import tf.w;
import tf.x;
import tf.y;

public final class o {

    public static final o f17495b = new o(new x(27));

    public static final o f17496c = new o(new y(28));

    public static final o f17497d;

    public final n f17498a;

    static {
        int i10 = 29;
        new o(new x(i10));
        f17497d = new o(new w(i10));
        new o(new y(27));
        int i11 = 28;
        new o(new x(i11));
        new o(new w(i11));
    }

    public o(p pVar) {
        if (qh.a.a()) {
            this.f17498a = new m(pVar, 1);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f17498a = new m(pVar, 0);
        } else {
            this.f17498a = new wb.o(pVar);
        }
    }
}
