package l50;

import java.io.IOException;
import k50.i0;
import k50.q;
import kotlin.jvm.internal.m;

public final class e extends q {
    public final long B;
    public final boolean C;
    public long D;

    public e(i0 i0Var, long j, boolean z) {
        super(i0Var);
        this.B = j;
        this.C = z;
    }

    @Override
    public final long s(k50.i sink, long j) throws IOException {
        m.e(sink, "sink");
        long j2 = this.D;
        long j3 = this.B;
        if (j2 > j3) {
            j = 0;
        } else if (this.C) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jS = super.s(sink, j);
        if (jS != -1) {
            this.D += jS;
        }
        long j5 = this.D;
        if ((j5 >= j3 || jS != -1) && j5 <= j3) {
            return jS;
        }
        if (jS > 0 && j5 > j3) {
            long j6 = sink.B - (j5 - j3);
            k50.i iVar = new k50.i();
            iVar.p0(sink);
            sink.c0(iVar, j6);
            iVar.a();
        }
        StringBuilder sbN = w.c.n("expected ", j3, " bytes but got ");
        sbN.append(this.D);
        throw new IOException(sbN.toString());
    }
}
