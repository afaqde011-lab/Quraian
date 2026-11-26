package s7;

import android.net.Uri;
import java.util.Map;

public final class q implements g7.f {
    public final g7.f A;
    public final int B;
    public final p0 C;
    public final byte[] D;
    public int E;

    public q(g7.f fVar, int i10, p0 p0Var) {
        ta.c0.s(i10 > 0);
        this.A = fVar;
        this.B = i10;
        this.C = p0Var;
        this.D = new byte[1];
        this.E = i10;
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final long p(g7.j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map r() {
        return this.A.r();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.E;
        g7.f fVar = this.A;
        if (i12 == 0) {
            byte[] bArr2 = this.D;
            int i13 = 0;
            if (fVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = fVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        e7.u uVar = new e7.u(i14, bArr3);
                        p0 p0Var = this.C;
                        long jMax = !p0Var.L ? p0Var.I : Math.max(p0Var.M.n(true), p0Var.I);
                        int iA = uVar.a();
                        a8.l0 l0Var = p0Var.K;
                        l0Var.getClass();
                        l0Var.g(iA, uVar);
                        l0Var.d(jMax, 1, iA, 0, null);
                        p0Var.L = true;
                    }
                }
                this.E = this.B;
            }
            return -1;
        }
        int i17 = fVar.read(bArr, i10, Math.min(this.E, i11));
        if (i17 != -1) {
            this.E -= i17;
        }
        return i17;
    }

    @Override
    public final void s(g7.s sVar) {
        sVar.getClass();
        this.A.s(sVar);
    }

    @Override
    public final Uri y() {
        return this.A.y();
    }
}
