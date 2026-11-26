package y0;

import b2.r;
import b3.n;
import v2.c0;

public abstract class b {

    public static final n f16582a;

    static {
        float f3 = 40;
        float f10 = 10;
        f16582a = new n(f10, f3, f10, f3);
    }

    public static final r a(r rVar, boolean z10, boolean z11, u00.a aVar) {
        if (!z10 || !d.f16583a) {
            return rVar;
        }
        if (z11) {
            rVar = rVar.V(new c0(f16582a));
        }
        return rVar.V(new a(aVar));
    }
}
