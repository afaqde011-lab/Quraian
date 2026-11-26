package o2;

import java.util.List;

public final class j0 extends h0 {
    public final String A;
    public final List B;
    public final int C;
    public final i2.q D;
    public final float E;
    public final i2.q F;
    public final float G;
    public final float H;
    public final int I;
    public final int J;
    public final float K;
    public final float L;
    public final float M;
    public final float N;

    public j0(String str, List list, int i10, i2.q qVar, float f3, i2.q qVar2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15) {
        this.A = str;
        this.B = list;
        this.C = i10;
        this.D = qVar;
        this.E = f3;
        this.F = qVar2;
        this.G = f10;
        this.H = f11;
        this.I = i11;
        this.J = i12;
        this.K = f12;
        this.L = f13;
        this.M = f14;
        this.N = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            return kotlin.jvm.internal.m.a(this.A, j0Var.A) && kotlin.jvm.internal.m.a(this.D, j0Var.D) && this.E == j0Var.E && kotlin.jvm.internal.m.a(this.F, j0Var.F) && this.G == j0Var.G && this.H == j0Var.H && this.I == j0Var.I && this.J == j0Var.J && this.K == j0Var.K && this.L == j0Var.L && this.M == j0Var.M && this.N == j0Var.N && this.C == j0Var.C && kotlin.jvm.internal.m.a(this.B, j0Var.B);
        }
        return false;
    }

    public final int hashCode() {
        int iA = g4.c.a(this.A.hashCode() * 31, 31, this.B);
        i2.q qVar = this.D;
        int iC = w.c.c(this.E, (iA + (qVar != null ? qVar.hashCode() : 0)) * 31, 31);
        i2.q qVar2 = this.F;
        return Integer.hashCode(this.C) + w.c.c(this.N, w.c.c(this.M, w.c.c(this.L, w.c.c(this.K, w.c.d(this.J, w.c.d(this.I, w.c.c(this.H, w.c.c(this.G, (iC + (qVar2 != null ? qVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
