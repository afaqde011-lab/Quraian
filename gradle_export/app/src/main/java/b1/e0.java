package b1;

import a1.c1;
import a1.s2;
import a1.t0;
import a1.t2;
import a1.w2;
import a1.x0;
import a1.x2;
import a40.u1;
import android.content.ClipDescription;
import c3.e1;
import c3.g1;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.y3;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import l1.i1;
import m3.n0;
import m3.q0;
import q0.s1;
import q0.y0;
import ri.t1;

public final class e0 {

    public final w2 f1940a;

    public final s2 f1941b;

    public y3.c f1942c;

    public boolean f1943d;

    public boolean f1944e;

    public final w0.l f1945f;

    public final a40.z f1946g;

    public final e1.q f1947h;

    public g1 f1948i;

    public boolean f1949j;

    public q2.a f1950k;
    public u00.a m;

    public u00.a f1951n;

    public final i1 f1956s;

    public final i1 f1957t;

    public final i1 f1958u;

    public f4 f1959v;

    public int f1960w;

    public f0.k f1961x;

    public final l1.w f1962y;

    public final androidx.media3.common.q f1963z;
    public final i1 l = l1.q.z(Boolean.TRUE);

    public final i1 f1952o = l1.q.z(new h2.b(9205357640488583168L));

    public final i1 f1953p = l1.q.z(new h2.b(9205357640488583168L));

    public final i1 f1954q = l1.q.z(null);

    public final i1 f1955r = l1.q.z(p.A);

    public e0(w2 w2Var, s2 s2Var, y3.c cVar, boolean z10, boolean z11, boolean z12, w0.l lVar, a40.z zVar, e1.q qVar, g1 g1Var) {
        this.f1940a = w2Var;
        this.f1941b = s2Var;
        this.f1942c = cVar;
        this.f1943d = z11;
        this.f1944e = z12;
        this.f1945f = lVar;
        this.f1946g = zVar;
        this.f1947h = qVar;
        this.f1948i = g1Var;
        this.f1949j = z10;
        Boolean bool = Boolean.FALSE;
        this.f1956s = l1.q.z(bool);
        this.f1957t = l1.q.z(k0.A);
        this.f1958u = l1.q.z(bool);
        this.f1960w = -1;
        this.f1962y = l1.q.r(new j(this, 1));
        this.f1963z = new androidx.media3.common.q(this.f1948i, 1);
    }

    public static final Object a(e0 e0Var, v2.v vVar, m00.c cVar) throws Throwable {
        t tVar;
        kotlin.jvm.internal.y yVar;
        Throwable th2;
        kotlin.jvm.internal.y yVar2;
        e0Var.getClass();
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.E = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(e0Var, cVar);
            }
        } else {
            tVar = new t(e0Var, cVar);
        }
        t tVar2 = tVar;
        Object obj = tVar2.C;
        l00.a aVar = l00.a.A;
        int i11 = tVar2.E;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar2 = tVar2.B;
            yVar = tVar2.A;
            try {
                t1.O(obj);
                g(e0Var, yVar, yVar2);
                return g00.b0.a;
            } catch (Throwable th3) {
                th2 = th3;
                g(e0Var, yVar, yVar2);
                throw th2;
            }
        }
        t1.O(obj);
        kotlin.jvm.internal.y yVar3 = new kotlin.jvm.internal.y();
        yVar3.A = 9205357640488583168L;
        kotlin.jvm.internal.y yVar4 = new kotlin.jvm.internal.y();
        yVar4.A = 9205357640488583168L;
        try {
            l lVar = new l((Object) yVar3, e0Var, (Object) yVar4, 0);
            m mVar = new m(yVar3, yVar4, e0Var, 0);
            m mVar2 = new m(yVar3, yVar4, e0Var, 1);
            n nVar = new n(e0Var, yVar4, yVar3);
            tVar2.A = yVar3;
            tVar2.B = yVar4;
            tVar2.E = 1;
            if (d0.i0.e(vVar, lVar, mVar, mVar2, nVar, tVar2) == aVar) {
                return aVar;
            }
            yVar = yVar3;
            yVar2 = yVar4;
            g(e0Var, yVar, yVar2);
            return g00.b0.a;
        } catch (Throwable th4) {
            yVar = yVar3;
            th2 = th4;
            yVar2 = yVar4;
            g(e0Var, yVar, yVar2);
            throw th2;
        }
    }

    public static final Object b(e0 e0Var, v2.v vVar, boolean z10, m00.c cVar) throws Throwable {
        u uVar;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.y yVar2;
        y0 y0Var;
        kotlin.jvm.internal.y yVar3;
        kotlin.jvm.internal.y yVar4;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i10 = uVar.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.F = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(e0Var, cVar);
            }
        } else {
            uVar = new u(e0Var, cVar);
        }
        u uVar2 = uVar;
        Object obj = uVar2.D;
        l00.a aVar = l00.a.A;
        int i11 = uVar2.F;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = uVar2.C;
            yVar = uVar2.B;
            yVar3 = uVar2.A;
            try {
                t1.O(obj);
                if (e0Var.l() == y0Var) {
                    h(e0Var, yVar3, yVar);
                }
                return g00.b0.a;
            } catch (Throwable th2) {
                th = th2;
                if (e0Var.l() == y0Var) {
                    h(e0Var, yVar3, yVar);
                }
                throw th;
            }
        }
        t1.O(obj);
        kotlin.jvm.internal.y yVar5 = new kotlin.jvm.internal.y();
        yVar5.A = 9205357640488583168L;
        yVar = new kotlin.jvm.internal.y();
        yVar.A = 0L;
        y0 y0Var2 = z10 ? y0.B : y0.C;
        try {
            o oVar = new o(e0Var, yVar5, yVar, y0Var2, z10);
            m mVar = new m(yVar5, e0Var, yVar, 2);
            m mVar2 = new m(yVar5, e0Var, yVar, 3);
            try {
                k kVar = new k(e0Var, yVar, yVar5, y0Var2, z10);
                yVar4 = yVar;
                yVar2 = yVar5;
                y0Var = y0Var2;
                try {
                    uVar2.A = yVar2;
                    uVar2.B = yVar4;
                    uVar2.C = y0Var;
                    uVar2.F = 1;
                    if (d0.i0.e(vVar, oVar, mVar, mVar2, kVar, uVar2) == aVar) {
                        return aVar;
                    }
                    yVar = yVar4;
                    yVar3 = yVar2;
                    if (e0Var.l() == y0Var) {
                        h(e0Var, yVar3, yVar);
                    }
                    return g00.b0.a;
                } catch (Throwable th3) {
                    th = th3;
                    yVar = yVar4;
                    yVar3 = yVar2;
                    if (e0Var.l() == y0Var) {
                        h(e0Var, yVar3, yVar);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                yVar4 = yVar;
                yVar2 = yVar5;
                y0Var = y0Var2;
            }
        } catch (Throwable th5) {
            th = th5;
            yVar2 = yVar5;
            y0Var = y0Var2;
        }
    }

    public static final void g(e0 e0Var, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2) {
        if ((yVar.A & 9223372034707292159L) != 9205357640488583168L) {
            yVar.A = 9205357640488583168L;
            yVar2.A = 9205357640488583168L;
            e0Var.d();
        }
    }

    public static final void h(e0 e0Var, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2) {
        if ((yVar.A & 9223372034707292159L) != 9205357640488583168L) {
            e0Var.d();
            yVar.A = 9205357640488583168L;
            yVar2.A = 0L;
            e0Var.f1960w = -1;
        }
    }

    public final void A(y0 y0Var, long j9) {
        this.f1954q.setValue(y0Var);
        this.f1953p.setValue(new h2.b(j9));
    }

    public final long B(z0.b bVar, int i10, int i11, boolean z10, du.w wVar, boolean z11, boolean z12, q2.b bVar2) {
        long jB;
        q2.a aVar;
        long j9 = bVar.D;
        q0 q0Var = new q0(j9);
        if (z12 || (!z11 && q0.d(j9))) {
            q0Var = null;
        }
        n0 n0VarC = this.f1941b.c();
        if (n0VarC == null) {
            jB = q0.f10518b;
        } else if (q0Var == null && kotlin.jvm.internal.m.a(wVar, e1.v.f5010e)) {
            jB = m3.h0.b(i10, i11);
        } else {
            f4 f4VarB = ca.v.B(n0VarC, i10, i11, this.f1960w, q0Var != null ? q0Var.f10520a : q0.f10518b, q0Var == null, z10);
            if (q0Var == null || f4VarB.j(this.f1959v)) {
                e1.u uVarC = wVar.c(f4VarB);
                jB = m3.h0.b(uVarC.f5004a.f4998b, uVarC.f5005b.f4998b);
                this.f1959v = f4VarB;
                this.f1960w = z10 ? i10 : i11;
            } else {
                jB = q0Var.f10520a;
            }
        }
        if (bVar2 != null && ((q0.g(jB) != q0.g(j9) || q0.f(jB) != q0.f(j9)) && (aVar = this.f1950k) != null)) {
            ((q2.c) aVar).a(bVar2.f12721a);
        }
        return jB;
    }

    public final h2.c c(n0 n0Var, z0.b bVar) {
        float f3;
        if (!q0.d(bVar.D)) {
            return h2.c.f6545e;
        }
        h2.c cVarC = n0Var.c((int) (bVar.D >> 32));
        float fFloor = (float) Math.floor(this.f1942c.A0(s1.f12700a));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        if (n0Var.f10496a.f10490h == y3.m.A) {
            f3 = (fFloor / 2) + cVarC.f6546a;
        } else {
            f3 = cVarC.f6548c - (fFloor / 2);
        }
        float f10 = fFloor / 2;
        float f11 = ((int) (n0Var.f10498c >> 32)) - f10;
        if (f3 > f11) {
            f3 = f11;
        }
        if (f3 < f10) {
            f3 = f10;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f3)) + 0.5f : (float) Math.rint(f3);
        return new h2.c(fFloor2 - f10, cVarC.f6547b, fFloor2 + f10, cVarC.f6549d);
    }

    public final void d() {
        this.f1954q.setValue(null);
        this.f1953p.setValue(new h2.b(9205357640488583168L));
        this.f1952o.setValue(new h2.b(9205357640488583168L));
    }

    public final g00.b0 e(boolean z10, m00.i iVar) {
        m3.h hVar;
        w2 w2Var = this.f1940a;
        if (q0.d(w2Var.d().D) || this.f1944e) {
            hVar = null;
        } else {
            z0.b bVarD = w2Var.d();
            hVar = new m3.h(bVarD.C.subSequence(q0.g(bVarD.D), q0.f(bVarD.D)).toString());
            if (z10) {
                w2Var.a();
            }
        }
        g00.b0 b0Var = g00.b0.a;
        if (hVar == null) {
            return b0Var;
        }
        ((c3.i) this.f1948i).a(g0.b.a(hVar));
        l00.a aVar = l00.a.A;
        return b0Var;
    }

    public final g00.b0 f(m00.i iVar) {
        m3.h hVar;
        w2 w2Var = this.f1940a;
        if (q0.d(w2Var.d().D) || !m() || this.f1944e) {
            hVar = null;
        } else {
            z0.b bVarD = w2Var.d();
            hVar = new m3.h(bVarD.C.subSequence(q0.g(bVarD.D), q0.f(bVarD.D)).toString());
            w2Var.c();
        }
        g00.b0 b0Var = g00.b0.a;
        if (hVar == null) {
            return b0Var;
        }
        ((c3.i) this.f1948i).a(g0.b.a(hVar));
        l00.a aVar = l00.a.A;
        return b0Var;
    }

    public final Object i(v2.v vVar, m00.i iVar) {
        Object objB1 = ((v2.j0) vVar).B1(new v(this, null, 0), iVar);
        return objB1 == l00.a.A ? objB1 : g00.b0.a;
    }

    public final c j(boolean z10) {
        z0.b bVarD = this.f1940a.d();
        boolean zBooleanValue = ((Boolean) this.f1956s.getValue()).booleanValue();
        boolean z11 = true;
        boolean z12 = ((p) this.f1955r.getValue()) == p.A;
        y0 y0VarL = l();
        if (!zBooleanValue || !z12 || !q0.d(bVarD.D) || bVarD.F != null || bVarD.C.length() <= 0) {
            z11 = false;
        } else if (y0VarL != y0.A) {
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                long jB = k().b();
                z1.q.n(fVarF, fVarK, kVarE);
                z2.a0 a0VarQ = q();
                if (!(a0VarQ != null ? y3.x(jB, y3.Y(a0VarQ)) : false)) {
                    z11 = false;
                }
            } catch (Throwable th2) {
                z1.q.n(fVarF, fVarK, kVarE);
                throw th2;
            }
        }
        if (z11) {
            return new c(true, z10 ? k().b() : 9205357640488583168L, 0.0f, x3.j.A, false);
        }
        return c.f1933f;
    }

    public final h2.c k() {
        n0 n0VarC = this.f1941b.c();
        return n0VarC == null ? h2.c.f6545e : c(n0VarC, this.f1940a.d());
    }

    public final y0 l() {
        return (y0) this.f1954q.getValue();
    }

    public final boolean m() {
        return this.f1949j;
    }

    public final long n() {
        i1 i1Var = this.f1953p;
        if ((((h2.b) i1Var.getValue()).f6544a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        i1 i1Var2 = this.f1952o;
        if ((((h2.b) i1Var2.getValue()).f6544a & 9223372034707292159L) == 9205357640488583168L) {
            return x0.o(this.f1941b, ((h2.b) i1Var.getValue()).f6544a);
        }
        long j9 = ((h2.b) i1Var.getValue()).f6544a;
        long j10 = ((h2.b) i1Var2.getValue()).f6544a;
        z2.a0 a0VarQ = q();
        return h2.b.f(j9, h2.b.e(j10, a0VarQ != null ? a0VarQ.e(0L) : 9205357640488583168L));
    }

    public final long o(boolean z10) {
        long j9;
        n0 n0VarC = this.f1941b.c();
        if (n0VarC == null) {
            return 0L;
        }
        long j10 = this.f1940a.d().D;
        if (z10) {
            int i10 = q0.f10519c;
            j9 = j10 >> 32;
        } else {
            int i11 = q0.f10519c;
            j9 = 4294967295L & j10;
        }
        return f50.c.F(n0VarC, (int) j9, z10, q0.h(j10));
    }

    public final c p(boolean z10, boolean z11) {
        boolean z12;
        y0 y0Var = z10 ? y0.B : y0.C;
        n0 n0VarC = this.f1941b.c();
        if (n0VarC == null) {
            return c.f1933f;
        }
        w2 w2Var = this.f1940a;
        long j9 = w2Var.d().D;
        if (q0.d(j9)) {
            return c.f1933f;
        }
        long jO = o(z10);
        if (((p) this.f1955r.getValue()) != p.A) {
            z12 = false;
        } else {
            if (l() != y0Var) {
                z2.a0 a0VarQ = q();
                if (!(a0VarQ != null ? y3.x(jO, y3.Y(a0VarQ)) : false)) {
                    z12 = false;
                }
            }
            z12 = true;
        }
        if (!z12) {
            return c.f1933f;
        }
        if (!(w2Var.d().F == null)) {
            return c.f1933f;
        }
        x3.j jVarA = n0VarC.a(z10 ? (int) (j9 >> 32) : Math.max(((int) (j9 & 4294967295L)) - 1, 0));
        boolean zH = q0.h(j9);
        if (z11) {
            z2.a0 a0VarQ2 = q();
            if (a0VarQ2 != null) {
                jO = x0.j(jO, y3.Y(a0VarQ2));
            }
        } else {
            jO = 9205357640488583168L;
        }
        return new c(true, jO, q0.q.y(n0VarC, (int) (z10 ? j9 >> 32 : j9 & 4294967295L)), jVarA, zH);
    }

    public final z2.a0 q() {
        z2.a0 a0VarE = this.f1941b.e();
        if (a0VarE == null || !a0VarE.A()) {
            return null;
        }
        return a0VarE;
    }

    public final void r() {
        e1.q qVar = this.f1947h;
        if (qVar == null) {
            return;
        }
        w2 w2Var = this.f1940a;
        CharSequence charSequence = w2Var.d().C;
        long j9 = w2Var.d().D;
        if (charSequence.length() <= 0 || q0.d(j9)) {
            return;
        }
        a40.c0.y(this.f1946g, (k00.i) null, a40.a0.D, new w(qVar, charSequence, j9, this, null, 0), 1);
    }

    public final Object s(m00.c cVar) {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i10 = zVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zVar.C = i10 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object obj = zVar.A;
        Object obj2 = l00.a.A;
        int i11 = zVar.C;
        g00.b0 b0Var = g00.b0.a;
        if (i11 == 0) {
            t1.O(obj);
            u00.a aVar = this.f1951n;
            if (aVar != null && aVar.invoke() != null) {
                throw new ClassCastException();
            }
            zVar.C = 1;
            if (t(zVar) == obj2) {
                return obj2;
            }
            return b0Var;
        }
        if (i11 == 1) {
            t1.O(obj);
            return b0Var;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        t1.O(obj);
        e1 e1Var = (e1) obj;
        if (e1Var != null) {
            e1Var.f2653a.getDescription();
            throw null;
        }
        zVar.C = 3;
        if (t(zVar) == obj2) {
            return obj2;
        }
        return b0Var;
    }

    public final java.lang.Object t(m00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: b1.e0.t(m00.c):java.lang.Object");
    }

    public final boolean u(long j9) throws NoWhenBranchMatchedException {
        int iG;
        t0 t0Var;
        boolean z10;
        a1.g1 g1Var;
        int i10;
        long jB;
        long j10;
        a1.g1 g1Var2;
        t2 t2Var;
        n0 n0VarC = this.f1941b.c();
        if (n0VarC == null || (iG = n0VarC.f10497b.g(j9)) == -1) {
            return false;
        }
        w2 w2Var = this.f1940a;
        l1.w wVar = w2Var.f138d;
        i1 i1Var = w2Var.f139e;
        c1 c1Var = (wVar == null || (t2Var = (t2) wVar.getValue()) == null) ? null : t2Var.f133b;
        long jA = c1Var != null ? c1Var.a(iG, false) : m3.h0.b(iG, iG);
        long jF = w2Var.f(jA);
        if (q0.d(jA) && q0.d(jF)) {
            t0Var = t0.A;
        } else if (q0.d(jA) || q0.d(jF)) {
            t0Var = (!q0.d(jA) || q0.d(jF)) ? t0.D : t0.B;
        } else {
            t0Var = t0.C;
        }
        int iOrdinal = t0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                z10 = false;
                if (iOrdinal == 2) {
                    h2.c cVarC = n0VarC.c((int) (jF >> 32));
                    h2.c cVarC2 = n0VarC.c((int) (jF & 4294967295L));
                    float fL = x0.l(j9, cVarC);
                    float fL2 = x0.l(j9, cVarC2);
                    if (fL == fL2 || fL >= fL2) {
                        j10 = jA & 4294967295L;
                    }
                    i10 = (int) j10;
                    g1Var = null;
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                z10 = false;
                h2.c cVarC3 = n0VarC.c((int) (jF >> 32));
                h2.c cVarC4 = n0VarC.c((int) (jF & 4294967295L));
                float fL3 = x0.l(j9, cVarC3);
                float fL4 = x0.l(j9, cVarC4);
                if (fL3 != fL4 && fL3 < fL4) {
                    x2 x2Var = x2.A;
                    g1Var2 = new a1.g1(x2Var, x2Var);
                } else {
                    x2 x2Var2 = x2.B;
                    g1Var2 = new a1.g1(x2Var2, x2Var2);
                }
                g1Var = g1Var2;
                i10 = (int) (jA >> 32);
            }
            jB = m3.h0.b(i10, i10);
            if (!q0.c(jB, w2Var.f135a.d().D) && (g1Var == null || g1Var.equals((a1.g1) i1Var.getValue()))) {
                return z10;
            }
            w2Var.k(jB);
            if (g1Var != null) {
                i1Var.setValue(g1Var);
            }
            return true;
        }
        z10 = false;
        j10 = jA >> 32;
        i10 = (int) j10;
        g1Var = null;
        jB = m3.h0.b(i10, i10);
        if (!q0.c(jB, w2Var.f135a.d().D)) {
        }
        w2Var.k(jB);
        if (g1Var != null) {
            i1Var.setValue(g1Var);
        }
        return true;
    }

    public final void v(boolean z10) {
        this.l.setValue(Boolean.valueOf(z10));
    }

    public final void w(boolean z10) {
        this.f1956s.setValue(Boolean.valueOf(z10));
    }

    public final void x(k0 k0Var) {
        this.f1957t.setValue(k0Var);
    }

    public final Object y(m00.c cVar) {
        d0 d0Var;
        w0.j jVar;
        u1 u1Var;
        w0.j jVar2;
        u1 u1Var2;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i10 = d0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        Object objK = d0Var.A;
        l00.a aVar = l00.a.A;
        int i11 = d0Var.C;
        w0.l lVar = this.f1945f;
        i1 i1Var = this.f1957t;
        k00.c cVar2 = null;
        try {
            if (i11 == 0) {
                t1.O(objK);
                a1.c0 c0Var = new a1.c0(this, cVar2, 7);
                d0Var.C = 1;
                objK = a40.c0.k(c0Var, d0Var);
                if (objK == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objK);
            }
            w(false);
            if (((k0) i1Var.getValue()) != k0.A && (jVar2 = lVar.f15828a) != null && (u1Var2 = jVar2.U) != null) {
                u1Var2.i((CancellationException) null);
                jVar2.U = null;
            }
            return g00.b0.a;
        } catch (Throwable th2) {
            w(false);
            if (((k0) i1Var.getValue()) != k0.A && (jVar = lVar.f15828a) != null && (u1Var = jVar.U) != null) {
                u1Var.i((CancellationException) null);
                jVar.U = null;
            }
            throw th2;
        }
    }

    public final g00.b0 z() {
        boolean z10;
        ClipDescription primaryClipDescription;
        androidx.media3.common.q qVar = this.f1963z;
        c3.i iVar = (c3.i) ((g1) qVar.C);
        if (iVar.f2680a.a().hasPrimaryClip() && (primaryClipDescription = iVar.f2680a.a().getPrimaryClipDescription()) != null) {
            z10 = primaryClipDescription.hasMimeType("text/*");
        }
        qVar.B = z10;
        l00.a aVar = l00.a.A;
        return g00.b0.a;
    }
}
