package k9;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;

public final class t3 {
    public static final t3 H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;

    public static final String f9479a0;

    public static final String f9480b0;

    public static final String f9481c0;

    public static final String f9482d0;

    public static final String f9483e0;

    public static final String f9484f0;

    public static final String f9485g0;

    public static final String f9486h0;

    public static final String f9487i0;

    public static final String f9488j0;

    public static final String f9489k0;

    public static final String f9490l0;

    public static final String f9491m0;

    public static final String f9492n0;

    public static final String f9493o0;

    public static final String f9494p0;
    public final int A;
    public final androidx.media3.common.t0 B;
    public final long C;
    public final long D;
    public final long E;
    public final androidx.media3.common.s2 F;
    public final androidx.media3.common.q2 G;

    public final PlaybackException f9495a;

    public final int f9496b;

    public final c4 f9497c;

    public final androidx.media3.common.e1 f9498d;

    public final androidx.media3.common.e1 f9499e;

    public final int f9500f;

    public final androidx.media3.common.z0 f9501g;

    public final int f9502h;

    public final boolean f9503i;

    public final androidx.media3.common.k2 f9504j;

    public final int f9505k;
    public final androidx.media3.common.w2 l;
    public final androidx.media3.common.t0 m;

    public final float f9506n;

    public final float f9507o;

    public final int f9508p;

    public final androidx.media3.common.d f9509q;

    public final d7.c f9510r;

    public final androidx.media3.common.l f9511s;

    public final int f9512t;

    public final boolean f9513u;

    public final boolean f9514v;

    public final int f9515w;

    public final boolean f9516x;

    public final boolean f9517y;

    public final int f9518z;

    static {
        c4 c4Var = c4.l;
        androidx.media3.common.e1 e1Var = c4.f9243k;
        androidx.media3.common.z0 z0Var = androidx.media3.common.z0.f1685d;
        androidx.media3.common.w2 w2Var = androidx.media3.common.w2.f1669d;
        androidx.media3.common.k2 k2Var = androidx.media3.common.k2.EMPTY;
        androidx.media3.common.t0 t0Var = androidx.media3.common.t0.K;
        H = new t3(null, 0, c4Var, e1Var, e1Var, 0, z0Var, 0, false, w2Var, k2Var, 0, t0Var, 1.0f, 1.0f, androidx.media3.common.d.f1142i, 0, d7.c.f4764d, androidx.media3.common.l.f1313e, 0, false, false, 1, 0, 1, false, false, t0Var, 5000L, 15000L, 3000L, androidx.media3.common.s2.f1554b, androidx.media3.common.q2.J);
        String str = e7.i0.f5136a;
        I = Integer.toString(1, 36);
        J = Integer.toString(2, 36);
        K = Integer.toString(3, 36);
        L = Integer.toString(4, 36);
        M = Integer.toString(5, 36);
        N = Integer.toString(6, 36);
        O = Integer.toString(7, 36);
        P = Integer.toString(33, 36);
        Q = Integer.toString(8, 36);
        R = Integer.toString(9, 36);
        S = Integer.toString(10, 36);
        T = Integer.toString(11, 36);
        U = Integer.toString(12, 36);
        V = Integer.toString(13, 36);
        W = Integer.toString(14, 36);
        X = Integer.toString(15, 36);
        Y = Integer.toString(16, 36);
        Z = Integer.toString(17, 36);
        f9479a0 = Integer.toString(18, 36);
        f9480b0 = Integer.toString(19, 36);
        f9481c0 = Integer.toString(20, 36);
        f9482d0 = Integer.toString(21, 36);
        f9483e0 = Integer.toString(22, 36);
        f9484f0 = Integer.toString(23, 36);
        f9485g0 = Integer.toString(24, 36);
        f9486h0 = Integer.toString(25, 36);
        f9487i0 = Integer.toString(26, 36);
        f9488j0 = Integer.toString(27, 36);
        f9489k0 = Integer.toString(28, 36);
        f9490l0 = Integer.toString(29, 36);
        f9491m0 = Integer.toString(30, 36);
        f9492n0 = Integer.toString(31, 36);
        f9493o0 = Integer.toString(32, 36);
        f9494p0 = Integer.toString(34, 36);
    }

    public t3(PlaybackException playbackException, int i10, c4 c4Var, androidx.media3.common.e1 e1Var, androidx.media3.common.e1 e1Var2, int i11, androidx.media3.common.z0 z0Var, int i12, boolean z10, androidx.media3.common.w2 w2Var, androidx.media3.common.k2 k2Var, int i13, androidx.media3.common.t0 t0Var, float f3, float f10, androidx.media3.common.d dVar, int i14, d7.c cVar, androidx.media3.common.l lVar, int i15, boolean z11, boolean z12, int i16, int i17, int i18, boolean z13, boolean z14, androidx.media3.common.t0 t0Var2, long j9, long j10, long j11, androidx.media3.common.s2 s2Var, androidx.media3.common.q2 q2Var) {
        this.f9495a = playbackException;
        this.f9496b = i10;
        this.f9497c = c4Var;
        this.f9498d = e1Var;
        this.f9499e = e1Var2;
        this.f9500f = i11;
        this.f9501g = z0Var;
        this.f9502h = i12;
        this.f9503i = z10;
        this.l = w2Var;
        this.f9504j = k2Var;
        this.f9505k = i13;
        this.m = t0Var;
        this.f9506n = f3;
        this.f9507o = f10;
        this.f9508p = i14;
        this.f9509q = dVar;
        this.f9510r = cVar;
        this.f9511s = lVar;
        this.f9512t = i15;
        this.f9513u = z11;
        this.f9514v = z12;
        this.f9515w = i16;
        this.f9518z = i17;
        this.A = i18;
        this.f9516x = z13;
        this.f9517y = z14;
        this.B = t0Var2;
        this.C = j9;
        this.D = j10;
        this.E = j11;
        this.F = s2Var;
        this.G = q2Var;
    }

    public static t3 r(int i10, Bundle bundle) {
        PlaybackException playbackException;
        fh.d2 d2VarG;
        d7.c cVar;
        androidx.media3.common.l lVarB;
        androidx.media3.common.s2 s2Var;
        IBinder binder = bundle.getBinder(f9493o0);
        if (binder instanceof s3) {
            return ((s3) binder).f9437e;
        }
        Bundle bundle2 = bundle.getBundle(f9479a0);
        Throwable remoteException = null;
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.F);
            String string2 = bundle2.getString(PlaybackException.G);
            String string3 = bundle2.getString(PlaybackException.H);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th2 = remoteException;
            int i11 = bundle2.getInt(PlaybackException.D, 1000);
            Bundle bundle3 = bundle2.getBundle(PlaybackException.I);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th2, i11, bundle3, bundle2.getLong(PlaybackException.E, SystemClock.elapsedRealtime()));
        }
        int i12 = bundle.getInt(f9481c0, 0);
        Bundle bundle4 = bundle.getBundle(f9480b0);
        c4 c4VarB = bundle4 == null ? c4.l : c4.b(bundle4);
        Bundle bundle5 = bundle.getBundle(f9482d0);
        androidx.media3.common.e1 e1VarC = bundle5 == null ? c4.f9243k : androidx.media3.common.e1.c(bundle5);
        Bundle bundle6 = bundle.getBundle(f9483e0);
        androidx.media3.common.e1 e1VarC2 = bundle6 == null ? c4.f9243k : androidx.media3.common.e1.c(bundle6);
        int i13 = bundle.getInt(f9484f0, 0);
        Bundle bundle7 = bundle.getBundle(I);
        androidx.media3.common.z0 z0Var = bundle7 == null ? androidx.media3.common.z0.f1685d : new androidx.media3.common.z0(bundle7.getFloat(androidx.media3.common.z0.f1686e, 1.0f), bundle7.getFloat(androidx.media3.common.z0.f1687f, 1.0f));
        int i14 = bundle.getInt(J, 0);
        boolean z10 = bundle.getBoolean(K, false);
        Bundle bundle8 = bundle.getBundle(L);
        androidx.media3.common.k2 k2VarFromBundle = bundle8 == null ? androidx.media3.common.k2.EMPTY : androidx.media3.common.k2.fromBundle(bundle8);
        int i15 = bundle.getInt(f9492n0, 0);
        Bundle bundle9 = bundle.getBundle(M);
        androidx.media3.common.w2 w2Var = bundle9 == null ? androidx.media3.common.w2.f1669d : new androidx.media3.common.w2(bundle9.getFloat(androidx.media3.common.w2.f1672g, 1.0f), bundle9.getInt(androidx.media3.common.w2.f1670e, 0), bundle9.getInt(androidx.media3.common.w2.f1671f, 0));
        Bundle bundle10 = bundle.getBundle(N);
        androidx.media3.common.t0 t0VarB = bundle10 == null ? androidx.media3.common.t0.K : androidx.media3.common.t0.b(bundle10);
        float f3 = bundle.getFloat(O, 1.0f);
        float f10 = bundle.getFloat(P, 1.0f);
        int i16 = bundle.getInt(f9494p0, 0);
        Bundle bundle11 = bundle.getBundle(Q);
        androidx.media3.common.d dVarA = bundle11 == null ? androidx.media3.common.d.f1142i : androidx.media3.common.d.a(bundle11);
        Bundle bundle12 = bundle.getBundle(f9485g0);
        if (bundle12 == null) {
            cVar = d7.c.f4764d;
            w2Var = w2Var;
            t0VarB = t0VarB;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(d7.c.f4765e);
            if (parcelableArrayList == null) {
                d2VarG = fh.d2.E;
            } else {
                fh.q0 q0VarM = fh.t0.m();
                for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i17);
                    bundle13.getClass();
                    q0VarM.c(d7.b.b(bundle13));
                }
                d2VarG = q0VarM.g();
            }
            cVar = new d7.c(bundle12.getLong(d7.c.f4766f), d2VarG);
        }
        Bundle bundle14 = bundle.getBundle(R);
        if (bundle14 == null) {
            lVarB = androidx.media3.common.l.f1313e;
        } else {
            int i18 = bundle14.getInt(androidx.media3.common.l.f1314f, 0);
            int i19 = bundle14.getInt(androidx.media3.common.l.f1315g, 0);
            int i20 = bundle14.getInt(androidx.media3.common.l.f1316h, 0);
            String string4 = bundle14.getString(androidx.media3.common.l.f1317i);
            androidx.media3.common.k kVar = new androidx.media3.common.k(i18);
            kVar.f1299c = i19;
            kVar.f1300d = i20;
            ta.c0.s(i18 != 0 || string4 == null);
            kVar.f1301e = string4;
            lVarB = kVar.b();
        }
        int i21 = bundle.getInt(S, 0);
        boolean z11 = bundle.getBoolean(T, false);
        boolean z12 = bundle.getBoolean(U, false);
        int i22 = bundle.getInt(V, 1);
        int i23 = bundle.getInt(W, 0);
        int i24 = bundle.getInt(X, 1);
        boolean z13 = bundle.getBoolean(Y, false);
        boolean z14 = bundle.getBoolean(Z, false);
        Bundle bundle15 = bundle.getBundle(f9486h0);
        androidx.media3.common.t0 t0VarB2 = bundle15 == null ? androidx.media3.common.t0.K : androidx.media3.common.t0.b(bundle15);
        androidx.media3.common.l lVar = lVarB;
        long j9 = bundle.getLong(f9487i0, i10 < 4 ? 0L : 5000L);
        long j10 = bundle.getLong(f9488j0, i10 < 4 ? 0L : 15000L);
        long j11 = bundle.getLong(f9489k0, i10 < 4 ? 0L : 3000L);
        Bundle bundle16 = bundle.getBundle(f9491m0);
        if (bundle16 == null) {
            s2Var = androidx.media3.common.s2.f1554b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(androidx.media3.common.s2.f1555c);
            s2Var = new androidx.media3.common.s2(parcelableArrayList2 == null ? fh.d2.E : e7.d.e(new a8.n(12), parcelableArrayList2));
        }
        Bundle bundle17 = bundle.getBundle(f9490l0);
        return new t3(playbackException, i12, c4VarB, e1VarC, e1VarC2, i13, z0Var, i14, z10, w2Var, k2VarFromBundle, i15, t0VarB, f3, f10, dVarA, i16, cVar, lVar, i21, z11, z12, i22, i23, i24, z13, z14, t0VarB2, j9, j10, j11, s2Var, bundle17 == null ? androidx.media3.common.q2.J : androidx.media3.common.q2.b(bundle17));
    }

    public final t3 a(androidx.media3.common.d dVar) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, dVar, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 b(androidx.media3.common.s2 s2Var) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, s2Var, this.G);
    }

    public final t3 c(int i10, boolean z10) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, i10, z10, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 d(int i10, int i11, boolean z10) {
        int i12 = this.A;
        boolean z11 = i12 == 3 && z10 && i11 == 0;
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, z10, i10, i11, i12, z11, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 e(androidx.media3.common.z0 z0Var) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, z0Var, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 f(int i10, PlaybackException playbackException) {
        boolean z10 = this.f9514v;
        int i11 = this.f9518z;
        boolean z11 = i10 == 3 && z10 && i11 == 0;
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(playbackException, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, z10, this.f9515w, i11, i10, z11, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 g(androidx.media3.common.t0 t0Var) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, t0Var, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 h(androidx.media3.common.e1 e1Var, androidx.media3.common.e1 e1Var2, int i10) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, e1Var, e1Var2, i10, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 i(int i10) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, i10, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 j(c4 c4Var) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 k(boolean z10) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, z10, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 l(androidx.media3.common.k2 k2Var) {
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 m(x3 x3Var, int i10) {
        c4 c4Var = this.f9497c;
        androidx.media3.common.e1 e1Var = c4Var.f9253a;
        c4 c4Var2 = new c4(new androidx.media3.common.e1(e1Var.f1182a, i10, e1Var.f1184c, e1Var.f1185d, e1Var.f1186e, e1Var.f1187f, e1Var.f1188g, e1Var.f1189h, e1Var.f1190i), c4Var.f9254b, c4Var.f9255c, c4Var.f9256d, c4Var.f9257e, c4Var.f9258f, c4Var.f9259g, c4Var.f9260h, c4Var.f9261i, c4Var.f9262j);
        ta.c0.A(x3Var.isEmpty() || c4Var2.f9253a.f1183b < x3Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var2, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, x3Var, 0, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 n(androidx.media3.common.k2 k2Var, c4 c4Var, int i10) {
        ta.c0.A(k2Var.isEmpty() || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, i10, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 o(androidx.media3.common.q2 q2Var) {
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, this.f9506n, this.f9507o, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, q2Var);
    }

    public final t3 p(float f3) {
        float f10 = f3 != 0.0f ? f3 : this.f9506n;
        androidx.media3.common.k2 k2Var = this.f9504j;
        boolean zIsEmpty = k2Var.isEmpty();
        c4 c4Var = this.f9497c;
        ta.c0.A(zIsEmpty || c4Var.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4Var, this.f9498d, this.f9499e, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, this.m, f3, f10, this.f9509q, this.f9508p, this.f9510r, this.f9511s, this.f9512t, this.f9513u, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final t3 q(androidx.media3.common.b1 b1Var, boolean z10, boolean z11) {
        float f3;
        float f10;
        int i10;
        boolean z12;
        boolean zA = b1Var.a(16);
        boolean zA2 = b1Var.a(17);
        c4 c4Var = this.f9497c;
        c4 c4VarA = c4Var.a(zA, zA2);
        androidx.media3.common.e1 e1VarB = this.f9498d.b(zA, zA2);
        androidx.media3.common.e1 e1VarB2 = this.f9499e.b(zA, zA2);
        androidx.media3.common.k2 k2VarCopyWithSingleWindow = this.f9504j;
        if (!zA2 && zA && !k2VarCopyWithSingleWindow.isEmpty()) {
            k2VarCopyWithSingleWindow = k2VarCopyWithSingleWindow.copyWithSingleWindow(c4Var.f9253a.f1183b);
        } else if (z10 || !zA2) {
            k2VarCopyWithSingleWindow = androidx.media3.common.k2.EMPTY;
        }
        androidx.media3.common.k2 k2Var = k2VarCopyWithSingleWindow;
        androidx.media3.common.t0 t0Var = !b1Var.a(18) ? androidx.media3.common.t0.K : this.m;
        boolean zA3 = b1Var.a(22);
        float f11 = this.f9506n;
        if (zA3) {
            f3 = this.f9507o;
            f10 = f11;
        } else {
            if (1.0f != 0.0f) {
                f11 = 1.0f;
            }
            f3 = f11;
            f10 = 1.0f;
        }
        androidx.media3.common.d dVar = !b1Var.a(21) ? androidx.media3.common.d.f1142i : this.f9509q;
        d7.c cVar = !b1Var.a(28) ? d7.c.f4764d : this.f9510r;
        if (b1Var.a(23)) {
            i10 = this.f9512t;
            z12 = this.f9513u;
        } else {
            i10 = 0;
            z12 = false;
        }
        androidx.media3.common.t0 t0Var2 = !b1Var.a(18) ? androidx.media3.common.t0.K : this.B;
        androidx.media3.common.s2 s2Var = (z11 || !b1Var.a(30)) ? androidx.media3.common.s2.f1554b : this.F;
        ta.c0.A(k2Var.isEmpty() || c4VarA.f9253a.f1183b < k2Var.getWindowCount());
        return new t3(this.f9495a, this.f9496b, c4VarA, e1VarB, e1VarB2, this.f9500f, this.f9501g, this.f9502h, this.f9503i, this.l, k2Var, this.f9505k, t0Var, f10, f3, dVar, this.f9508p, cVar, this.f9511s, i10, z12, this.f9514v, this.f9515w, this.f9518z, this.A, this.f9516x, this.f9517y, t0Var2, this.C, this.D, this.E, s2Var, this.G);
    }

    public final androidx.media3.common.q0 s() {
        androidx.media3.common.k2 k2Var = this.f9504j;
        if (k2Var.isEmpty()) {
            return null;
        }
        return k2Var.getWindow(this.f9497c.f9253a.f1183b, new androidx.media3.common.j2()).f1285c;
    }

    public final Bundle t(int i10) {
        Bundle bundle = new Bundle();
        PlaybackException playbackException = this.f9495a;
        if (playbackException != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(PlaybackException.D, playbackException.A);
            bundle2.putLong(PlaybackException.E, playbackException.B);
            bundle2.putString(PlaybackException.F, playbackException.getMessage());
            bundle2.putBundle(PlaybackException.I, playbackException.C);
            Throwable cause = playbackException.getCause();
            if (cause != null) {
                bundle2.putString(PlaybackException.G, cause.getClass().getName());
                bundle2.putString(PlaybackException.H, cause.getMessage());
            }
            bundle.putBundle(f9479a0, bundle2);
        }
        int i11 = this.f9496b;
        if (i11 != 0) {
            bundle.putInt(f9481c0, i11);
        }
        c4 c4Var = this.f9497c;
        if (i10 < 3 || !c4Var.equals(c4.l)) {
            bundle.putBundle(f9480b0, c4Var.c(i10));
        }
        androidx.media3.common.e1 e1Var = this.f9498d;
        if (i10 < 3 || !c4.f9243k.a(e1Var)) {
            bundle.putBundle(f9482d0, e1Var.d(i10));
        }
        androidx.media3.common.e1 e1Var2 = this.f9499e;
        if (i10 < 3 || !c4.f9243k.a(e1Var2)) {
            bundle.putBundle(f9483e0, e1Var2.d(i10));
        }
        int i12 = this.f9500f;
        if (i12 != 0) {
            bundle.putInt(f9484f0, i12);
        }
        androidx.media3.common.z0 z0Var = androidx.media3.common.z0.f1685d;
        androidx.media3.common.z0 z0Var2 = this.f9501g;
        if (!z0Var2.equals(z0Var)) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(androidx.media3.common.z0.f1686e, z0Var2.f1688a);
            bundle3.putFloat(androidx.media3.common.z0.f1687f, z0Var2.f1689b);
            bundle.putBundle(I, bundle3);
        }
        int i13 = this.f9502h;
        if (i13 != 0) {
            bundle.putInt(J, i13);
        }
        boolean z10 = this.f9503i;
        if (z10) {
            bundle.putBoolean(K, z10);
        }
        androidx.media3.common.k2 k2Var = androidx.media3.common.k2.EMPTY;
        androidx.media3.common.k2 k2Var2 = this.f9504j;
        if (!k2Var2.equals(k2Var)) {
            bundle.putBundle(L, k2Var2.toBundle());
        }
        int i14 = this.f9505k;
        if (i14 != 0) {
            bundle.putInt(f9492n0, i14);
        }
        androidx.media3.common.w2 w2Var = androidx.media3.common.w2.f1669d;
        androidx.media3.common.w2 w2Var2 = this.l;
        if (!w2Var2.equals(w2Var)) {
            Bundle bundle4 = new Bundle();
            int i15 = w2Var2.f1673a;
            if (i15 != 0) {
                bundle4.putInt(androidx.media3.common.w2.f1670e, i15);
            }
            int i16 = w2Var2.f1674b;
            if (i16 != 0) {
                bundle4.putInt(androidx.media3.common.w2.f1671f, i16);
            }
            float f3 = w2Var2.f1675c;
            if (f3 != 1.0f) {
                bundle4.putFloat(androidx.media3.common.w2.f1672g, f3);
            }
            bundle.putBundle(M, bundle4);
        }
        androidx.media3.common.t0 t0Var = androidx.media3.common.t0.K;
        androidx.media3.common.t0 t0Var2 = this.m;
        if (!t0Var2.equals(t0Var)) {
            bundle.putBundle(N, t0Var2.c());
        }
        float f10 = this.f9506n;
        if (f10 != 1.0f) {
            bundle.putFloat(O, f10);
        }
        float f11 = this.f9507o;
        if (f11 != 1.0f) {
            bundle.putFloat(P, f11);
        }
        int i17 = this.f9508p;
        if (i17 != 0) {
            bundle.putInt(f9494p0, i17);
        }
        androidx.media3.common.d dVar = androidx.media3.common.d.f1142i;
        androidx.media3.common.d dVar2 = this.f9509q;
        if (!dVar2.equals(dVar)) {
            bundle.putBundle(Q, dVar2.c());
        }
        d7.c cVar = d7.c.f4764d;
        d7.c cVar2 = this.f9510r;
        if (!cVar2.equals(cVar)) {
            Bundle bundle5 = new Bundle();
            String str = d7.c.f4765e;
            fh.d2 d2Var = cVar2.f4767a;
            fh.q0 q0VarM = fh.t0.m();
            for (int i18 = 0; i18 < d2Var.D; i18++) {
                if (((d7.b) d2Var.get(i18)).f4750d == null) {
                    q0VarM.c((d7.b) d2Var.get(i18));
                }
            }
            fh.d2 d2VarG = q0VarM.g();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(d2VarG.D);
            fh.r0 r0VarListIterator = d2VarG.listIterator(0);
            while (r0VarListIterator.hasNext()) {
                d7.b bVar = (d7.b) r0VarListIterator.next();
                Bundle bundleC = bVar.c();
                Bitmap bitmap = bVar.f4750d;
                if (bitmap != null) {
                    bundleC.putParcelable(d7.b.f4743w, bitmap);
                }
                arrayList.add(bundleC);
            }
            bundle5.putParcelableArrayList(str, arrayList);
            bundle5.putLong(d7.c.f4766f, cVar2.f4768b);
            bundle.putBundle(f9485g0, bundle5);
        }
        androidx.media3.common.l lVar = androidx.media3.common.l.f1313e;
        androidx.media3.common.l lVar2 = this.f9511s;
        if (!lVar2.equals(lVar)) {
            Bundle bundle6 = new Bundle();
            int i19 = lVar2.f1318a;
            if (i19 != 0) {
                bundle6.putInt(androidx.media3.common.l.f1314f, i19);
            }
            int i20 = lVar2.f1319b;
            if (i20 != 0) {
                bundle6.putInt(androidx.media3.common.l.f1315g, i20);
            }
            int i21 = lVar2.f1320c;
            if (i21 != 0) {
                bundle6.putInt(androidx.media3.common.l.f1316h, i21);
            }
            String str2 = lVar2.f1321d;
            if (str2 != null) {
                bundle6.putString(androidx.media3.common.l.f1317i, str2);
            }
            bundle.putBundle(R, bundle6);
        }
        int i22 = this.f9512t;
        if (i22 != 0) {
            bundle.putInt(S, i22);
        }
        boolean z11 = this.f9513u;
        if (z11) {
            bundle.putBoolean(T, z11);
        }
        boolean z12 = this.f9514v;
        if (z12) {
            bundle.putBoolean(U, z12);
        }
        int i23 = this.f9515w;
        if (i23 != 1) {
            bundle.putInt(V, i23);
        }
        int i24 = this.f9518z;
        if (i24 != 0) {
            bundle.putInt(W, i24);
        }
        int i25 = this.A;
        if (i25 != 1) {
            bundle.putInt(X, i25);
        }
        boolean z13 = this.f9516x;
        if (z13) {
            bundle.putBoolean(Y, z13);
        }
        boolean z14 = this.f9517y;
        if (z14) {
            bundle.putBoolean(Z, z14);
        }
        androidx.media3.common.t0 t0Var3 = androidx.media3.common.t0.K;
        androidx.media3.common.t0 t0Var4 = this.B;
        if (!t0Var4.equals(t0Var3)) {
            bundle.putBundle(f9486h0, t0Var4.c());
        }
        long j9 = i10 < 6 ? 0L : 5000L;
        long j10 = this.C;
        if (j10 != j9) {
            bundle.putLong(f9487i0, j10);
        }
        long j11 = i10 < 6 ? 0L : 15000L;
        long j12 = this.D;
        if (j12 != j11) {
            bundle.putLong(f9488j0, j12);
        }
        long j13 = i10 >= 6 ? 3000L : 0L;
        long j14 = this.E;
        if (j14 != j13) {
            bundle.putLong(f9489k0, j14);
        }
        androidx.media3.common.s2 s2Var = androidx.media3.common.s2.f1554b;
        androidx.media3.common.s2 s2Var2 = this.F;
        if (!s2Var2.equals(s2Var)) {
            Bundle bundle7 = new Bundle();
            bundle7.putParcelableArrayList(androidx.media3.common.s2.f1555c, e7.d.k(s2Var2.f1556a, new a8.n(11)));
            bundle.putBundle(f9491m0, bundle7);
        }
        androidx.media3.common.q2 q2Var = androidx.media3.common.q2.J;
        androidx.media3.common.q2 q2Var2 = this.G;
        if (!q2Var2.equals(q2Var)) {
            bundle.putBundle(f9490l0, q2Var2.c());
        }
        return bundle;
    }
}
