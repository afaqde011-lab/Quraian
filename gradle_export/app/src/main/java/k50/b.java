package k50;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

public final class b extends Thread {
    public final int A = 0;

    public b(String str) {
        super(str);
    }

    public b(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = e.h;
                ReentrantLock reentrantLock2 = e.h;
                reentrantLock2.lock();
                try {
                    e eVarM = hb.f.m();
                    if (eVarM == e.l) {
                        e.l = null;
                        return;
                    } else {
                        reentrantLock2.unlock();
                        if (eVarM != null) {
                            eVarM.j();
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }
}
