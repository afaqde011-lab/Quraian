package k50;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class t implements i0 {
    public final c0 A;
    public final Inflater B;
    public int C;
    public boolean D;

    public t(c0 c0Var, Inflater inflater) {
        this.A = c0Var;
        this.B = inflater;
    }

    @Override
    public final k0 c() {
        return this.A.A.c();
    }

    @Override
    public final void close() {
        if (this.D) {
            return;
        }
        this.B.end();
        this.D = true;
        this.A.close();
    }

    @Override
    public final long s(i sink, long j) throws IOException {
        long j2;
        kotlin.jvm.internal.m.e(sink, "sink");
        while (j >= 0) {
            if (this.D) {
                throw new IllegalStateException("closed");
            }
            c0 c0Var = this.A;
            Inflater inflater = this.B;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    d0 d0VarN0 = sink.n0(1);
                    int iMin = (int) Math.min(j, 8192 - d0VarN0.c);
                    if (inflater.needsInput() && !c0Var.a()) {
                        d0 d0Var = c0Var.B.A;
                        kotlin.jvm.internal.m.b(d0Var);
                        int i = d0Var.c;
                        int i2 = d0Var.b;
                        int i3 = i - i2;
                        this.C = i3;
                        inflater.setInput(d0Var.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(d0VarN0.a, d0VarN0.c, iMin);
                    int i4 = this.C;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.C -= remaining;
                        c0Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        d0VarN0.c += iInflate;
                        j2 = iInflate;
                        sink.B += j2;
                    } else {
                        if (d0VarN0.b == d0VarN0.c) {
                            sink.A = d0VarN0.a();
                            e0.a(d0VarN0);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (c0Var.a()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(w.c.i(j, "byteCount < 0: ").toString());
    }
}
