package nb;

import ab.a0;
import java.io.Closeable;
import k50.c0;
import k50.z;

public final class n extends o {
    public final z A;
    public final k50.o B;
    public final String C;
    public final Closeable D;
    public boolean E;
    public c0 F;

    public n(z zVar, k50.o oVar, String str, Closeable closeable) {
        this.A = zVar;
        this.B = oVar;
        this.C = str;
        this.D = closeable;
    }

    @Override
    public final a0 a() {
        return null;
    }

    @Override
    public final synchronized void close() {
        try {
            this.E = true;
            c0 c0Var = this.F;
            if (c0Var != null) {
                bc.d.a(c0Var);
            }
            Closeable closeable = this.D;
            if (closeable != null) {
                bc.d.a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized k50.k i() {
        if (this.E) {
            throw new IllegalStateException("closed");
        }
        c0 c0Var = this.F;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarR = bi.b.r(this.B.n(this.A));
        this.F = c0VarR;
        return c0VarR;
    }
}
