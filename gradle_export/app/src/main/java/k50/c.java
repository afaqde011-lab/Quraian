package k50;

import java.io.IOException;
import java.io.OutputStream;

public final class c implements g0 {
    public final int A;
    public final Object B;
    public final Object C;

    public c(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
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
    public final void c0(i iVar, long j) throws IOException {
        h0 h0Var;
        switch (this.A) {
            case 0:
                ab.a0.u(iVar.B, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    d0 d0Var = iVar.A;
                    kotlin.jvm.internal.m.b(d0Var);
                    try {
                        try {
                            while (j3 < 65536) {
                                j3 += (long) (d0Var.c - d0Var.b);
                                if (j3 >= j2) {
                                    j3 = j2;
                                    h0Var = (h0) this.B;
                                    c cVar = (c) this.C;
                                    h0Var.h();
                                    cVar.c0(iVar, j3);
                                    if (!h0Var.i()) {
                                        throw h0Var.k(null);
                                    }
                                    j2 -= j3;
                                } else {
                                    d0Var = d0Var.f;
                                    kotlin.jvm.internal.m.b(d0Var);
                                }
                            }
                            cVar.c0(iVar, j3);
                            if (!h0Var.i()) {
                                throw h0Var.k(null);
                            }
                            j2 -= j3;
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
                    h0Var = (h0) this.B;
                    c cVar2 = (c) this.C;
                    h0Var.h();
                }
                break;
            default:
                ab.a0.u(iVar.B, 0L, j);
                while (j > 0) {
                    ((k0) this.C).f();
                    d0 d0Var2 = iVar.A;
                    kotlin.jvm.internal.m.b(d0Var2);
                    int iMin = (int) Math.min(j, d0Var2.c - d0Var2.b);
                    ((OutputStream) this.B).write(d0Var2.a, d0Var2.b, iMin);
                    int i = d0Var2.b + iMin;
                    d0Var2.b = i;
                    long j4 = iMin;
                    j -= j4;
                    iVar.B -= j4;
                    if (i == d0Var2.c) {
                        iVar.A = d0Var2.a();
                        e0.a(d0Var2);
                    }
                }
                return;
        }
    }

    @Override
    public final void close() throws IOException {
        switch (this.A) {
            case 0:
                h0 h0Var = (h0) this.B;
                c cVar = (c) this.C;
                h0Var.h();
                try {
                    try {
                        cVar.close();
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
                ((OutputStream) this.B).close();
                return;
        }
    }

    @Override
    public final void flush() throws IOException {
        switch (this.A) {
            case 0:
                h0 h0Var = (h0) this.B;
                c cVar = (c) this.C;
                h0Var.h();
                try {
                    try {
                        cVar.flush();
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
                ((OutputStream) this.B).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.C) + ')';
            default:
                return "sink(" + ((OutputStream) this.B) + ')';
        }
    }
}
