package z;

import b3.j2;

public final class n1 extends b2.q implements b3.y, j2 {
    public p1 O;
    public boolean P;

    @Override
    public final int G(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        if (this.P) {
            i10 = Integer.MAX_VALUE;
        }
        return v0Var.s(i10);
    }

    @Override
    public final int T(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        if (this.P) {
            i10 = Integer.MAX_VALUE;
        }
        return v0Var.D(i10);
    }

    @Override
    public final int d0(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        if (!this.P) {
            i10 = Integer.MAX_VALUE;
        }
        return v0Var.d(i10);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        n.h(j9, this.P ? d0.q1.A : d0.q1.B);
        z2.l1 l1VarO = v0Var.O(y3.a.a(j9, 0, this.P ? y3.a.h(j9) : Integer.MAX_VALUE, 0, this.P ? Integer.MAX_VALUE : y3.a.g(j9), 5));
        int i10 = l1VarO.A;
        int iH = y3.a.h(j9);
        if (i10 > iH) {
            i10 = iH;
        }
        int i11 = l1VarO.B;
        int iG = y3.a.g(j9);
        if (i11 > iG) {
            i11 = iG;
        }
        int i12 = l1VarO.B - i11;
        int i13 = l1VarO.A - i10;
        if (!this.P) {
            i12 = i13;
        }
        this.O.f(i12);
        this.O.f16952b.i(this.P ? i11 : i10);
        this.O.f16953c.i(this.P ? l1VarO.B : l1VarO.A);
        return y0Var.o0(i10, i11, h00.y.A, new a1.q0(this, i12, l1VarO, 6));
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        j3.y.o(a0Var);
        final int i10 = 0;
        final int i11 = 1;
        j3.l lVar = new j3.l(new u00.a(this) {
            public final n1 B;

            {
                this.B = this;
            }

            public final Object invoke() {
                int iH;
                int i12 = i10;
                n1 n1Var = this.B;
                switch (i12) {
                    case 0:
                        iH = n1Var.O.f16951a.h();
                        break;
                    default:
                        iH = n1Var.O.f16955e.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        }, new u00.a(this) {
            public final n1 B;

            {
                this.B = this;
            }

            public final Object invoke() {
                int iH;
                int i12 = i11;
                n1 n1Var = this.B;
                switch (i12) {
                    case 0:
                        iH = n1Var.O.f16951a.h();
                        break;
                    default:
                        iH = n1Var.O.f16955e.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        });
        if (this.P) {
            j3.z zVar = j3.w.f7998w;
            a10.w wVar = j3.y.f8004a[13];
            a0Var.a(zVar, lVar);
        } else {
            j3.z zVar2 = j3.w.f7997v;
            a10.w wVar2 = j3.y.f8004a[12];
            a0Var.a(zVar2, lVar);
        }
    }

    @Override
    public final int z(b3.u0 u0Var, z2.v0 v0Var, int i10) {
        if (!this.P) {
            i10 = Integer.MAX_VALUE;
        }
        return v0Var.f0(i10);
    }
}
