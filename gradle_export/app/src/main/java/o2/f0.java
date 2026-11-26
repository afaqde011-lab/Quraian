package o2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f0 extends h0 implements Iterable, v00.a {
    public final String A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final List I;
    public final List J;

    public f0(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
        this.A = str;
        this.B = f3;
        this.C = f10;
        this.D = f11;
        this.E = f12;
        this.F = f13;
        this.G = f14;
        this.H = f15;
        this.I = list;
        this.J = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f0)) {
            f0 f0Var = (f0) obj;
            return kotlin.jvm.internal.m.a(this.A, f0Var.A) && this.B == f0Var.B && this.C == f0Var.C && this.D == f0Var.D && this.E == f0Var.E && this.F == f0Var.F && this.G == f0Var.G && this.H == f0Var.H && kotlin.jvm.internal.m.a(this.I, f0Var.I) && kotlin.jvm.internal.m.a(this.J, f0Var.J);
        }
        return false;
    }

    public final int hashCode() {
        return this.J.hashCode() + g4.c.a(w.c.c(this.H, w.c.c(this.G, w.c.c(this.F, w.c.c(this.E, w.c.c(this.D, w.c.c(this.C, w.c.c(this.B, this.A.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.I);
    }

    @Override
    public final Iterator iterator() {
        return new n30.g(this);
    }
}
