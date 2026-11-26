package v8;

import a8.r;
import androidx.media3.common.ParserException;
import e7.u;
import java.io.EOFException;
import ta.c0;

public final class f {

    public int f15544a;

    public long f15545b;

    public int f15546c;

    public int f15547d;

    public int f15548e;

    public final int[] f15549f = new int[255];

    public final u f15550g = new u(255);

    public final boolean a(r rVar, boolean z10) throws ParserException, EOFException {
        boolean zI;
        boolean zI2;
        this.f15544a = 0;
        this.f15545b = 0L;
        this.f15546c = 0;
        this.f15547d = 0;
        this.f15548e = 0;
        u uVar = this.f15550g;
        uVar.K(27);
        try {
            zI = rVar.i(uVar.f5182a, 0, 27, z10);
        } catch (EOFException e3) {
            if (!z10) {
                throw e3;
            }
            zI = false;
        }
        if (zI && uVar.C() == 1332176723) {
            if (uVar.A() == 0) {
                this.f15544a = uVar.A();
                this.f15545b = uVar.p();
                uVar.r();
                uVar.r();
                uVar.r();
                int iA = uVar.A();
                this.f15546c = iA;
                this.f15547d = iA + 27;
                uVar.K(iA);
                try {
                    zI2 = rVar.i(uVar.f5182a, 0, this.f15546c, z10);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                    zI2 = false;
                }
                if (zI2) {
                    for (int i10 = 0; i10 < this.f15546c; i10++) {
                        int iA2 = uVar.A();
                        this.f15549f[i10] = iA2;
                        this.f15548e += iA2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(r rVar, long j9) {
        boolean zI;
        c0.s(rVar.getPosition() == rVar.j());
        u uVar = this.f15550g;
        uVar.K(4);
        while (true) {
            if (j9 != -1 && rVar.getPosition() + 4 >= j9) {
                break;
            }
            try {
                zI = rVar.i(uVar.f5182a, 0, 4, true);
            } catch (EOFException unused) {
                zI = false;
            }
            if (!zI) {
                break;
            }
            uVar.N(0);
            if (uVar.C() == 1332176723) {
                rVar.t();
                return true;
            }
            rVar.u(1);
        }
        do {
            if (j9 != -1 && rVar.getPosition() >= j9) {
                break;
            }
        } while (rVar.n(1) != -1);
        return false;
    }
}
