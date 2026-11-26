package mb;

import a40.m0;
import a40.w1;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b3.o0;
import d40.p1;
import java.util.concurrent.CancellationException;
import l1.e1;
import l1.i1;
import l1.y1;

public final class j extends m2.b implements y1 {
    public f40.c E;
    public final p1 F = d40.o.c(new h2.e(0));
    public final i1 G = l1.q.z(null);
    public final e1 H = new e1(1.0f);
    public final i1 I = l1.q.z(null);
    public h J;
    public m2.b K;
    public u00.k L;
    public u00.k M;
    public z2.p N;
    public int O;
    public boolean P;
    public final i1 Q;
    public final i1 R;
    public final i1 S;

    public j(wb.i iVar, lb.f fVar) {
        d dVar = d.f10805a;
        this.J = dVar;
        this.L = b.C;
        this.N = z2.o.f17146b;
        this.O = 1;
        this.Q = l1.q.z(dVar);
        this.R = l1.q.z(iVar);
        this.S = l1.q.z(fVar);
    }

    @Override
    public final void a(float f3) {
        this.H.i(f3);
    }

    @Override
    public final void b() {
        f40.c cVar = this.E;
        if (cVar != null) {
            a40.c0.i(cVar, (CancellationException) null);
        }
        this.E = null;
        Object obj = this.K;
        y1 y1Var = obj instanceof y1 ? (y1) obj : null;
        if (y1Var != null) {
            y1Var.b();
        }
    }

    @Override
    public final void c() {
        f40.c cVar = this.E;
        if (cVar != null) {
            a40.c0.i(cVar, (CancellationException) null);
        }
        this.E = null;
        Object obj = this.K;
        y1 y1Var = obj instanceof y1 ? (y1) obj : null;
        if (y1Var != null) {
            y1Var.c();
        }
    }

    @Override
    public final void d() {
        if (this.E != null) {
            return;
        }
        w1 w1VarE = a40.c0.e();
        h40.e eVar = m0.a;
        f40.c cVarC = a40.c0.c(rd.a.P(w1VarE, f40.m.a.F));
        this.E = cVarC;
        Object obj = this.K;
        k00.c cVar = null;
        y1 y1Var = obj instanceof y1 ? (y1) obj : null;
        if (y1Var != null) {
            y1Var.d();
        }
        if (!this.P) {
            a40.c0.y(cVarC, (k00.i) null, (a40.a0) null, new l6.d(this, cVar, 3), 3);
            return;
        }
        wb.h hVarA = wb.i.a((wb.i) this.R.getValue());
        hVarA.f15917b = ((lb.j) ((lb.f) this.S.getValue())).f10207b;
        hVarA.f15934u = null;
        hVarA.a().B.getClass();
        wb.c cVar2 = bc.c.f2479a;
        l(new f(null));
    }

    @Override
    public final void e(i2.m mVar) {
        this.I.setValue(mVar);
    }

    @Override
    public final long h() {
        m2.b bVar = (m2.b) this.G.getValue();
        if (bVar != null) {
            return bVar.h();
        }
        return 9205357640488583168L;
    }

    @Override
    public final void i(o0 o0Var) {
        k2.b bVar = o0Var.A;
        h2.e eVar = new h2.e(bVar.b());
        p1 p1Var = this.F;
        p1Var.getClass();
        p1Var.k((Object) null, eVar);
        m2.b bVar2 = (m2.b) this.G.getValue();
        if (bVar2 != null) {
            bVar2.g(o0Var, bVar.b(), this.H.h(), (i2.m) this.I.getValue());
        }
    }

    public final h j() {
        return (h) this.Q.getValue();
    }

    public final m2.b k(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new td.b(drawable.mutate());
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        i2.d dVar = new i2.d(bitmap);
        int i10 = this.O;
        m2.a aVar = new m2.a(dVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        aVar.G = i10;
        return aVar;
    }

    public final void l(h hVar) {
        wb.j jVar;
        m2.b bVarA;
        u00.k kVar;
        Object objA;
        y1 y1Var;
        y1 y1Var2;
        h hVar2 = this.J;
        h hVar3 = (h) this.L.invoke(hVar);
        this.J = hVar3;
        this.Q.setValue(hVar3);
        if (!(hVar3 instanceof g)) {
            if (hVar3 instanceof e) {
                jVar = ((e) hVar3).f10807b;
            } else {
                bVarA = null;
            }
            if (bVarA == null) {
                bVarA = hVar3.a();
            }
            this.K = bVarA;
            this.G.setValue(bVarA);
            if (this.E != null && hVar2.a() != hVar3.a()) {
                objA = hVar2.a();
                if (objA instanceof y1) {
                    y1Var = (y1) objA;
                } else {
                    y1Var = null;
                }
                if (y1Var != null) {
                    y1Var.c();
                }
                Object objA2 = hVar3.a();
                y1Var2 = objA2 instanceof y1 ? (y1) objA2 : null;
                if (y1Var2 != null) {
                    y1Var2.d();
                }
            }
            kVar = this.M;
            if (kVar != null) {
                kVar.invoke(hVar3);
            }
        }
        jVar = ((g) hVar3).f10810b;
        ac.f fVarA = jVar.b().f15943i.a(l.f10811a, jVar);
        if (fVarA instanceof ac.b) {
            bVarA = new t(hVar2 instanceof f ? hVar2.a() : null, hVar3.a(), this.N, ((ac.b) fVarA).f431c, ((jVar instanceof wb.p) && ((wb.p) jVar).f15981g) ? false : true);
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            bVarA = hVar3.a();
        }
        this.K = bVarA;
        this.G.setValue(bVarA);
        if (this.E != null) {
            objA = hVar2.a();
            if (objA instanceof y1) {
                y1Var = (y1) objA;
            } else {
                y1Var = null;
            }
            if (y1Var != null) {
                y1Var.c();
            }
            Object objA3 = hVar3.a();
            if (objA3 instanceof y1) {
            }
            if (y1Var2 != null) {
                y1Var2.d();
            }
        }
        kVar = this.M;
        if (kVar != null) {
            kVar.invoke(hVar3);
        }
    }
}
