package androidx.media3.common;

import android.os.Bundle;

public abstract class g1 {

    public static final String f1213a;

    static {
        String str = e7.i0.f5136a;
        f1213a = Integer.toString(0, 36);
    }

    public static g1 a(Bundle bundle) {
        String str = f1213a;
        int i10 = bundle.getInt(str, -1);
        if (i10 == 0) {
            String str2 = a0.f1061d;
            ta.c0.s(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(a0.f1061d, false) ? new a0(bundle.getBoolean(a0.f1062e, false)) : new a0();
        }
        if (i10 == 1) {
            String str3 = y0.f1683c;
            ta.c0.s(bundle.getInt(str, -1) == 1);
            float f3 = bundle.getFloat(y0.f1683c, -1.0f);
            return f3 == -1.0f ? new y0() : new y0(f3);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException(g4.c.f(i10, "Unknown RatingType: "));
            }
            String str4 = f2.f1206d;
            ta.c0.s(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(f2.f1206d, false) ? new f2(bundle.getBoolean(f2.f1207e, false)) : new f2();
        }
        String str5 = d2.f1167d;
        ta.c0.s(bundle.getInt(str, -1) == 2);
        int i11 = bundle.getInt(d2.f1167d, 5);
        float f10 = bundle.getFloat(d2.f1168e, -1.0f);
        return f10 == -1.0f ? new d2(i11) : new d2(i11, f10);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
