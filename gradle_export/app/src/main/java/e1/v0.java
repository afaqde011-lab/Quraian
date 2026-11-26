package e1;

import a40.u1;
import android.content.ClipDescription;
import bv.h2;
import c3.g1;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.f4;
import java.util.concurrent.CancellationException;
import l1.i1;
import q0.e2;
import q0.i2;
import q0.j1;
import q0.j2;
import q0.q1;
import ri.t1;

public final class v0 {
    public final f4 A;
    public boolean B;

    public final i2 f5015a;

    public j1 f5018d;

    public u00.a f5021g;

    public g1 f5022h;

    public a40.z f5023i;

    public q f5024j;

    public q2.a f5025k;
    public g2.t l;
    public final i1 m;

    public final i1 f5026n;

    public long f5027o;

    public m3.q0 f5028p;

    public long f5029q;

    public final i1 f5030r;

    public final i1 f5031s;

    public int f5032t;

    public r3.w f5033u;

    public f4 f5034v;

    public m3.q0 f5035w;

    public final i1 f5036x;

    public final w0.l f5037y;

    public final t0 f5038z;

    public r3.p f5016b = j2.f12662a;

    public u00.k f5017c = new pp.d(5);

    public final i1 f5019e = l1.q.z(new r3.w((String) null, 0, 7));

    public r3.e0 f5020f = r3.d0.A;

    public v0(i2 i2Var) {
        this.f5015a = i2Var;
        Boolean bool = Boolean.TRUE;
        this.m = l1.q.z(bool);
        this.f5026n = l1.q.z(bool);
        this.f5027o = 0L;
        this.f5029q = 0L;
        this.f5030r = l1.q.z(null);
        this.f5031s = l1.q.z(null);
        this.f5032t = -1;
        this.f5033u = new r3.w((String) null, 0L, 7);
        this.f5036x = l1.q.z(Boolean.FALSE);
        this.f5037y = new w0.l();
        this.f5038z = new t0(this);
        this.A = new f4(this);
    }

    public static final g00.k a(v0 v0Var) {
        String str;
        m3.q0 q0Var;
        m3.h hVarM = v0Var.m();
        if (hVarM == null || (str = hVarM.B) == null || (q0Var = v0Var.f5035w) == null) {
            return null;
        }
        long j9 = q0Var.f10520a;
        return new g00.k(str, new m3.q0(m3.h0.b(v0Var.f5016b.z((int) (j9 >> 32)), v0Var.f5016b.z((int) (j9 & 4294967295L)))));
    }

    public static final void b(v0 v0Var, m3.q0 q0Var) {
        m3.h hVarM;
        String str;
        a40.z zVar;
        if (q0Var == null) {
            return;
        }
        long j9 = q0Var.f10520a;
        q qVar = v0Var.f5024j;
        if (qVar == null || (hVarM = v0Var.m()) == null || (str = hVarM.B) == null) {
            return;
        }
        r3.p pVar = v0Var.f5016b;
        long jB = m3.h0.b(pVar.z((int) (j9 >> 32)), pVar.z((int) (j9 & 4294967295L)));
        if (str.length() <= 0 || m3.q0.d(jB) || (zVar = v0Var.f5023i) == null) {
            return;
        }
        a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new d0.h(qVar, str, jB, q0Var, v0Var, pVar, null), 3);
    }

    public static final long c(v0 v0Var, r3.w wVar, long j9, boolean z10, boolean z11, du.w wVar2, boolean z12, q2.b bVar) {
        e2 e2VarD;
        char c10;
        q2.a aVar;
        j1 j1Var = v0Var.f5018d;
        if (j1Var == null || (e2VarD = j1Var.d()) == null) {
            return m3.q0.f10518b;
        }
        r3.p pVar = v0Var.f5016b;
        long j10 = wVar.f13100b;
        m3.h hVar = wVar.f13099a;
        int i10 = m3.q0.f10519c;
        long jB = m3.h0.b(pVar.z((int) (j10 >> 32)), v0Var.f5016b.z((int) (j10 & 4294967295L)));
        boolean z13 = false;
        int iB = e2VarD.b(false, j9);
        int i11 = (z11 || z10) ? iB : (int) (jB >> 32);
        int i12 = (!z11 || z10) ? iB : (int) (jB & 4294967295L);
        f4 f4Var = v0Var.f5034v;
        int i13 = -1;
        if (z10 || f4Var == null) {
            c10 = ' ';
        } else {
            c10 = ' ';
            int i14 = v0Var.f5032t;
            if (i14 != -1) {
                i13 = i14;
            }
        }
        f4 f4VarB = ca.v.B(e2VarD.f12608a, i11, i12, i13, jB, z10, z11);
        if (f4VarB.j(f4Var)) {
            v0Var.f5034v = f4VarB;
            v0Var.f5032t = iB;
            u uVarC = wVar2.c(f4VarB);
            long jB2 = m3.h0.b(v0Var.f5016b.k(uVarC.f5004a.f4998b), v0Var.f5016b.k(uVarC.f5005b.f4998b));
            if (!m3.q0.c(jB2, j10)) {
                boolean z14 = m3.q0.h(jB2) != m3.q0.h(j10) && m3.q0.c(m3.h0.b((int) (4294967295L & jB2), (int) (jB2 >> c10)), j10);
                boolean z15 = m3.q0.d(jB2) && m3.q0.d(j10);
                if (z12 && hVar.B.length() > 0 && !z14 && !z15 && bVar != null && (aVar = v0Var.f5025k) != null) {
                    ((q2.c) aVar).a(bVar.f12721a);
                }
                v0Var.f5017c.invoke(e(hVar, jB2));
                v0Var.f5035w = new m3.q0(jB2);
                if (!z12) {
                    v0Var.t(!m3.q0.d(jB2));
                }
                j1 j1Var2 = v0Var.f5018d;
                if (j1Var2 != null) {
                    j1Var2.f12652q.setValue(Boolean.valueOf(z12));
                }
                j1 j1Var3 = v0Var.f5018d;
                if (j1Var3 != null) {
                    j1Var3.m.setValue(Boolean.valueOf(!m3.q0.d(jB2) && b5.z(v0Var, true)));
                }
                j1 j1Var4 = v0Var.f5018d;
                if (j1Var4 != null) {
                    j1Var4.f12649n.setValue(Boolean.valueOf(!m3.q0.d(jB2) && b5.z(v0Var, false)));
                }
                j1 j1Var5 = v0Var.f5018d;
                if (j1Var5 != null) {
                    if (m3.q0.d(jB2) && b5.z(v0Var, true)) {
                        z13 = true;
                    }
                    j1Var5.f12650o.setValue(Boolean.valueOf(z13));
                }
                return jB2;
            }
        }
        return j10;
    }

    public static r3.w e(m3.h hVar, long j9) {
        return new r3.w(hVar, j9, (m3.q0) null);
    }

    public final u1 d(boolean z10) {
        a40.z zVar = this.f5023i;
        if (zVar != null) {
            return a40.c0.y(zVar, (k00.i) null, a40.a0.D, new h2(this, z10, (k00.c) null, 1), 1);
        }
        return null;
    }

    public final void f() {
        a40.z zVar = this.f5023i;
        if (zVar != null) {
            a40.c0.y(zVar, (k00.i) null, a40.a0.D, new p0(this, null, 1), 1);
        }
    }

    public final void g(h2.b bVar) {
        if (!m3.q0.d(n().f13100b)) {
            j1 j1Var = this.f5018d;
            e2 e2VarD = j1Var != null ? j1Var.d() : null;
            int iF = (bVar == null || e2VarD == null) ? m3.q0.f(n().f13100b) : this.f5016b.k(e2VarD.b(true, bVar.f6544a));
            r3.w wVarB = r3.w.b(n(), null, m3.h0.b(iF, iF), 5);
            this.f5017c.invoke(wVarB);
            this.f5035w = new m3.q0(wVarB.f13100b);
        }
        q((bVar == null || n().f13099a.B.length() <= 0) ? q0.z0.A : q0.z0.C);
        t(false);
    }

    public final void h(boolean z10) {
        g2.t tVar;
        j1 j1Var = this.f5018d;
        if (j1Var != null && !j1Var.b() && (tVar = this.l) != null) {
            g2.t.a(tVar);
        }
        this.f5033u = n();
        t(z10);
        q(q0.z0.B);
    }

    public final h2.b i() {
        return (h2.b) this.f5031s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.f5026n.getValue()).booleanValue();
    }

    public final long l(boolean z10) {
        e2 e2VarD;
        long j9;
        j1 j1Var = this.f5018d;
        if (j1Var == null || (e2VarD = j1Var.d()) == null) {
            return 9205357640488583168L;
        }
        m3.n0 n0Var = e2VarD.f12608a;
        m3.h hVarM = m();
        if (hVarM == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.m.a(hVarM.B, n0Var.f10496a.f10483a.B)) {
            return 9205357640488583168L;
        }
        r3.w wVarN = n();
        if (z10) {
            long j10 = wVarN.f13100b;
            int i10 = m3.q0.f10519c;
            j9 = j10 >> 32;
        } else {
            long j11 = wVarN.f13100b;
            int i11 = m3.q0.f10519c;
            j9 = j11 & 4294967295L;
        }
        return f50.c.F(n0Var, this.f5016b.z((int) j9), z10, m3.q0.h(n().f13100b));
    }

    public final m3.h m() {
        q1 q1Var;
        j1 j1Var = this.f5018d;
        if (j1Var == null || (q1Var = j1Var.f12638a) == null) {
            return null;
        }
        return q1Var.f12683a;
    }

    public final r3.w n() {
        return (r3.w) this.f5019e.getValue();
    }

    public final void o() {
        u1 u1Var;
        w0.j jVar = this.f5037y.f15828a;
        if (jVar == null || (u1Var = jVar.U) == null) {
            return;
        }
        u1Var.i((CancellationException) null);
        jVar.U = null;
    }

    public final void p() {
        a40.z zVar = this.f5023i;
        if (zVar != null) {
            a40.c0.y(zVar, (k00.i) null, a40.a0.D, new p0(this, null, 2), 1);
        }
    }

    public final void q(q0.z0 z0Var) {
        j1 j1Var = this.f5018d;
        if (j1Var != null) {
            if (j1Var.a() == z0Var) {
                j1Var = null;
            }
            if (j1Var != null) {
                j1Var.f12648k.setValue(z0Var);
            }
        }
    }

    public final void r() {
        j1 j1Var;
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            if (!k() || ((j1Var = this.f5018d) != null && !((Boolean) j1Var.f12652q.getValue()).booleanValue())) {
                z1.q.n(fVarF, fVarK, kVarE);
            } else {
                z1.q.n(fVarF, fVarK, kVarE);
                this.f5037y.a();
            }
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }

    public final Object s(m00.c cVar) {
        u0 u0Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i10 = u0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object objValueOf = u0Var.B;
        Object obj = l00.a.A;
        int i11 = u0Var.D;
        if (i11 == 0) {
            t1.O(objValueOf);
            g1 g1Var = this.f5022h;
            if (g1Var != null) {
                u0Var.A = this;
                u0Var.D = 1;
                ClipDescription primaryClipDescription = ((c3.i) g1Var).f2680a.a().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return g00.b0.a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = u0Var.A;
        t1.O(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.f5036x.setValue(bool);
        return g00.b0.a;
    }

    public final void t(boolean z10) {
        j1 j1Var = this.f5018d;
        if (j1Var != null) {
            j1Var.l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            r();
        } else {
            o();
        }
    }
}
