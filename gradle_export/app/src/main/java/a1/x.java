package a1;

import android.view.autofill.AutofillValue;

public final class x extends b3.l implements b3.j2 {
    public r3.c0 Q;
    public r3.w R;
    public q0.j1 S;
    public boolean T;
    public boolean U;
    public r3.p V;
    public e1.v0 W;
    public r3.j X;
    public g2.t Y;

    public static void E1(q0.j1 j1Var, String str, boolean z10) {
        if (z10) {
            r3.b0 b0Var = j1Var.f12642e;
            q0.r0 r0Var = j1Var.f12657v;
            if (b0Var == null) {
                int length = str.length();
                r0Var.invoke(new r3.w(str, m3.h0.b(length, length), 4));
            } else {
                r3.w wVarD = j1Var.f12641d.d(va.a.S(new r3.d(), new r3.a(str, 1)));
                b0Var.a(null, wVarD);
                r0Var.invoke(wVarD);
            }
        }
    }

    @Override
    public final boolean i1() {
        return true;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        boolean z10 = this.U;
        m3.h hVar = this.R.f13099a;
        a10.w[] wVarArr = j3.y.f8004a;
        j3.z zVar = j3.w.F;
        a10.w[] wVarArr2 = j3.y.f8004a;
        a10.w wVar = wVarArr2[18];
        a0Var.a(zVar, hVar);
        m3.h hVar2 = this.Q.f13065a;
        j3.z zVar2 = j3.w.G;
        a10.w wVar2 = wVarArr2[19];
        a0Var.a(zVar2, hVar2);
        long j9 = this.R.f13100b;
        j3.z zVar3 = j3.w.H;
        a10.w wVar3 = wVarArr2[20];
        a0Var.a(zVar3, new m3.q0(j9));
        j3.y.d(a0Var, c2.k.f2615a);
        j3.y.g(a0Var, new c2.f(AutofillValue.forText(this.R.f13099a)));
        int i10 = 0;
        j3.y.b(a0Var, new v(this, i10));
        int i11 = this.X.f13076d;
        if (i11 == 6) {
            c2.m.f2621a.getClass();
            j3.y.f(a0Var, c2.l.f2619c);
        } else if (i11 == 7 || i11 == 8) {
            c2.m.f2621a.getClass();
            j3.y.f(a0Var, c2.l.f2618b);
        } else if (i11 == 4) {
            c2.m.f2621a.getClass();
            j3.y.f(a0Var, c2.l.f2620d);
        }
        boolean z11 = this.T;
        g00.b0 b0Var = g00.b0.a;
        if (!z11) {
            a0Var.a(j3.w.f7987j, b0Var);
        }
        if (z10) {
            a0Var.a(j3.w.N, b0Var);
        }
        boolean z12 = this.T;
        j3.z zVar4 = j3.w.Q;
        a10.w wVar4 = wVarArr2[28];
        a0Var.a(zVar4, Boolean.valueOf(z12));
        j3.y.a(a0Var, new v(this, 1));
        int i12 = 2;
        if (z12) {
            a0Var.a(j3.n.f7950k, new j3.a(null, new v(this, i12)));
            a0Var.a(j3.n.f7952o, new j3.a(null, new v(this, a0Var)));
        }
        a0Var.a(j3.n.f7949j, new j3.a(null, new w(this, i10)));
        j3.y.c(a0Var, this.X.f13077e, new u(this, 6));
        a0Var.a(j3.n.f7941b, new j3.a(null, new u(this, 7)));
        a0Var.a(j3.n.f7942c, new j3.a(null, new u(this, 1)));
        if (!m3.q0.d(this.R.f13100b) && !z10) {
            a0Var.a(j3.n.f7954q, new j3.a(null, new u(this, 2)));
            if (this.T) {
                a0Var.a(j3.n.f7955r, new j3.a(null, new u(this, 3)));
            }
        }
        if (this.T) {
            a0Var.a(j3.n.f7956s, new j3.a(null, new u(this, 5)));
        }
    }
}
