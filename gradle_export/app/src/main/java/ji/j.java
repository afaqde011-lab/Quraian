package ji;

import android.os.Process;
import com.google.android.gms.internal.measurement.g4;

public final class j implements Runnable {
    public final int A;
    public final Runnable B;

    public j(Runnable runnable, int i10) {
        this.A = i10;
        this.B = runnable;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                this.B.run();
                break;
            default:
                try {
                    this.B.run();
                } catch (Exception e3) {
                    g4.E("Executor", "Background execution failure.", e3);
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return this.B.toString();
            default:
                return super.toString();
        }
    }
}
