package k9;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

public final class h2 implements androidx.media3.common.d1 {
    public final WeakReference A;
    public final WeakReference B;

    public h2(s1 s1Var, v3 v3Var) {
        this.A = new WeakReference(s1Var);
        this.B = new WeakReference(v3Var);
    }

    @Override
    public final void A(int i10, boolean z10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.c(i10, z10);
        s1VarB.f9415c.a(true, true);
        try {
            q2 q2Var = ((t2) s1VarB.f9420h.f9465h.E).m;
            if (q2Var != null) {
                if (z10) {
                    i10 = 0;
                }
                q2Var.f9403d = i10;
                if (q2Var.f9404e == null) {
                    q2Var.f9404e = new l9.l0(q2Var, q2Var.f9400a, q2Var.f9401b, q2Var.f9403d, q2Var.f9402c, 0);
                }
                q2Var.f9404e.setCurrentVolume(i10);
            }
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void C(long j9) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.getClass();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void D(androidx.media3.common.t0 t0Var) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var2 = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var2, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.x();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void E(androidx.media3.common.t0 t0Var) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        s1VarB.f9429s = s1VarB.f9429s.g(t0Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.n(t0Var);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void F(long j9) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j10 = t3Var.C;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j10, j9, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.getClass();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void G(androidx.media3.common.q2 q2Var) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.o(q2Var);
        s1VarB.f9415c.a(true, true);
        s1VarB.f(new j7.e(18));
    }

    @Override
    public final void I() {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        oj.q qVar = s1VarB.f9419g.f9384f;
        fh.t0 t0VarC = qVar.C();
        for (int i10 = 0; i10 < t0VarC.size(); i10++) {
            a2 a2Var = (a2) t0VarC.get(i10);
            qVar.G(a2Var);
            s1VarB.e(a2Var, new j7.e(20));
        }
    }

    @Override
    public final void K(androidx.media3.common.s2 s2Var) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.b(s2Var);
        s1VarB.f9415c.a(true, false);
        s1VarB.f(new j7.e(19));
    }

    @Override
    public final void M(androidx.media3.common.l lVar) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.h();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void Q(long j9) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j10 = t3Var.C;
        long j11 = t3Var.D;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j10, j11, j9, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
    }

    @Override
    public final void R(PlaybackException playbackException) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            t2 t2Var = (t2) s1VarB.f9420h.f9465h.E;
            t2Var.P(t2Var.f9463f.f9430t);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void S(int i10, int i11) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f(new i7.p(i10, i11, 3));
    }

    @Override
    public final void T(androidx.media3.common.b1 b1Var) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.k(b1Var);
    }

    @Override
    public final void U(androidx.media3.common.e1 e1Var, androidx.media3.common.e1 e1Var2, int i10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.h(e1Var, e1Var2, i10);
        s1VarB.f9415c.a(true, true);
        try {
            t2 t2Var = (t2) s1VarB.f9420h.f9465h.E;
            t2Var.P(t2Var.f9463f.f9430t);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void V(boolean z10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z11 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z12 = t3Var.f9513u;
        boolean z13 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z11, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z12, z13, i16, i17, i18, z10, z14, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            t2 t2Var = (t2) s1VarB.f9420h.f9465h.E;
            t2Var.P(t2Var.f9463f.f9430t);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
        s1VarB.G();
    }

    @Override
    public final void a(androidx.media3.common.w2 w2Var) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.getClass();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    public final s1 b() {
        return (s1) this.A.get();
    }

    @Override
    public final void e(int i10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.i(i10);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.o(i10);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void f(int i10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        s1VarB.f9429s = t3Var.d(t3Var.f9515w, i10, t3Var.f9514v);
        s1VarB.f9415c.a(true, true);
        try {
            t2 t2Var = (t2) s1VarB.f9420h.f9465h.E;
            t2Var.P(t2Var.f9463f.f9430t);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void k(boolean z10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z11 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z12 = t3Var.f9513u;
        boolean z13 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z14 = t3Var.f9516x;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z11, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z12, z13, i16, i17, i18, z14, z10, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.getClass();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
        s1VarB.G();
    }

    @Override
    public final void m(int i10, boolean z10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        s1VarB.f9429s = t3Var.d(i10, t3Var.f9518z, z10);
        s1VarB.f9415c.a(true, true);
        try {
            t2 t2Var = (t2) s1VarB.f9420h.f9465h.E;
            t2Var.P(t2Var.f9463f.f9430t);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void n(float f3) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        s1VarB.f9429s = s1VarB.f9429s.p(f3);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.getClass();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void p(int i10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i11 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i12 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i13 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i14 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i11, c4Var, e1Var, e1Var2, i12, z0Var, i13, z10, w2Var, k2Var, i14, t0Var, f3, f10, dVar, i10, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.getClass();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void r(int i10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        v3 v3Var = (v3) this.B.get();
        if (v3Var == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.f(i10, v3Var.getPlayerError());
        s1VarB.f9415c.a(true, true);
        try {
            bb.d dVar = s1VarB.f9420h.f9465h;
            v3Var.getPlayerError();
            t2 t2Var = (t2) dVar.E;
            t2Var.P(t2Var.f9463f.f9430t);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void s(androidx.media3.common.d dVar) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.a(dVar);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.e(dVar);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void t(d7.c cVar) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        int i10 = t3Var.f9496b;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
    }

    @Override
    public final void u(int i10, androidx.media3.common.q0 q0Var) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        t3 t3Var = s1VarB.f9429s;
        PlaybackException playbackException = t3Var.f9495a;
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = t3Var.f9498d;
        androidx.media3.common.e1 e1Var2 = t3Var.f9499e;
        int i11 = t3Var.f9500f;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z10 = t3Var.f9503i;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z11 = t3Var.f9513u;
        boolean z12 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z13 = t3Var.f9516x;
        boolean z14 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var = t3Var.F;
        androidx.media3.common.q2 q2Var = t3Var.G;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        s1VarB.f9429s = new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z10, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z11, z12, i16, i17, i18, z13, z14, t0Var2, j9, j10, j11, s2Var, q2Var);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.k(q0Var);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void v(androidx.media3.common.k2 k2Var, int i10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        v3 v3Var = (v3) this.B.get();
        if (v3Var == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.n(k2Var, v3Var.b(), i10);
        s1VarB.f9415c.a(false, true);
        try {
            s1VarB.f9420h.f9465h.v(k2Var);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void w(boolean z10) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.k(z10);
        s1VarB.f9415c.a(true, true);
        try {
            s1VarB.f9420h.f9465h.q(z10);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    @Override
    public final void x(androidx.media3.common.z0 z0Var) {
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.J();
        if (((v3) this.B.get()) == null) {
            return;
        }
        s1VarB.f9429s = s1VarB.f9429s.e(z0Var);
        s1VarB.f9415c.a(true, true);
        try {
            t2 t2Var = (t2) s1VarB.f9420h.f9465h.E;
            t2Var.P(t2Var.f9463f.f9430t);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }
}
