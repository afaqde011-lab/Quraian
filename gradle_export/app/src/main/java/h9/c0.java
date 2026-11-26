package h9;

import com.google.android.gms.cast.Cast;
import e7.i0;
import g1.c3;

public final class c0 implements g0 {

    public final b0 f6671a;

    public final e7.u f6672b = new e7.u(32);

    public int f6673c;

    public int f6674d;

    public boolean f6675e;

    public boolean f6676f;

    public c0(b0 b0Var) {
        this.f6671a = b0Var;
    }

    @Override
    public final void a() {
        this.f6676f = true;
    }

    @Override
    public final void b(int i10, e7.u uVar) {
        int iA;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iA = uVar.f5183b + uVar.A();
        } else {
            iA = -1;
        }
        if (this.f6676f) {
            if (!z10) {
                return;
            }
            this.f6676f = false;
            uVar.N(iA);
            this.f6674d = 0;
        }
        while (uVar.a() > 0) {
            int i11 = this.f6674d;
            e7.u uVar2 = this.f6672b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iA2 = uVar.A();
                    uVar.N(uVar.f5183b - 1);
                    if (iA2 == 255) {
                        this.f6676f = true;
                        return;
                    }
                }
                int iMin = Math.min(uVar.a(), 3 - this.f6674d);
                uVar.k(this.f6674d, iMin, uVar2.f5182a);
                int i12 = this.f6674d + iMin;
                this.f6674d = i12;
                if (i12 == 3) {
                    uVar2.N(0);
                    uVar2.M(3);
                    uVar2.O(1);
                    int iA3 = uVar2.A();
                    int iA4 = uVar2.A();
                    this.f6675e = (iA3 & Cast.MAX_NAMESPACE_LENGTH) != 0;
                    int i13 = (((iA3 & 15) << 8) | iA4) + 3;
                    this.f6673c = i13;
                    byte[] bArr = uVar2.f5182a;
                    if (bArr.length < i13) {
                        uVar2.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(uVar.a(), this.f6673c - this.f6674d);
                uVar.k(this.f6674d, iMin2, uVar2.f5182a);
                int i14 = this.f6674d + iMin2;
                this.f6674d = i14;
                int i15 = this.f6673c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f6675e) {
                        uVar2.M(i15);
                    } else {
                        if (i0.k(0, uVar2.f5182a, i15, -1) != 0) {
                            this.f6676f = true;
                            return;
                        }
                        uVar2.M(this.f6673c - 4);
                    }
                    uVar2.N(0);
                    this.f6671a.b(uVar2);
                    this.f6674d = 0;
                }
            }
        }
    }

    @Override
    public final void c(e7.e0 e0Var, a8.s sVar, c3 c3Var) {
        this.f6671a.c(e0Var, sVar, c3Var);
        this.f6676f = true;
    }
}
