package j7;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b1;
import androidx.media3.common.c1;
import androidx.media3.common.d1;
import androidx.media3.common.e1;
import androidx.media3.common.f1;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.l;
import androidx.media3.common.q0;
import androidx.media3.common.q2;
import androidx.media3.common.s2;
import androidx.media3.common.t0;
import androidx.media3.common.v0;
import androidx.media3.common.w2;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.ExoPlaybackException;
import e7.b0;
import e7.d0;
import e7.i0;
import e7.m;
import e7.p;
import fh.i2;
import i7.t;
import i7.u;
import i7.z;
import j2.n;
import java.io.IOException;
import java.util.List;
import s7.a0;
import s7.g0;
import s7.r;
import s7.w;
import ta.c0;
import th.o;

public final class f implements d1, g0, n7.i {
    public final b0 A;
    public final h2 B;
    public final j2 C;
    public final o D;
    public final SparseArray E;
    public p F;
    public f1 G;
    public d0 H;
    public boolean I;

    public f(b0 b0Var) {
        b0Var.getClass();
        this.A = b0Var;
        this.F = new p(i0.r().getThread());
        h2 h2Var = new h2();
        this.B = h2Var;
        this.C = new j2();
        this.D = new o(h2Var);
        this.E = new SparseArray();
    }

    @Override
    public final void A(int i10, boolean z10) {
        b0(W(), 30, new n(16));
    }

    @Override
    public final void B(int i10, a0 a0Var, int i11) {
        b0(Z(i10, a0Var), 1022, new c(9));
    }

    @Override
    public final void C(long j9) {
        b0(W(), 16, new c(6));
    }

    @Override
    public final void D(t0 t0Var) {
        b0(W(), 14, new n(28));
    }

    @Override
    public final void E(t0 t0Var) {
        b0(W(), 15, new n(23));
    }

    @Override
    public final void F(long j9) {
        b0(W(), 17, new c(28));
    }

    @Override
    public final void G(q2 q2Var) {
        b0(W(), 19, new c(26));
    }

    @Override
    public final void H(v0 v0Var) {
        b0(W(), 28, new n(9));
    }

    @Override
    public final void I() {
    }

    @Override
    public final void J(boolean z10) {
        b0(a0(), 23, new c(20));
    }

    @Override
    public final void K(s2 s2Var) {
        b0(W(), 2, new n(11));
    }

    @Override
    public final void L(List list) {
        a aVarW = W();
        b0(aVarW, 27, new t(aVarW, list));
    }

    @Override
    public final void M(l lVar) {
        b0(W(), 29, new n(22));
    }

    @Override
    public final void N(int i10, boolean z10) {
        b0(W(), -1, new n(7));
    }

    @Override
    public final void O(int i10, a0 a0Var, gj.e eVar) {
        b0(Z(i10, a0Var), 1023, new c(21));
    }

    @Override
    public final void P(PlaybackException playbackException) {
        a0 a0Var;
        b0((!(playbackException instanceof ExoPlaybackException) || (a0Var = ((ExoPlaybackException) playbackException).O) == null) ? W() : Y(a0Var), 10, new n(15));
    }

    @Override
    public final void Q(long j9) {
        b0(W(), 18, new c(17));
    }

    @Override
    public final void R(PlaybackException playbackException) {
        a0 a0Var;
        a aVarW = (!(playbackException instanceof ExoPlaybackException) || (a0Var = ((ExoPlaybackException) playbackException).O) == null) ? W() : Y(a0Var);
        b0(aVarW, 10, new b(aVarW, playbackException));
    }

    @Override
    public final void S(int i10, int i11) {
        b0(a0(), 24, new c(0));
    }

    @Override
    public final void T(b1 b1Var) {
        b0(W(), 13, new n(2));
    }

    @Override
    public final void U(e1 e1Var, e1 e1Var2, int i10) {
        if (i10 == 1) {
            this.I = false;
        }
        f1 f1Var = this.G;
        f1Var.getClass();
        o oVar = this.D;
        oVar.E = o.y(f1Var, (fh.t0) oVar.C, (a0) oVar.F, (h2) oVar.B);
        a aVarW = W();
        b0(aVarW, 11, new androidx.media3.cast.n(aVarW, i10, e1Var, e1Var2));
    }

    @Override
    public final void V(boolean z10) {
        b0(W(), 7, new n(10));
    }

    public final a W() {
        return Y((a0) this.D.E);
    }

    public final a X(k2 k2Var, int i10, a0 a0Var) {
        a0 a0Var2 = k2Var.isEmpty() ? null : a0Var;
        this.A.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = k2Var.equals(this.G.getCurrentTimeline()) && i10 == this.G.getCurrentMediaItemIndex();
        long jW = 0;
        if (a0Var2 == null || !a0Var2.b()) {
            if (z10) {
                jW = this.G.getContentPosition();
            } else if (!k2Var.isEmpty()) {
                jW = i0.W(k2Var.getWindow(i10, this.C).l);
            }
        } else if (z10 && this.G.getCurrentAdGroupIndex() == a0Var2.f13645b && this.G.getCurrentAdIndexInAdGroup() == a0Var2.f13646c) {
            jW = this.G.getCurrentPosition();
        }
        return new a(jElapsedRealtime, k2Var, i10, a0Var2, jW, this.G.getCurrentTimeline(), this.G.getCurrentMediaItemIndex(), (a0) this.D.E, this.G.getCurrentPosition(), this.G.getTotalBufferedDuration());
    }

    public final a Y(a0 a0Var) {
        this.G.getClass();
        k2 k2Var = a0Var == null ? null : (k2) ((i2) this.D.D).get(a0Var);
        if (a0Var != null && k2Var != null) {
            return X(k2Var, k2Var.getPeriodByUid(a0Var.f13644a, this.B).f1233c, a0Var);
        }
        int currentMediaItemIndex = this.G.getCurrentMediaItemIndex();
        k2 currentTimeline = this.G.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = k2.EMPTY;
        }
        return X(currentTimeline, currentMediaItemIndex, null);
    }

    public final a Z(int i10, a0 a0Var) {
        this.G.getClass();
        if (a0Var != null) {
            return ((k2) ((i2) this.D.D).get(a0Var)) != null ? Y(a0Var) : X(k2.EMPTY, i10, a0Var);
        }
        k2 currentTimeline = this.G.getCurrentTimeline();
        if (i10 >= currentTimeline.getWindowCount()) {
            currentTimeline = k2.EMPTY;
        }
        return X(currentTimeline, i10, null);
    }

    @Override
    public final void a(w2 w2Var) {
        a aVarA0 = a0();
        b0(aVarA0, 25, new u(aVarA0, w2Var));
    }

    public final a a0() {
        return Y((a0) this.D.G);
    }

    @Override
    public final void b(int i10, a0 a0Var, r rVar, w wVar) {
        b0(Z(i10, a0Var), 1001, new c(11));
    }

    public final void b0(a aVar, int i10, m mVar) {
        this.E.put(i10, aVar);
        this.F.f(i10, mVar);
    }

    @Override
    public final void c(int i10, a0 a0Var, r rVar, w wVar, int i11) {
        b0(Z(i10, a0Var), 1000, new c(1));
    }

    public final void c0(z zVar, Looper looper) {
        c0.A(this.G == null || ((fh.t0) this.D.C).isEmpty());
        zVar.getClass();
        this.G = zVar;
        this.H = this.A.a(looper, null);
        p pVar = this.F;
        ak.a aVar = new ak.a(this, zVar, 6);
        pVar.getClass();
        b0 b0Var = this.A;
        c0.A(b0Var != null);
        this.F = new p(pVar.f5159d, looper, looper.getThread(), b0Var, aVar, pVar.f5164i);
    }

    @Override
    public final void d(int i10, a0 a0Var) {
        b0(Z(i10, a0Var), 1027, new c(18));
    }

    @Override
    public final void e(int i10) {
        b0(W(), 8, new n(25));
    }

    @Override
    public final void f(int i10) {
        b0(W(), 6, new n(13));
    }

    @Override
    public final void g(boolean z10) {
    }

    @Override
    public final void h(int i10) {
    }

    @Override
    public final void i(int i10, a0 a0Var) {
        b0(Z(i10, a0Var), 1025, new c(22));
    }

    @Override
    public final void j(int i10, a0 a0Var, r rVar, w wVar) {
        b0(Z(i10, a0Var), 1002, new c(7));
    }

    @Override
    public final void k(boolean z10) {
        b0(W(), 3, new c(29));
    }

    @Override
    public final void l(f1 f1Var, c1 c1Var) {
    }

    @Override
    public final void m(int i10, boolean z10) {
        b0(W(), 5, new n(17));
    }

    @Override
    public final void n(float f3) {
        b0(a0(), 22, new n(5));
    }

    @Override
    public final void o(int i10, a0 a0Var, w wVar) {
        b0(Z(i10, a0Var), 1005, new c(23));
    }

    @Override
    public final void p(int i10) {
        b0(a0(), 21, new c(14));
    }

    @Override
    public final void q(int i10, a0 a0Var, w wVar) {
        a aVarZ = Z(i10, a0Var);
        b0(aVarZ, 1004, new ak.a(aVarZ, wVar, 7));
    }

    @Override
    public final void r(int i10) {
        b0(W(), 4, new n(21));
    }

    @Override
    public final void s(androidx.media3.common.d dVar) {
        b0(a0(), 20, new n(8));
    }

    @Override
    public final void t(d7.c cVar) {
        b0(W(), 27, new n(20));
    }

    @Override
    public final void u(int i10, q0 q0Var) {
        b0(W(), 1, new n(4));
    }

    @Override
    public final void v(k2 k2Var, int i10) {
        f1 f1Var = this.G;
        f1Var.getClass();
        o oVar = this.D;
        oVar.E = o.y(f1Var, (fh.t0) oVar.C, (a0) oVar.F, (h2) oVar.B);
        oVar.Q(f1Var.getCurrentTimeline());
        b0(W(), 0, new n(3));
    }

    @Override
    public final void w(boolean z10) {
        b0(W(), 9, new n(29));
    }

    @Override
    public final void x(z0 z0Var) {
        b0(W(), 12, new n(1));
    }

    @Override
    public final void y(int i10, a0 a0Var, r rVar, w wVar, IOException iOException, boolean z10) {
        a aVarZ = Z(i10, a0Var);
        b0(aVarZ, 1003, new ab.r(aVarZ, rVar, wVar, iOException, z10));
    }

    @Override
    public final void z(int i10, a0 a0Var, Exception exc) {
        b0(Z(i10, a0Var), 1024, new c(10));
    }
}
