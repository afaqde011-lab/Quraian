package e7;

import android.os.SystemClock;
import androidx.media3.common.h2;
import androidx.media3.common.k2;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

public final class y {

    public final int f5198a;

    public Object f5199b;

    public int f5200c;

    public int f5201d;

    public long f5202e;

    public boolean f5203f;

    public long f5204g;

    public final a1.n f5205h;

    public y(a1.n nVar, int i10) {
        this.f5205h = nVar;
        this.f5198a = i10;
    }

    public final void a() {
        a1.n nVar = this.f5205h;
        d0 d0Var = (d0) nVar.G;
        i7.z zVar = (i7.z) nVar.B;
        if (!zVar.isPlaying()) {
            if (this.f5203f) {
                d0Var.e(2);
            }
            this.f5203f = false;
            return;
        }
        k2 currentTimeline = zVar.getCurrentTimeline();
        Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(zVar.getCurrentPeriodIndex());
        int currentAdGroupIndex = zVar.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = zVar.getCurrentAdIndexInAdGroup();
        long currentPosition = zVar.getCurrentPosition();
        if (uidOfPeriod != null && currentAdGroupIndex == -1) {
            currentPosition -= i0.W(currentTimeline.getPeriodByUid(uidOfPeriod, (h2) nVar.F).f1235e);
        }
        ((b0) nVar.E).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f5203f;
        int i10 = this.f5198a;
        if (z10 && Objects.equals(uidOfPeriod, this.f5199b) && currentAdGroupIndex == this.f5200c && currentAdIndexInAdGroup == this.f5201d && currentPosition == this.f5202e) {
            if (jElapsedRealtime - this.f5204g >= i10) {
                ((i7.v) nVar.D).A.v(new ExoPlaybackException(2, 1003, new StuckPlayerException(2, i10)));
                return;
            }
            return;
        }
        this.f5203f = true;
        this.f5204g = jElapsedRealtime;
        this.f5199b = uidOfPeriod;
        this.f5200c = currentAdGroupIndex;
        this.f5201d = currentAdIndexInAdGroup;
        this.f5202e = currentPosition;
        d0Var.e(2);
        d0Var.f5120a.sendEmptyMessageDelayed(2, i10);
    }
}
