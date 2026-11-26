package d50;

import java.io.IOException;
import k50.i;
import kotlin.jvm.internal.m;

public final class f extends a {
    public boolean D;

    @Override
    public final void close() {
        if (this.B) {
            return;
        }
        if (!this.D) {
            a();
        }
        this.B = true;
    }

    @Override
    public final long s(i sink, long j) throws IOException {
        m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
        }
        if (this.B) {
            throw new IllegalStateException("closed");
        }
        if (this.D) {
            return -1L;
        }
        long jS = super.s(sink, j);
        if (jS != -1) {
            return jS;
        }
        this.D = true;
        a();
        return -1L;
    }
}
