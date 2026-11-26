package e50;

import com.google.android.gms.internal.measurement.x5;
import java.net.SocketTimeoutException;

public final class t extends k50.e {
    public final u m;

    public t(u uVar) {
        this.m = uVar;
    }

    @Override
    public final void j() {
        this.m.e(9);
        m mVar = this.m.b;
        synchronized (mVar) {
            long j = mVar.N;
            long j2 = mVar.M;
            if (j < j2) {
                return;
            }
            mVar.M = j2 + 1;
            mVar.O = System.nanoTime() + ((long) 1000000000);
            mVar.H.c(new a50.b(2, mVar, x5.n(new StringBuilder(), mVar.C, " ping")), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
