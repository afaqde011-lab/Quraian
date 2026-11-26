package p7;

import java.nio.ByteBuffer;
import ta.c0;

public final class f extends h7.e {
    public long J;
    public int K;
    public int L;

    @Override
    public final void q() {
        super.q();
        this.K = 0;
    }

    public final boolean u(h7.e eVar) {
        ByteBuffer byteBuffer;
        c0.s(!eVar.c(1073741824));
        c0.s(!eVar.c(268435456));
        c0.s(!eVar.c(4));
        if (v()) {
            if (this.K >= this.L) {
                return false;
            }
            ByteBuffer byteBuffer2 = eVar.E;
            if (byteBuffer2 != null && (byteBuffer = this.E) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.K;
        this.K = i10 + 1;
        if (i10 == 0) {
            this.G = eVar.G;
            if (eVar.c(1)) {
                this.B = 1;
            }
        }
        ByteBuffer byteBuffer3 = eVar.E;
        if (byteBuffer3 != null) {
            s(byteBuffer3.remaining());
            this.E.put(byteBuffer3);
        }
        this.J = eVar.G;
        return true;
    }

    public final boolean v() {
        return this.K > 0;
    }
}
