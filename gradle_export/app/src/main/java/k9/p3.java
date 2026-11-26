package k9;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class p3 extends Binder implements m {

    public static final int f9382k = 0;

    public final WeakReference f9383e;

    public final oj.q f9384f;

    public final Set f9385g;

    public fh.c2 f9386h;

    public int f9387i;

    public o3 f9388j;

    public p3(s1 s1Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.f9383e = new WeakReference(s1Var);
        this.f9384f = new oj.q(s1Var);
        this.f9385g = Collections.synchronizedSet(new HashSet());
        this.f9386h = fh.c2.I;
    }

    public static kh.v h2(s1 s1Var, a2 a2Var, int i10, n3 n3Var, e7.h hVar) {
        if (s1Var.o()) {
            return kh.t.B;
        }
        kh.v vVar = (kh.v) n3Var.d(s1Var, a2Var, i10);
        kh.b0 b0Var = new kh.b0();
        vVar.a(new ab.k(s1Var, b0Var, hVar, vVar, 12), kh.p.A);
        return b0Var;
    }

    public static void m2(s1 s1Var, a2 a2Var, int i10, d4 d4Var) {
        try {
            z1 z1Var = a2Var.f9209d;
            z1Var.getClass();
            z1Var.u(i10, d4Var);
            s1Var.f9415c.a(true, true);
        } catch (RemoteException e3) {
            e7.a.n("MediaSessionStub", "Failed to send result to controller " + a2Var, e3);
        }
    }

    public static k7.t n2(e7.h hVar) {
        return new k7.t(new k7.t(hVar, 8), 7);
    }

    @Override
    public final void B(k kVar, int i10, boolean z10, int i11) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 34, n2(new androidx.media3.cast.m(i11, 3, z10)));
    }

    @Override
    public final void B0(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 8, n2(new j7.e(23)));
    }

    @Override
    public final void B1(k kVar, int i10, int i11) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 34, n2(new androidx.media3.cast.n(i11, 8)));
    }

    @Override
    public final void C0(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 24, n2(new j7.e(21)));
    }

    @Override
    public final void E1(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 2, n2(new b3(7)));
    }

    @Override
    public final void F(k kVar, int i10, int i11, int i12) {
        if (kVar == null || i11 < 0 || i12 < 0) {
            return;
        }
        k2(kVar, i10, 20, n2(new i7.p(i11, i12, 5)));
    }

    @Override
    public final void F0(k kVar, int i10, boolean z10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 26, n2(new androidx.media3.cast.o(5, z10)));
    }

    @Override
    public final void G0(k kVar, int i10) {
        a2 a2VarE;
        if (kVar == null || (a2VarE = this.f9384f.E(kVar.asBinder())) == null) {
            return;
        }
        l2(a2VarE, i10, 11, n2(new j7.e(25)));
    }

    @Override
    public final void G1(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 6, n2(new j7.e(27)));
    }

    @Override
    public final void H0(k kVar, int i10, int i11) {
        if (kVar == null || i11 < 0) {
            return;
        }
        k2(kVar, i10, 25, n2(new androidx.media3.cast.n(i11, 11)));
    }

    @Override
    public final void I0(k kVar, int i10, Surface surface) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 27, n2(new ak.a(this, surface, 20)));
    }

    @Override
    public final void I1(k kVar, int i10, float f3) {
        if (kVar == null || f3 <= 0.0f) {
            return;
        }
        k2(kVar, i10, 13, n2(new androidx.media3.cast.q(f3, 4)));
    }

    @Override
    public final void L0(k kVar) {
        if (kVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            s1 s1Var = (s1) this.f9383e.get();
            if (s1Var != null && !s1Var.o()) {
                a2 a2VarE = this.f9384f.E(kVar.asBinder());
                if (a2VarE != null) {
                    e7.i0.M(s1Var.l, new ji.a(this, a2VarE, 22));
                }
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override
    public final void M(k kVar, int i10, int i11, Bundle bundle) {
        if (kVar == null || bundle == null || i11 < 0) {
            return;
        }
        try {
            k2(kVar, i10, 20, new f3(new ak.a(new z2(1, androidx.media3.common.q0.a(bundle)), new y2(this, i11, 2), 22), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }

    @Override
    public final void M0(k kVar, int i10, Bundle bundle) {
        if (kVar == null || bundle == null) {
            return;
        }
        try {
            k2(kVar, i10, 19, n2(new i7.n(androidx.media3.common.t0.b(bundle), 2)));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaMetadata", e3);
        }
    }

    @Override
    public final void M1(k kVar, int i10, int i11, int i12) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 27, n2(new w2(this, i11, i12)));
    }

    @Override
    public final void N(k kVar, int i10) {
        a2 a2VarE;
        if (kVar == null || (a2VarE = this.f9384f.E(kVar.asBinder())) == null) {
            return;
        }
        l2(a2VarE, i10, 1, n2(new j7.e(22)));
    }

    @Override
    public final void N1(k kVar, int i10, final int i11, final int i12, final int i13) {
        if (kVar == null || i11 < 0 || i12 < i11 || i13 < 0) {
            return;
        }
        k2(kVar, i10, 20, n2(new e7.h() {
            @Override
            public final void accept(Object obj) {
                ((v3) obj).moveMediaItems(i11, i12, i13);
            }
        }));
    }

    @Override
    public final void P0(k kVar, int i10) {
        a2 a2VarE;
        if (kVar == null || (a2VarE = this.f9384f.E(kVar.asBinder())) == null) {
            return;
        }
        l2(a2VarE, i10, 9, n2(new j7.e(29)));
    }

    @Override
    public final void Q1(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            s1 s1Var = (s1) this.f9383e.get();
            if (s1Var != null && !s1Var.o()) {
                e7.i0.M(s1Var.l, new ji.a(this, kVar, 21));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override
    public final void R(final k kVar, final int i10, Bundle bundle, Bundle bundle2, boolean z10) {
        if (kVar == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            final z3 z3VarA = z3.a(bundle);
            if (!b.n(z3VarA.f9579b)) {
                f(kVar, i10, z3VarA, 0, new f3(new ak.a(z10, z3VarA, bundle2), 1));
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                final s1 s1Var = (s1) this.f9383e.get();
                if (s1Var != null && !s1Var.o()) {
                    final a2 a2VarE = this.f9384f.E(kVar.asBinder());
                    if (a2VarE == null) {
                        return;
                    }
                    e7.i0.M(s1Var.l, new Runnable() {
                        @Override
                        public final void run() {
                            z3 z3Var = z3VarA;
                            String str = z3Var.f9579b;
                            s1 s1Var2 = s1Var;
                            int i11 = i10;
                            p3 p3Var = this.A;
                            oj.q qVar = p3Var.f9384f;
                            a2 a2Var = a2VarE;
                            if (qVar.M(a2Var)) {
                                try {
                                    b bVarD = b.d(z3Var);
                                    Object obj = bVarD.f9231j;
                                    int i12 = bVarD.f9223b;
                                    if (!bVarD.b()) {
                                        e7.a.m("MediaSessionStub", "Can't execute predefined custom command: " + str);
                                        p3.m2(s1Var2, a2Var, i11, new d4(-6));
                                        return;
                                    }
                                    z3 z3Var2 = bVarD.f9222a;
                                    boolean zBooleanValue = false;
                                    if (z3Var2 != null) {
                                        ta.c0.A(z3Var2.f9578a == 40010);
                                        p3Var.f(kVar, i11, null, 40010, new f3(new j3(bVarD), 1));
                                        return;
                                    }
                                    v3 v3Var = s1Var2.f9430t;
                                    if (i12 == 1) {
                                        if (obj != null) {
                                            zBooleanValue = ((Boolean) obj).booleanValue();
                                        } else if (!v3Var.getPlayWhenReady()) {
                                            zBooleanValue = true;
                                        }
                                    }
                                    if (zBooleanValue) {
                                        p3Var.j2(a2Var, i11);
                                    } else if (i12 == 31) {
                                        obj.getClass();
                                        p3Var.l2(a2Var, i11, 31, new f3(new ak.a(new x2((androidx.media3.common.q0) obj, true, 0), new b3(9), 21), 1));
                                    } else {
                                        p3Var.l2(a2Var, i11, i12, p3.n2(new j3(bVarD)));
                                    }
                                    qVar.y(a2Var);
                                } catch (RuntimeException e3) {
                                    e7.a.n("MediaSessionStub", "Failed to convert predefined custom command: " + str, e3);
                                    p3.m2(s1Var2, a2Var, i11, new d4(-3));
                                }
                            }
                        }
                    });
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for SessionCommand", e3);
        }
    }

    @Override
    public final void S(k kVar, int i10, int i11, int i12) {
        if (kVar == null || i11 < 0) {
            return;
        }
        k2(kVar, i10, 33, n2(new i7.p(i11, i12, 4)));
    }

    @Override
    public final void S0(k kVar, int i10, int i11, IBinder iBinder) {
        if (kVar == null || iBinder == null || i11 < 0) {
            return;
        }
        try {
            fh.t0 t0VarA = androidx.media3.common.g.a(iBinder);
            fh.q0 q0VarM = fh.t0.m();
            for (int i12 = 0; i12 < t0VarA.size(); i12++) {
                Bundle bundle = (Bundle) t0VarA.get(i12);
                bundle.getClass();
                q0VarM.c(androidx.media3.common.q0.a(bundle));
            }
            k2(kVar, i10, 20, new f3(new ak.a(new i7.t(2, q0VarM.g()), new y2(this, i11, 3), 22), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }

    @Override
    public final void T1(k kVar, int i10, Bundle bundle) {
        if (kVar == null || bundle == null) {
            return;
        }
        try {
            k2(kVar, i10, 29, n2(new ak.a(this, androidx.media3.common.q2.b(bundle), 17)));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for TrackSelectionParameters", e3);
        }
    }

    @Override
    public final void U(k kVar, int i10, Bundle bundle) {
        if (kVar == null || bundle == null) {
            return;
        }
        try {
            k2(kVar, i10, 13, n2(new c0(new androidx.media3.common.z0(bundle.getFloat(androidx.media3.common.z0.f1686e, 1.0f), bundle.getFloat(androidx.media3.common.z0.f1687f, 1.0f)), 2)));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for PlaybackParameters", e3);
        }
    }

    @Override
    public final void U1(k kVar, int i10, float f3) {
        if (kVar == null || f3 < 0.0f || f3 > 1.0f) {
            return;
        }
        k2(kVar, i10, 24, n2(new androidx.media3.cast.q(f3, 5)));
    }

    @Override
    public final void W(k kVar, int i10, int i11, int i12) {
        if (kVar == null || i11 < 0 || i12 < i11) {
            return;
        }
        k2(kVar, i10, 20, new k7.t(new w2(this, i11, i12), 7));
    }

    @Override
    public final void W0(k kVar, int i10, int i11, int i12, IBinder iBinder) {
        if (kVar == null || iBinder == null || i11 < 0 || i12 < i11) {
            return;
        }
        try {
            fh.t0 t0VarA = androidx.media3.common.g.a(iBinder);
            fh.q0 q0VarM = fh.t0.m();
            for (int i13 = 0; i13 < t0VarA.size(); i13++) {
                Bundle bundle = (Bundle) t0VarA.get(i13);
                bundle.getClass();
                q0VarM.c(androidx.media3.common.q0.a(bundle));
            }
            k2(kVar, i10, 20, new f3(new ak.a(new c2(q0VarM.g()), new w2(this, i11, i12), 22), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }

    @Override
    public final void W1(k kVar, int i10, int i11) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 34, n2(new androidx.media3.cast.n(i11, 9)));
    }

    @Override
    public final void X1(k kVar, int i10, int i11) {
        if (kVar == null || i11 < 0) {
            return;
        }
        k2(kVar, i10, 20, new k7.t(new y2(this, i11, 4), 7));
    }

    @Override
    public final void Y1(k kVar, int i10, Bundle bundle) {
        if (kVar == null || bundle == null) {
            return;
        }
        try {
            k2(kVar, i10, 20, new f3(new ak.a(new z2(2, androidx.media3.common.q0.a(bundle)), new b3(3), 22), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final void b0(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 4, n2(new b3(6)));
    }

    public final void d(k kVar, a2 a2Var) {
        if (kVar == null) {
            com.google.android.gms.internal.measurement.z3.v(kVar);
            return;
        }
        s1 s1Var = (s1) this.f9383e.get();
        if (s1Var == null || s1Var.o()) {
            com.google.android.gms.internal.measurement.z3.v(kVar);
        } else {
            this.f9385g.add(a2Var);
            e7.i0.M(s1Var.l, new ab.k(this, a2Var, s1Var, kVar, 11));
        }
    }

    public final void f(k kVar, final int i10, final z3 z3Var, final int i11, final n3 n3Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final s1 s1Var = (s1) this.f9383e.get();
            if (s1Var != null && !s1Var.o()) {
                final a2 a2VarE = this.f9384f.E(kVar.asBinder());
                if (a2VarE == null) {
                    return;
                }
                e7.i0.M(s1Var.l, new Runnable() {
                    @Override
                    public final void run() {
                        oj.q qVar = this.A.f9384f;
                        a2 a2Var = a2VarE;
                        if (qVar.M(a2Var)) {
                            z3 z3Var2 = z3Var;
                            s1 s1Var2 = s1Var;
                            int i12 = i10;
                            if (z3Var2 != null) {
                                if (!qVar.Q(a2Var, z3Var2)) {
                                    p3.m2(s1Var2, a2Var, i12, new d4(-4));
                                    return;
                                }
                            } else if (!qVar.P(a2Var, i11)) {
                                p3.m2(s1Var2, a2Var, i12, new d4(-4));
                                return;
                            }
                            n3Var.d(s1Var2, a2Var, i12);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override
    public final void f0(k kVar, int i10, boolean z10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 14, n2(new androidx.media3.cast.o(6, z10)));
    }

    @Override
    public final void f1(k kVar, int i10, int i11) {
        if (kVar == null) {
            return;
        }
        if (i11 == 2 || i11 == 0 || i11 == 1) {
            k2(kVar, i10, 15, n2(new androidx.media3.cast.n(i11, 10)));
        }
    }

    @Override
    public final void f2(k kVar, int i10, Surface surface, int i11, int i12) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 27, n2(new d0(this, surface, i11, i12, 2)));
    }

    @Override
    public final void g0(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 24, n2(new b3(5)));
    }

    public final t3 g2(t3 t3Var) {
        fh.t0 t0Var = t3Var.F.f1556a;
        fh.q0 q0VarM = fh.t0.m();
        fh.k0 k0Var = new fh.k0(4, 7);
        for (int i10 = 0; i10 < t0Var.size(); i10++) {
            androidx.media3.common.r2 r2Var = (androidx.media3.common.r2) t0Var.get(i10);
            androidx.media3.common.l2 l2Var = r2Var.f1487b;
            String string = (String) this.f9386h.get(l2Var);
            if (string == null) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = this.f9387i;
                this.f9387i = i11 + 1;
                String str = e7.i0.f5136a;
                sb2.append(Integer.toString(i11, 36));
                sb2.append("-");
                sb2.append(l2Var.f1339b);
                string = sb2.toString();
            }
            k0Var.L(l2Var, string);
            q0VarM.c(new androidx.media3.common.r2(new androidx.media3.common.l2(string, r2Var.f1487b.f1341d), r2Var.f1488c, r2Var.f1489d, r2Var.f1490e));
        }
        this.f9386h = k0Var.e();
        t3 t3VarB = t3Var.b(new androidx.media3.common.s2(q0VarM.g()));
        androidx.media3.common.q2 q2Var = t3VarB.G;
        if (q2Var.H.isEmpty()) {
            return t3VarB;
        }
        androidx.media3.common.p2 p2VarC = q2Var.a().c();
        fh.s2 it = q2Var.H.values().iterator();
        while (it.hasNext()) {
            androidx.media3.common.m2 m2Var = (androidx.media3.common.m2) it.next();
            androidx.media3.common.l2 l2Var2 = m2Var.f1353a;
            String str2 = (String) this.f9386h.get(l2Var2);
            if (str2 != null) {
                p2VarC.a(new androidx.media3.common.m2(new androidx.media3.common.l2(str2, l2Var2.f1341d), m2Var.f1354b));
            } else {
                p2VarC.a(m2Var);
            }
        }
        return t3VarB.o(p2VarC.b());
    }

    public final int i2(a2 a2Var, v3 v3Var, int i10) {
        if (v3Var.isCommandAvailable(17)) {
            oj.q qVar = this.f9384f;
            if (!qVar.N(a2Var, 17) && qVar.N(a2Var, 16)) {
                return v3Var.getCurrentMediaItemIndex() + i10;
            }
        }
        return i10;
    }

    @Override
    public final void j0(k kVar, int i10, IBinder iBinder, int i11, long j9) {
        if (kVar == null || iBinder == null) {
            return;
        }
        if (i11 == -1 || i11 >= 0) {
            try {
                fh.t0 t0VarA = androidx.media3.common.g.a(iBinder);
                fh.q0 q0VarM = fh.t0.m();
                for (int i12 = 0; i12 < t0VarA.size(); i12++) {
                    Bundle bundle = (Bundle) t0VarA.get(i12);
                    bundle.getClass();
                    q0VarM.c(androidx.media3.common.q0.a(bundle));
                }
                k2(kVar, i10, 20, new f3(new ak.a(new j7.d(j9, i11, q0VarM.g()), new b3(9), 21), 1));
            } catch (RuntimeException e3) {
                e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
            }
        }
    }

    @Override
    public final void j1(k kVar, int i10, androidx.media3.common.g gVar) {
        p1(kVar, i10, gVar, true);
    }

    public final void j2(a2 a2Var, int i10) {
        l2(a2Var, i10, 1, n2(new ak.a(this, a2Var, 19)));
    }

    public final void k2(k kVar, int i10, int i11, n3 n3Var) {
        a2 a2VarE = this.f9384f.E(kVar.asBinder());
        if (a2VarE != null) {
            l2(a2VarE, i10, i11, n3Var);
        }
    }

    @Override
    public final void l(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 26, n2(new j7.e(24)));
    }

    @Override
    public final void l0(k kVar, int i10) {
        a2 a2VarE;
        if (kVar == null || (a2VarE = this.f9384f.E(kVar.asBinder())) == null) {
            return;
        }
        j2(a2VarE, i10);
    }

    @Override
    public final void l1(k kVar, int i10) {
        a2 a2VarE;
        if (kVar == null || (a2VarE = this.f9384f.E(kVar.asBinder())) == null) {
            return;
        }
        l2(a2VarE, i10, 7, n2(new j7.e(26)));
    }

    public final void l2(final a2 a2Var, final int i10, final int i11, final n3 n3Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final s1 s1Var = (s1) this.f9383e.get();
            if (s1Var != null && !s1Var.o()) {
                e7.i0.M(s1Var.l, new Runnable() {
                    @Override
                    public final void run() {
                        oj.q qVar = this.A.f9384f;
                        final a2 a2Var2 = a2Var;
                        int i12 = i11;
                        boolean zN = qVar.N(a2Var2, i12);
                        final s1 s1Var2 = s1Var;
                        final int i13 = i10;
                        if (!zN) {
                            p3.m2(s1Var2, a2Var2, i13, new d4(-4));
                            return;
                        }
                        nv.p pVar = s1Var2.f9417e;
                        s1Var2.F(a2Var2);
                        pVar.getClass();
                        final n3 n3Var2 = n3Var;
                        if (i12 != 27) {
                            qVar.t(a2Var2, i12, new e() {
                                @Override
                                public final kh.v run() {
                                    return (kh.v) n3Var2.d(s1Var2, a2Var2, i13);
                                }
                            });
                        } else {
                            n3Var2.d(s1Var2, a2Var2, i13);
                            qVar.t(a2Var2, i12, new h3());
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override
    public final void m1(k kVar, int i10, IBinder iBinder) {
        if (kVar == null || iBinder == null) {
            return;
        }
        try {
            fh.t0 t0VarA = androidx.media3.common.g.a(iBinder);
            fh.q0 q0VarM = fh.t0.m();
            for (int i11 = 0; i11 < t0VarA.size(); i11++) {
                Bundle bundle = (Bundle) t0VarA.get(i11);
                bundle.getClass();
                q0VarM.c(androidx.media3.common.q0.a(bundle));
            }
            k2(kVar, i10, 20, new f3(new ak.a(new i7.t(3, q0VarM.g()), new b3(2), 22), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }

    @Override
    public final void n(k kVar, int i10, Bundle bundle, long j9) {
        if (kVar == null || bundle == null) {
            return;
        }
        try {
            k2(kVar, i10, 31, new f3(new ak.a(new ee.e(androidx.media3.common.q0.a(bundle), j9), new b3(9), 21), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }

    @Override
    public final void n0(k kVar, int i10, int i11, Bundle bundle) {
        if (kVar == null || bundle == null || i11 < 0) {
            return;
        }
        try {
            k2(kVar, i10, 20, new f3(new ak.a(new z2(0, androidx.media3.common.q0.a(bundle)), new y2(this, i11, 1), 22), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }

    @Override
    public final void n1(k kVar, int i10) {
        a2 a2VarE;
        if (kVar == null || (a2VarE = this.f9384f.E(kVar.asBinder())) == null) {
            return;
        }
        l2(a2VarE, i10, 3, n2(new b3(4)));
    }

    @Override
    public final void o1(k kVar, int i10, int i11, long j9) {
        if (kVar == null || i11 < 0) {
            return;
        }
        k2(kVar, i10, 10, new k7.t(new j7.d(j9, i11, this), 7));
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        switch (i10) {
            case 3002:
                U1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                H0(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                l(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                s1(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                F0(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                z0(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                n(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                z0(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                p1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                p1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                j0(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                v1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                w(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                q0(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                k kVarD = d1.d(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                R(kVarD, i12, (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, creator), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, creator), false);
                return true;
            case 3017:
                f1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                f0(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                X1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                W(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                p(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                F(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                N1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                l0(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                N(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                E1(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                U(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                I1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                Y1(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR));
                return true;
            case 3030:
                n0(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                m1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                S0(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                M0(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                n1(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                Q1(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                b0(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                w1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                t1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                o1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                G0(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                u0(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                G1(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                B0(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                I0(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Surface) com.google.android.gms.internal.measurement.y3.j(parcel, Surface.CREATOR));
                return true;
            case 3045:
                L0(d1.d(parcel.readStrongBinder()));
                return true;
            case 3046:
                l1(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                P0(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                T1(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                k kVarD2 = d1.d(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR);
                if (kVarD2 != null && string != null && bundle != null) {
                    if (TextUtils.isEmpty(string)) {
                        e7.a.m("MediaSessionStub", "setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            f(kVarD2, i13, null, 40010, new f3(new b3(string, androidx.media3.common.g1.a(bundle)), 1));
                        } catch (RuntimeException e3) {
                            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for Rating", e3);
                        }
                    }
                }
                return true;
            case 3050:
                k kVarD3 = d1.d(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR);
                if (kVarD3 != null && bundle2 != null) {
                    try {
                        f(kVarD3, i14, null, 40010, new f3(new b3(androidx.media3.common.g1.a(bundle2), 10), 1));
                    } catch (RuntimeException e10) {
                        e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for Rating", e10);
                    }
                }
                return true;
            case 3051:
                S(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                W1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                B1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                B(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                M(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                W0(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                r(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3058:
                C0(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3059:
                g0(d1.d(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3060:
                k kVarD4 = d1.d(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                R(kVarD4, i15, (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, creator2), (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                f2(d1.d(parcel.readStrongBinder()), parcel.readInt(), (Surface) com.google.android.gms.internal.measurement.y3.j(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                return true;
            case 3062:
                M1(d1.d(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                final e1 e1VarA = null;
                switch (i10) {
                    case 4001:
                        k kVarD5 = d1.d(parcel.readStrongBinder());
                        int i16 = parcel.readInt();
                        Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR);
                        if (kVarD5 != null) {
                            if (bundle3 != null) {
                                try {
                                    e1VarA = e1.a(bundle3);
                                } catch (RuntimeException e11) {
                                    e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e11);
                                }
                            }
                            f(kVarD5, i16, null, 50000, new f3(new k7.t(e1VarA, 6), 0));
                            break;
                        }
                        return true;
                    case 4002:
                        k kVarD6 = d1.d(parcel.readStrongBinder());
                        int i17 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (kVarD6 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                e7.a.m("MediaSessionStub", "getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            f(kVarD6, i17, null, 50004, new f3(new dk.a(string2, 4), 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        k kVarD7 = d1.d(parcel.readStrongBinder());
                        int i18 = parcel.readInt();
                        String string3 = parcel.readString();
                        int i19 = parcel.readInt();
                        int i20 = parcel.readInt();
                        Bundle bundle4 = (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR);
                        if (kVarD7 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                e7.a.m("MediaSessionStub", "getChildren(): Ignoring empty parentId");
                            } else if (i19 < 0) {
                                e7.a.m("MediaSessionStub", "getChildren(): Ignoring negative page");
                            } else if (i20 < 1) {
                                e7.a.m("MediaSessionStub", "getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle4 != null) {
                                    try {
                                        e1VarA = e1.a(bundle4);
                                    } catch (RuntimeException e12) {
                                        e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e12);
                                    }
                                }
                                f(kVarD7, i18, null, 50003, new f3(new r1(i19, i20, string3, e1VarA), 0));
                            }
                            break;
                        }
                        return true;
                    case 4004:
                        k kVarD8 = d1.d(parcel.readStrongBinder());
                        int i21 = parcel.readInt();
                        final String string4 = parcel.readString();
                        Bundle bundle5 = (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR);
                        if (kVarD8 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                e7.a.m("MediaSessionStub", "search(): Ignoring empty query");
                            } else {
                                if (bundle5 != null) {
                                    try {
                                        e1VarA = e1.a(bundle5);
                                    } catch (RuntimeException e13) {
                                        e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e13);
                                    }
                                }
                                final int i22 = 1;
                                f(kVarD8, i21, null, 50005, new f3(new n3() {
                                    @Override
                                    public final Object d(s1 s1Var, a2 a2Var, int i23) {
                                        switch (i22) {
                                            case 0:
                                                return s1Var.C(a2Var, string4, e1VarA);
                                            default:
                                                return s1Var.A(a2Var, string4, e1VarA);
                                        }
                                    }
                                }, 0));
                            }
                            break;
                        }
                        return true;
                    case 4005:
                        k kVarD9 = d1.d(parcel.readStrongBinder());
                        int i23 = parcel.readInt();
                        String string5 = parcel.readString();
                        int i24 = parcel.readInt();
                        int i25 = parcel.readInt();
                        Bundle bundle6 = (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR);
                        if (kVarD9 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                e7.a.m("MediaSessionStub", "getSearchResult(): Ignoring empty query");
                            } else if (i24 < 0) {
                                e7.a.m("MediaSessionStub", "getSearchResult(): Ignoring negative page");
                            } else if (i25 < 1) {
                                e7.a.m("MediaSessionStub", "getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle6 != null) {
                                    try {
                                        e1VarA = e1.a(bundle6);
                                    } catch (RuntimeException e14) {
                                        e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e14);
                                    }
                                }
                                f(kVarD9, i23, null, 50006, new f3(new d0(i24, i25, string5, e1VarA), 0));
                            }
                            break;
                        }
                        return true;
                    case 4006:
                        k kVarD10 = d1.d(parcel.readStrongBinder());
                        int i26 = parcel.readInt();
                        final String string6 = parcel.readString();
                        Bundle bundle7 = (Bundle) com.google.android.gms.internal.measurement.y3.j(parcel, Bundle.CREATOR);
                        if (kVarD10 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                e7.a.m("MediaSessionStub", "subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle7 != null) {
                                    try {
                                        e1VarA = e1.a(bundle7);
                                    } catch (RuntimeException e15) {
                                        e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for LibraryParams", e15);
                                    }
                                }
                                final int i27 = 0;
                                f(kVarD10, i26, null, 50001, new f3(new n3() {
                                    @Override
                                    public final Object d(s1 s1Var, a2 a2Var, int i28) {
                                        switch (i27) {
                                            case 0:
                                                return s1Var.C(a2Var, string6, e1VarA);
                                            default:
                                                return s1Var.A(a2Var, string6, e1VarA);
                                        }
                                    }
                                }, i27));
                            }
                            break;
                        }
                        return true;
                    case 4007:
                        k kVarD11 = d1.d(parcel.readStrongBinder());
                        int i28 = parcel.readInt();
                        String string7 = parcel.readString();
                        if (kVarD11 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                e7.a.m("MediaSessionStub", "unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            f(kVarD11, i28, null, 50002, new f3(new dk.a(string7, 3), 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
        }
    }

    @Override
    public final void p(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 20, n2(new b3(8)));
    }

    @Override
    public final void p1(k kVar, int i10, IBinder iBinder, boolean z10) {
        if (kVar == null || iBinder == null) {
            return;
        }
        try {
            fh.t0 t0VarA = androidx.media3.common.g.a(iBinder);
            fh.q0 q0VarM = fh.t0.m();
            for (int i11 = 0; i11 < t0VarA.size(); i11++) {
                Bundle bundle = (Bundle) t0VarA.get(i11);
                bundle.getClass();
                q0VarM.c(androidx.media3.common.q0.a(bundle));
            }
            k2(kVar, i10, 20, new f3(new ak.a(new x2(q0VarM.g(), z10, 2), new b3(9), 21), 1));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }

    @Override
    public final void q0(k kVar, int i10, Bundle bundle) {
        s1 s1Var = (s1) this.f9383e.get();
        if (kVar == null || bundle == null || s1Var == null) {
            com.google.android.gms.internal.measurement.z3.v(kVar);
            return;
        }
        try {
            AudioPlayerService audioPlayerService = s1Var.f9418f;
            g gVarA = g.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            String str = gVarA.f9301c;
            if (com.google.android.gms.internal.measurement.z3.q(callingUid, audioPlayerService, str) == 1) {
                e7.a.m("MediaSessionStub", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                com.google.android.gms.internal.measurement.z3.v(kVar);
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = gVarA.f9302d;
            }
            try {
                l9.g0 g0Var = new l9.g0(str, callingPid, callingUid);
                boolean zB = l9.h.a(audioPlayerService).b(g0Var);
                int i11 = gVarA.f9299a;
                int i12 = gVarA.f9300b;
                d(kVar, new a2(g0Var, i11, i12, zB, new k3(kVar, i12), gVarA.f9303e));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for ConnectionRequest", e3);
        }
    }

    @Override
    public final void r(k kVar, int i10, Bundle bundle, boolean z10) {
        if (kVar == null || bundle == null) {
            return;
        }
        try {
            k2(kVar, i10, 35, n2(new x2(androidx.media3.common.d.a(bundle), z10, 1)));
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for AudioAttributes", e3);
        }
    }

    @Override
    public final void r0(k kVar, int i10, Bundle bundle) {
        R(kVar, i10, bundle, Bundle.EMPTY, false);
    }

    @Override
    public final void s1(k kVar, int i10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 26, n2(new b3(1)));
    }

    @Override
    public final void t1(k kVar, int i10, long j9) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 5, n2(new androidx.media3.common.y1(j9)));
    }

    @Override
    public final void u0(k kVar, int i10) {
        a2 a2VarE;
        if (kVar == null || (a2VarE = this.f9384f.E(kVar.asBinder())) == null) {
            return;
        }
        l2(a2VarE, i10, 12, n2(new j7.e(28)));
    }

    @Override
    public final void v0(k kVar, int i10, Bundle bundle) {
        z0(kVar, i10, bundle, true);
    }

    @Override
    public final void v1(k kVar, int i10, boolean z10) {
        if (kVar == null) {
            return;
        }
        k2(kVar, i10, 1, n2(new androidx.media3.cast.o(4, z10)));
    }

    @Override
    public final void w(k kVar, int i10, Bundle bundle) {
        f fVar;
        if (kVar == null || bundle == null) {
            return;
        }
        try {
            d4 d4VarA = d4.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                oj.q qVar = this.f9384f;
                IBinder iBinderAsBinder = kVar.asBinder();
                synchronized (qVar.B) {
                    try {
                        a2 a2VarE = qVar.E(iBinderAsBinder);
                        fVar = a2VarE != null ? (f) ((u.e) qVar.D).get(a2VarE) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                b3.g1 g1Var = fVar != null ? fVar.f9281b : null;
                if (g1Var == null) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } else {
                    g1Var.j(i10, d4VarA);
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (Throwable th3) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th3;
            }
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for SessionResult", e3);
        }
    }

    @Override
    public final void w1(k kVar, int i10, int i11) {
        if (kVar == null || i11 < 0) {
            return;
        }
        k2(kVar, i10, 10, new k7.t(new y2(this, i11, 0), 7));
    }

    @Override
    public final void z0(k kVar, int i10, Bundle bundle, boolean z10) {
        if (kVar == null || bundle == null) {
            return;
        }
        try {
            androidx.media3.common.q0 q0VarA = androidx.media3.common.q0.a(bundle);
            a2 a2VarE = this.f9384f.E(kVar.asBinder());
            if (a2VarE != null) {
                l2(a2VarE, i10, 31, new f3(new ak.a(new x2(q0VarA, z10, 0), new b3(9), 21), 1));
            }
        } catch (RuntimeException e3) {
            e7.a.n("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e3);
        }
    }
}
