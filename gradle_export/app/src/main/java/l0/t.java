package l0;

import a1.q2;
import kotlin.NoWhenBranchMatchedException;

public final class t extends b2.q implements b3.y, b3.k {
    public static final r R = new r();
    public u O;
    public hf.c P;
    public d0.q1 Q;

    public final boolean B1(o oVar, int i10) {
        if (i10 == 5 || i10 == 6) {
            if (this.Q == d0.q1.B) {
                return false;
            }
        } else if (i10 == 3 || i10 == 4) {
            if (this.Q == d0.q1.A) {
                return false;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (C1(i10)) {
            if (oVar.f9781b >= this.O.a() - 1) {
                return false;
            }
        } else if (oVar.f9780a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean C1(int i10) throws NoWhenBranchMatchedException {
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 5) {
            return false;
        }
        if (i10 == 6) {
            return true;
        }
        if (i10 == 3) {
            int iOrdinal = b3.m.y(this).f2053a0.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = b3.m.y(this).f2053a0.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        z2.l1 l1VarO = v0Var.O(j9);
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new q2(l1VarO, 12));
    }
}
