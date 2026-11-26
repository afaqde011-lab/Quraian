package n7;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import e7.i0;
import fh.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ta.c0;
import tf.w;

public final class b implements e {

    public final List f11121a;

    public final p f11122b;

    public final h7.b f11123c;

    public final hf.c f11124d;

    public final boolean f11125e;

    public final boolean f11126f;

    public final HashMap f11127g;

    public final e7.i f11128h;

    public final w f11129i;

    public final j7.j f11130j;

    public final c7.c f11131k;
    public final UUID l;
    public final Looper m;

    public final androidx.mediarouter.app.d f11132n;

    public final Object f11133o;

    public int f11134p;

    public int f11135q;

    public HandlerThread f11136r;

    public android.support.v4.media.session.f f11137s;

    public h7.a f11138t;

    public DrmSession$DrmSessionException f11139u;

    public byte[] f11140v;

    public byte[] f11141w;

    public n f11142x;

    public gi.c f11143y;

    public o f11144z;

    public b(UUID uuid, p pVar, h7.b bVar, hf.c cVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap map, c7.c cVar2, Looper looper, w wVar, j7.j jVar) {
        this.l = uuid;
        this.f11123c = bVar;
        this.f11124d = cVar;
        this.f11122b = pVar;
        this.f11125e = z10;
        this.f11126f = z11;
        if (bArr != null) {
            this.f11141w = bArr;
            this.f11121a = null;
        } else {
            list.getClass();
            this.f11121a = Collections.unmodifiableList(list);
        }
        this.f11127g = map;
        this.f11131k = cVar2;
        this.f11128h = new e7.i();
        this.f11129i = wVar;
        this.f11130j = jVar;
        this.f11134p = 2;
        this.m = looper;
        this.f11132n = new androidx.mediarouter.app.d(this, looper, 6);
        this.f11133o = new Object();
    }

    @Override
    public final UUID a() {
        n();
        return this.l;
    }

    @Override
    public final void b(h hVar) {
        n();
        if (this.f11135q < 0) {
            e7.a.d("DefaultDrmSession", "Session reference count less than zero: " + this.f11135q);
            this.f11135q = 0;
        }
        if (hVar != null) {
            e7.i iVar = this.f11128h;
            synchronized (iVar.A) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.D);
                    arrayList.add(hVar);
                    iVar.D = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.B.get(hVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.C);
                        hashSet.add(hVar);
                        iVar.C = Collections.unmodifiableSet(hashSet);
                    }
                    iVar.B.put(hVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int i10 = this.f11135q + 1;
        this.f11135q = i10;
        if (i10 == 1) {
            c0.A(this.f11134p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f11136r = handlerThread;
            handlerThread.start();
            this.f11137s = new android.support.v4.media.session.f(this, this.f11136r.getLooper());
            if (l()) {
                h(true);
            }
        } else if (hVar != null && i() && this.f11128h.a(hVar) == 1) {
            hVar.c(this.f11134p);
        }
        d dVar = (d) this.f11124d.B;
        if (dVar.l != -9223372036854775807L) {
            dVar.f11156o.remove(this);
            Handler handler = dVar.f11162u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(h hVar) {
        n();
        int i10 = this.f11135q;
        if (i10 <= 0) {
            e7.a.d("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f11135q = i11;
        if (i11 == 0) {
            this.f11134p = 0;
            androidx.mediarouter.app.d dVar = this.f11132n;
            String str = i0.f5136a;
            dVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f11137s;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f493b = true;
            }
            this.f11137s = null;
            this.f11136r.quit();
            this.f11136r = null;
            this.f11138t = null;
            this.f11139u = null;
            this.f11142x = null;
            synchronized (this.f11133o) {
                this.f11143y = null;
            }
            this.f11144z = null;
            byte[] bArr = this.f11140v;
            if (bArr != null) {
                this.f11122b.n(bArr);
                this.f11140v = null;
            }
        }
        if (hVar != null) {
            e7.i iVar = this.f11128h;
            synchronized (iVar.A) {
                try {
                    Integer num = (Integer) iVar.B.get(hVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(iVar.D);
                        arrayList.remove(hVar);
                        iVar.D = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            iVar.B.remove(hVar);
                            HashSet hashSet = new HashSet(iVar.C);
                            hashSet.remove(hVar);
                            iVar.C = Collections.unmodifiableSet(hashSet);
                        } else {
                            iVar.B.put(hVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f11128h.a(hVar) == 0) {
                hVar.e();
            }
        }
        hf.c cVar = this.f11124d;
        int i12 = this.f11135q;
        d dVar2 = (d) cVar.B;
        if (i12 == 1 && dVar2.f11157p > 0 && dVar2.l != -9223372036854775807L) {
            dVar2.f11156o.add(this);
            Handler handler = dVar2.f11162u;
            handler.getClass();
            handler.postAtTime(new m9.f(this, 4), this, SystemClock.uptimeMillis() + dVar2.l);
        } else if (i12 == 0) {
            dVar2.m.remove(this);
            if (dVar2.f11159r == this) {
                dVar2.f11159r = null;
            }
            if (dVar2.f11160s == this) {
                dVar2.f11160s = null;
            }
            h7.b bVar = dVar2.f11152i;
            HashSet hashSet2 = (HashSet) bVar.A;
            hashSet2.remove(this);
            if (((b) bVar.B) == this) {
                bVar.B = null;
                if (!hashSet2.isEmpty()) {
                    b bVar2 = (b) hashSet2.iterator().next();
                    bVar.B = bVar2;
                    o oVarG = bVar2.f11122b.g();
                    bVar2.f11144z = oVarG;
                    android.support.v4.media.session.f fVar2 = bVar2.f11137s;
                    String str2 = i0.f5136a;
                    oVarG.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(s7.r.f13729f.getAndIncrement(), true, SystemClock.elapsedRealtime(), oVarG)).sendToTarget();
                }
            }
            if (dVar2.l != -9223372036854775807L) {
                Handler handler2 = dVar2.f11162u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                dVar2.f11156o.remove(this);
            }
        }
        dVar2.j();
    }

    @Override
    public final boolean d() {
        n();
        return this.f11125e;
    }

    @Override
    public final boolean e(String str) {
        n();
        byte[] bArr = this.f11140v;
        bArr.getClass();
        return this.f11122b.C(str, bArr);
    }

    @Override
    public final DrmSession$DrmSessionException f() {
        n();
        if (this.f11134p == 1) {
            return this.f11139u;
        }
        return null;
    }

    @Override
    public final h7.a g() {
        n();
        return this.f11138t;
    }

    @Override
    public final int getState() {
        n();
        return this.f11134p;
    }

    public final void h(boolean z10) {
        long jMin;
        long j9;
        Set set;
        if (this.f11126f) {
            return;
        }
        byte[] bArr = this.f11140v;
        String str = i0.f5136a;
        boolean z11 = true;
        if (this.f11141w == null) {
            m(1, z10, bArr);
            return;
        }
        if (this.f11134p != 4) {
            try {
                this.f11122b.m(this.f11140v, this.f11141w);
            } catch (Exception | NoSuchMethodError e3) {
                j(e3, 1);
                z11 = false;
            }
            if (!z11) {
                return;
            }
        }
        if (androidx.media3.common.h.f1217d.equals(this.l)) {
            n();
            byte[] bArr2 = this.f11140v;
            Pair pair = null;
            Map mapE = bArr2 == null ? null : this.f11122b.e(bArr2);
            if (mapE != null) {
                long j10 = -9223372036854775807L;
                try {
                    String str2 = (String) mapE.get("LicenseDurationRemaining");
                    j9 = str2 != null ? Long.parseLong(str2) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j9);
                try {
                    String str3 = (String) mapE.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j10 = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j10));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            e7.a.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m(2, z10, bArr);
            return;
        }
        if (jMin <= 0) {
            j(new KeysExpiredException(), 2);
            return;
        }
        this.f11134p = 4;
        e7.i iVar = this.f11128h;
        synchronized (iVar.A) {
            set = iVar.C;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((h) it.next()).b();
        }
    }

    public final boolean i() {
        int i10 = this.f11134p;
        return i10 == 3 || i10 == 4;
    }

    public final void j(Throwable th2, int i10) {
        int iS;
        Set set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            iS = i0.s(i0.t(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else if (th2 instanceof MediaDrmResetException) {
            iS = 6006;
        } else if ((th2 instanceof NotProvisionedException) || a.a.M(th2)) {
            iS = 6002;
        } else if (th2 instanceof DeniedByServerException) {
            iS = 6007;
        } else if (th2 instanceof UnsupportedDrmException) {
            iS = 6001;
        } else if (th2 instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
            iS = 6003;
        } else if (th2 instanceof KeysExpiredException) {
            iS = 6008;
        } else if (i10 == 1) {
            iS = 6006;
        } else if (i10 == 2) {
            iS = 6004;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException();
            }
            iS = 6002;
        }
        this.f11139u = new DrmSession$DrmSessionException(th2, iS);
        e7.a.e("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e7.i iVar = this.f11128h;
            synchronized (iVar.A) {
                set = iVar.C;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((h) it.next()).d((Exception) th2);
            }
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!a.a.N(th2) && !a.a.M(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f11134p != 4) {
            this.f11134p = 1;
        }
    }

    public final void k(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || a.a.M(th2)) {
            this.f11123c.x(this);
        } else {
            j(th2, z10 ? 1 : 2);
        }
    }

    public final boolean l() {
        Set set;
        if (i()) {
            return true;
        }
        try {
            try {
                byte[] bArrK = this.f11122b.k();
                this.f11140v = bArrK;
                this.f11122b.p(bArrK, this.f11130j);
                this.f11138t = this.f11122b.j(this.f11140v);
                this.f11134p = 3;
                e7.i iVar = this.f11128h;
                synchronized (iVar.A) {
                    set = iVar.C;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).c(3);
                }
                this.f11140v.getClass();
                return true;
            } catch (NotProvisionedException unused) {
                this.f11123c.x(this);
                return false;
            }
        } catch (Exception | NoSuchMethodError e3) {
            if (a.a.M(e3)) {
                this.f11123c.x(this);
                return false;
            }
            j(e3, 1);
            return false;
        }
    }

    public final void m(int i10, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f11133o) {
                try {
                    this.f11143y = new gi.c(27);
                    List list = this.f11121a;
                    if (list != null) {
                        t0.o(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n nVarT = this.f11122b.t(bArr, this.f11121a, i10, this.f11127g);
            this.f11142x = nVarT;
            android.support.v4.media.session.f fVar = this.f11137s;
            String str = i0.f5136a;
            nVarT.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(s7.r.f13729f.getAndIncrement(), z10, SystemClock.elapsedRealtime(), nVarT)).sendToTarget();
        } catch (Exception | NoSuchMethodError e3) {
            k(e3, true);
        }
    }

    public final void n() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            e7.a.n("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
