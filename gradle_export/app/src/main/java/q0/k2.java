package q0;

public final class k2 implements z2.g0 {
    public final b2 A;
    public final int B;
    public final r3.c0 C;
    public final u00.a D;

    public k2(b2 b2Var, int i10, r3.c0 c0Var, u00.a aVar) {
        this.A = b2Var;
        this.B = i10;
        this.C = c0Var;
        this.D = aVar;
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        z2.l1 l1VarO = v0Var.O(y3.a.a(j9, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(l1VarO.B, y3.a.g(j9));
        return y0Var.o0(l1VarO.A, iMin, h00.y.A, new a1.q0(this, l1VarO, iMin, 5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return kotlin.jvm.internal.m.a(this.A, k2Var.A) && this.B == k2Var.B && kotlin.jvm.internal.m.a(this.C, k2Var.C) && kotlin.jvm.internal.m.a(this.D, k2Var.D);
    }

    public final int hashCode() {
        return this.D.hashCode() + ((this.C.hashCode() + w.c.d(this.B, this.A.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.A + ", cursorOffset=" + this.B + ", transformedText=" + this.C + ", textLayoutResultProvider=" + this.D + ')';
    }
}
