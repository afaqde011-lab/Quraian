package k50;

import java.io.IOException;
import java.io.InputStream;

public final class g extends InputStream {
    public final int A;
    public final k B;

    public g(k kVar, int i) {
        this.A = i;
        this.B = kVar;
    }

    private final void a() {
    }

    @Override
    public final int available() throws IOException {
        long jMin;
        switch (this.A) {
            case 0:
                jMin = Math.min(((i) this.B).B, Integer.MAX_VALUE);
                break;
            default:
                c0 c0Var = (c0) this.B;
                if (c0Var.C) {
                    throw new IOException("closed");
                }
                jMin = Math.min(c0Var.B.B, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override
    public final void close() {
        switch (this.A) {
            case 0:
                break;
            default:
                ((c0) this.B).close();
                break;
        }
    }

    @Override
    public final int read() throws IOException {
        switch (this.A) {
            case 0:
                i iVar = (i) this.B;
                if (iVar.B > 0) {
                    return iVar.readByte() & 255;
                }
                return -1;
            default:
                c0 c0Var = (c0) this.B;
                i iVar2 = c0Var.B;
                if (c0Var.C) {
                    throw new IOException("closed");
                }
                if (iVar2.B == 0 && c0Var.A.s(iVar2, 8192L) == -1) {
                    return -1;
                }
                return iVar2.readByte() & 255;
        }
    }

    @Override
    public final int read(byte[] sink, int i, int i2) throws IOException {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(sink, "sink");
                return ((i) this.B).read(sink, i, i2);
            default:
                kotlin.jvm.internal.m.e(sink, "data");
                c0 c0Var = (c0) this.B;
                i iVar = c0Var.B;
                if (c0Var.C) {
                    throw new IOException("closed");
                }
                ab.a0.u(sink.length, i, i2);
                if (iVar.B == 0 && c0Var.A.s(iVar, 8192L) == -1) {
                    return -1;
                }
                return iVar.read(sink, i, i2);
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return ((i) this.B) + ".inputStream()";
            default:
                return ((c0) this.B) + ".inputStream()";
        }
    }
}
