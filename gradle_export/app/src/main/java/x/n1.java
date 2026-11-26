package x;

import l1.p2;

public final class n1 {

    public final f5.c f16323a;

    public final n1 f16324b;

    public final String f16325c;

    public final l1.i1 f16326d;

    public final l1.i1 f16327e;

    public final l1.g1 f16328f = new l1.g1(0);

    public final l1.g1 f16329g = new l1.g1(Long.MIN_VALUE);

    public final l1.i1 f16330h;

    public final z1.p f16331i;

    public final z1.p f16332j;

    public final l1.i1 f16333k;
    public final l1.w l;

    public n1(f5.c cVar, n1 n1Var, String str) {
        this.f16323a = cVar;
        this.f16324b = n1Var;
        this.f16325c = str;
        this.f16326d = l1.q.z(cVar.J0());
        this.f16327e = l1.q.z(new l1(cVar.J0(), cVar.J0()));
        Boolean bool = Boolean.FALSE;
        this.f16330h = l1.q.z(bool);
        this.f16331i = new z1.p();
        this.f16332j = new z1.p();
        this.f16333k = l1.q.z(bool);
        this.l = l1.q.r(new r9.f(this, 2));
        cVar.S0(this);
    }

    public final void a(Object obj, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? g0Var.g(obj) : g0Var.i(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(this) ? 32 : 16;
        }
        if (!g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            g0Var.V();
        } else if (g()) {
            g0Var.c0(467722849);
            g0Var.r(false);
        } else {
            g0Var.c0(466062241);
            p(obj);
            int i12 = i11 & 112;
            boolean z10 = i12 == 32;
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (z10 || objN == cVar) {
                objN = l1.q.r(new r9.f(this, 1));
                g0Var.n0(objN);
            }
            if (((Boolean) ((p2) objN).getValue()).booleanValue()) {
                g0Var.c0(466470356);
                Object objN2 = g0Var.N();
                if (objN2 == cVar) {
                    objN2 = l1.q.o(g0Var);
                    g0Var.n0(objN2);
                }
                a40.z zVar = (a40.z) objN2;
                boolean zI = g0Var.i(zVar) | (i12 == 32);
                Object objN3 = g0Var.N();
                if (zI || objN3 == cVar) {
                    objN3 = new mu.q(zVar, this, 19);
                    g0Var.n0(objN3);
                }
                l1.q.c(zVar, this, (u00.k) objN3, g0Var);
                g0Var.r(false);
            } else {
                g0Var.c0(467712929);
                g0Var.r(false);
            }
            g0Var.r(false);
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(this, obj, i10, 16);
        }
    }

    public final long b() {
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, ((m1) pVar.get(i10)).L.h());
        }
        z1.p pVar2 = this.f16332j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((n1) pVar2.get(i11)).b());
        }
        return jMax;
    }

    public final void c() {
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) pVar.get(i10);
            m1Var.F = null;
            m1Var.E = null;
            m1Var.I = false;
        }
        z1.p pVar2 = this.f16332j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n1) pVar2.get(i11)).c();
        }
    }

    public final boolean d() {
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m1) pVar.get(i10)).E != null) {
                return true;
            }
        }
        z1.p pVar2 = this.f16332j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((n1) pVar2.get(i11)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        n1 n1Var = this.f16324b;
        return n1Var != null ? n1Var.e() : this.f16328f.h();
    }

    public final k1 f() {
        return (k1) this.f16327e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f16333k.getValue()).booleanValue();
    }

    public final void h(boolean z10, long j9) {
        l1.g1 g1Var = this.f16329g;
        long jH = g1Var.h();
        f5.c cVar = this.f16323a;
        if (jH == Long.MIN_VALUE) {
            g1Var.i(j9);
            ((l1.i1) cVar.B).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((l1.i1) cVar.B).getValue()).booleanValue()) {
            ((l1.i1) cVar.B).setValue(Boolean.TRUE);
        }
        this.f16330h.setValue(Boolean.FALSE);
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) pVar.get(i10);
            l1.i1 i1Var = m1Var.G;
            l1.i1 i1Var2 = m1Var.G;
            if (!((Boolean) i1Var.getValue()).booleanValue()) {
                long jB = z10 ? m1Var.a().b() : j9;
                m1Var.e(m1Var.a().f(jB));
                m1Var.K = m1Var.a().d(jB);
                if (m1Var.a().e(jB)) {
                    i1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) i1Var2.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        z1.p pVar2 = this.f16332j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            n1 n1Var = (n1) pVar2.get(i11);
            l1.i1 i1Var3 = n1Var.f16326d;
            f5.c cVar2 = n1Var.f16323a;
            if (!kotlin.jvm.internal.m.a(i1Var3.getValue(), cVar2.J0())) {
                n1Var.h(z10, j9);
            }
            if (!kotlin.jvm.internal.m.a(n1Var.f16326d.getValue(), cVar2.J0())) {
                z11 = false;
            }
        }
        if (z11) {
            i();
        }
    }

    public final void i() {
        this.f16329g.i(Long.MIN_VALUE);
        f5.c cVar = this.f16323a;
        if (cVar instanceof k0) {
            ((k0) cVar).R0(this.f16326d.getValue());
        }
        n(0L);
        ((l1.i1) cVar.B).setValue(Boolean.FALSE);
        z1.p pVar = this.f16332j;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n1) pVar.get(i10)).i();
        }
    }

    public final void j(float f3) {
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) pVar.get(i10);
            m1Var.getClass();
            if (f3 == -4.0f || f3 == -5.0f) {
                h1 h1Var = m1Var.F;
                if (h1Var != null) {
                    m1Var.a().h(h1Var.f16295c);
                    m1Var.E = null;
                    m1Var.F = null;
                }
                Object obj = f3 == -4.0f ? m1Var.a().f16296d : m1Var.a().f16295c;
                m1Var.a().h(obj);
                m1Var.a().i(obj);
                m1Var.e(obj);
                m1Var.L.i(m1Var.a().b());
            } else {
                m1Var.H.i(f3);
            }
        }
        z1.p pVar2 = this.f16332j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n1) pVar2.get(i11)).j(f3);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f16329g.i(Long.MIN_VALUE);
        f5.c cVar = this.f16323a;
        ((l1.i1) cVar.B).setValue(Boolean.FALSE);
        boolean zG = g();
        l1.i1 i1Var = this.f16326d;
        if (!zG || !kotlin.jvm.internal.m.a(cVar.J0(), obj) || !kotlin.jvm.internal.m.a(i1Var.getValue(), obj2)) {
            if (!kotlin.jvm.internal.m.a(cVar.J0(), obj) && (cVar instanceof k0)) {
                ((k0) cVar).R0(obj);
            }
            i1Var.setValue(obj2);
            this.f16333k.setValue(Boolean.TRUE);
            this.f16327e.setValue(new l1(obj, obj2));
        }
        z1.p pVar = this.f16332j;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            n1 n1Var = (n1) pVar.get(i10);
            kotlin.jvm.internal.m.c(n1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (n1Var.g()) {
                n1Var.k(n1Var.f16323a.J0(), n1Var.f16326d.getValue());
            }
        }
        z1.p pVar2 = this.f16331i;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((m1) pVar2.get(i11)).c(0L);
        }
    }

    public final void l(long j9) {
        l1.g1 g1Var = this.f16329g;
        if (g1Var.h() == Long.MIN_VALUE) {
            g1Var.i(j9);
        }
        n(j9);
        this.f16330h.setValue(Boolean.FALSE);
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m1) pVar.get(i10)).c(j9);
        }
        z1.p pVar2 = this.f16332j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            n1 n1Var = (n1) pVar2.get(i11);
            if (!kotlin.jvm.internal.m.a(n1Var.f16326d.getValue(), n1Var.f16323a.J0())) {
                n1Var.l(j9);
            }
        }
    }

    public final void m(r0 r0Var) {
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) pVar.get(i10);
            l1.i1 i1Var = m1Var.J;
            if (!kotlin.jvm.internal.m.a(m1Var.a().f16295c, m1Var.a().f16296d)) {
                m1Var.F = m1Var.a();
                m1Var.E = r0Var;
            }
            m1Var.D.setValue(new h1(m1Var.N, m1Var.A, i1Var.getValue(), i1Var.getValue(), m1Var.K.c()));
            m1Var.L.i(m1Var.a().b());
            m1Var.I = true;
        }
        z1.p pVar2 = this.f16332j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n1) pVar2.get(i11)).m(r0Var);
        }
    }

    public final void n(long j9) {
        if (this.f16324b == null) {
            this.f16328f.i(j9);
        }
    }

    public final void o() {
        h1 h1Var;
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) pVar.get(i10);
            r0 r0Var = m1Var.E;
            if (r0Var != null && (h1Var = m1Var.F) != null) {
                long jG = w00.a.G(r0Var.f16361g * ((double) r0Var.f16358d));
                Object objF = h1Var.f(jG);
                if (m1Var.I) {
                    m1Var.a().i(objF);
                }
                m1Var.a().h(objF);
                m1Var.L.i(m1Var.a().b());
                if (m1Var.H.h() == -2.0f || m1Var.I) {
                    m1Var.e(objF);
                } else {
                    m1Var.c(m1Var.O.e());
                }
                if (jG >= r0Var.f16361g) {
                    m1Var.E = null;
                    m1Var.F = null;
                } else {
                    r0Var.f16357c = false;
                }
            }
        }
        z1.p pVar2 = this.f16332j;
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n1) pVar2.get(i11)).o();
        }
    }

    public final void p(Object obj) {
        l1.i1 i1Var = this.f16326d;
        if (kotlin.jvm.internal.m.a(i1Var.getValue(), obj)) {
            return;
        }
        this.f16327e.setValue(new l1(i1Var.getValue(), obj));
        f5.c cVar = this.f16323a;
        if (!kotlin.jvm.internal.m.a(cVar.J0(), i1Var.getValue())) {
            cVar.R0(i1Var.getValue());
        }
        i1Var.setValue(obj);
        if (this.f16329g.h() == Long.MIN_VALUE) {
            this.f16330h.setValue(Boolean.TRUE);
        }
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m1) pVar.get(i10)).H.i(-2.0f);
        }
    }

    public final String toString() {
        z1.p pVar = this.f16331i;
        int size = pVar.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((m1) pVar.get(i10)) + ", ";
        }
        return str;
    }
}
