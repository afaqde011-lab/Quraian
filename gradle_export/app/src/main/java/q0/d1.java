package q0;

public final class d1 implements z2.g0 {
    public final b2 A;
    public final int B;
    public final r3.c0 C;
    public final u00.a D;

    public d1(b2 b2Var, int i10, r3.c0 c0Var, u00.a aVar) {
        this.A = b2Var;
        this.B = i10;
        this.C = c0Var;
        this.D = aVar;
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        long j10;
        if (v0Var.D(y3.a.g(j9)) < y3.a.h(j9)) {
            j10 = j9;
        } else {
            j10 = j9;
            j9 = y3.a.a(j10, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        z2.l1 l1VarO = v0Var.O(j9);
        int iMin = Math.min(l1VarO.A, y3.a.h(j10));
        return y0Var.o0(iMin, l1VarO.B, h00.y.A, new h0.u1(iMin, 2, this, y0Var, l1VarO));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return kotlin.jvm.internal.m.a(this.A, d1Var.A) && this.B == d1Var.B && kotlin.jvm.internal.m.a(this.C, d1Var.C) && kotlin.jvm.internal.m.a(this.D, d1Var.D);
    }

    public final int hashCode() {
        return this.D.hashCode() + ((this.C.hashCode() + w.c.d(this.B, this.A.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.A + ", cursorOffset=" + this.B + ", transformedText=" + this.C + ", textLayoutResultProvider=" + this.D + ')';
    }
}
