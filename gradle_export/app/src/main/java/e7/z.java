package e7;

import android.os.SystemClock;
import androidx.media3.common.h2;
import androidx.media3.common.k2;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

public final class z {

    public final int f5206a;

    public Object f5207b;

    public int f5208c;

    public int f5209d;

    public boolean f5210e;

    public long f5211f;

    public final a1.n f5212g;

    public z(a1.n nVar, int i10) {
        this.f5212g = nVar;
        this.f5206a = i10;
    }

    public final void a() {
        long duration;
        a1.n nVar = this.f5212g;
        h2 h2Var = (h2) nVar.F;
        d0 d0Var = (d0) nVar.G;
        i7.z zVar = (i7.z) nVar.B;
        k2 currentTimeline = zVar.getCurrentTimeline();
        Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(zVar.getCurrentPeriodIndex());
        int currentAdGroupIndex = zVar.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = zVar.getCurrentAdIndexInAdGroup();
        long currentPosition = zVar.getCurrentPosition();
        if (uidOfPeriod == null || currentAdGroupIndex != -1) {
            duration = currentAdGroupIndex != -1 ? zVar.getDuration() : -9223372036854775807L;
        } else {
            currentTimeline.getPeriodByUid(uidOfPeriod, h2Var);
            currentPosition -= i0.W(h2Var.f1235e);
            duration = i0.W(h2Var.f1234d);
        }
        boolean zIsPlaying = zVar.isPlaying();
        if (!zIsPlaying || duration == -9223372036854775807L || currentPosition < duration) {
            d0Var.e(3);
            if (zIsPlaying && duration != -9223372036854775807L) {
                d0Var.f5120a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - currentPosition) / zVar.getPlaybackParameters().f1688a));
            }
            this.f5210e = false;
            return;
        }
        ((b0) nVar.E).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f5210e;
        int i10 = this.f5206a;
        if (z10 && Objects.equals(uidOfPeriod, this.f5207b) && currentAdGroupIndex == this.f5208c && currentAdIndexInAdGroup == this.f5209d) {
            if (jElapsedRealtime - this.f5211f >= i10) {
                ((i7.v) nVar.D).A.v(new ExoPlaybackException(2, 1003, new StuckPlayerException(3, i10)));
                return;
            }
            return;
        }
        this.f5210e = true;
        this.f5211f = jElapsedRealtime;
        this.f5207b = uidOfPeriod;
        this.f5208c = currentAdGroupIndex;
        this.f5209d = currentAdIndexInAdGroup;
        d0Var.e(3);
        d0Var.f5120a.sendEmptyMessageDelayed(3, i10);
    }
}
