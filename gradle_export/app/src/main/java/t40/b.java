package t40;

import a1.i;
import android.graphics.Rect;
import ca.v;
import hf.c;
import i2.b0;
import k2.d;
import k2.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l1.z0;
import u00.k;
import z2.a0;

public final class b extends n implements k {
    public final int A;
    public final z0 B;

    public b(z0 z0Var, int i) {
        super(1);
        this.A = i;
        this.B = z0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                a0 it = (a0) obj;
                m.e(it, "it");
                this.B.setValue(new Rect(0, 0, (int) (it.p() >> 32), (int) (it.p() & 4294967295L)));
                break;
            default:
                d Canvas = (d) obj;
                m.e(Canvas, "$this$Canvas");
                for (u40.a aVar : (Iterable) this.B.getValue()) {
                    i iVarG0 = Canvas.G0();
                    long jQ = iVarG0.q();
                    iVarG0.n().i();
                    c cVar = (c) iVarG0.B;
                    float f = aVar.f;
                    float f2 = aVar.d;
                    float f3 = aVar.b;
                    float f4 = aVar.c;
                    float f5 = aVar.a;
                    float f6 = 2;
                    float f7 = f4 / f6;
                    float f8 = f7 + f5;
                    cVar.F(f, ab.a0.d(f8, (f2 / f6) + f3));
                    cVar.H(aVar.g, 1.0f, ab.a0.d(f8, f3));
                    w40.c cVar2 = aVar.h;
                    m.e(cVar2, "<this>");
                    int i = aVar.e;
                    if (cVar2.equals(w40.a.a)) {
                        d.M(Canvas, b0.c(i), f7, ab.a0.d(f8, f3 + f7), 0, 120);
                    } else if (cVar2.equals(w40.b.a)) {
                        d.R(Canvas, b0.c(i), ab.a0.d(f5, f3), v.i(f4, f2), 0.0f, (h) null, 0, 120);
                    }
                    w.c.t(iVarG0, jQ);
                }
                break;
        }
        return g00.b0.a;
    }
}
