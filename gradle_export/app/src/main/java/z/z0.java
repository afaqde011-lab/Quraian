package z;

import android.view.View;
import android.widget.Magnifier;
import b3.j2;
import b3.v1;

public final class z0 extends b2.q implements b3.p, b3.o, j2, v1 {
    public u00.k O;
    public u00.k P;
    public l1 W;
    public View X;
    public y3.c Y;
    public wi.b Z;

    public l1.w f16989b0;

    public y3.l f16991d0;

    public c40.h f16992e0;
    public float Q = Float.NaN;
    public boolean R = true;
    public long S = 9205357640488583168L;
    public float T = Float.NaN;
    public float U = Float.NaN;
    public boolean V = true;

    public final l1.i1 f16988a0 = new l1.i1(null, l1.c.D);

    public long f16990c0 = 9205357640488583168L;

    public z0(u00.k kVar, u00.k kVar2, l1 l1Var) {
        this.O = kVar;
        this.P = kVar2;
        this.W = l1Var;
    }

    public final long B1() {
        if (this.f16989b0 == null) {
            this.f16989b0 = l1.q.r(new x0(this, 2));
        }
        l1.w wVar = this.f16989b0;
        if (wVar != null) {
            return ((h2.b) wVar.getValue()).f6544a;
        }
        return 9205357640488583168L;
    }

    public final void C1() {
        wi.b bVar;
        wi.b bVar2 = this.Z;
        if (bVar2 != null) {
            ((Magnifier) bVar2.B).dismiss();
        }
        View viewA = this.X;
        if (viewA == null) {
            viewA = b3.m.A(this);
        }
        this.X = viewA;
        y3.c cVar = this.Y;
        if (cVar == null) {
            cVar = b3.m.y(this).Z;
        }
        this.Y = cVar;
        l1 l1Var = this.W;
        boolean z10 = this.R;
        long j9 = this.S;
        float f3 = this.T;
        float f10 = this.U;
        boolean z11 = this.V;
        float f11 = this.Q;
        l1Var.getClass();
        if (z10) {
            bVar = new wi.b(new Magnifier(viewA), 10);
        } else {
            long jB1 = cVar.b1(j9);
            float fA0 = cVar.A0(f3);
            float fA1 = cVar.A0(f10);
            Magnifier.Builder builder = new Magnifier.Builder(viewA);
            if (jB1 != 9205357640488583168L) {
                builder.setSize(w00.a.F(Float.intBitsToFloat((int) (jB1 >> 32))), w00.a.F(Float.intBitsToFloat((int) (jB1 & 4294967295L))));
            }
            if (!Float.isNaN(fA0)) {
                builder.setCornerRadius(fA0);
            }
            if (!Float.isNaN(fA1)) {
                builder.setElevation(fA1);
            }
            if (!Float.isNaN(f11)) {
                builder.setInitialZoom(f11);
            }
            builder.setClippingEnabled(z11);
            bVar = new wi.b(builder.build(), 10);
        }
        this.Z = bVar;
        E1();
    }

    public final void D1() {
        y3.c cVar = this.Y;
        if (cVar == null) {
            cVar = b3.m.y(this).Z;
            this.Y = cVar;
        }
        long j9 = ((h2.b) this.O.invoke(cVar)).f6544a;
        if ((j9 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & B1()) == 9205357640488583168L) {
            this.f16990c0 = 9205357640488583168L;
            wi.b bVar = this.Z;
            if (bVar != null) {
                ((Magnifier) bVar.B).dismiss();
                return;
            }
            return;
        }
        this.f16990c0 = h2.b.f(B1(), j9);
        if (this.Z == null) {
            C1();
        }
        wi.b bVar2 = this.Z;
        if (bVar2 != null) {
            long j10 = this.f16990c0;
            float f3 = this.Q;
            Magnifier magnifier = (Magnifier) bVar2.B;
            if (!Float.isNaN(f3)) {
                magnifier.setZoom(f3);
            }
            if ((9223372034707292159L & 9205357640488583168L) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (9205357640488583168L >> 32)), Float.intBitsToFloat((int) (4294967295L & 9205357640488583168L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            }
        }
        E1();
    }

    public final void E1() {
        y3.c cVar;
        wi.b bVar = this.Z;
        if (bVar == null || (cVar = this.Y) == null) {
            return;
        }
        if (y3.l.a(this.f16991d0, bVar.a())) {
            return;
        }
        u00.k kVar = this.P;
        if (kVar != null) {
            kVar.invoke(new y3.h(cVar.t(kh.n.m0(bVar.a()))));
        }
        this.f16991d0 = new y3.l(bVar.a());
    }

    @Override
    public final void J0() {
        b3.m.t(this, new x0(this, 0));
    }

    @Override
    public final void W(b3.p1 p1Var) {
        this.f16988a0.setValue(p1Var);
    }

    @Override
    public final void i(b3.o0 o0Var) {
        o0Var.a();
        c40.h hVar = this.f16992e0;
        if (hVar != null) {
            hVar.j(g00.b0.a);
        }
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        a0Var.a(a1.f16893a, new x0(this, 1));
    }

    @Override
    public final void t1() {
        J0();
        this.f16992e0 = ri.t1.b(0, 7, null);
        a40.c0.y(p1(), (k00.i) null, a40.a0.D, new l6.d(this, null, 27), 1);
    }

    @Override
    public final void u1() {
        wi.b bVar = this.Z;
        if (bVar != null) {
            ((Magnifier) bVar.B).dismiss();
        }
        this.Z = null;
    }
}
