package e00;

import a1.v2;
import b3.o0;
import d00.r0;
import i2.y;

public final class w implements c {
    public final d a;

    public w(d dVar) {
        this.a = dVar;
    }

    @Override
    public final void b(o0 o0Var, r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
        d dVar = this.a;
        dVar.i.getClass();
        dVar.m.getClass();
        dVar.l.getClass();
        m kVar = (m) h00.q.N0(dVar.l());
        if (kVar != null) {
            float fK = dVar.k();
            if (Float.isNaN(fK)) {
                fK = 0;
            }
            if (kVar instanceof k) {
                if (Float.isNaN(fK)) {
                    fK = f.a;
                }
                k kVar2 = (k) kVar;
                long j = kVar2.a;
                float fD = i2.t.d(j) * ((fK / 72) + 1);
                if (fD > 1.0f) {
                    fD = 1.0f;
                }
                kVar = new k(i2.t.b(fD, j), kVar2.b);
            }
        } else {
            kVar = null;
        }
        m mVar = kVar;
        if (mVar == null) {
            return;
        }
        float f = dVar.j;
        if (f >= 1.0f) {
            w00.a.q(o0Var, mVar, context, 0L, o0Var.b());
            return;
        }
        y yVarW = b3.m.w(context.a);
        l2.b bVarC = yVarW.c();
        try {
            bVarC.f(f);
            k2.d.Z(o0Var, bVarC, new v2(mVar, context, this));
            rd.a.x(o0Var, bVarC);
        } finally {
            yVarW.a(bVarC);
        }
    }
}
