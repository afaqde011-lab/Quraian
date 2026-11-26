package e7;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;

public final class a0 {

    public final int f5112a;

    public int f5113b;

    public boolean f5114c;

    public long f5115d;

    public final a1.n f5116e;

    public a0(a1.n nVar, int i10) {
        this.f5116e = nVar;
        this.f5112a = i10;
    }

    public final void a() {
        a1.n nVar = this.f5116e;
        d0 d0Var = (d0) nVar.G;
        i7.z zVar = (i7.z) nVar.B;
        int playbackSuppressionReason = zVar.getPlaybackSuppressionReason();
        if (!zVar.getPlayWhenReady() || zVar.getPlaybackState() == 1 || zVar.getPlaybackState() == 4 || playbackSuppressionReason == 0 || playbackSuppressionReason == 1) {
            if (this.f5114c) {
                d0Var.e(4);
            }
            this.f5114c = false;
            return;
        }
        ((b0) nVar.E).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f5114c;
        int i10 = this.f5112a;
        if (z10 && this.f5113b == playbackSuppressionReason) {
            if (jElapsedRealtime - this.f5115d >= i10) {
                ((i7.v) nVar.D).A.v(new ExoPlaybackException(2, 1003, new StuckPlayerException(4, i10)));
                return;
            }
            return;
        }
        this.f5114c = true;
        this.f5115d = jElapsedRealtime;
        this.f5113b = playbackSuppressionReason;
        d0Var.e(4);
        d0Var.f5120a.sendEmptyMessageDelayed(4, i10);
    }
}
