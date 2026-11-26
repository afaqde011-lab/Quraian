package n7;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.x0;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import fh.d2;
import fh.e1;
import fh.r0;
import fh.s2;
import fh.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import k9.b3;
import ta.c0;
import tf.w;

public final class d implements l {

    public final UUID f11145b;

    public final b3 f11146c;

    public final c7.c f11147d;

    public final HashMap f11148e;

    public final boolean f11149f;

    public final int[] f11150g;

    public final boolean f11151h;

    public final h7.b f11152i;

    public final w f11153j;

    public final hf.c f11154k;
    public final long l;
    public final ArrayList m;

    public final Set f11155n;

    public final Set f11156o;

    public int f11157p;

    public p f11158q;

    public b f11159r;

    public b f11160s;

    public Looper f11161t;

    public Handler f11162u;

    public byte[] f11163v;

    public j7.j f11164w;

    public volatile androidx.mediarouter.app.d f11165x;

    public d(UUID uuid, c7.c cVar, HashMap map, boolean z10, int[] iArr, boolean z11, w wVar) {
        uuid.getClass();
        c0.r("Use C.CLEARKEY_UUID instead", !androidx.media3.common.h.f1215b.equals(uuid));
        this.f11145b = uuid;
        this.f11146c = s.D;
        this.f11147d = cVar;
        this.f11148e = map;
        this.f11149f = z10;
        this.f11150g = iArr;
        this.f11151h = z11;
        this.f11153j = wVar;
        this.f11152i = new h7.b(19);
        this.f11154k = new hf.c(this, 24);
        this.m = new ArrayList();
        this.f11155n = Collections.newSetFromMap(new IdentityHashMap());
        this.f11156o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000L;
    }

    public static boolean f(b bVar) {
        bVar.n();
        if (bVar.f11134p != 1) {
            return false;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = bVar.f();
        drmSession$DrmSessionExceptionF.getClass();
        Throwable cause = drmSession$DrmSessionExceptionF.getCause();
        return (cause instanceof ResourceBusyException) || a.a.N(cause);
    }

    public static ArrayList i(androidx.media3.common.o oVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(oVar.D);
        for (int i10 = 0; i10 < oVar.D; i10++) {
            androidx.media3.common.n nVar = oVar.A[i10];
            if ((nVar.a(uuid) || (androidx.media3.common.h.f1216c.equals(uuid) && nVar.a(androidx.media3.common.h.f1215b))) && (nVar.E != null || z10)) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override
    public final e a(h hVar, androidx.media3.common.t tVar) {
        k(false);
        c0.A(this.f11157p > 0);
        this.f11161t.getClass();
        return e(this.f11161t, hVar, tVar, true);
    }

    @Override
    public final void b(Looper looper, j7.j jVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.f11161t;
                if (looper2 == null) {
                    this.f11161t = looper;
                    this.f11162u = new Handler(looper);
                } else {
                    c0.A(looper2 == looper);
                    this.f11162u.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11164w = jVar;
    }

    @Override
    public final k c(h hVar, androidx.media3.common.t tVar) {
        c0.A(this.f11157p > 0);
        this.f11161t.getClass();
        c cVar = new c(this, hVar);
        Handler handler = this.f11162u;
        handler.getClass();
        handler.post(new ji.a(cVar, tVar, 28));
        return cVar;
    }

    @Override
    public final int d(androidx.media3.common.t tVar) {
        k(false);
        p pVar = this.f11158q;
        pVar.getClass();
        int iU = pVar.u();
        androidx.media3.common.o oVar = tVar.f1598r;
        if (oVar == null) {
            int iH = x0.h(tVar.f1594n);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f11150g;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == iH) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                return 0;
            }
        } else if (this.f11163v == null) {
            UUID uuid = this.f11145b;
            if (i(oVar, uuid, true).isEmpty()) {
                if (oVar.D == 1 && oVar.A[0].a(androidx.media3.common.h.f1215b)) {
                    e7.a.m("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = oVar.C;
            if (str != null && !"cenc".equals(str) && !"cbcs".equals(str) && ("cbc1".equals(str) || "cens".equals(str))) {
                return 1;
            }
        }
        return iU;
    }

    public final e e(Looper looper, h hVar, androidx.media3.common.t tVar, boolean z10) {
        ArrayList arrayListI;
        if (this.f11165x == null) {
            this.f11165x = new androidx.mediarouter.app.d(this, looper, 7);
        }
        androidx.media3.common.o oVar = tVar.f1598r;
        int i10 = 0;
        b bVar = null;
        if (oVar == null) {
            int iH = x0.h(tVar.f1594n);
            p pVar = this.f11158q;
            pVar.getClass();
            if (pVar.u() != 2 || !q.f11178c) {
                int[] iArr = this.f11150g;
                while (true) {
                    if (i10 >= iArr.length) {
                        i10 = -1;
                        break;
                    }
                    if (iArr[i10] == iH) {
                        break;
                    }
                    i10++;
                }
                if (i10 != -1 && pVar.u() != 1) {
                    b bVar2 = this.f11159r;
                    if (bVar2 == null) {
                        r0 r0Var = t0.B;
                        b bVarH = h(d2.E, true, null, z10);
                        this.m.add(bVarH);
                        this.f11159r = bVarH;
                    } else {
                        bVar2.b(null);
                    }
                    return this.f11159r;
                }
            }
            return null;
        }
        if (this.f11163v == null) {
            arrayListI = i(oVar, this.f11145b, false);
            if (arrayListI.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.f11145b);
                e7.a.e("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                if (hVar != null) {
                    hVar.d(defaultDrmSessionManager$MissingSchemeDataException);
                }
                return new m(new DrmSession$DrmSessionException(defaultDrmSessionManager$MissingSchemeDataException, 6003));
            }
        } else {
            arrayListI = null;
        }
        if (this.f11149f) {
            for (b bVar3 : this.m) {
                if (Objects.equals(bVar3.f11121a, arrayListI)) {
                    bVar = bVar3;
                    break;
                }
            }
        } else {
            bVar = this.f11160s;
        }
        if (bVar != null) {
            bVar.b(hVar);
            return bVar;
        }
        b bVarH2 = h(arrayListI, false, hVar, z10);
        if (!this.f11149f) {
            this.f11160s = bVarH2;
        }
        this.m.add(bVarH2);
        return bVarH2;
    }

    public final b g(List list, boolean z10, h hVar) {
        this.f11158q.getClass();
        boolean z11 = this.f11151h | z10;
        p pVar = this.f11158q;
        byte[] bArr = this.f11163v;
        Looper looper = this.f11161t;
        looper.getClass();
        j7.j jVar = this.f11164w;
        jVar.getClass();
        b bVar = new b(this.f11145b, pVar, this.f11152i, this.f11154k, list, z11, z10, bArr, this.f11148e, this.f11147d, looper, this.f11153j, jVar);
        bVar.b(hVar);
        if (this.l != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b h(List list, boolean z10, h hVar, boolean z11) {
        b bVarG = g(list, z10, hVar);
        boolean zF = f(bVarG);
        long j9 = this.l;
        Set set = this.f11156o;
        if (zF && !set.isEmpty()) {
            s2 it = e1.n(set).iterator();
            while (it.hasNext()) {
                ((e) it.next()).c(null);
            }
            bVarG.c(hVar);
            if (j9 != -9223372036854775807L) {
                bVarG.c(null);
            }
            bVarG = g(list, z10, hVar);
        }
        if (f(bVarG) && z11) {
            Set set2 = this.f11155n;
            if (!set2.isEmpty()) {
                s2 it2 = e1.n(set2).iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    s2 it3 = e1.n(set).iterator();
                    while (it3.hasNext()) {
                        ((e) it3.next()).c(null);
                    }
                }
                bVarG.c(hVar);
                if (j9 != -9223372036854775807L) {
                    bVarG.c(null);
                }
                return g(list, z10, hVar);
            }
        }
        return bVarG;
    }

    public final void j() {
        if (this.f11158q != null && this.f11157p == 0 && this.m.isEmpty() && this.f11155n.isEmpty()) {
            p pVar = this.f11158q;
            pVar.getClass();
            pVar.release();
            this.f11158q = null;
        }
    }

    public final void k(boolean z10) {
        if (z10 && this.f11161t == null) {
            e7.a.n("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f11161t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            e7.a.n("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f11161t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override
    public final void prepare() {
        p fVar;
        k(true);
        int i10 = this.f11157p;
        this.f11157p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f11158q == null) {
            UUID uuid = this.f11145b;
            this.f11146c.getClass();
            try {
                try {
                    try {
                        fVar = new s(uuid);
                    } catch (Exception e3) {
                        throw new UnsupportedDrmException(e3);
                    }
                } catch (UnsupportedSchemeException e10) {
                    throw new UnsupportedDrmException(e10);
                }
            } catch (UnsupportedDrmException unused) {
                e7.a.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                fVar = new sg.f();
            }
            this.f11158q = fVar;
            fVar.l(new gi.c(this, 26));
            return;
        }
        if (this.l == -9223372036854775807L) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).b(null);
            i11++;
        }
    }

    @Override
    public final void release() {
        k(true);
        int i10 = this.f11157p - 1;
        this.f11157p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).c(null);
            }
        }
        s2 it = e1.n(this.f11155n).iterator();
        while (it.hasNext()) {
            ((c) it.next()).release();
        }
        j();
    }
}
