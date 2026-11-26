package q0;

public final class e2 {

    public final m3.n0 f12608a;

    public z2.a0 f12609b = null;

    public z2.a0 f12610c;

    public e2(m3.n0 n0Var, z2.a0 a0Var) {
        this.f12608a = n0Var;
        this.f12610c = a0Var;
    }

    public final long a(long j9) {
        h2.c cVarF;
        z2.a0 a0Var = this.f12609b;
        h2.c cVar = h2.c.f6545e;
        if (a0Var != null) {
            if (a0Var.A()) {
                z2.a0 a0Var2 = this.f12610c;
                cVarF = a0Var2 != null ? a0Var2.F(a0Var, true) : null;
            } else {
                cVarF = cVar;
            }
            if (cVarF != null) {
                cVar = cVarF;
            }
        }
        int i10 = (int) (j9 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = cVar.f6546a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            fIntBitsToFloat2 = cVar.f6548c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i10);
            }
        }
        int i11 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat5 = cVar.f6547b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
            fIntBitsToFloat5 = cVar.f6549d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i11);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(boolean z10, long j9) {
        if (z10) {
            j9 = a(j9);
        }
        return this.f12608a.f10497b.g(d(j9));
    }

    public final boolean c(long j9) {
        long jD = d(a(j9));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        m3.n0 n0Var = this.f12608a;
        int iE = n0Var.f10497b.e(fIntBitsToFloat);
        int i10 = (int) (jD >> 32);
        return Float.intBitsToFloat(i10) >= n0Var.f(iE) && Float.intBitsToFloat(i10) <= n0Var.g(iE);
    }

    public final long d(long j9) {
        z2.a0 a0Var;
        z2.a0 a0Var2 = this.f12609b;
        if (a0Var2 != null) {
            if (!a0Var2.A()) {
                a0Var2 = null;
            }
            if (a0Var2 != null && (a0Var = this.f12610c) != null) {
                z2.a0 a0Var3 = a0Var.A() ? a0Var : null;
                if (a0Var3 != null) {
                    return a0Var2.V(a0Var3, j9);
                }
            }
        }
        return j9;
    }

    public final long e(long j9) {
        z2.a0 a0Var;
        z2.a0 a0Var2 = this.f12609b;
        if (a0Var2 != null) {
            if (!a0Var2.A()) {
                a0Var2 = null;
            }
            if (a0Var2 != null && (a0Var = this.f12610c) != null) {
                z2.a0 a0Var3 = a0Var.A() ? a0Var : null;
                if (a0Var3 != null) {
                    return a0Var3.V(a0Var2, j9);
                }
            }
        }
        return j9;
    }
}
