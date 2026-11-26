package k50;

import java.io.IOException;
import java.io.OutputStream;

public final class h extends OutputStream {
    public final int A;
    public final j B;

    public h(j jVar, int i) {
        this.A = i;
        this.B = jVar;
    }

    private final void a() {
    }

    private final void i() {
    }

    @Override
    public final void close() {
        switch (this.A) {
            case 0:
                break;
            default:
                ((b0) this.B).close();
                break;
        }
    }

    @Override
    public final void flush() {
        switch (this.A) {
            case 0:
                break;
            default:
                b0 b0Var = (b0) this.B;
                if (!b0Var.C) {
                    b0Var.flush();
                }
                break;
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return ((i) this.B) + ".outputStream()";
            default:
                return ((b0) this.B) + ".outputStream()";
        }
    }

    @Override
    public final void write(int i) throws IOException {
        switch (this.A) {
            case 0:
                ((i) this.B).q0(i);
                return;
            default:
                b0 b0Var = (b0) this.B;
                if (b0Var.C) {
                    throw new IOException("closed");
                }
                b0Var.B.q0((byte) i);
                b0Var.a();
                return;
        }
    }

    @Override
    public final void write(byte[] data, int i, int i2) throws IOException {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(data, "data");
                ((i) this.B).write(data, i, i2);
                return;
            default:
                kotlin.jvm.internal.m.e(data, "data");
                b0 b0Var = (b0) this.B;
                if (b0Var.C) {
                    throw new IOException("closed");
                }
                b0Var.B.write(data, i, i2);
                b0Var.a();
                return;
        }
    }
}
