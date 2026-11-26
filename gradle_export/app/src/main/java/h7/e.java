package h7;

import androidx.media3.common.r0;
import androidx.media3.common.t;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

public class e extends f7.e {
    public t C;
    public final c D = new c();
    public ByteBuffer E;
    public boolean F;
    public long G;
    public ByteBuffer H;
    public final int I;

    static {
        r0.a("media3.decoder");
    }

    public e(int i10) {
        this.I = i10;
    }

    public void q() {
        this.B = 0;
        ByteBuffer byteBuffer = this.E;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.H;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.F = false;
    }

    public final ByteBuffer r(int i10) {
        int i11 = this.I;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.E;
        throw new DecoderInputBuffer$InsufficientCapacityException(g4.c.e(byteBuffer == null ? 0 : byteBuffer.capacity(), i10, "Buffer too small (", " < ", ")"));
    }

    public final void s(int i10) {
        ByteBuffer byteBuffer = this.E;
        if (byteBuffer == null) {
            this.E = r(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.E = byteBuffer;
            return;
        }
        ByteBuffer byteBufferR = r(i11);
        byteBufferR.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferR.put(byteBuffer);
        }
        this.E = byteBufferR;
    }

    public final void t() {
        ByteBuffer byteBuffer = this.E;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.H;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
