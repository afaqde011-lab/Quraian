package z;

import a1.x1;
import b3.j2;
import b3.o2;
import b3.v1;

public final class g0 extends b3.l implements j2, b3.p, b3.j, v1, o2 {
    public static final l1 W = new l1();
    public f0.i Q;
    public final u00.k R;
    public f0.d S;
    public l0.r0 T;
    public b3.p1 U;
    public final g2.a0 V;

    public g0(f0.i iVar, int i10, u00.k kVar) {
        this.Q = iVar;
        this.R = kVar;
        g2.a0 a0Var = new g2.a0(i10, new av.b(2, this, g0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 9), 10);
        B1(a0Var);
        this.V = a0Var;
    }

    public g0(f0.i iVar, x1 x1Var, int i10) {
        this(iVar, 1, (i10 & 4) != 0 ? null : x1Var);
    }

    public final void E1(f0.i iVar, f0.h hVar) {
        if (!this.N) {
            iVar.b(hVar);
        } else {
            a40.e1 e1Var = p1().A.get(a40.w.B);
            a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new pz.k(iVar, hVar, e1Var != null ? e1Var.f0(new ym.j0(iVar, hVar, 6)) : null, (k00.c) null, 25), 3);
        }
    }

    public final void F1(f0.i iVar) {
        f0.d dVar;
        if (kotlin.jvm.internal.m.a(this.Q, iVar)) {
            return;
        }
        f0.i iVar2 = this.Q;
        if (iVar2 != null && (dVar = this.S) != null) {
            iVar2.b(new f0.e(dVar));
        }
        this.S = null;
        this.Q = iVar;
    }

    @Override
    public final void J0() {
        final kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        final int i10 = 0;
        b3.m.t(this, new u00.a() {
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        zVar.A = b3.m.h((g0) this, z2.j1.f17126a);
                        return g00.b0.a;
                    default:
                        String str = (String) zVar;
                        l40.b bVar = new l40.b((l40.c) this, 0);
                        return ri.t1.l(str, n40.b.c, new n40.e[0], bVar);
                }
            }
        });
        l0.r0 r0Var = (l0.r0) zVar.A;
        if (this.V.G1().a()) {
            l0.r0 r0Var2 = this.T;
            if (r0Var2 != null) {
                r0Var2.b();
            }
            if (r0Var != null) {
                r0Var.a();
            } else {
                r0Var = null;
            }
            this.T = r0Var;
        }
    }

    @Override
    public final void W(b3.p1 p1Var) {
        this.U = p1Var;
        if (this.V.G1().a()) {
            boolean z10 = p1Var.z1().N;
            l1 l1Var = h0.O;
            if (!z10) {
                if (this.N) {
                    b3.m.j(this, l1Var);
                }
            } else {
                b3.p1 p1Var2 = this.U;
                if (p1Var2 != null && p1Var2.z1().N && this.N) {
                    b3.m.j(this, l1Var);
                }
            }
        }
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        boolean zA = this.V.G1().a();
        a10.w[] wVarArr = j3.y.f8004a;
        j3.z zVar = j3.w.l;
        a10.w wVar = j3.y.f8004a[4];
        a0Var.a(zVar, Boolean.valueOf(zA));
        a0Var.a(j3.n.f7960w, new j3.a(null, new pi.c(0, this, g0.class, "requestFocus", "requestFocus()Z", 0, 15)));
    }

    @Override
    public final Object o() {
        return W;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void v1() {
        l0.r0 r0Var = this.T;
        if (r0Var != null) {
            r0Var.b();
        }
        this.T = null;
    }
}
