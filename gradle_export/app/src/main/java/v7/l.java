package v7;

import androidx.media3.common.l2;
import com.google.protobuf.RuntimeVersion;
import fh.b2;
import fh.g0;
import fh.t0;
import fh.y1;

public final class l extends n implements Comparable {
    public final int E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;

    public l(int i10, l2 l2Var, int i11, j jVar, int i12, String str, String str2) {
        int iU;
        super(i10, l2Var, i11);
        int i13 = 0;
        this.F = i7.a.l(i12, false);
        int i14 = this.D.f1587e;
        int i15 = jVar.C;
        t0 t0Var = jVar.f1463y;
        int i16 = i14 & (~i15);
        this.G = (i16 & 1) != 0;
        this.H = (i16 & 2) != 0;
        t0 t0VarS = str2 != null ? t0.s(str2) : t0Var.isEmpty() ? t0.s(RuntimeVersion.SUFFIX) : t0Var;
        int i17 = 0;
        while (true) {
            if (i17 >= t0VarS.size()) {
                iU = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iU = p.u(this.D, (String) t0VarS.get(i17), jVar.D);
                if (iU > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.I = i17;
        this.J = iU;
        int i18 = str2 != null ? 1088 : jVar.A;
        int i19 = this.D.f1588f;
        b2 b2Var = p.f15511k;
        int iBitCount = (i19 == 0 || i19 != i18) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        this.K = iBitCount;
        androidx.media3.common.t tVar = this.D;
        this.N = (1088 & tVar.f1588f) != 0;
        int iS = p.s(tVar, jVar.f1464z);
        this.L = iS;
        int iU2 = p.u(this.D, str, p.x(str) == null);
        this.M = iU2;
        boolean z10 = iU > 0 || (t0Var.isEmpty() && iBitCount > 0) || ((t0Var.isEmpty() && iS != Integer.MAX_VALUE) || this.G || ((this.H && iU2 > 0) || jVar.f1462x));
        if (i7.a.l(i12, jVar.B0) && z10) {
            i13 = 1;
        }
        this.E = i13;
    }

    @Override
    public final int a() {
        return this.E;
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final int compareTo(l lVar) {
        g0 g0VarC = g0.f5672a.c(this.F, lVar.F);
        Integer numValueOf = Integer.valueOf(this.I);
        Integer numValueOf2 = Integer.valueOf(lVar.I);
        y1 y1Var = y1.B;
        y1 y1Var2 = y1.C;
        g0 g0VarB = g0VarC.b(numValueOf, numValueOf2, y1Var2);
        int i10 = lVar.J;
        int i11 = this.J;
        g0 g0VarA = g0VarB.a(i11, i10);
        int i12 = lVar.K;
        int i13 = this.K;
        g0 g0VarC2 = g0VarA.a(i13, i12).b(Integer.valueOf(this.L), Integer.valueOf(lVar.L), y1Var2).c(this.G, lVar.G);
        Boolean boolValueOf = Boolean.valueOf(this.H);
        Boolean boolValueOf2 = Boolean.valueOf(lVar.H);
        if (i11 != 0) {
            y1Var = y1Var2;
        }
        g0 g0VarA2 = g0VarC2.b(boolValueOf, boolValueOf2, y1Var).a(this.M, lVar.M);
        if (i13 == 0) {
            g0VarA2 = g0VarA2.d(this.N, lVar.N);
        }
        return g0VarA2.e();
    }
}
