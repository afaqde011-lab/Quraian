package j0;

import android.os.Trace;
import as.y0;
import b3.l0;
import d0.n2;
import g00.b0;
import g1.l2;
import g1.s1;
import java.util.List;
import l0.f0;
import l0.s0;
import l0.u0;
import l0.v0;
import l1.i1;
import l1.z0;
import ri.t1;
import s10.w0;
import z.b1;

public final class v implements n2 {

    public static final w0 f7816y = y1.k.b(new ir.b(19), new hx.t(13));

    public final a f7817a;

    public boolean f7818b;

    public n f7819c;

    public boolean f7820d;

    public final q f7821e;

    public final i1 f7822f;

    public final f0.i f7823g;

    public float f7824h;

    public boolean f7825i;

    public final d0.n f7826j;

    public final boolean f7827k;
    public l0 l;
    public final t m;

    public final l0.d f7828n;

    public final f0 f7829o;

    public final hf.c f7830p;

    public final v0 f7831q;

    public final gi.c f7832r;

    public final s0 f7833s;

    public final z0 f7834t;

    public final i1 f7835u;

    public final i1 f7836v;

    public final z0 f7837w;

    public final h1.l f7838x;

    public v(int i10, int i11) {
        a aVar = new a();
        aVar.f7740a = -1;
        aVar.f7742c = -1;
        this.f7817a = aVar;
        this.f7821e = new q(i10, i11, 0);
        this.f7822f = new i1(x.f7839a, l1.c.D);
        this.f7823g = new f0.i();
        this.f7826j = new d0.n(new h00.a(this, 6));
        this.f7827k = true;
        this.m = new t(this, 0);
        this.f7828n = new l0.d();
        this.f7829o = new f0();
        this.f7830p = new hf.c(15);
        this.f7831q = new v0(new s1(this, i10));
        this.f7832r = new gi.c(this, 8);
        this.f7833s = new s0();
        this.f7834t = l0.q.h();
        Boolean bool = Boolean.FALSE;
        this.f7835u = l1.q.z(bool);
        this.f7836v = l1.q.z(bool);
        this.f7837w = l0.q.h();
        this.f7838x = new h1.l(9);
    }

    public static Object j(v vVar, int i10, m00.c cVar) {
        vVar.getClass();
        Object objC = vVar.c(b1.A, new l2(vVar, i10, (k00.c) null), cVar);
        return objC == l00.a.A ? objC : b0.a;
    }

    @Override
    public final boolean a() {
        return this.f7826j.a();
    }

    @Override
    public final boolean b() {
        return ((Boolean) this.f7836v.getValue()).booleanValue();
    }

    @Override
    public final java.lang.Object c(z.b1 r6, u00.n r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: j0.v.c(z.b1, u00.n, m00.c):java.lang.Object");
    }

    @Override
    public final boolean d() {
        return ((Boolean) this.f7835u.getValue()).booleanValue();
    }

    @Override
    public final float e(float f3) {
        return this.f7826j.e(f3);
    }

    public final Object f(int i10, k00.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i11 = sVar.C;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.C = i11 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.A;
        l00.a aVar = l00.a.A;
        int i12 = sVar.C;
        try {
            if (i12 == 0) {
                t1.O(obj);
                this.f7825i = true;
                y0 y0Var = new y0(this, i10, (k00.c) null, 4);
                sVar.C = 1;
                if (c(b1.A, y0Var, sVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            this.f7825i = false;
            this = b0.a;
            return this;
        } catch (Throwable th2) {
            this.f7825i = false;
            throw th2;
        }
    }

    public final void g(n nVar, boolean z10, boolean z11) {
        ?? r4 = nVar.f7781k;
        int i10 = nVar.f7782n;
        int i11 = nVar.f7772b;
        o oVar = nVar.f7771a;
        this.f7831q.f9802e = r4.size();
        h1.l lVar = this.f7838x;
        q qVar = this.f7821e;
        if (!z10 && this.f7818b) {
            this.f7819c = nVar;
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                if (!(((Number) ((x.j) lVar.B).B.getValue()).floatValue() == 0.0f) && oVar != null && oVar.f7786a == qVar.f7808b.h() && i11 == qVar.f7809c.h()) {
                    lVar.a1();
                }
                return;
            } finally {
                z1.q.n(fVarF, fVarK, kVarE);
            }
        }
        if (z10) {
            this.f7818b = true;
        }
        this.f7836v.setValue(Boolean.valueOf(((oVar != null ? oVar.f7786a : 0) == 0 && i11 == 0) ? false : true));
        this.f7835u.setValue(Boolean.valueOf(nVar.f7773c));
        this.f7824h -= nVar.f7774d;
        this.f7822f.setValue(nVar);
        if (z11) {
            qVar.getClass();
            if (!(((float) i11) >= 0.0f)) {
                g0.a.c("scrollOffset should be non-negative");
            }
            qVar.f7809c.i(i11);
            lVar = lVar;
        } else {
            o oVar2 = (o) h00.q.N0((List) r4);
            o oVar3 = (o) h00.q.U0((List) r4);
            Trace.setCounter("firstVisibleItem:index", oVar2 != null ? oVar2.f7786a : -1L);
            Trace.setCounter("lastVisibleItem:index", oVar3 != null ? oVar3.f7786a : -1L);
            qVar.getClass();
            qVar.f7811e = oVar != null ? oVar.f7796k : null;
            if (qVar.f7810d || i10 > 0) {
                qVar.f7810d = true;
                if (!(((float) i11) >= r6)) {
                    g0.a.c("scrollOffset should be non-negative");
                }
                qVar.a(oVar != null ? oVar.f7786a : 0, i11);
            }
            if (this.f7827k) {
                a aVar = this.f7817a;
                int i12 = aVar.f7740a;
                boolean z12 = aVar.f7741b;
                if (i12 != -1 && !r4.isEmpty() && i12 != a.b(nVar, z12)) {
                    aVar.f7740a = -1;
                    u0 u0Var = (u0) aVar.f7744e;
                    if (u0Var != null) {
                        u0Var.cancel();
                    }
                    aVar.f7744e = null;
                }
                int i13 = aVar.f7742c;
                if (i13 != -1 && aVar.f7743d != r6 && i13 != i10 && !r4.isEmpty()) {
                    int iB = a.b(nVar, aVar.f7743d < 0);
                    if (iB >= 0 && iB < i10) {
                        aVar.f7740a = iB;
                        aVar.f7744e = gi.c.t(this.f7832r, iB);
                    }
                }
                aVar.f7742c = i10;
            }
        }
        if (z10) {
            lVar.b1(nVar.f7776f, nVar.f7779i, nVar.f7778h);
        }
    }

    public final n h() {
        return (n) this.f7822f.getValue();
    }

    public final void i(float f3, n nVar) {
        u0 u0Var;
        u0 u0Var2;
        if (this.f7827k) {
            ?? r4 = nVar.f7781k;
            ?? r7 = nVar.f7781k;
            boolean zIsEmpty = r4.isEmpty();
            a aVar = this.f7817a;
            if (!zIsEmpty) {
                boolean z10 = f3 < 0.0f;
                int iB = a.b(nVar, z10);
                if (iB >= 0 && iB < nVar.f7782n) {
                    if (iB != aVar.f7740a) {
                        if (aVar.f7741b != z10) {
                            aVar.f7740a = -1;
                            u0 u0Var3 = (u0) aVar.f7744e;
                            if (u0Var3 != null) {
                                u0Var3.cancel();
                            }
                            aVar.f7744e = null;
                        }
                        aVar.f7741b = z10;
                        aVar.f7740a = iB;
                        aVar.f7744e = gi.c.t(this.f7832r, iB);
                    }
                    if (z10) {
                        o oVar = (o) h00.q.T0((List) r7);
                        if (((oVar.f7798o + oVar.f7799p) + nVar.f7785q) - nVar.m < (-f3) && (u0Var2 = (u0) aVar.f7744e) != null) {
                            u0Var2.a();
                        }
                    } else if (nVar.l - ((o) h00.q.L0((List) r7)).f7798o < f3 && (u0Var = (u0) aVar.f7744e) != null) {
                        u0Var.a();
                    }
                }
            }
            aVar.f7743d = f3;
        }
    }

    public final void k(int i10) {
        q qVar = this.f7821e;
        if (qVar.f7808b.h() != i10 || qVar.f7809c.h() != 0) {
            f0 f0Var = this.f7829o;
            f0Var.e();
            f0Var.f9730b = null;
            f0Var.f9731c = -1;
        }
        qVar.a(i10, 0);
        qVar.f7811e = null;
        l0 l0Var = this.l;
        if (l0Var != null) {
            l0Var.l();
        }
    }
}
