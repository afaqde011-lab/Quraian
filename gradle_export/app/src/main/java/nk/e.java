package nk;

import b2.q;
import b3.o;
import b3.o0;
import i2.b0;
import i2.k0;
import i2.l0;
import i2.p;
import i2.s;
import i2.y;
import jk.k;
import jk.l;
import kotlin.NoWhenBranchMatchedException;
import y3.m;

public final class e extends q implements o {
    public l O;
    public u00.a P;
    public l2.b Q;
    public i2.g S;
    public final i2.e R = b0.g();
    public float T = Float.NaN;

    public e(l lVar, u00.a aVar) {
        this.O = lVar;
        this.P = aVar;
    }

    @Override
    public final void i(o0 o0Var) throws NoWhenBranchMatchedException {
        i2.g gVarA;
        k2.b bVar = o0Var.A;
        o0Var.a();
        a aVar = (a) this.P.invoke();
        if (aVar == null) {
            return;
        }
        long j9 = aVar.f11370b;
        l2.b bVar2 = this.Q;
        if (bVar2 != null) {
            long jB = bVar.b();
            m layoutDirection = o0Var.getLayoutDirection();
            float fA0 = o0Var.A0(aVar.f11369a);
            final float fA1 = o0Var.A0(y3.g.a(j9));
            final float fA2 = o0Var.A0(y3.g.b(j9));
            final l0 l0VarA = ((k) this.O.f8325g).a(jB, layoutDirection, o0Var);
            if (l0VarA instanceof k0) {
                gVarA = this.S;
                if (gVarA == null) {
                    gVarA = i2.j.a();
                    this.S = gVarA;
                }
            } else {
                gVarA = null;
            }
            this.R.e(aVar.f11371c);
            bVar2.f(aVar.f11372d);
            bVar2.g(aVar.f11373e);
            if (this.T != fA0) {
                bVar2.j(fA0 > 0.0f ? new p(fA0, fA0, 3) : null);
                this.T = fA0;
            }
            final i2.g gVar = gVarA;
            k2.d.Z(o0Var, bVar2, new u00.k() {
                public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                    k2.d dVar = (k2.d) obj;
                    kotlin.jvm.internal.m.e(dVar, "$this$record");
                    s sVarN = dVar.G0().n();
                    sVarN.i();
                    l0 l0Var = l0VarA;
                    jk.d.a(sVarN, l0Var, gVar);
                    b0.l(sVarN, l0Var, this.R);
                    float f3 = fA1;
                    float f10 = fA2;
                    sVarN.p(f3, f10);
                    b0.l(sVarN, l0Var, c.f11374a);
                    sVarN.p(-f3, -f10);
                    sVarN.q();
                    return g00.b0.a;
                }
            });
            s sVarN = bVar.B.n();
            sVarN.i();
            jk.d.a(sVarN, l0VarA, gVar);
            rd.a.x(o0Var, bVar2);
            sVarN.q();
        }
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        l2.b bVarC = b3.m.w(this).c();
        bVarC.i(1);
        this.Q = bVarC;
    }

    @Override
    public final void u1() {
        y yVarW = b3.m.w(this);
        l2.b bVar = this.Q;
        if (bVar != null) {
            yVarW.a(bVar);
            this.Q = null;
        }
    }
}
