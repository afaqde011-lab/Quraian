package b3;

public final class r1 implements z2.v0 {
    public final int A;
    public final z2.v0 B;
    public final Enum C;
    public final Enum D;

    public r1(z2.v0 v0Var, Enum r4, Enum r7, int i10) {
        this.A = i10;
        this.B = v0Var;
        this.C = r4;
        this.D = r7;
    }

    @Override
    public final int D(int i10) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B.D(i10);
    }

    @Override
    public final z2.l1 O(long j9) {
        switch (this.A) {
            case 0:
                t1 t1Var = (t1) this.C;
                u1 u1Var = (u1) this.D;
                u1 u1Var2 = u1.A;
                z2.v0 v0Var = this.B;
                if (u1Var == u1Var2) {
                    return new s1(t1Var == t1.B ? v0Var.D(y3.a.g(j9)) : v0Var.s(y3.a.g(j9)), y3.a.c(j9) ? y3.a.g(j9) : 32767, 0);
                }
                return new s1(y3.a.d(j9) ? y3.a.h(j9) : 32767, t1Var == t1.B ? v0Var.d(y3.a.h(j9)) : v0Var.f0(y3.a.h(j9)), 0);
            case 1:
                z2.x xVar = (z2.x) this.C;
                z2.y yVar = (z2.y) this.D;
                z2.y yVar2 = z2.y.A;
                z2.v0 v0Var2 = this.B;
                if (yVar == yVar2) {
                    return new s1(xVar == z2.x.B ? v0Var2.D(y3.a.g(j9)) : v0Var2.s(y3.a.g(j9)), y3.a.c(j9) ? y3.a.g(j9) : 32767, 1);
                }
                return new s1(y3.a.d(j9) ? y3.a.h(j9) : 32767, xVar == z2.x.B ? v0Var2.d(y3.a.h(j9)) : v0Var2.f0(y3.a.h(j9)), 1);
            default:
                z2.z0 z0Var = (z2.z0) this.C;
                z2.a1 a1Var = (z2.a1) this.D;
                z2.a1 a1Var2 = z2.a1.A;
                z2.v0 v0Var3 = this.B;
                if (a1Var == a1Var2) {
                    return new s1(z0Var == z2.z0.B ? v0Var3.D(y3.a.g(j9)) : v0Var3.s(y3.a.g(j9)), y3.a.c(j9) ? y3.a.g(j9) : 32767, 2);
                }
                return new s1(y3.a.d(j9) ? y3.a.h(j9) : 32767, z0Var == z2.z0.B ? v0Var3.d(y3.a.h(j9)) : v0Var3.f0(y3.a.h(j9)), 2);
        }
    }

    @Override
    public final Object U() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B.U();
    }

    @Override
    public final int d(int i10) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B.d(i10);
    }

    @Override
    public final int f0(int i10) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B.f0(i10);
    }

    @Override
    public final int s(int i10) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B.s(i10);
    }
}
