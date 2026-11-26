package a1;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

public final class h implements r3.r {

    public w0 f49a;

    public a40.u1 f50b;

    public b1 f51c;

    public d40.d1 f52d;

    @Override
    public final void a() {
        j(null);
    }

    @Override
    public final void b() {
        c3.t2 t2Var;
        w0 w0Var = this.f49a;
        if (w0Var == null || (t2Var = (c3.t2) b3.m.h(w0Var, c3.o1.f2741q)) == null) {
            return;
        }
        ((c3.p1) t2Var).b();
    }

    @Override
    public final void c(r3.w wVar, r3.w wVar2) {
        b1 b1Var = this.f51c;
        if (b1Var != null) {
            boolean z10 = (m3.q0.c(b1Var.f23h.f13100b, wVar2.f13100b) && kotlin.jvm.internal.m.a(b1Var.f23h.f13101c, wVar2.f13101c)) ? false : true;
            b1Var.f23h = wVar2;
            int size = b1Var.f25j.size();
            for (int i10 = 0; i10 < size; i10++) {
                f1 f1Var = (f1) ((WeakReference) b1Var.f25j.get(i10)).get();
                if (f1Var != null) {
                    f1Var.f40g = wVar2;
                }
            }
            y0 y0Var = b1Var.m;
            synchronized (y0Var.f142c) {
                y0Var.f149j = null;
                y0Var.l = null;
                y0Var.f150k = null;
                y0Var.m = null;
                y0Var.f151n = null;
            }
            if (kotlin.jvm.internal.m.a(wVar, wVar2)) {
                if (z10) {
                    u0 u0Var = b1Var.f17b;
                    int iG = m3.q0.g(wVar2.f13100b);
                    int iF = m3.q0.f(wVar2.f13100b);
                    m3.q0 q0Var = b1Var.f23h.f13101c;
                    int iG2 = q0Var != null ? m3.q0.g(q0Var.f10520a) : -1;
                    m3.q0 q0Var2 = b1Var.f23h.f13101c;
                    u0Var.I().updateSelection((View) u0Var.B, iG, iF, iG2, q0Var2 != null ? m3.q0.f(q0Var2.f10520a) : -1);
                    return;
                }
                return;
            }
            if (wVar != null && (!kotlin.jvm.internal.m.a(wVar.f13099a.B, wVar2.f13099a.B) || (m3.q0.c(wVar.f13100b, wVar2.f13100b) && !kotlin.jvm.internal.m.a(wVar.f13101c, wVar2.f13101c)))) {
                u0 u0Var2 = b1Var.f17b;
                u0Var2.I().restartInput((View) u0Var2.B);
                return;
            }
            int size2 = b1Var.f25j.size();
            for (int i11 = 0; i11 < size2; i11++) {
                f1 f1Var2 = (f1) ((WeakReference) b1Var.f25j.get(i11)).get();
                if (f1Var2 != null) {
                    r3.w wVar3 = b1Var.f23h;
                    u0 u0Var3 = b1Var.f17b;
                    if (f1Var2.f44k) {
                        f1Var2.f40g = wVar3;
                        if (f1Var2.f42i) {
                            u0Var3.I().updateExtractedText((View) u0Var3.B, f1Var2.f41h, x0.g(wVar3));
                        }
                        m3.q0 q0Var3 = wVar3.f13101c;
                        long j9 = wVar3.f13100b;
                        int iG3 = q0Var3 != null ? m3.q0.g(q0Var3.f10520a) : -1;
                        m3.q0 q0Var4 = wVar3.f13101c;
                        u0Var3.I().updateSelection((View) u0Var3.B, m3.q0.g(j9), m3.q0.f(j9), iG3, q0Var4 != null ? m3.q0.f(q0Var4.f10520a) : -1);
                    }
                }
            }
        }
    }

    @Override
    public final void d() {
        a40.u1 u1Var = this.f50b;
        if (u1Var != null) {
            u1Var.i((CancellationException) null);
        }
        this.f50b = null;
        d40.d1 d1VarI = i();
        if (d1VarI != null) {
            d1VarI.a();
        }
    }

    @Override
    public final void e(r3.w wVar, r3.j jVar, q0.t1 t1Var, q0.r0 r0Var) {
        j(new a(wVar, this, jVar, t1Var, r0Var, 0));
    }

    @Override
    public final void f() {
        c3.t2 t2Var;
        w0 w0Var = this.f49a;
        if (w0Var == null || (t2Var = (c3.t2) b3.m.h(w0Var, c3.o1.f2741q)) == null) {
            return;
        }
        ((c3.p1) t2Var).a();
    }

    @Override
    public final void g(r3.w wVar, r3.p pVar, m3.n0 n0Var, a20.d dVar, h2.c cVar, h2.c cVar2) {
        b1 b1Var = this.f51c;
        if (b1Var != null) {
            y0 y0Var = b1Var.m;
            synchronized (y0Var.f142c) {
                try {
                    y0Var.f149j = wVar;
                    y0Var.l = pVar;
                    y0Var.f150k = n0Var;
                    y0Var.m = cVar;
                    y0Var.f151n = cVar2;
                    if (y0Var.f144e || y0Var.f143d) {
                        y0Var.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override
    public final void h(h2.c cVar) {
        Rect rect;
        b1 b1Var = this.f51c;
        if (b1Var != null) {
            b1Var.l = new Rect(w00.a.F(cVar.f6546a), w00.a.F(cVar.f6547b), w00.a.F(cVar.f6548c), w00.a.F(cVar.f6549d));
            if (!b1Var.f25j.isEmpty() || (rect = b1Var.l) == null) {
                return;
            }
            b1Var.f16a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final d40.w0 i() {
        d40.d1 d1Var = this.f52d;
        if (d1Var != null) {
            return d1Var;
        }
        if (!y0.d.f16583a) {
            return null;
        }
        d40.d1 d1VarB = d40.o.b(0, 2, c40.a.C);
        this.f52d = d1VarB;
        return d1VarB;
    }

    public final void j(a aVar) {
        w0 w0Var = this.f49a;
        if (w0Var == null) {
            return;
        }
        a40.u1 u1Var = null;
        this.f50b = w0Var.N ? a40.c0.y(w0Var.p1(), (k00.i) null, a40.a0.D, new d(w0Var, new g((Object) aVar, (Object) this, (Object) w0Var, (k00.c) u1Var, 0), u1Var, 4), 1) : null;
    }

    public final void k(w0 w0Var) {
        if (this.f49a != w0Var) {
            g0.a.c("Expected textInputModifierNode to be " + w0Var + " but was " + this.f49a);
        }
        this.f49a = null;
    }
}
