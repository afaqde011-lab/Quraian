package x;

import com.google.protobuf.RuntimeVersion;

public final class y1 implements u1 {
    public final u.v A;
    public final u.w B;
    public final int C;
    public final v D;
    public int[] E = t1.f16374a;
    public float[] F;
    public o G;
    public o H;
    public o I;
    public o J;
    public float[] K;
    public float[] L;
    public wb.o M;

    public y1(u.v vVar, u.w wVar, int i10, v vVar2) {
        this.A = vVar;
        this.B = wVar;
        this.C = i10;
        this.D = vVar2;
        float[] fArr = t1.f16375b;
        this.F = fArr;
        this.K = fArr;
        this.L = fArr;
        this.M = t1.f16376c;
    }

    @Override
    public final o c(long j9, o oVar, o oVar2, o oVar3) {
        int[] iArr = t1.f16374a;
        int i10 = 0;
        long j10 = (j9 / 1000000) - ((long) 0);
        long j11 = this.C;
        if (j10 < 0) {
            j10 = 0;
        }
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 < 0) {
            return oVar3;
        }
        f(oVar, oVar2, oVar3);
        o oVar4 = this.H;
        kotlin.jvm.internal.m.b(oVar4);
        if (this.M != t1.f16376c) {
            int i11 = (int) j12;
            float fE = e(d(i11), i11, false);
            float[] fArr = this.L;
            q[][] qVarArr = (q[][]) this.M.A;
            float f3 = qVarArr[0][0].f16336a;
            float f10 = qVarArr[qVarArr.length - 1][0].f16337b;
            if (fE < f3) {
                fE = f3;
            }
            if (fE <= f10) {
                f10 = fE;
            }
            int length = fArr.length;
            boolean z10 = false;
            for (q[] qVarArr2 : qVarArr) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < length - 1) {
                    q qVar = qVarArr2[i13];
                    if (f10 <= qVar.f16337b) {
                        if (qVar.f16349p) {
                            fArr[i12] = qVar.f16350q;
                            fArr[i12 + 1] = qVar.f16351r;
                        } else {
                            qVar.c(f10);
                            fArr[i12] = qVar.a();
                            fArr[i12 + 1] = qVar.b();
                        }
                        z10 = true;
                    }
                    i12 += 2;
                    i13++;
                }
                if (z10) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i10 < length2) {
                oVar4.e(fArr[i10], i10);
                i10++;
            }
        } else {
            o oVarR = r((j12 - 1) * 1000000, oVar, oVar2, oVar3);
            o oVarR2 = r(j12 * 1000000, oVar, oVar2, oVar3);
            int iB = oVarR.b();
            while (i10 < iB) {
                oVar4.e((oVarR.a(i10) - oVarR2.a(i10)) * 1000.0f, i10);
                i10++;
            }
        }
        return oVar4;
    }

    public final int d(int i10) {
        int i11;
        u.v vVar = this.A;
        int i12 = vVar.f14904b;
        vVar.getClass();
        if (i12 <= 0 || i12 > vVar.f14904b) {
            v.a.d(RuntimeVersion.SUFFIX);
            throw null;
        }
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = vVar.f14903a[i11];
                if (i15 >= i10) {
                    if (i15 <= i10) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = -(i14 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    public final float e(int i10, int i11, boolean z10) {
        v vVar;
        float f3;
        u.v vVar2 = this.A;
        if (i10 >= vVar2.f14904b - 1) {
            f3 = i11;
        } else {
            int iC = vVar2.c(i10);
            int iC2 = vVar2.c(i10 + 1);
            if (i11 != iC) {
                int i12 = iC2 - iC;
                x1 x1Var = (x1) this.B.b(iC);
                if (x1Var == null || (vVar = x1Var.f16388b) == null) {
                    vVar = this.D;
                }
                float f10 = i12;
                float fB = vVar.b((i11 - iC) / f10);
                return z10 ? fB : ((f10 * fB) + iC) / 1000;
            }
            f3 = iC;
        }
        return f3 / 1000;
    }

    public final void f(o oVar, o oVar2, o oVar3) {
        float[] fArr;
        boolean z10 = this.M != t1.f16376c;
        o oVar4 = this.G;
        u.w wVar = this.B;
        u.v vVar = this.A;
        if (oVar4 == null) {
            this.G = oVar.c();
            this.H = oVar3.c();
            int i10 = vVar.f14904b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = vVar.c(i11) / 1000;
            }
            this.F = fArr2;
            int i12 = vVar.f14904b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i13] = 0;
            }
            this.E = iArr;
        }
        if (z10) {
            if (this.M != t1.f16376c && kotlin.jvm.internal.m.a(this.I, oVar) && kotlin.jvm.internal.m.a(this.J, oVar2)) {
                return;
            }
            this.I = oVar;
            this.J = oVar2;
            int iB = oVar.b() + (oVar.b() % 2);
            this.K = new float[iB];
            this.L = new float[iB];
            int i14 = vVar.f14904b;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iC = vVar.c(i15);
                x1 x1Var = (x1) wVar.b(iC);
                if (iC == 0 && x1Var == null) {
                    fArr = new float[iB];
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr[i16] = oVar.a(i16);
                    }
                } else if (iC == this.C && x1Var == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = oVar2.a(i17);
                    }
                } else {
                    kotlin.jvm.internal.m.b(x1Var);
                    o oVar5 = x1Var.f16387a;
                    float[] fArr4 = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr4[i18] = oVar5.a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.M = new wb.o(this.E, this.F, fArr3);
        }
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final o r(long j9, o oVar, o oVar2, o oVar3) {
        o oVar4;
        o oVar5;
        o oVar6 = oVar;
        int[] iArr = t1.f16374a;
        int i10 = 0;
        long j10 = (j9 / 1000000) - ((long) 0);
        int i11 = this.C;
        long j11 = i11;
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 <= j11) {
            j11 = j10;
        }
        int i12 = (int) j11;
        u.w wVar = this.B;
        x1 x1Var = (x1) wVar.b(i12);
        if (x1Var != null) {
            return x1Var.f16387a;
        }
        if (i12 >= i11) {
            return oVar2;
        }
        if (i12 <= 0) {
            return oVar6;
        }
        f(oVar6, oVar2, oVar3);
        o oVar7 = this.G;
        kotlin.jvm.internal.m.b(oVar7);
        if (this.M != t1.f16376c) {
            float fE = e(d(i12), i12, false);
            float[] fArr = this.K;
            q[][] qVarArr = (q[][]) this.M.A;
            int length = qVarArr.length - 1;
            float f3 = qVarArr[0][0].f16336a;
            float f10 = qVarArr[length][0].f16337b;
            int length2 = fArr.length;
            if (fE < f3 || fE > f10) {
                if (fE > f10) {
                    f3 = f10;
                } else {
                    length = 0;
                }
                float f11 = fE - f3;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2 - 1) {
                    q qVar = qVarArr[length][i14];
                    boolean z10 = qVar.f16349p;
                    float f12 = qVar.f16351r;
                    float f13 = qVar.f16350q;
                    if (z10) {
                        float f14 = qVar.f16336a;
                        float f15 = qVar.f16346k;
                        float f16 = qVar.f16338c;
                        fArr[i13] = (f13 * f11) + w.c.b(qVar.f16340e, f16, (f3 - f14) * f15, f16);
                        float f17 = (f3 - f14) * f15;
                        float f18 = qVar.f16339d;
                        fArr[i13 + 1] = (f12 * f11) + w.c.b(qVar.f16341f, f18, f17, f18);
                    } else {
                        qVar.c(f3);
                        fArr[i13] = (qVar.a() * f11) + (qVar.f16347n * qVar.f16343h) + f13;
                        fArr[i13 + 1] = (qVar.b() * f11) + (qVar.f16348o * qVar.f16344i) + f12;
                    }
                    i13 += 2;
                    i14++;
                    qVarArr = qVarArr;
                }
            } else {
                int length3 = qVarArr.length;
                int i15 = 0;
                boolean z11 = false;
                while (i15 < length3) {
                    int i16 = i10;
                    int i17 = i16;
                    while (i16 < length2 - 1) {
                        q qVar2 = qVarArr[i15][i17];
                        if (fE <= qVar2.f16337b) {
                            if (qVar2.f16349p) {
                                float f19 = qVar2.f16336a;
                                float f20 = qVar2.f16346k;
                                float f21 = qVar2.f16338c;
                                fArr[i16] = w.c.b(qVar2.f16340e, f21, (fE - f19) * f20, f21);
                                float f22 = qVar2.f16339d;
                                fArr[i16 + 1] = w.c.b(qVar2.f16341f, f22, (fE - f19) * f20, f22);
                            } else {
                                qVar2.c(fE);
                                fArr[i16] = (qVar2.f16347n * qVar2.f16343h) + qVar2.f16350q;
                                fArr[i16 + 1] = (qVar2.f16348o * qVar2.f16344i) + qVar2.f16351r;
                            }
                            z11 = true;
                        }
                        i16 += 2;
                        i17++;
                    }
                    if (z11) {
                        break;
                    }
                    i15++;
                    i10 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i18 = 0; i18 < length4; i18++) {
                oVar7.e(fArr[i18], i18);
            }
        } else {
            int iD = d(i12);
            float fE2 = e(iD, i12, true);
            u.v vVar = this.A;
            x1 x1Var2 = (x1) wVar.b(vVar.c(iD));
            if (x1Var2 != null && (oVar5 = x1Var2.f16387a) != null) {
                oVar6 = oVar5;
            }
            x1 x1Var3 = (x1) wVar.b(vVar.c(iD + 1));
            if (x1Var3 == null || (oVar4 = x1Var3.f16387a) == null) {
                oVar4 = oVar2;
            }
            int iB = oVar7.b();
            for (int i19 = 0; i19 < iB; i19++) {
                oVar7.e((oVar4.a(i19) * fE2) + ((1 - fE2) * oVar6.a(i19)), i19);
            }
        }
        return oVar7;
    }

    @Override
    public final int v() {
        return this.C;
    }
}
