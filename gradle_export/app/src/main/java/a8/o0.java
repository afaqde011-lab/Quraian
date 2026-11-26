package a8;

import java.nio.ByteBuffer;

public final class o0 {

    public boolean f304a;

    public o0(f7.p pVar, f7.r rVar) throws f7.q {
        int i10 = rVar.f5551a;
        ByteBuffer byteBuffer = rVar.f5552b;
        ta.c0.s(i10 == 6 || i10 == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        n0 n0Var = new n0(iMin, bArr);
        pVar.getClass();
        if (n0Var.h()) {
            this.f304a = false;
            return;
        }
        int i11 = n0Var.i(2);
        if (!n0Var.h()) {
            this.f304a = true;
            return;
        }
        if (i11 != 3 && i11 != 0) {
            n0Var.h();
        }
        n0Var.s();
        throw new f7.q();
    }

    public void a(boolean z10) {
        if (this.f304a == z10) {
            return;
        }
        this.f304a = z10;
    }
}
