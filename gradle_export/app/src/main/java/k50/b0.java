package k50;

import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class b0 implements j {
    public final g0 A;
    public final i B;
    public boolean C;

    public b0(g0 sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.A = sink;
        this.B = new i();
    }

    @Override
    public final j J(int i, byte[] source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.write(source, 0, i);
        a();
        return this;
    }

    @Override
    public final j K(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.w0(string);
        a();
        return this;
    }

    @Override
    public final j Q(long j) {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.s0(j);
        a();
        return this;
    }

    @Override
    public final j V(l byteString) {
        kotlin.jvm.internal.m.e(byteString, "byteString");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.o0(byteString);
        a();
        return this;
    }

    public final j a() {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        i iVar = this.B;
        long jV = iVar.v();
        if (jV > 0) {
            this.A.c0(iVar, jV);
        }
        return this;
    }

    @Override
    public final i b() {
        return this.B;
    }

    @Override
    public final k0 c() {
        return this.A.c();
    }

    @Override
    public final void c0(i source, long j) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.c0(source, j);
        a();
    }

    @Override
    public final void close() {
        g0 g0Var = this.A;
        if (this.C) {
            return;
        }
        i iVar = this.B;
        long j = iVar.B;
        if (j > 0) {
            g0Var.c0(iVar, j);
        }
        th = null;
        try {
            g0Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.C = true;
        if (th != null) {
            throw th;
        }
    }

    @Override
    public final void flush() {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        i iVar = this.B;
        long j = iVar.B;
        g0 g0Var = this.A;
        if (j > 0) {
            g0Var.c0(iVar, j);
        }
        g0Var.flush();
    }

    @Override
    public final j h0(long j) {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.r0(j);
        a();
        return this;
    }

    @Override
    public final OutputStream i0() {
        return new h(this, 1);
    }

    @Override
    public final boolean isOpen() {
        return !this.C;
    }

    public final String toString() {
        return "buffer(" + this.A + ')';
    }

    @Override
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.B.write(source);
        a();
        return iWrite;
    }

    @Override
    public final j write(byte[] source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.write(source, 0, source.length);
        a();
        return this;
    }

    @Override
    public final j writeByte(int i) {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.q0(i);
        a();
        return this;
    }

    @Override
    public final j writeInt(int i) {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.t0(i);
        a();
        return this;
    }

    @Override
    public final j writeShort(int i) {
        if (this.C) {
            throw new IllegalStateException("closed");
        }
        this.B.u0(i);
        a();
        return this;
    }
}
