package z7;

import androidx.media3.common.t;
import e7.i0;
import e7.u;
import java.nio.ByteBuffer;

public final class b extends i7.a {
    public final h7.e S;
    public final u T;
    public a U;
    public long V;

    public b() {
        super(6);
        this.S = new h7.e(1);
        this.T = new u();
    }

    @Override
    public final int B(t tVar) {
        return "application/x-camera-motion".equals(tVar.f1594n) ? i7.a.c(4, 0, 0, 0) : i7.a.c(0, 0, 0, 0);
    }

    @Override
    public final void e(int i10, Object obj) {
        if (i10 == 8) {
            this.U = (a) obj;
        }
    }

    @Override
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override
    public final boolean k() {
        return j();
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void n() {
        a aVar = this.U;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override
    public final void p(long j9, boolean z10, boolean z11) {
        this.V = Long.MIN_VALUE;
        a aVar = this.U;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override
    public final void x(long j9, long j10) {
        float[] fArr;
        while (!j() && this.V < 100000 + j9) {
            h7.e eVar = this.S;
            eVar.q();
            h7.b bVar = this.C;
            bVar.m();
            if (w(bVar, eVar, 0) != -4 || eVar.c(4)) {
                return;
            }
            long j11 = eVar.G;
            this.V = j11;
            boolean z10 = j11 < this.L;
            if (this.U != null && !z10) {
                eVar.t();
                ByteBuffer byteBuffer = eVar.E;
                String str = i0.f5136a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    u uVar = this.T;
                    uVar.L(iLimit, bArrArray);
                    uVar.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(uVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.U.c(fArr, this.V - this.K);
                }
            }
        }
    }
}
