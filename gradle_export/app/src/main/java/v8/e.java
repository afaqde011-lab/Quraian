package v8;

import a8.r;
import e7.u;
import java.io.EOFException;
import ta.c0;

public final class e {

    public final f f15539a = new f();

    public final u f15540b = new u(0, new byte[65025]);

    public int f15541c = -1;

    public int f15542d;

    public boolean f15543e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f15542d = 0;
        do {
            int i13 = this.f15542d;
            int i14 = i10 + i13;
            f fVar = this.f15539a;
            if (i14 >= fVar.f15546c) {
                break;
            }
            int[] iArr = fVar.f15549f;
            this.f15542d = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(r rVar) {
        int i10;
        c0.A(rVar != null);
        boolean z10 = this.f15543e;
        u uVar = this.f15540b;
        if (z10) {
            this.f15543e = false;
            uVar.K(0);
        }
        while (!this.f15543e) {
            int i11 = this.f15541c;
            f fVar = this.f15539a;
            if (i11 < 0) {
                if (fVar.b(rVar, -1L) && fVar.a(rVar, true)) {
                    int iA = fVar.f15547d;
                    if ((fVar.f15544a & 1) == 1 && uVar.f5184c == 0) {
                        iA += a(0);
                        i10 = this.f15542d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        rVar.u(iA);
                        this.f15541c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f15541c);
            int i12 = this.f15541c + this.f15542d;
            if (iA2 > 0) {
                uVar.c(uVar.f5184c + iA2);
                try {
                    rVar.readFully(uVar.f5182a, uVar.f5184c, iA2);
                    uVar.M(uVar.f5184c + iA2);
                    this.f15543e = fVar.f15549f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.f15546c) {
                i12 = -1;
            }
            this.f15541c = i12;
        }
        return true;
    }
}
