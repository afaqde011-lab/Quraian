package e4;

import ba.m;
import java.util.Arrays;
import l9.f0;

public final class e extends b {

    public g[] f5083f;

    public g[] f5084g;

    public int f5085h;

    public f0 f5086i;

    @Override
    public final g d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f5085h; i11++) {
            g[] gVarArr = this.f5083f;
            g gVar = gVarArr[i11];
            if (!zArr[gVar.B]) {
                f0 f0Var = this.f5086i;
                f0Var.B = gVar;
                int i12 = 8;
                if (i10 != -1) {
                    g gVar2 = gVarArr[i10];
                    while (i12 >= 0) {
                        float f3 = gVar2.H[i12];
                        float f10 = ((g) f0Var.B).H[i12];
                        if (f10 != f3) {
                            if (f10 >= f3) {
                                break;
                            }
                            i10 = i11;
                            break;
                            break;
                        }
                        i12--;
                    }
                } else {
                    while (i12 >= 0) {
                        float f11 = ((g) f0Var.B).H[i12];
                        if (f11 > 0.0f) {
                            break;
                        }
                        if (f11 < 0.0f) {
                            i10 = i11;
                            break;
                        }
                        i12--;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f5083f[i10];
    }

    @Override
    public final boolean e() {
        return this.f5085h == 0;
    }

    @Override
    public final void i(c cVar, b bVar, boolean z10) {
        g gVar = bVar.f5061a;
        if (gVar == null) {
            return;
        }
        float[] fArr = gVar.H;
        a aVar = bVar.f5064d;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            g gVarE = aVar.e(i10);
            float f3 = aVar.f(i10);
            f0 f0Var = this.f5086i;
            f0Var.B = gVarE;
            if (gVarE.A) {
                boolean z11 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((g) f0Var.B).H;
                    float f10 = (fArr[i11] * f3) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((g) f0Var.B).H[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((e) f0Var.C).k((g) f0Var.B);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f3;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((g) f0Var.B).H[i12] = f12;
                    } else {
                        ((g) f0Var.B).H[i12] = 0.0f;
                    }
                }
                j(gVarE);
            }
            this.f5062b = (bVar.f5062b * f3) + this.f5062b;
        }
        k(gVar);
    }

    public final void j(g gVar) {
        int i10;
        int i11 = this.f5085h + 1;
        g[] gVarArr = this.f5083f;
        if (i11 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f5083f = gVarArr2;
            this.f5084g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f5083f;
        int i12 = this.f5085h;
        gVarArr3[i12] = gVar;
        int i13 = i12 + 1;
        this.f5085h = i13;
        if (i13 > 1 && gVarArr3[i12].B > gVar.B) {
            int i14 = 0;
            while (true) {
                i10 = this.f5085h;
                if (i14 >= i10) {
                    break;
                }
                this.f5084g[i14] = this.f5083f[i14];
                i14++;
            }
            Arrays.sort(this.f5084g, 0, i10, new m(4));
            for (int i15 = 0; i15 < this.f5085h; i15++) {
                this.f5083f[i15] = this.f5084g[i15];
            }
        }
        gVar.A = true;
        gVar.a(this);
    }

    public final void k(g gVar) {
        int i10 = 0;
        while (i10 < this.f5085h) {
            if (this.f5083f[i10] == gVar) {
                while (true) {
                    int i11 = this.f5085h;
                    if (i10 >= i11 - 1) {
                        this.f5085h = i11 - 1;
                        gVar.A = false;
                        return;
                    } else {
                        g[] gVarArr = this.f5083f;
                        int i12 = i10 + 1;
                        gVarArr[i10] = gVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override
    public final String toString() {
        f0 f0Var = this.f5086i;
        String str = " goal -> (" + this.f5062b + ") : ";
        for (int i10 = 0; i10 < this.f5085h; i10++) {
            f0Var.B = this.f5083f[i10];
            str = str + f0Var + " ";
        }
        return str;
    }
}
