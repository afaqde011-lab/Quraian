package a8;

import java.io.EOFException;

public final class p implements l0 {

    public final byte[] f305a = new byte[4096];

    @Override
    public final int b(androidx.media3.common.j jVar, int i10, boolean z10) throws EOFException {
        byte[] bArr = this.f305a;
        int i11 = jVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override
    public final void d(long j9, int i10, int i11, int i12, k0 k0Var) {
    }

    @Override
    public final void e(e7.u uVar, int i10, int i11) {
        uVar.O(i10);
    }

    @Override
    public final void f(androidx.media3.common.t tVar) {
    }
}
