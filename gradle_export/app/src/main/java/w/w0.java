package w;

public final class w0 extends h0.y0 {
    public x.n1 P;
    public x.j1 Q;
    public x.j1 R;
    public x.j1 S;
    public x0 T;
    public y0 U;
    public u00.a V;
    public n0 W;
    public long X;
    public b2.d Y;
    public final v0 Z;

    public final v0 f15818a0;

    public w0(x.n1 n1Var, x.j1 j1Var, x.j1 j1Var2, x.j1 j1Var3, x0 x0Var, y0 y0Var, u00.a aVar, n0 n0Var) {
        super(1);
        this.P = n1Var;
        this.Q = j1Var;
        this.R = j1Var2;
        this.S = j1Var3;
        this.T = x0Var;
        this.U = y0Var;
        this.V = aVar;
        this.W = n0Var;
        this.X = f0.f15757a;
        y3.b.b(0, 0, 0, 0, 15);
        this.Z = new v0(this, 0);
        this.f15818a0 = new v0(this, 1);
    }

    public final b2.d D1() {
        b2.d dVar;
        b2.d dVar2;
        if (this.P.f().b(l0.A, l0.B)) {
            i0 i0Var = this.T.f15820a.f15767c;
            if (i0Var != null && (dVar2 = i0Var.f15773a) != null) {
                return dVar2;
            }
            i0 i0Var2 = this.U.f15824a.f15767c;
            if (i0Var2 != null) {
                return i0Var2.f15773a;
            }
            return null;
        }
        i0 i0Var3 = this.U.f15824a.f15767c;
        if (i0Var3 != null && (dVar = i0Var3.f15773a) != null) {
            return dVar;
        }
        i0 i0Var4 = this.T.f15820a.f15767c;
        if (i0Var4 != null) {
            return i0Var4.f15773a;
        }
        return null;
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        i2.w0 w0Var;
        x.i1 i1VarA;
        long j10;
        if (this.P.f16323a.J0() == this.P.f16326d.getValue()) {
            this.Y = null;
        } else if (this.Y == null) {
            b2.d dVarD1 = D1();
            if (dVarD1 == null) {
                dVarD1 = b2.b.A;
            }
            this.Y = dVarD1;
        }
        boolean zW0 = y0Var.w0();
        h00.y yVar = h00.y.A;
        if (zW0) {
            z2.l1 l1VarO = v0Var.O(j9);
            long j11 = (((long) l1VarO.A) << 32) | (((long) l1VarO.B) & 4294967295L);
            this.X = j11;
            return y0Var.o0((int) (j11 >> 32), (int) (j11 & 4294967295L), yVar, new b0(l1VarO, 1));
        }
        if (!((Boolean) this.V.invoke()).booleanValue()) {
            z2.l1 l1VarO2 = v0Var.O(j9);
            return y0Var.o0(l1VarO2.A, l1VarO2.B, yVar, new b0(l1VarO2, 2));
        }
        n0 n0Var = this.W;
        x.j1 j1Var = n0Var.f15792a;
        x.j1 j1Var2 = n0Var.f15793b;
        x.n1 n1Var = n0Var.f15794c;
        x0 x0Var = n0Var.f15795d;
        g2 g2Var = x0Var.f15820a;
        y0 y0Var2 = n0Var.f15796e;
        x.j1 j1Var3 = n0Var.f15797f;
        x.i1 i1VarA2 = j1Var != null ? j1Var.a(new o0(x0Var, y0Var2, 0), new o0(x0Var, y0Var2, 1)) : null;
        x.i1 i1VarA3 = j1Var2 != null ? j1Var2.a(new o0(x0Var, y0Var2, 2), new o0(x0Var, y0Var2, 3)) : null;
        if (n1Var.f16323a.J0() == l0.A) {
            d1 d1Var = g2Var.f15768d;
            if (d1Var != null) {
                w0Var = new i2.w0(d1Var.f15749b);
            } else {
                d1 d1Var2 = y0Var2.f15824a.f15768d;
                if (d1Var2 != null) {
                    w0Var = new i2.w0(d1Var2.f15749b);
                } else {
                    w0Var = null;
                }
            }
        } else {
            d1 d1Var3 = y0Var2.f15824a.f15768d;
            if (d1Var3 != null) {
                w0Var = new i2.w0(d1Var3.f15749b);
            } else {
                d1 d1Var4 = g2Var.f15768d;
                if (d1Var4 != null) {
                    w0Var = new i2.w0(d1Var4.f15749b);
                } else {
                    w0Var = null;
                }
            }
        }
        b3.n0 n0Var2 = new b3.n0(i1VarA2, i1VarA3, j1Var3 != null ? j1Var3.a(f.K, new b3.n0(w0Var, x0Var, y0Var2, 8)) : null, 7);
        z2.l1 l1VarO3 = v0Var.O(j9);
        long j12 = (((long) l1VarO3.A) << 32) | (((long) l1VarO3.B) & 4294967295L);
        long j13 = !y3.l.b(this.X, f0.f15757a) ? this.X : j12;
        x.j1 j1Var4 = this.Q;
        if (j1Var4 != null) {
            i1VarA = j1Var4.a(this.Z, new u0(this, j13, 0));
        } else {
            i1VarA = null;
        }
        if (i1VarA != null) {
            j12 = ((y3.l) i1VarA.getValue()).f16596a;
        }
        long jD = y3.b.d(j9, j12);
        x.j1 j1Var5 = this.R;
        long jA = 0;
        long j14 = j1Var5 != null ? ((y3.j) j1Var5.a(f.P, new u0(this, j13, 1)).getValue()).f16590a : 0L;
        x.j1 j1Var6 = this.S;
        if (j1Var6 != null) {
            j10 = ((y3.j) j1Var6.a(this.f15818a0, new u0(this, j13, 2)).getValue()).f16590a;
        } else {
            j10 = 0;
        }
        b2.d dVar = this.Y;
        if (dVar != null) {
            jA = dVar.a(j13, jD, y3.m.A);
        }
        return y0Var.o0((int) (jD >> 32), (int) (jD & 4294967295L), yVar, new t0(l1VarO3, y3.j.d(jA, j10), j14, n0Var2));
    }

    @Override
    public final void t1() {
        this.X = f0.f15757a;
    }
}
