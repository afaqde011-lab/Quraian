package jv;

import b2.r;
import g00.b0;
import kotlin.jvm.internal.m;
import u00.o;
import w.d0;

public final class b implements o {
    public final int A;
    public final u00.a B;
    public final Float C;

    public b(u00.a aVar, Float f, int i) {
        this.A = i;
        this.B = aVar;
        this.C = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        d0 AnimatedVisibility = (d0) obj;
        l1.j jVar = (l1.j) obj2;
        ((Integer) obj3).getClass();
        switch (i) {
            case 0:
                m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                r rVarO = w50.c.o(h0.c.C(b2.o.A, 4), false, null, this.B, 7);
                Float f = this.C;
                ox.a.a(f != null ? f.floatValue() : 0.0f, 0, rVarO, jVar);
                break;
            case 1:
                m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                r rVarO2 = w50.c.o(h0.c.C(b2.o.A, 8), false, null, this.B, 7);
                Float f2 = this.C;
                ox.a.a(f2 != null ? f2.floatValue() : 0.0f, 0, rVarO2, jVar);
                break;
            default:
                m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                r rVarO3 = w50.c.o(h0.c.C(b2.o.A, 8), false, null, this.B, 7);
                Float f3 = this.C;
                ox.a.a(f3 != null ? f3.floatValue() : 0.0f, 0, rVarO3, jVar);
                break;
        }
        return b0.a;
    }
}
