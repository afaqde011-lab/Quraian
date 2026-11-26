package k9;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.b5;
import com.mchutov.quranify.player.presentation.analytics.AndroidAutoEvent;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class s1 {
    public static final d4 J = new d4(1);
    public static final eh.x K = a.a.T(new eh.z(4));
    public boolean A;
    public final fh.t0 B;
    public final fh.t0 C;
    public final Bundle D;
    public final g1 E;
    public final nv.p F;
    public final fh.j0 G;
    public final fh.j0 H;
    public final int I;

    public final Object f9413a = new Object();

    public final Uri f9414b;

    public final g2 f9415c;

    public final f2 f9416d;

    public final nv.p f9417e;

    public final AudioPlayerService f9418f;

    public final p3 f9419g;

    public final t2 f9420h;

    public final String f9421i;

    public final f4 f9422j;

    public final g1 f9423k;
    public final Handler l;
    public final h1.l m;

    public final e2 f9424n;

    public final Handler f9425o;

    public final boolean f9426p;

    public final boolean f9427q;

    public final fh.t0 f9428r;

    public t3 f9429s;

    public v3 f9430t;

    public final PendingIntent f9431u;

    public h2 f9432v;

    public gi.c f9433w;

    public m1 f9434x;

    public boolean f9435y;

    public final long f9436z;

    public s1(g1 g1Var, AudioPlayerService audioPlayerService, tv.d dVar, PendingIntent pendingIntent, fh.t0 t0Var, fh.t0 t0Var2, fh.t0 t0Var3, nv.p pVar, Bundle bundle, Bundle bundle2, h1.l lVar) {
        e7.a.h("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + e7.i0.f5136a + "]");
        this.f9423k = g1Var;
        this.f9418f = audioPlayerService;
        this.f9421i = "QURANIFY_MEDIA_SESSION_ID";
        this.f9431u = pendingIntent;
        this.B = t0Var;
        this.C = t0Var2;
        this.f9428r = t0Var3;
        this.f9417e = pVar;
        this.D = bundle2;
        this.m = lVar;
        this.f9426p = true;
        this.f9427q = true;
        p3 p3Var = new p3(this);
        this.f9419g = p3Var;
        this.f9425o = new Handler(Looper.getMainLooper());
        Looper applicationLooper = dVar.getApplicationLooper();
        Handler handler = new Handler(applicationLooper);
        this.l = handler;
        this.f9429s = t3.H;
        this.f9415c = new g2(this, applicationLooper);
        this.f9416d = new f2(this, applicationLooper);
        Uri uriBuild = new Uri.Builder().scheme(s1.class.getName()).appendPath("QURANIFY_MEDIA_SESSION_ID").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f9414b = uriBuild;
        t2 t2Var = new t2(this, uriBuild, handler, bundle, t0Var, t0Var2, y1.f9551e, y1.f9552f, bundle2);
        this.f9420h = t2Var;
        this.f9422j = new f4(Process.myUid(), 1009000300, 8, audioPlayerService.getPackageName(), p3Var, bundle, ((l9.c0) t2Var.f9467j.B).f10128c.B);
        v3 v3Var = new v3(dVar);
        this.f9430t = v3Var;
        e7.i0.M(handler, new ji.a(this, v3Var, 17));
        this.f9436z = 3000L;
        this.f9424n = new e2(this, 2);
        e7.i0.M(handler, new e2(this, 3));
        this.E = g1Var;
        this.F = pVar;
        this.I = 1;
        this.G = new fh.j0();
        this.H = new fh.j0();
    }

    public static Object I(Future future) {
        ta.c0.A(future.isDone());
        try {
            return future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e3) {
            e7.a.n("MediaSessionImpl", "Library operation failed", e3);
            return null;
        }
    }

    public static void K(int i10, q qVar) {
        if (qVar.f9394a == 0) {
            fh.t0 t0Var = (fh.t0) qVar.f9396c;
            t0Var.getClass();
            if (t0Var.size() <= i10) {
                return;
            }
            throw new IllegalStateException("Invalid size=" + t0Var.size() + ", pageSize=" + i10);
        }
    }

    public static void a(s1 s1Var) {
        synchronized (s1Var.f9413a) {
            try {
                if (s1Var.f9435y) {
                    return;
                }
                c4 c4VarB = s1Var.f9430t.b();
                if (!s1Var.f9415c.hasMessages(1) && q3.a(c4VarB, s1Var.f9429s.f9497c)) {
                    oj.q qVar = s1Var.f9419g.f9384f;
                    fh.t0 t0VarC = qVar.C();
                    for (int i10 = 0; i10 < t0VarC.size(); i10++) {
                        a2 a2Var = (a2) t0VarC.get(i10);
                        qVar.G(a2Var);
                        s1Var.e(a2Var, new d2(c4VarB, qVar.N(a2Var, 16), qVar.N(a2Var, 17), a2Var));
                    }
                    try {
                        s1Var.f9420h.f9465h.f(0, c4VarB, true, true, 0);
                    } catch (RemoteException e3) {
                        e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
                    }
                }
                s1Var.G();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(s1 s1Var, Runnable runnable) {
        e7.i0.M(s1Var.l, runnable);
    }

    public static boolean p(a2 a2Var) {
        return a2Var != null && Objects.equals(a2Var.a(), "com.android.systemui");
    }

    public final kh.b0 A(a2 a2Var, String str, e1 e1Var) {
        kh.b0 b0VarL;
        a2 a2VarF = F(a2Var);
        nv.p pVar = this.F;
        pVar.getClass();
        g1 g1Var = this.E;
        kotlin.jvm.internal.m.e(g1Var, "session");
        kotlin.jvm.internal.m.e(a2VarF, "browser");
        kotlin.jvm.internal.m.e(str, "query");
        AudioPlayerService audioPlayerService = pVar.a;
        if (AudioPlayerService.n(audioPlayerService, a2VarF)) {
            b0VarL = AudioPlayerService.l(audioPlayerService, new nv.l(g1Var, a2VarF, str, e1Var, (k00.c) null));
        } else {
            androidx.media3.common.f1 f1VarA = g1Var.a();
            kotlin.jvm.internal.m.d(f1VarA, "getPlayer(...)");
            b0VarL = AudioPlayerService.l(audioPlayerService, new nv.m(audioPlayerService, str, AudioPlayerService.i(audioPlayerService, f1VarA), kotlin.jvm.internal.m.a(a2VarF.a(), "com.google.android.projection.gearhead"), g1Var, a2VarF, e1Var, (k00.c) null));
        }
        b0VarL.a(new q1(this, b0VarL, a2Var, 1), new p1(this, 0));
        return b0VarL;
    }

    public final kh.v B(a2 a2Var, List list, final int i10, final long j9) {
        String str;
        a2 a2VarF = F(a2Var);
        nv.p pVar = this.f9417e;
        AudioPlayerService audioPlayerService = pVar.a;
        AudioPlayerService audioPlayerService2 = pVar.a;
        g1 g1Var = this.f9423k;
        kotlin.jvm.internal.m.e(g1Var, "mediaSession");
        kotlin.jvm.internal.m.e(a2VarF, "controller");
        kotlin.jvm.internal.m.e(list, "mediaItems");
        androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) h00.q.O0(i10, list);
        if (q0Var == null || (str = q0Var.f1413a) == null) {
            androidx.media3.common.q0 q0Var2 = (androidx.media3.common.q0) h00.q.N0(list);
            str = q0Var2 != null ? q0Var2.f1413a : null;
        }
        if (AudioPlayerService.n(audioPlayerService, a2VarF) || kotlin.jvm.internal.m.a(str, "premium_required")) {
            if (AudioPlayerService.C(a2VarF)) {
                audioPlayerService.u().logEvent(AndroidAutoEvent.AndroidAutoSubscriptionBlocked.INSTANCE);
            }
            return b5.x(new b2(h00.x.A, 0, 0L));
        }
        if (str != null && audioPlayerService.y().d(str)) {
            androidx.media3.common.f1 f1VarA = g1Var.a();
            kotlin.jvm.internal.m.d(f1VarA, "getPlayer(...)");
            return AudioPlayerService.l(audioPlayerService2, new nv.n(audioPlayerService2, str, a2VarF, AudioPlayerService.j(audioPlayerService, f1VarA), (k00.c) null, 0));
        }
        if (str != null && audioPlayerService.y().c(str)) {
            androidx.media3.common.f1 f1VarA2 = g1Var.a();
            kotlin.jvm.internal.m.d(f1VarA2, "getPlayer(...)");
            return AudioPlayerService.l(audioPlayerService2, new nv.n(audioPlayerService2, str, a2VarF, AudioPlayerService.j(audioPlayerService, f1VarA2), (k00.c) null, 1));
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((androidx.media3.common.q0) it.next()).f1414b == null) {
                    AudioPlayerService.q(audioPlayerService, a2VarF);
                    return AudioPlayerService.l(audioPlayerService2, new nv.o(audioPlayerService2, list, i10, j9, a2VarF, (k00.c) null));
                }
            }
        }
        AudioPlayerService.q(audioPlayerService, a2VarF);
        if (AudioPlayerService.C(a2VarF)) {
            audioPlayerService.u().logEvent(new AndroidAutoEvent.AndroidAutoPlaybackStarted((String) null));
        }
        return e7.i0.V(pVar.a(g1Var, a2VarF, list), new kh.m() {
            @Override
            public final kh.v apply(Object obj) {
                return b5.x(new b2((List) obj, i10, j9));
            }
        });
    }

    public final kh.b0 C(a2 a2Var, String str, e1 e1Var) {
        z1 z1Var = a2Var.f9209d;
        z1Var.getClass();
        this.H.j(z1Var, str);
        this.G.j(str, a2Var);
        a2 a2VarF = F(a2Var);
        nv.p pVar = this.F;
        pVar.getClass();
        g1 g1Var = this.E;
        kotlin.jvm.internal.m.e(g1Var, "session");
        kotlin.jvm.internal.m.e(a2VarF, "browser");
        kotlin.jvm.internal.m.e(str, "mediaId");
        AudioPlayerService audioPlayerService = pVar.a;
        kh.b0 b0VarV = e7.i0.V(AudioPlayerService.l(audioPlayerService, new d40.l(audioPlayerService, str, (k00.c) null, 5)), new f1(a2VarF, g1Var, str, e1Var));
        b0VarV.a(new ab.k(this, b0VarV, a2Var, str, 6), new p1(this, 1));
        return b0VarV;
    }

    public final kh.t D(a2 a2Var, String str) {
        F(a2Var);
        this.F.getClass();
        kh.t tVarX = b5.x(q.d());
        tVarX.a(new ab.e(this, a2Var, str, 14), new p1(this, 0));
        return tVarX;
    }

    public final void E() {
        e7.a.h("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + e7.i0.f5136a + "] [" + androidx.media3.common.r0.b() + "]");
        synchronized (this.f9413a) {
            try {
                if (this.f9435y) {
                    return;
                }
                this.f9435y = true;
                f2 f2Var = this.f9416d;
                ab.e eVar = (ab.e) f2Var.f9289b;
                if (eVar != null) {
                    f2Var.removeCallbacks(eVar);
                    f2Var.f9289b = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    e7.i0.M(this.l, new e2(this, 0));
                } catch (Exception e3) {
                    e7.a.n("MediaSessionImpl", "Exception thrown while closing", e3);
                }
                t2 t2Var = this.f9420h;
                androidx.mediarouter.app.g gVar = t2Var.f9468k;
                if (gVar != null) {
                    t2Var.f9463f.f9418f.unregisterReceiver(gVar);
                }
                l9.c0 c0Var = (l9.c0) t2Var.f9467j.B;
                c0Var.f10131f.kill();
                MediaSession mediaSession = c0Var.f10126a;
                mediaSession.setCallback(null);
                c0Var.f10127b.f10124e.clear();
                mediaSession.release();
                p3 p3Var = this.f9419g;
                Set set = p3Var.f9385g;
                oj.q qVar = p3Var.f9384f;
                for (a2 a2Var : qVar.C()) {
                    qVar.R(a2Var);
                    z1 z1Var = a2Var.f9209d;
                    if (z1Var != null) {
                        z1Var.g();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    z1 z1Var2 = ((a2) it.next()).f9209d;
                    if (z1Var2 != null) {
                        z1Var2.g();
                    }
                }
                set.clear();
                p3Var.f9383e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a2 F(a2 a2Var) {
        if (!this.A || !p(a2Var)) {
            return a2Var;
        }
        a2 a2VarI = i();
        a2VarI.getClass();
        return a2VarI;
    }

    public final void G() {
        Handler handler = this.l;
        e2 e2Var = this.f9424n;
        handler.removeCallbacks(e2Var);
        if (this.f9427q) {
            long j9 = this.f9436z;
            if (j9 > 0) {
                if (this.f9430t.isPlaying() || this.f9430t.isLoading()) {
                    handler.postDelayed(e2Var, j9);
                }
            }
        }
    }

    public final void H(v3 v3Var, v3 v3Var2) {
        t2 t2Var = this.f9420h;
        this.f9430t = v3Var2;
        if (v3Var != null) {
            h2 h2Var = this.f9432v;
            h2Var.getClass();
            v3Var.removeListener(h2Var);
        }
        h2 h2Var2 = new h2(this, v3Var2);
        v3Var2.addListener(h2Var2);
        this.f9432v = h2Var2;
        try {
            t2Var.f9465h.l(0, v3Var, v3Var2);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
        if (v3Var == null) {
            ((l9.c0) t2Var.f9467j.B).f10126a.setActive(true);
        }
        this.f9429s = new t3(v3Var2.getPlayerError(), 0, v3Var2.b(), v3Var2.a(), v3Var2.a(), 0, v3Var2.getPlaybackParameters(), v3Var2.getRepeatMode(), v3Var2.getShuffleModeEnabled(), v3Var2.getVideoSize(), v3Var2.d(), 0, v3Var2.isCommandAvailable(18) ? v3Var2.getPlaylistMetadata() : androidx.media3.common.t0.K, v3Var2.isCommandAvailable(22) ? v3Var2.getVolume() : 1.0f, 1.0f, v3Var2.isCommandAvailable(21) ? v3Var2.getAudioAttributes() : androidx.media3.common.d.f1142i, 0, v3Var2.isCommandAvailable(28) ? v3Var2.getCurrentCues() : d7.c.f4764d, v3Var2.getDeviceInfo(), v3Var2.isCommandAvailable(23) ? v3Var2.getDeviceVolume() : 0, v3Var2.f(), v3Var2.getPlayWhenReady(), 1, v3Var2.getPlaybackSuppressionReason(), v3Var2.getPlaybackState(), v3Var2.isPlaying(), v3Var2.isLoading(), v3Var2.e(), v3Var2.getSeekBackIncrement(), v3Var2.getSeekForwardIncrement(), v3Var2.getMaxSeekToPreviousPosition(), v3Var2.isCommandAvailable(30) ? v3Var2.getCurrentTracks() : androidx.media3.common.s2.f1554b, v3Var2.getTrackSelectionParameters());
        k(v3Var2.getAvailableCommands());
    }

    public final void J() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }

    public final boolean c(KeyEvent keyEvent, boolean z10, boolean z11) {
        d dVar;
        a2 a2VarI = this.f9423k.f9307a.i();
        a2VarI.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode == 79) {
            if (!this.f9430t.getPlayWhenReady()) {
                dVar = new d(this, a2VarI, 5);
            } else {
                dVar = new d(this, a2VarI, 6);
            }
        } else if (keyCode == 126) {
            dVar = new d(this, a2VarI, 7);
        } else if (keyCode == 127) {
            dVar = new d(this, a2VarI, 8);
        } else if (keyCode == 272) {
            dVar = new d(this, a2VarI, 9);
        } else if (keyCode != 273) {
            switch (keyCode) {
                case 85:
                    if (!this.f9430t.getPlayWhenReady()) {
                        dVar = new d(this, a2VarI, 6);
                    } else {
                        dVar = new d(this, a2VarI, 5);
                    }
                    break;
                case 86:
                    dVar = new d(this, a2VarI, 4);
                    break;
                case 87:
                    dVar = new d(this, a2VarI, 9);
                    break;
                case 88:
                    dVar = new d(this, a2VarI, 1);
                    break;
                case 89:
                    dVar = new d(this, a2VarI, 3);
                    break;
                case 90:
                    dVar = new d(this, a2VarI, 2);
                    break;
                default:
                    return false;
            }
        } else {
            dVar = new d(this, a2VarI, 1);
        }
        e7.i0.M(this.l, new com.revenuecat.purchases.c(this, z11, a2VarI, dVar, 3));
        return true;
    }

    public final kh.v d(a2 a2Var, i2 i2Var) {
        int i10;
        kh.v vVarX;
        p3 p3Var = this.f9419g;
        try {
            b3.g1 g1VarI = p3Var.f9384f.I(a2Var);
            if (g1VarI != null) {
                y3 y3VarC = g1VarI.c(J);
                i10 = y3VarC.H;
                vVarX = y3VarC;
            } else {
                if (!m(a2Var)) {
                    return b5.x(new d4(-100));
                }
                i10 = 0;
                vVarX = b5.x(new d4(0));
            }
            z1 z1Var = a2Var.f9209d;
            if (z1Var != null) {
                i2Var.c(z1Var, i10);
            }
            return vVarX;
        } catch (DeadObjectException unused) {
            p3Var.f9384f.R(a2Var);
            return b5.x(new d4(-100));
        } catch (RemoteException e3) {
            e7.a.n("MediaSessionImpl", "Exception in " + a2Var, e3);
            return b5.x(new d4(-1));
        }
    }

    public final void e(a2 a2Var, i2 i2Var) {
        int iF;
        p3 p3Var = this.f9419g;
        try {
            b3.g1 g1VarI = p3Var.f9384f.I(a2Var);
            if (g1VarI != null) {
                iF = g1VarI.f();
            } else if (!m(a2Var)) {
                return;
            } else {
                iF = 0;
            }
            z1 z1Var = a2Var.f9209d;
            if (z1Var != null) {
                i2Var.c(z1Var, iF);
            }
        } catch (DeadObjectException unused) {
            p3Var.f9384f.R(a2Var);
        } catch (RemoteException e3) {
            e7.a.n("MediaSessionImpl", "Exception in " + a2Var, e3);
        }
    }

    public final void f(i2 i2Var) {
        fh.t0 t0VarC = this.f9419g.f9384f.C();
        for (int i10 = 0; i10 < t0VarC.size(); i10++) {
            e((a2) t0VarC.get(i10), i2Var);
        }
        try {
            i2Var.c(this.f9420h.f9465h, 0);
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
        m1 m1VarH = h();
        if (m1VarH != null) {
            try {
                i2Var.c(m1VarH.L, 0);
            } catch (RemoteException e10) {
                e7.a.e("MediaSessionImpl", "Exception in using media1 API", e10);
            }
        }
    }

    public final fh.d2 g() {
        fh.d2 d2VarG;
        fh.t0 t0VarC = this.f9419g.f9384f.C();
        fh.t0 t0VarC2 = this.f9420h.f9462e.C();
        fh.q0 q0VarN = fh.t0.n(t0VarC2.size() + t0VarC.size());
        if (this.A) {
            for (int i10 = 0; i10 < t0VarC.size(); i10++) {
                a2 a2Var = (a2) t0VarC.get(i10);
                if (!p(a2Var)) {
                    q0VarN.c(a2Var);
                }
            }
            for (int i11 = 0; i11 < t0VarC2.size(); i11++) {
                a2 a2Var2 = (a2) t0VarC2.get(i11);
                if (!p(a2Var2)) {
                    q0VarN.c(a2Var2);
                }
            }
            d2VarG = q0VarN.g();
        } else {
            q0VarN.e(t0VarC);
            q0VarN.e(t0VarC2);
            d2VarG = q0VarN.g();
        }
        m1 m1VarH = h();
        if (m1VarH == null) {
            return d2VarG;
        }
        fh.t0 t0VarC3 = m1VarH.K.C();
        fh.q0 q0VarN2 = fh.t0.n(t0VarC3.size() + d2VarG.D);
        q0VarN2.e(d2VarG);
        q0VarN2.e(t0VarC3);
        return q0VarN2.g();
    }

    public final m1 h() {
        m1 m1Var;
        synchronized (this.f9413a) {
            m1Var = this.f9434x;
        }
        return m1Var;
    }

    public final a2 i() {
        fh.t0 t0VarC = this.f9419g.f9384f.C();
        for (int i10 = 0; i10 < t0VarC.size(); i10++) {
            a2 a2Var = (a2) t0VarC.get(i10);
            if (n(a2Var)) {
                return a2Var;
            }
        }
        return null;
    }

    public final a2 j() {
        fh.t0 t0VarC = this.f9420h.f9462e.C();
        for (int i10 = 0; i10 < t0VarC.size(); i10++) {
            a2 a2Var = (a2) t0VarC.get(i10);
            if (p(a2Var)) {
                return a2Var;
            }
        }
        fh.t0 t0VarC2 = this.f9419g.f9384f.C();
        for (int i11 = 0; i11 < t0VarC2.size(); i11++) {
            a2 a2Var2 = (a2) t0VarC2.get(i11);
            if (p(a2Var2)) {
                return a2Var2;
            }
        }
        return null;
    }

    public final void k(androidx.media3.common.b1 b1Var) {
        this.f9415c.a(false, false);
        f(new a1(b1Var));
        try {
            bb.d dVar = this.f9420h.f9465h;
            androidx.media3.common.l lVar = this.f9429s.f9511s;
            dVar.h();
        } catch (RemoteException e3) {
            e7.a.e("MediaSessionImpl", "Exception in using media1 API", e3);
        }
    }

    public final void l(a2 a2Var, boolean z10) {
        if (x()) {
            boolean z11 = this.f9430t.isCommandAvailable(16) && this.f9430t.getCurrentMediaItem() != null;
            boolean z12 = this.f9430t.isCommandAvailable(31) || this.f9430t.isCommandAvailable(20);
            a2 a2VarF = F(a2Var);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            ta.c0.A(!false);
            sparseBooleanArray.append(1, true);
            ta.c0.A(!false);
            androidx.media3.common.b1 b1Var = new androidx.media3.common.b1(new androidx.media3.common.r(sparseBooleanArray));
            if (z11 || !z12) {
                if (!z11) {
                    e7.a.m("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                e7.i0.A(this.f9430t);
                if (z10) {
                    y(a2VarF);
                    return;
                }
                return;
            }
            this.f9417e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            kh.s sVar = new kh.s();
            sVar.m(unsupportedOperationException);
            sVar.a(new kh.r(sVar, new com.google.android.gms.internal.measurement.f4(this, a2VarF, z10, b1Var), 0), new p1(this, 2));
        }
    }

    public final boolean m(a2 a2Var) {
        if (this.f9419g.f9384f.M(a2Var) || this.f9420h.f9462e.M(a2Var)) {
            return true;
        }
        m1 m1VarH = h();
        return m1VarH != null && m1VarH.K.M(a2Var);
    }

    public final boolean n(a2 a2Var) {
        return Objects.equals(a2Var.a(), this.f9418f.getPackageName()) && a2Var.f9207b != 0 && new Bundle(a2Var.f9210e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f9413a) {
            z10 = this.f9435y;
        }
        return z10;
    }

    public final void q(a2 a2Var, q qVar) {
        int i10 = this.I;
        if (i10 == 0 || a2Var.f9207b != 0) {
            return;
        }
        int i11 = qVar.f9394a;
        t2 t2Var = this.f9420h;
        if (i11 == -102 || i11 == -105) {
            boolean z10 = i10 == 1;
            t2Var.getClass();
            e1 e1Var = qVar.f9398e;
            b4 b4Var = qVar.f9399f;
            int iG = p.g(i11);
            c3.x1 x1Var = t2Var.f9473r;
            if (x1Var == null || x1Var.f2770c != iG) {
                String str = b4Var != null ? b4Var.f9239b : "no error message provided";
                Bundle bundle = Bundle.EMPTY;
                if (e1Var != null) {
                    Bundle bundle2 = e1Var.f9276a;
                    if (bundle2.containsKey("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT")) {
                        bundle = bundle2;
                    } else if (b4Var != null) {
                        bundle = b4Var.f9240c;
                    }
                } else if (b4Var != null) {
                    bundle = b4Var.f9240c;
                }
                t2Var.f9473r = new c3.x1(z10, iG, str, bundle);
                t2Var.P(t2Var.f9463f.f9430t);
            }
        }
        if (i11 != 0 || t2Var.f9473r == null) {
            return;
        }
        t2Var.f9473r = null;
        t2Var.P(t2Var.f9463f.f9430t);
    }

    public final kh.v r(a2 a2Var, List list) {
        return this.f9417e.a(this.f9423k, F(a2Var), list);
    }

    public final y1 s(a2 a2Var) {
        List listF;
        fh.t0 t0VarO;
        boolean z10 = this.A;
        fh.t0 t0VarO2 = null;
        t2 t2Var = this.f9420h;
        if (z10 && p(a2Var)) {
            t2Var.getClass();
            a4 a4Var = y1.f9551e;
            a4 a4Var2 = t2Var.f9477v;
            a4Var2.getClass();
            androidx.media3.common.b1 b1Var = t2Var.f9478w;
            b1Var.getClass();
            if (t2Var.f9476u.isEmpty()) {
                fh.t0 t0Var = t2Var.f9475t;
                t0VarO2 = t0Var == null ? null : fh.t0.o(t0Var);
                t0VarO = null;
            } else {
                fh.t0 t0Var2 = t2Var.f9476u;
                t0VarO = t0Var2 == null ? null : fh.t0.o(t0Var2);
            }
            return new y1(a4Var2, b1Var, t0VarO2, t0VarO);
        }
        nv.p pVar = this.f9417e;
        pVar.getClass();
        g1 g1Var = this.f9423k;
        kotlin.jvm.internal.m.e(g1Var, "session");
        s1 s1Var = g1Var.f9307a;
        a4 a4Var3 = y1.f9551e;
        z3 z3Var = nv.t.a;
        AudioPlayerService audioPlayerService = pVar.a;
        int i10 = AudioPlayerService.j0;
        a4 a4VarA = nv.t.a(audioPlayerService.E());
        androidx.media3.common.b1 b1VarG = audioPlayerService.G(g1Var, a2Var);
        fh.t0 t0VarO3 = (!s1Var.n(a2Var) || (listF = audioPlayerService.F(g1Var, a2Var)) == null) ? null : fh.t0.o(listF);
        if (kotlin.jvm.internal.m.a(a2Var.a(), "com.google.android.projection.gearhead")) {
            audioPlayerService.u().logEvent(AndroidAutoEvent.AndroidAutoConnected.INSTANCE);
        }
        y1 y1Var = new y1(a4VarA, b1VarG, null, t0VarO3);
        if (n(a2Var)) {
            this.A = true;
            if (t0VarO3 == null) {
                t0VarO3 = s1Var.C;
            }
            if (t0VarO3.isEmpty()) {
                t2Var.f9475t = s1Var.B;
            } else {
                t2Var.M(t0VarO3);
            }
            t2Var.L(a4VarA, b1VarG);
        }
        return y1Var;
    }

    public final kh.v t(a2 a2Var, String str, int i10, e1 e1Var) {
        kh.v vVarL;
        boolean zEquals = Objects.equals(str, "androidx.media3.session.recent.root");
        boolean z10 = false;
        Object[] objArr = 0;
        nv.p pVar = this.F;
        if (!zEquals) {
            a2 a2VarF = F(a2Var);
            pVar.getClass();
            AudioPlayerService audioPlayerService = pVar.a;
            g1 g1Var = this.E;
            kotlin.jvm.internal.m.e(g1Var, "session");
            kotlin.jvm.internal.m.e(a2VarF, "browser");
            kotlin.jvm.internal.m.e(str, "parentId");
            if (AudioPlayerService.n(audioPlayerService, a2VarF)) {
                vVarL = AudioPlayerService.m(audioPlayerService, str.equals("root"), e1Var);
            } else {
                androidx.media3.common.f1 f1VarA = g1Var.a();
                kotlin.jvm.internal.m.d(f1VarA, "getPlayer(...)");
                vVarL = AudioPlayerService.l(audioPlayerService, new nv.n(audioPlayerService, str, AudioPlayerService.i(audioPlayerService, f1VarA), e1Var, (k00.c) null, 2));
            }
            kh.v vVar = vVarL;
            vVar.a(new o1(this, vVar, a2Var, i10, 0), new p1(this, 0));
            return vVar;
        }
        if (this.f9420h.l == null) {
            return b5.x(q.b(-6));
        }
        if (this.f9430t.getPlaybackState() == 1) {
            kh.b0 b0Var = new kh.b0();
            if (this.A) {
                i().getClass();
            }
            pVar.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            kh.s sVar = new kh.s();
            sVar.m(unsupportedOperationException);
            sVar.a(new kh.r((Object) sVar, (Object) new h1.l(b0Var, e1Var, z10), (int) (objArr == true ? 1 : 0)), kh.p.A);
            return b0Var;
        }
        androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
        fh.r0 r0Var = fh.t0.B;
        fh.d2 d2Var = fh.d2.E;
        List list = Collections.EMPTY_LIST;
        fh.d2 d2Var2 = fh.d2.E;
        androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
        androidx.media3.common.m0 m0Var = androidx.media3.common.m0.f1344d;
        androidx.media3.common.s0 s0Var = new androidx.media3.common.s0();
        s0Var.f1529q = Boolean.FALSE;
        s0Var.f1530r = Boolean.TRUE;
        return b5.x(q.c(fh.t0.s(new androidx.media3.common.q0("androidx.media3.session.recent.item", new androidx.media3.common.g0(e0Var), null, new androidx.media3.common.k0(j0Var), new androidx.media3.common.t0(s0Var), m0Var)), e1Var));
    }

    public final kh.v u(a2 a2Var, e1 e1Var) {
        if (e1Var == null || !e1Var.f9277b || !p(a2Var)) {
            a2 a2VarF = F(a2Var);
            nv.p pVar = this.F;
            pVar.getClass();
            kotlin.jvm.internal.m.e(this.E, "session");
            kotlin.jvm.internal.m.e(a2VarF, "browser");
            AudioPlayerService audioPlayerService = pVar.a;
            return AudioPlayerService.l(audioPlayerService, new l6.r(audioPlayerService, e1Var, null, 1));
        }
        if (this.f9420h.l == null) {
            return b5.x(q.b(-6));
        }
        androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
        fh.r0 r0Var = fh.t0.B;
        fh.d2 d2Var = fh.d2.E;
        List list = Collections.EMPTY_LIST;
        fh.d2 d2Var2 = fh.d2.E;
        androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
        androidx.media3.common.m0 m0Var = androidx.media3.common.m0.f1344d;
        androidx.media3.common.s0 s0Var = new androidx.media3.common.s0();
        s0Var.f1529q = Boolean.TRUE;
        s0Var.f1530r = Boolean.FALSE;
        androidx.media3.common.q0 q0Var = new androidx.media3.common.q0("androidx.media3.session.recent.root", new androidx.media3.common.g0(e0Var), null, new androidx.media3.common.k0(j0Var), new androidx.media3.common.t0(s0Var), m0Var);
        q.e(q0Var);
        return b5.x(new q(0, SystemClock.elapsedRealtime(), e1Var, null, q0Var, 2));
    }

    public final kh.v v(a2 a2Var, String str, int i10, int i11, e1 e1Var) {
        kh.v vVarL;
        a2 a2VarF = F(a2Var);
        nv.p pVar = this.F;
        pVar.getClass();
        g1 g1Var = this.E;
        kotlin.jvm.internal.m.e(g1Var, "session");
        kotlin.jvm.internal.m.e(a2VarF, "browser");
        kotlin.jvm.internal.m.e(str, "query");
        AudioPlayerService audioPlayerService = pVar.a;
        if (AudioPlayerService.n(audioPlayerService, a2VarF)) {
            vVarL = AudioPlayerService.m(audioPlayerService, false, e1Var);
        } else {
            androidx.media3.common.f1 f1VarA = g1Var.a();
            kotlin.jvm.internal.m.d(f1VarA, "getPlayer(...)");
            vVarL = AudioPlayerService.l(audioPlayerService, new nv.k(audioPlayerService, str, AudioPlayerService.i(audioPlayerService, f1VarA), i10, i11, e1Var, (k00.c) null));
        }
        kh.v vVar = vVarL;
        vVar.a(new o1(this, vVar, a2Var, i11, 1), new p1(this, 0));
        return vVar;
    }

    public final boolean w(a2 a2Var, Intent intent) {
        boolean z10;
        t2 t2Var;
        int i10 = a2Var.f9207b;
        Bundle extras = intent.getExtras();
        ab.e eVar = null;
        KeyEvent keyEvent = (extras == null || !extras.containsKey("android.intent.extra.KEY_EVENT")) ? null : (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
            AudioPlayerService audioPlayerService = this.f9418f;
            if ((component == null || Objects.equals(component.getPackageName(), audioPlayerService.getPackageName())) && keyEvent != null) {
                J();
                this.f9417e.getClass();
                if (keyEvent.getAction() != 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                        switch (keyCode) {
                        }
                    }
                    return true;
                }
                int keyCode2 = keyEvent.getKeyCode();
                boolean zHasSystemFeature = audioPlayerService.getPackageManager().hasSystemFeature("android.software.leanback");
                f2 f2Var = this.f9416d;
                if (keyCode2 == 79 || keyCode2 == 85) {
                    if (!zHasSystemFeature && i10 == 0 && keyEvent.getRepeatCount() == 0) {
                        ab.e eVar2 = (ab.e) f2Var.f9289b;
                        if (eVar2 == null) {
                            ab.e eVar3 = new ab.e(f2Var, a2Var, keyEvent, 16);
                            f2Var.f9289b = eVar3;
                            f2Var.postDelayed(eVar3, ViewConfiguration.getDoubleTapTimeout());
                            return true;
                        }
                        if (eVar2 != null) {
                            f2Var.removeCallbacks(eVar2);
                            f2Var.f9289b = null;
                        }
                        z10 = true;
                    } else {
                        ab.e eVar4 = (ab.e) f2Var.f9289b;
                        if (eVar4 != null) {
                            f2Var.removeCallbacks(eVar4);
                            ab.e eVar5 = (ab.e) f2Var.f9289b;
                            f2Var.f9289b = null;
                            eVar = eVar5;
                        }
                        if (eVar != null) {
                            e7.i0.M(f2Var, eVar);
                        }
                    }
                    if (!this.A) {
                        boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                        if (keyEvent.getRepeatCount() <= 0 || c(keyEvent, z10, booleanExtra)) {
                            return true;
                        }
                    } else {
                        t2Var = this.f9420h;
                        if ((keyCode2 != 85 || keyCode2 == 79) && z10) {
                            t2Var.z();
                            return true;
                        }
                        if (i10 != 0) {
                            ((l9.v) ((h7.b) t2Var.f9467j.C).A).f10183a.dispatchMediaButtonEvent(keyEvent);
                            return true;
                        }
                    }
                } else {
                    ab.e eVar6 = (ab.e) f2Var.f9289b;
                    if (eVar6 != null) {
                        f2Var.removeCallbacks(eVar6);
                        ab.e eVar7 = (ab.e) f2Var.f9289b;
                        f2Var.f9289b = null;
                        eVar = eVar7;
                    }
                    if (eVar != null) {
                        e7.i0.M(f2Var, eVar);
                    }
                }
                z10 = false;
                if (!this.A) {
                    boolean booleanExtra2 = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEvent.getRepeatCount() <= 0) {
                    }
                    return true;
                }
                t2Var = this.f9420h;
                if (keyCode2 != 85) {
                    t2Var.z();
                    return true;
                }
                t2Var.z();
                return true;
                if (i10 != 0) {
                    ((l9.v) ((h7.b) t2Var.f9467j.C).A).f10183a.dispatchMediaButtonEvent(keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        kh.b0 b0Var = new kh.b0();
        this.f9425o.post(new ji.a(this, b0Var, 16));
        try {
            return ((Boolean) b0Var.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public final void y(a2 a2Var) {
        F(a2Var);
        this.f9417e.getClass();
    }

    public final void z(a2 a2Var) {
        if (this.A && p(a2Var)) {
            return;
        }
        nv.p pVar = this.f9417e;
        pVar.getClass();
        g1 g1Var = this.f9423k;
        kotlin.jvm.internal.m.e(g1Var, "session");
        if (g1Var.f9307a.n(a2Var)) {
            AudioPlayerService audioPlayerService = pVar.a;
            int i10 = AudioPlayerService.j0;
            g1Var.e(a2Var, audioPlayerService.F(g1Var, a2Var));
        }
    }
}
