package e7;

import android.os.SystemClock;
import androidx.media3.common.h2;
import androidx.media3.common.k2;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

public final class x {

    public final int f5189a;

    public Object f5190b;

    public int f5191c;

    public int f5192d;

    public long f5193e;

    public long f5194f;

    public boolean f5195g;

    public long f5196h;

    public final a1.n f5197i;

    public x(a1.n nVar, int i10) {
        this.f5197i = nVar;
        this.f5189a = i10;
    }

    public final void a() {
        Object obj;
        a1.n nVar = this.f5197i;
        d0 d0Var = (d0) nVar.G;
        i7.z zVar = (i7.z) nVar.B;
        if (zVar.getPlaybackState() != 2 || !zVar.getPlayWhenReady() || zVar.getPlaybackSuppressionReason() != 0) {
            if (this.f5195g) {
                d0Var.e(1);
            }
            this.f5195g = false;
            return;
        }
        k2 currentTimeline = zVar.getCurrentTimeline();
        Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(zVar.getCurrentPeriodIndex());
        int currentAdGroupIndex = zVar.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = zVar.getCurrentAdIndexInAdGroup();
        long bufferedPosition = zVar.getBufferedPosition();
        long jMax = Math.max(0L, zVar.getTotalBufferedDuration() - Math.max(0L, bufferedPosition - zVar.getCurrentPosition()));
        if (uidOfPeriod != null && currentAdGroupIndex == -1) {
            bufferedPosition -= i0.W(currentTimeline.getPeriodByUid(uidOfPeriod, (h2) nVar.F).f1235e);
        }
        ((b0) nVar.E).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f5195g;
        int i10 = this.f5189a;
        if (z10 && Objects.equals(uidOfPeriod, this.f5190b) && currentAdGroupIndex == this.f5191c && currentAdIndexInAdGroup == this.f5192d) {
            obj = uidOfPeriod;
            if (bufferedPosition == this.f5193e && jMax == this.f5194f) {
                if (jElapsedRealtime - this.f5196h >= i10) {
                    ((i7.v) nVar.D).A.v(new ExoPlaybackException(2, 1003, new StuckPlayerException(1, i10)));
                    return;
                }
                return;
            }
        } else {
            obj = uidOfPeriod;
        }
        this.f5195g = true;
        this.f5196h = jElapsedRealtime;
        this.f5190b = obj;
        this.f5191c = currentAdGroupIndex;
        this.f5192d = currentAdIndexInAdGroup;
        this.f5193e = bufferedPosition;
        this.f5194f = jMax;
        d0Var.e(1);
        d0Var.f5120a.sendEmptyMessageDelayed(1, i10);
    }
}
