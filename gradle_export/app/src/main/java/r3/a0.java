package r3;

import android.view.Choreographer;

public final class a0 implements Choreographer.FrameCallback {
    public final int A;
    public final Runnable B;

    public a0(Runnable runnable, int i10) {
        this.A = i10;
        this.B = runnable;
    }

    @Override
    public final void doFrame(long j9) {
        int i10 = this.A;
        Runnable runnable = this.B;
        switch (i10) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
