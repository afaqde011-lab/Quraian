package d0;

import android.view.KeyEvent;
import android.view.ViewConfiguration;

public final class m2 extends o0 implements t2.e, b3.j2 {

    public z.h1 f4450j0;

    public t0 f4451k0;

    public final u2.d f4452l0;

    public final l f4453m0;

    public final u2 f4454n0;

    public final g2 f4455o0;

    public final g2.a0 f4456p0;

    public final i f4457q0;

    public a1.y1 f4458r0;

    public k2 f4459s0;

    public m1 f4460t0;

    public k3 f4461u0;

    public m2(c cVar, t0 t0Var, q1 q1Var, n2 n2Var, f0.i iVar, z.h1 h1Var, boolean z10, boolean z11) {
        super(e2.f4423a, z10, iVar, q1Var);
        this.f4450j0 = h1Var;
        this.f4451k0 = t0Var;
        u2.d dVar = new u2.d();
        this.f4452l0 = dVar;
        l lVar = new l(new x.t(new o10.b(e2.f4426d)));
        this.f4453m0 = lVar;
        z.h1 h1Var2 = this.f4450j0;
        t0 t0Var2 = this.f4451k0;
        u2 u2Var = new u2(n2Var, h1Var2, t0Var2 == null ? lVar : t0Var2, q1Var, z11, dVar, this, new h2(this, 0));
        this.f4454n0 = u2Var;
        g2 g2Var = new g2(u2Var, z10);
        this.f4455o0 = g2Var;
        g2.a0 a0Var = new g2.a0(2, null, 10);
        B1(a0Var);
        this.f4456p0 = a0Var;
        i iVar2 = new i(q1Var, u2Var, z11, cVar, new h2(this, 1));
        B1(iVar2);
        this.f4457q0 = iVar2;
        B1(new u2.i(g2Var, dVar));
        n0.g gVar = new n0.g();
        gVar.O = iVar2;
        B1(gVar);
    }

    @Override
    public final void A(v2.k kVar, v2.l lVar, long j9) {
        int i10;
        int i11;
        ?? r10 = kVar.f15387a;
        int size = r10.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((Boolean) this.R.invoke(new v2.a0(((v2.s) r10.get(i12)).f15407i))).booleanValue()) {
                super.A(kVar, lVar, j9);
                break;
            }
        }
        if (this.U == null) {
            z.j0 j0Var = new z.j0(this);
            B1(j0Var);
            this.U = j0Var;
        }
        if (this.S) {
            v2.l lVar2 = v2.l.A;
            k00.c cVar = null;
            u2 u2Var = this.f4454n0;
            if (lVar == lVar2 && kVar.f15392f == 6) {
                if (this.f4460t0 == null) {
                    this.f4460t0 = new m1(u2Var, new qj.c(ViewConfiguration.get(b3.m.A(this).getContext()), 16), new av.o(2, this, m2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 6), b3.m.y(this).Z);
                }
                m1 m1Var = this.f4460t0;
                if (m1Var != null) {
                    a40.z zVarP1 = p1();
                    if (m1Var.f4449h == null) {
                        m1Var.f4449h = a40.c0.y(zVarP1, (k00.i) null, (a40.a0) null, new a1.d(m1Var, cVar, 27), 3);
                    }
                }
            }
            m1 m1Var2 = this.f4460t0;
            if (m1Var2 != null && kVar.f15392f == 6) {
                int size2 = r10.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        if (lVar == v2.l.A && m1Var2.f4490d) {
                            m1Var2.f(kVar);
                            p1.a(kVar);
                        }
                        if (lVar != v2.l.B || m1Var2.f4490d || !m1Var2.f(kVar)) {
                            break;
                            break;
                            break;
                        } else {
                            p1.a(kVar);
                            break;
                        }
                    }
                    if (((v2.s) r10.get(i13)).b()) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            if (lVar == v2.l.A && ((i11 = kVar.f15392f) == 10 || i11 == 11 || i11 == 12)) {
                if (this.f4461u0 == null) {
                    i10 = 10;
                    this.f4461u0 = new k3(u2Var, new av.o(2, this, m2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 7), b3.m.y(this).Z);
                } else {
                    i10 = 10;
                }
                k3 k3Var = this.f4461u0;
                if (k3Var != null) {
                    a40.z zVarP2 = p1();
                    if (k3Var.f4443g == null) {
                        k3Var.f4443g = a40.c0.y(zVarP2, (k00.i) null, (a40.a0) null, new a1.g(k3Var, null), 3);
                    }
                }
            } else {
                i10 = 10;
            }
            k3 k3Var2 = this.f4461u0;
            if (k3Var2 != null) {
                int i14 = kVar.f15392f;
                if (i14 == i10 || i14 == 11 || i14 == 12) {
                    int size3 = r10.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        if (((v2.s) r10.get(i15)).b()) {
                            return;
                        }
                    }
                    if (lVar == v2.l.A && k3Var2.f4490d) {
                        k3Var2.d(kVar);
                        p1.a(kVar);
                    }
                    if (lVar == v2.l.B && !k3Var2.f4490d && k3Var2.d(kVar)) {
                        p1.a(kVar);
                    }
                }
            }
        }
    }

    @Override
    public final Object I1(n0 n0Var, n0 n0Var2) {
        z.b1 b1Var = z.b1.B;
        u2 u2Var = this.f4454n0;
        Object objF = u2Var.f(b1Var, new a1.e2(n0Var, u2Var, (k00.c) null, 16), n0Var2);
        return objF == l00.a.A ? objF : g00.b0.a;
    }

    @Override
    public final void N1(long j9) {
    }

    @Override
    public final boolean O(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.S) {
            return false;
        }
        if ((!t2.a.a(t2.d.b(keyEvent), t2.a.D) && !t2.a.a(t2.d.a(keyEvent.getKeyCode()), t2.a.C)) || t2.d.c(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        q1 q1Var = this.f4454n0.f4515d;
        q1 q1Var2 = q1.A;
        i iVar = this.f4457q0;
        if (q1Var == q1Var2) {
            int iC1 = (int) (iVar.C1() & 4294967295L);
            float f3 = t2.a.a(t2.d.a(keyEvent.getKeyCode()), t2.a.C) ? iC1 : -iC1;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        } else {
            int iC2 = (int) (iVar.C1() >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(t2.a.a(t2.d.a(keyEvent.getKeyCode()), t2.a.C) ? iC2 : -iC2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new k2(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null, 0), 3);
        return true;
    }

    @Override
    public final void O1(w wVar) {
        a40.c0.y(this.f4452l0.c(), (k00.i) null, (a40.a0) null, new i2(wVar, this, (k00.c) null, 0), 3);
    }

    @Override
    public final boolean T1() {
        u2 u2Var = this.f4454n0;
        if (u2Var.f4512a.a()) {
            return true;
        }
        z.h1 h1Var = u2Var.f4513b;
        return h1Var != null ? h1Var.d() : false;
    }

    public final void W1(c cVar, t0 t0Var, q1 q1Var, n2 n2Var, f0.i iVar, z.h1 h1Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = false;
        if (this.S != z10) {
            this.f4455o0.B = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        t0 t0Var2 = t0Var == null ? this.f4453m0 : t0Var;
        u2 u2Var = this.f4454n0;
        if (!kotlin.jvm.internal.m.a(u2Var.f4512a, n2Var)) {
            u2Var.f4512a = n2Var;
            z14 = true;
        }
        u2Var.f4513b = h1Var;
        if (u2Var.f4515d != q1Var) {
            u2Var.f4515d = q1Var;
            z14 = true;
        }
        if (u2Var.f4516e != z11) {
            u2Var.f4516e = z11;
        } else {
            z13 = z14;
        }
        u2Var.f4514c = t0Var2;
        u2Var.f4517f = this.f4452l0;
        i iVar2 = this.f4457q0;
        iVar2.O = q1Var;
        iVar2.Q = z11;
        iVar2.R = cVar;
        this.f4450j0 = h1Var;
        this.f4451k0 = t0Var;
        bw.b bVar = e2.f4423a;
        q1 q1Var2 = u2Var.f4515d;
        q1 q1Var3 = q1.A;
        if (q1Var2 != q1Var3) {
            q1Var3 = q1.B;
        }
        V1(bVar, z10, iVar, q1Var3, z13);
        if (z12) {
            this.f4458r0 = null;
            this.f4459s0 = null;
            b3.m.o(this);
        }
    }

    @Override
    public final void h() {
        X();
        if (this.N) {
            y3.c cVar = b3.m.y(this).Z;
            l lVar = this.f4453m0;
            lVar.getClass();
            lVar.f4444a = new x.t(new o10.b(cVar));
        }
        m1 m1Var = this.f4460t0;
        if (m1Var != null) {
            m1Var.f4489c = b3.m.y(this).Z;
        }
        k3 k3Var = this.f4461u0;
        if (k3Var != null) {
            k3Var.f4489c = b3.m.y(this).Z;
        }
    }

    @Override
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        if (this.S && (this.f4458r0 == null || this.f4459s0 == null)) {
            this.f4458r0 = new a1.y1(this, 9);
            this.f4459s0 = new k2(this, null);
        }
        a1.y1 y1Var = this.f4458r0;
        if (y1Var != null) {
            a10.w[] wVarArr = j3.y.f8004a;
            a0Var.a(j3.n.f7943d, new j3.a(null, y1Var));
        }
        k2 k2Var = this.f4459s0;
        if (k2Var != null) {
            a10.w[] wVarArr2 = j3.y.f8004a;
            a0Var.a(j3.n.f7944e, k2Var);
        }
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        if (this.N) {
            y3.c cVar = b3.m.y(this).Z;
            l lVar = this.f4453m0;
            lVar.getClass();
            lVar.f4444a = new x.t(new o10.b(cVar));
        }
        m1 m1Var = this.f4460t0;
        if (m1Var != null) {
            m1Var.f4489c = b3.m.y(this).Z;
        }
        k3 k3Var = this.f4461u0;
        if (k3Var != null) {
            k3Var.f4489c = b3.m.y(this).Z;
        }
    }
}
