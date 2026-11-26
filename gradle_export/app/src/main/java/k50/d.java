package k50;

import java.io.IOException;
import java.io.InputStream;

public final class d implements i0 {
    public final int A = 1;
    public final Object B;
    public final Object C;

    public d(InputStream input, k0 k0Var) {
        kotlin.jvm.internal.m.e(input, "input");
        this.B = input;
        this.C = k0Var;
    }

    public d(h0 h0Var, d dVar) {
        this.B = h0Var;
        this.C = dVar;
    }

    @Override
    public final k0 c() {
        switch (this.A) {
            case 0:
                return (h0) this.B;
            default:
                return (k0) this.C;
        }
    }

    @Override
    public final void close() throws IOException {
        switch (this.A) {
            case 0:
                h0 h0Var = (h0) this.B;
                d dVar = (d) this.C;
                h0Var.h();
                try {
                    try {
                        dVar.close();
                        if (h0Var.i()) {
                            throw h0Var.k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!h0Var.i()) {
                            throw e;
                        }
                        throw h0Var.k(e);
                    }
                } catch (Throwable th) {
                    h0Var.i();
                    throw th;
                }
            default:
                ((InputStream) this.B).close();
                return;
        }
    }

    @Override
    public final long s(i sink, long j) throws IOException {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(sink, "sink");
                h0 h0Var = (h0) this.B;
                d dVar = (d) this.C;
                h0Var.h();
                try {
                    try {
                        long jS = dVar.s(sink, j);
                        if (h0Var.i()) {
                            throw h0Var.k(null);
                        }
                        return jS;
                    } catch (IOException e) {
                        if (h0Var.i()) {
                            throw h0Var.k(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    h0Var.i();
                    throw th;
                }
            default:
                kotlin.jvm.internal.m.e(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
                }
                try {
                    ((k0) this.C).f();
                    d0 d0VarN0 = sink.n0(1);
                    int i = ((InputStream) this.B).read(d0VarN0.a, d0VarN0.c, (int) Math.min(j, 8192 - d0VarN0.c));
                    if (i == -1) {
                        if (d0VarN0.b == d0VarN0.c) {
                            sink.A = d0VarN0.a();
                            e0.a(d0VarN0);
                        }
                        return -1L;
                    }
                    d0VarN0.c += i;
                    long j2 = i;
                    sink.B += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (bi.b.H(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.C) + ')';
            default:
                return "source(" + ((InputStream) this.B) + ')';
        }
    }
}
