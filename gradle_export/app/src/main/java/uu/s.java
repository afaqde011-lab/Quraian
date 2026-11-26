package uu;

import a40.u1;
import androidx.media3.common.c1;
import androidx.media3.common.d1;
import androidx.media3.common.e1;
import androidx.media3.common.f1;
import androidx.media3.common.q0;
import androidx.media3.common.z0;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerEvent;
import d40.p1;
import ta.c0;

public final class s implements d1 {
    public final w A;
    public final k9.u B;

    public s(w wVar, k9.u uVar) {
        this.A = wVar;
        this.B = uVar;
    }

    public final void U(e1 oldPosition, e1 newPosition, int i) {
        kotlin.jvm.internal.m.e(oldPosition, "oldPosition");
        kotlin.jvm.internal.m.e(newPosition, "newPosition");
        w wVar = this.A;
        if (wVar.l() && i == 1 && oldPosition.b == newPosition.b) {
            p1 p1Var = wVar.E;
            long j = newPosition.f;
            if (j < 0) {
                j = 0;
            }
            Long lValueOf = Long.valueOf(j);
            p1Var.getClass();
            p1Var.k(null, lValueOf);
        }
    }

    public final void V(boolean z) {
        w wVar = this.A;
        if (wVar.l()) {
            u1 u1Var = wVar.u;
            if (u1Var != null) {
                u1Var.i(null);
            }
            if (!z) {
                k9.u uVar = this.B;
                if (uVar.getPlayWhenReady() && uVar.getPlaybackState() == 2) {
                    wVar.u = c0.M(wVar.q, (k00.i) null, (u00.n) null, (u00.k) null, new r(wVar, uVar, null), 31);
                    return;
                }
            }
            c0.M(wVar.q, (k00.i) null, (u00.n) null, (u00.k) null, new ab.o(wVar, z, (k00.c) null, 8), 31);
        }
    }

    public final void e(int i) {
        w wVar = this.A;
        if (wVar.l()) {
            c0.M(wVar.q, (k00.i) null, (u00.n) null, (u00.k) null, new a1.p1(wVar, i, (k00.c) null, 10), 31);
        }
    }

    public final void l(f1 player, c1 c1Var) {
        kotlin.jvm.internal.m.e(player, "player");
        if (c1Var.a.a.get(0)) {
            w wVar = this.A;
            if (wVar.l()) {
                c0.M(wVar.q, (k00.i) null, (u00.n) null, (u00.k) null, new h(wVar, null, 8), 31);
            }
        }
    }

    public final void m(int i, boolean z) {
        w wVar = this.A;
        if (wVar.l()) {
            p1 p1Var = wVar.H;
            Boolean boolValueOf = Boolean.valueOf(z);
            p1Var.getClass();
            p1Var.k(null, boolValueOf);
        }
    }

    public final void r(int i) {
        Object value;
        k9.u uVar;
        Object value2;
        k9.u uVar2;
        Object value3;
        long duration;
        Object value4;
        k9.u uVar3;
        Object value5;
        Object value6;
        if (this.A.l()) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                p1 p1Var = this.A.D;
                do {
                    value5 = p1Var.getValue();
                    ((Number) value5).longValue();
                } while (!p1Var.i(value5, 0L));
                p1 p1Var2 = this.A.E;
                do {
                    value6 = p1Var2.getValue();
                    ((Number) value6).longValue();
                } while (!p1Var2.i(value6, 0L));
                this.A.l.a();
                PlayerItem playerItem = (PlayerItem) this.A.C.getValue();
                if (playerItem == null) {
                    return;
                }
                this.A.h.logEvent(new AudioPlayerEvent.AudioCompleted(String.valueOf(playerItem.getSurahId()), playerItem.getReciterName()));
                return;
            }
            long j = this.A.R;
            if (!this.A.Q) {
                w wVar = this.A;
                p1 p1Var3 = wVar.D;
                do {
                    value = p1Var3.getValue();
                    ((Number) value).longValue();
                    uVar = wVar.r;
                } while (!p1Var3.i(value, Long.valueOf(uVar != null ? uVar.getDuration() : 0L)));
                w wVar2 = this.A;
                p1 p1Var4 = wVar2.E;
                do {
                    value2 = p1Var4.getValue();
                    ((Number) value2).longValue();
                    uVar2 = wVar2.r;
                } while (!p1Var4.i(value2, Long.valueOf(uVar2 != null ? uVar2.getCurrentPosition() : 0L)));
                return;
            }
            this.A.Q = false;
            w wVar3 = this.A;
            p1 p1Var5 = wVar3.D;
            do {
                value3 = p1Var5.getValue();
                ((Number) value3).longValue();
                k9.u uVar4 = wVar3.r;
                duration = uVar4 != null ? uVar4.getDuration() : 0L;
                if (duration <= 0) {
                    duration = j;
                }
            } while (!p1Var5.i(value3, Long.valueOf(duration)));
            w wVar4 = this.A;
            p1 p1Var6 = wVar4.E;
            do {
                value4 = p1Var6.getValue();
                ((Number) value4).longValue();
                uVar3 = wVar4.r;
            } while (!p1Var6.i(value4, Long.valueOf(uVar3 != null ? uVar3.getCurrentPosition() : 0L)));
            this.A.R = 0L;
            this.A.w();
        }
    }

    public final void u(int i, q0 q0Var) {
        w wVar = this.A;
        if (wVar.l()) {
            if (i == 0 || i == 1) {
                wVar.l.a();
            }
            c0.M(wVar.q, (k00.i) null, (u00.n) null, (u00.k) null, new rm.c(wVar, q0Var, null, 15), 31);
        }
    }

    public final void w(boolean z) {
        w wVar = this.A;
        if (wVar.l()) {
            c0.M(wVar.q, (k00.i) null, (u00.n) null, (u00.k) null, new k(wVar, z, null), 31);
        }
    }

    public final void x(z0 playbackParameters) {
        kotlin.jvm.internal.m.e(playbackParameters, "playbackParameters");
        w wVar = this.A;
        if (wVar.l()) {
            p1 p1Var = wVar.M;
            Float fValueOf = Float.valueOf(playbackParameters.a);
            p1Var.getClass();
            p1Var.k(null, fValueOf);
        }
    }
}
