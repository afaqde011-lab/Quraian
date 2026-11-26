package mb;

import android.os.SystemClock;
import b3.o0;
import l1.e1;
import l1.f1;
import l1.i1;
import z2.d0;

public final class t extends m2.b {
    public m2.b E;
    public final m2.b F;
    public final z2.p G;
    public final int H;
    public final boolean I;
    public boolean L;
    public final f1 J = new f1(0);
    public long K = -1;
    public final e1 M = new e1(1.0f);
    public final i1 N = l1.q.z(null);

    public t(m2.b bVar, m2.b bVar2, z2.p pVar, int i10, boolean z10) {
        this.E = bVar;
        this.F = bVar2;
        this.G = pVar;
        this.H = i10;
        this.I = z10;
    }

    @Override
    public final void a(float f3) {
        this.M.i(f3);
    }

    @Override
    public final void e(i2.m mVar) {
        this.N.setValue(mVar);
    }

    @Override
    public final long h() {
        m2.b bVar = this.E;
        long jH = bVar != null ? bVar.h() : 0L;
        m2.b bVar2 = this.F;
        long jH2 = bVar2 != null ? bVar2.h() : 0L;
        boolean z10 = jH != 9205357640488583168L;
        boolean z11 = jH2 != 9205357640488583168L;
        if (z10 && z11) {
            return ca.v.i(Math.max(h2.e.e(jH), h2.e.e(jH2)), Math.max(h2.e.b(jH), h2.e.b(jH2)));
        }
        return 9205357640488583168L;
    }

    @Override
    public final void i(o0 o0Var) {
        boolean z10 = this.L;
        e1 e1Var = this.M;
        m2.b bVar = this.F;
        if (z10) {
            j(o0Var, bVar, e1Var.h());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.K == -1) {
            this.K = jUptimeMillis;
        }
        float f3 = (jUptimeMillis - this.K) / this.H;
        float fH = e1Var.h() * ab.a0.x(f3, 0.0f, 1.0f);
        float fH2 = this.I ? e1Var.h() - fH : e1Var.h();
        this.L = f3 >= 1.0f;
        j(o0Var, this.E, fH2);
        j(o0Var, bVar, fH);
        if (this.L) {
            this.E = null;
        } else {
            f1 f1Var = this.J;
            f1Var.i(f1Var.h() + 1);
        }
    }

    public final void j(o0 o0Var, m2.b bVar, float f3) {
        k2.b bVar2 = o0Var.A;
        if (bVar == null || f3 <= 0.0f) {
            return;
        }
        long jB = bVar2.b();
        long jH = bVar.h();
        long jP = (jH == 9205357640488583168L || h2.e.f(jH) || jB == 9205357640488583168L || h2.e.f(jB)) ? jB : d0.p(jH, this.G.a(jH, jB));
        i1 i1Var = this.N;
        if (jB == 9205357640488583168L || h2.e.f(jB)) {
            bVar.g(o0Var, jP, f3, (i2.m) i1Var.getValue());
            return;
        }
        float f10 = 2;
        float fE = (h2.e.e(jB) - h2.e.e(jP)) / f10;
        float fB = (h2.e.b(jB) - h2.e.b(jP)) / f10;
        ((hf.c) bVar2.B.B).D(fE, fB, fE, fB);
        bVar.g(o0Var, jP, f3, (i2.m) i1Var.getValue());
        float f11 = -fE;
        float f12 = -fB;
        ((hf.c) bVar2.B.B).D(f11, f12, f11, f12);
    }
}
