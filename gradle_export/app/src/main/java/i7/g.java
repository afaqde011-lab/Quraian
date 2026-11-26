package i7;

import android.text.TextUtils;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import fh.d2;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g implements k0 {

    public static final d2 f7305s;

    public final j2 f7306a;

    public final h2 f7307b;

    public final w7.e f7308c;

    public final long f7309d;

    public final long f7310e;

    public final long f7311f;

    public final long f7312g;

    public final long f7313h;

    public final long f7314i;

    public final long f7315j;

    public final long f7316k;
    public final int l;
    public final boolean m;

    public final long f7317n;

    public final boolean f7318o;

    public final fh.w0 f7319p;

    public final ConcurrentHashMap f7320q;

    public long f7321r;

    static {
        fh.r0 r0Var = fh.t0.B;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        fh.w.e(6, objArr);
        f7305s = fh.t0.l(6, objArr);
    }

    public g(w7.e eVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, int i18, boolean z11, Map map) {
        a(i14, 0, "bufferForPlaybackMs", "0");
        a(i15, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i16, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i17, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(i10, i14, "minBufferMs", "bufferForPlaybackMs");
        a(i11, i15, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(i10, i16, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i17, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(i12, i10, "maxBufferMs", "minBufferMs");
        a(i13, i11, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(i18, 0, "backBufferDurationMs", "0");
        this.f7306a = new j2();
        this.f7307b = new h2();
        this.f7308c = eVar;
        this.f7309d = e7.i0.H(i10);
        this.f7310e = e7.i0.H(i11);
        this.f7311f = e7.i0.H(i12);
        this.f7312g = e7.i0.H(i13);
        this.f7313h = e7.i0.H(i14);
        this.f7314i = e7.i0.H(i15);
        this.f7315j = e7.i0.H(i16);
        this.f7316k = e7.i0.H(i17);
        this.l = -1;
        this.m = z10;
        this.f7317n = e7.i0.H(i18);
        this.f7318o = z11;
        this.f7320q = new ConcurrentHashMap();
        this.f7319p = fh.w0.a(map);
        this.f7321r = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        if (!(i10 >= i11)) {
            throw new IllegalArgumentException(ze.d.H("%s cannot be less than %s", str, str2));
        }
    }

    public final boolean b(j0 j0Var) {
        int i10;
        boolean z10;
        j7.j jVar = j0Var.f7375a;
        long j9 = j0Var.f7378d;
        f fVar = (f) this.f7320q.get(jVar);
        fVar.getClass();
        f fVar2 = (f) this.f7320q.get(jVar);
        fVar2.getClass();
        synchronized (fVar2) {
            i10 = fVar2.f7293d;
        }
        int i11 = i10 * this.f7308c.f15848b;
        f fVar3 = (f) this.f7320q.get(jVar);
        fVar3.getClass();
        boolean z11 = i11 >= fVar3.f7292c;
        if (jVar.equals(j7.j.f8248c)) {
            return !z11;
        }
        k2 k2Var = j0Var.f7376b;
        androidx.media3.common.l0 l0Var = k2Var.getWindow(k2Var.getPeriodByUid(j0Var.f7377c.f13644a, this.f7307b).f1233c, this.f7306a).f1285c.f1414b;
        if (l0Var == null) {
            z10 = false;
        } else {
            String scheme = l0Var.f1328a.getScheme();
            if (TextUtils.isEmpty(scheme) || f7305s.contains(scheme)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        long jMin = z10 ? this.f7310e : this.f7309d;
        long j10 = z10 ? this.f7312g : this.f7311f;
        float f3 = j0Var.f7379e;
        if (f3 > 1.0f) {
            jMin = Math.min(e7.i0.u(f3, jMin), j10);
        }
        if (j9 < Math.max(jMin, 500000L)) {
            boolean z12 = (z10 ? this.m : false) || !z11;
            fVar.f7291b = z12;
            if (!z12 && j9 < 500000) {
                e7.a.m("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= j10 || z11) {
            fVar.f7291b = false;
        }
        return fVar.f7291b;
    }

    public final void c() {
        int i10 = 0;
        if (this.f7320q.isEmpty()) {
            w7.e eVar = this.f7308c;
            synchronized (eVar) {
                if (eVar.f15847a) {
                    eVar.c(0);
                }
            }
            return;
        }
        w7.e eVar2 = this.f7308c;
        Iterator it = this.f7320q.values().iterator();
        while (it.hasNext()) {
            i10 += ((f) it.next()).f7292c;
        }
        eVar2.c(i10);
    }
}
