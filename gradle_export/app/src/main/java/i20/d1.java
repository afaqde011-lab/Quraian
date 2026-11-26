package i20;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class d1 extends o20.j implements o20.u {
    public int B;
    public int C;
    public int D;
    public e1 E;
    public int F;
    public int G;
    public f1 H;

    public static d1 e() {
        d1 d1Var = new d1();
        d1Var.E = e1.ERROR;
        d1Var.H = f1.LANGUAGE_VERSION;
        return d1Var;
    }

    @Override
    public final o20.b a() {
        g1 g1VarD = d();
        g1VarD.isInitialized();
        return g1VarD;
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        g1 g1Var = null;
        try {
            try {
                g1.L.getClass();
                f(new g1(fVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                g1 g1Var2 = (g1) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    g1Var = g1Var2;
                    if (g1Var != null) {
                        f(g1Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (g1Var != null) {
                f(g1Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        f((g1) oVar);
        return this;
    }

    public final Object clone() {
        d1 d1VarE = e();
        d1VarE.f(d());
        return d1VarE;
    }

    public final g1 d() {
        g1 g1Var = new g1(this);
        int i = this.B;
        int i2 = (i & 1) != 1 ? 0 : 1;
        g1Var.C = this.C;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        g1Var.D = this.D;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        g1Var.E = this.E;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        g1Var.F = this.F;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        g1Var.G = this.G;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        g1Var.H = this.H;
        g1Var.B = i2;
        return g1Var;
    }

    public final void f(g1 g1Var) {
        if (g1Var == g1.K) {
            return;
        }
        int i = g1Var.B;
        if ((i & 1) == 1) {
            int i2 = g1Var.C;
            this.B = 1 | this.B;
            this.C = i2;
        }
        if ((i & 2) == 2) {
            int i3 = g1Var.D;
            this.B = 2 | this.B;
            this.D = i3;
        }
        if ((i & 4) == 4) {
            e1 e1Var = g1Var.E;
            e1Var.getClass();
            this.B = 4 | this.B;
            this.E = e1Var;
        }
        int i4 = g1Var.B;
        if ((i4 & 8) == 8) {
            int i5 = g1Var.F;
            this.B = 8 | this.B;
            this.F = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = g1Var.G;
            this.B = 16 | this.B;
            this.G = i6;
        }
        if ((i4 & 32) == 32) {
            f1 f1Var = g1Var.H;
            f1Var.getClass();
            this.B = 32 | this.B;
            this.H = f1Var;
        }
        this.A = this.A.b(g1Var.A);
    }
}
