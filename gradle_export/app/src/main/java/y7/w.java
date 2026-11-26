package y7;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import e7.i0;

public final class w implements Choreographer.VsyncCallback, DisplayManager.DisplayListener {

    public final Choreographer f16741a;

    public final DisplayManager f16742b;

    public volatile long f16743c = -9223372036854775807L;

    public volatile long f16744d = -9223372036854775807L;

    public final Handler f16745e = i0.l(null);

    public w(Choreographer choreographer, DisplayManager displayManager) {
        this.f16741a = choreographer;
        this.f16742b = displayManager;
    }

    @Override
    public final void onDisplayAdded(int i10) {
    }

    @Override
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            this.f16741a.postVsyncCallback(this);
        }
    }

    @Override
    public final void onDisplayRemoved(int i10) {
    }

    @Override
    public final void onVsync(Choreographer.FrameData frameData) {
        this.f16743c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f16744d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f16744d = -9223372036854775807L;
        }
        this.f16745e.postDelayed(new m9.f(this, 22), 500L);
    }
}
