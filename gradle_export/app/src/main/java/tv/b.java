package tv;

import a40.u1;
import a40.z;
import android.os.Bundle;
import android.os.Looper;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.f1;
import androidx.media3.common.k2;
import androidx.media3.common.q0;
import androidx.media3.exoplayer.ExoPlayer;
import d40.p1;
import k00.i;
import kotlin.jvm.internal.m;
import su.j;
import su.p;
import su.r;
import su.s;
import su.t;
import ta.c0;
import u00.k;
import u00.n;
import xu.f;

public final class b {
    public final f a;
    public final z b;
    public f1 c;
    public t d;
    public i7.f1 e;
    public u1 f;
    public u1 g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public pi.c l;
    public final a m;

    public b(f controller, f40.c scope) {
        m.e(controller, "controller");
        m.e(scope, "scope");
        this.a = controller;
        this.b = scope;
        this.h = true;
        this.i = -1;
        this.m = new a(this);
    }

    public final void a(t tVar) throws IllegalSeekPositionException {
        f1 f1Var;
        if (m.a(tVar, this.d)) {
            return;
        }
        this.d = tVar;
        this.h = true;
        boolean zG = g();
        this.j = zG;
        if (zG && (f1Var = this.c) != null) {
            this.i = f1Var.getCurrentMediaItemIndex();
        }
        b();
        l();
        boolean zG2 = g();
        if (zG2 == this.k) {
            return;
        }
        this.k = zG2;
        pi.c cVar = this.l;
        if (cVar != null) {
            cVar.invoke();
        }
    }

    public final void b() throws IllegalSeekPositionException {
        t tVar;
        c();
        ExoPlayer exoPlayer = this.c;
        ExoPlayer exoPlayer2 = exoPlayer instanceof ExoPlayer ? exoPlayer : null;
        if (exoPlayer2 == null || (tVar = this.d) == null || !g()) {
            return;
        }
        i7.z zVar = (i7.z) exoPlayer2;
        if (zVar.getCurrentTimeline().isEmpty()) {
            return;
        }
        k7.t tVar2 = new k7.t(this, 23);
        zVar.A();
        i7.f1 f1VarF = zVar.f(tVar2);
        Looper mainLooper = Looper.getMainLooper();
        c0.A(!f1VarF.j);
        f1VarF.f = mainLooper;
        int currentMediaItemIndex = zVar.getCurrentMediaItemIndex();
        long j = tVar.b;
        k2 k2Var = f1VarF.c;
        c0.A(!f1VarF.j);
        c0.s(j != -9223372036854775807L);
        if (currentMediaItemIndex < 0 || (!k2Var.isEmpty() && currentMediaItemIndex >= k2Var.getWindowCount())) {
            throw new IllegalSeekPositionException();
        }
        f1VarF.g = currentMediaItemIndex;
        f1VarF.h = j;
        c0.A(!f1VarF.j);
        f1VarF.i = false;
        f1VarF.b();
        this.e = f1VarF;
    }

    public final void c() {
        i7.f1 f1Var = this.e;
        if (f1Var != null) {
            synchronized (f1Var) {
                c0.A(f1Var.j);
                f1Var.k = true;
                f1Var.a(false);
            }
        }
        this.e = null;
    }

    public final su.d d() {
        q0 currentMediaItem;
        Bundle bundle;
        f1 f1Var = this.c;
        if (f1Var == null || (currentMediaItem = f1Var.getCurrentMediaItem()) == null || (bundle = currentMediaItem.d.I) == null) {
            return null;
        }
        long j = bundle.getLong("surahId", -1L);
        int i = bundle.getInt("reciterId", -1);
        if (j < 0 || i < 0) {
            return null;
        }
        return new su.d(bundle.getInt("surahNumber", 0), j, i);
    }

    public final void e() {
        f1 f1Var = this.c;
        if (f1Var == null) {
            return;
        }
        f1Var.removeListener(this.m);
        c();
        u1 u1Var = this.f;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.f = null;
        u1 u1Var2 = this.g;
        if (u1Var2 != null) {
            u1Var2.i(null);
        }
        this.g = null;
        this.c = null;
        this.a.h = null;
    }

    public final Long f() {
        f1 f1Var = this.c;
        if (f1Var != null) {
            Long lValueOf = Long.valueOf(f1Var.getDuration());
            long jLongValue = lValueOf.longValue();
            if (jLongValue != -9223372036854775807L && jLongValue > 0) {
                return lValueOf;
            }
        }
        return null;
    }

    public final boolean g() {
        if (this.d != null) {
            return this.a.e(d());
        }
        return false;
    }

    public final void h(long j) {
        f1 f1Var = this.c;
        if (f1Var == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(this.i);
        int iIntValue = numValueOf.intValue();
        if (iIntValue == -1 || iIntValue >= f1Var.getMediaItemCount()) {
            numValueOf = null;
        }
        f1Var.seekTo(numValueOf != null ? numValueOf.intValue() : f1Var.getCurrentMediaItemIndex(), j);
        this.h = true;
    }

    public final void i() throws IllegalSeekPositionException {
        u1 u1Var = this.g;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.g = null;
        f1 f1Var = this.c;
        if (f1Var == null) {
            return;
        }
        su.d dVarD = d();
        t tVar = this.d;
        f fVar = this.a;
        this.j = tVar != null && fVar.e(dVarD);
        if (fVar.e(dVarD)) {
            this.i = f1Var.getCurrentMediaItemIndex();
            if (dVarD != null) {
                fVar.i(dVarD);
            }
        } else if (dVarD != null) {
            this.g = c0.M(this.b, (i) null, (n) null, (k) null, new l6.d(this, (k00.c) null, 16), 31);
        }
        b();
        l();
        boolean zG = g();
        if (zG == this.k) {
            return;
        }
        this.k = zG;
        pi.c cVar = this.l;
        if (cVar != null) {
            cVar.invoke();
        }
    }

    public final void j(boolean z) {
        t tVar;
        f1 f1Var = this.c;
        if (f1Var == null || (tVar = this.d) == null) {
            return;
        }
        boolean z2 = g() && f1Var.getPlayWhenReady() && f1Var.getCurrentPosition() >= tVar.b - 300;
        if (this.h) {
            if (z || z2) {
                this.h = false;
                this.a.b(su.n.a);
            }
        }
    }

    public final long k(long j) {
        if (g()) {
            f fVar = this.a;
            s sVarD = fVar.d();
            Long lValueOf = null;
            if (sVarD != null) {
                r rVarE = sVarD.e(new p(j));
                p1 p1Var = fVar.f;
                s sVar = rVarE.a;
                p1Var.getClass();
                p1Var.k(null, sVar);
                su.k kVar = rVarE.b;
                j jVar = kVar instanceof j ? (j) kVar : null;
                if (jVar != null) {
                    lValueOf = Long.valueOf(jVar.a);
                }
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
        }
        return j;
    }

    public final void l() {
        f1 f1Var;
        k00.c cVar = null;
        if (this.d == null || (f1Var = this.c) == null || !f1Var.isPlaying()) {
            u1 u1Var = this.f;
            if (u1Var != null) {
                u1Var.i(null);
            }
            this.f = null;
            return;
        }
        u1 u1Var2 = this.f;
        if (u1Var2 == null || !u1Var2.a()) {
            this.f = c0.M(this.b, (i) null, (n) null, (k) null, new rm.c(this, cVar, 12), 31);
        }
    }
}
