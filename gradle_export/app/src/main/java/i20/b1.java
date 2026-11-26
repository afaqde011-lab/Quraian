package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class b1 extends o20.k {
    public int D;
    public int E;
    public int F;
    public u0 G;
    public int H;
    public u0 I;
    public int J;
    public List K;
    public e L;

    public static b1 f() {
        b1 b1Var = new b1();
        u0 u0Var = u0.U;
        b1Var.G = u0Var;
        b1Var.I = u0Var;
        b1Var.K = Collections.EMPTY_LIST;
        b1Var.L = e.P;
        return b1Var;
    }

    @Override
    public final o20.b a() {
        c1 c1VarE = e();
        if (c1VarE.isInitialized()) {
            return c1VarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        c1 c1Var = null;
        try {
            try {
                c1.O.getClass();
                g(new c1(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                c1 c1Var2 = (c1) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c1Var = c1Var2;
                    if (c1Var != null) {
                        g(c1Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c1Var != null) {
                g(c1Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((c1) oVar);
        return this;
    }

    public final Object clone() {
        b1 b1VarF = f();
        b1VarF.g(e());
        return b1VarF;
    }

    public final c1 e() {
        c1 c1Var = new c1(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c1Var.D = this.E;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c1Var.E = this.F;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c1Var.F = this.G;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c1Var.G = this.H;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c1Var.H = this.I;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        c1Var.I = this.J;
        if ((i & 64) == 64) {
            this.K = Collections.unmodifiableList(this.K);
            this.D &= -65;
        }
        c1Var.J = this.K;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c1Var.K = this.L;
        c1Var.C = i2;
        return c1Var;
    }

    public final void g(c1 c1Var) {
        e eVar;
        u0 u0Var;
        u0 u0Var2;
        if (c1Var == c1.N) {
            return;
        }
        int i = c1Var.C;
        if ((i & 1) == 1) {
            int i2 = c1Var.D;
            this.D = 1 | this.D;
            this.E = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c1Var.E;
            this.D = 2 | this.D;
            this.F = i3;
        }
        if ((i & 4) == 4) {
            u0 u0Var3 = c1Var.F;
            if ((this.D & 4) != 4 || (u0Var2 = this.G) == u0.U) {
                this.G = u0Var3;
            } else {
                t0 t0VarP = u0.p(u0Var2);
                t0VarP.g(u0Var3);
                this.G = t0VarP.e();
            }
            this.D |= 4;
        }
        int i4 = c1Var.C;
        if ((i4 & 8) == 8) {
            int i5 = c1Var.G;
            this.D = 8 | this.D;
            this.H = i5;
        }
        if ((i4 & 16) == 16) {
            u0 u0Var4 = c1Var.H;
            if ((this.D & 16) != 16 || (u0Var = this.I) == u0.U) {
                this.I = u0Var4;
            } else {
                t0 t0VarP2 = u0.p(u0Var);
                t0VarP2.g(u0Var4);
                this.I = t0VarP2.e();
            }
            this.D |= 16;
        }
        if ((c1Var.C & 32) == 32) {
            int i6 = c1Var.I;
            this.D = 32 | this.D;
            this.J = i6;
        }
        if (!c1Var.J.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = c1Var.J;
                this.D &= -65;
            } else {
                if ((this.D & 64) != 64) {
                    this.K = new ArrayList(this.K);
                    this.D |= 64;
                }
                this.K.addAll(c1Var.J);
            }
        }
        if ((c1Var.C & 64) == 64) {
            e eVar2 = c1Var.K;
            if ((this.D & 128) != 128 || (eVar = this.L) == e.P) {
                this.L = eVar2;
            } else {
                c cVarH = e.h(eVar);
                cVarH.f(eVar2);
                this.L = cVarH.d();
            }
            this.D |= 128;
        }
        d(c1Var);
        this.A = this.A.b(c1Var.B);
    }
}
