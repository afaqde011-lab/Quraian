package androidx.media3.common;

import android.view.Choreographer;
import java.util.concurrent.Executor;

public final class q1 implements Executor {
    public final int A;
    public final Object B;

    public q1(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                c2.d((c2) obj, runnable);
                break;
            case 1:
                ((e7.d0) obj).d(runnable);
                break;
            case 2:
                e7.i0.M(((k9.v) obj).H, runnable);
                break;
            case 3:
                e7.i0.M(((k9.w1) obj).D, runnable);
                break;
            case 4:
                ((o9.b) obj).post(runnable);
                break;
            default:
                ((Choreographer) obj).postFrameCallback(new r3.a0(runnable, 0));
                break;
        }
    }
}
