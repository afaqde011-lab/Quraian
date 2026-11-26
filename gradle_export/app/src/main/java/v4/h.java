package v4;

import android.os.Process;

public final class h extends Thread {
    public final int A;

    public h(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.A = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.A);
        super.run();
    }
}
