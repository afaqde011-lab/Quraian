package c3;

import android.os.Trace;
import android.view.MotionEvent;

public final class k implements Runnable {
    public final int A;
    public final z B;

    public k(z zVar, int i10) {
        this.A = i10;
        this.B = zVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                z zVar = this.B;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!zVar.I.isEmpty()) {
                    try {
                        ((u00.a) zVar.I.removeLast()).invoke();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                z zVar2 = this.B;
                zVar2.f2790d1 = false;
                MotionEvent motionEvent = zVar2.V0;
                kotlin.jvm.internal.m.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                zVar2.H(motionEvent);
                return;
            default:
                z.l(this.B.getRoot());
                return;
        }
    }
}
