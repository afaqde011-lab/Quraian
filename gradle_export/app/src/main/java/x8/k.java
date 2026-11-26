package x8;

import fh.q0;
import fh.t0;
import k7.t;

public interface k {
    void D(byte[] bArr, int i10, int i11, j jVar, e7.h hVar);

    default d m(int i10, int i11, byte[] bArr) {
        q0 q0VarM = t0.m();
        D(bArr, 0, i11, j.f16491c, new t(q0VarM, 29));
        return new b(q0VarM.g());
    }

    int p();

    default void reset() {
    }
}
