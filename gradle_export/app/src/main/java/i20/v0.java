package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class v0 extends o20.k {
    public int D;
    public int E;
    public int F;
    public List G;
    public u0 H;
    public int I;
    public u0 J;
    public int K;
    public List L;
    public List M;
    public List N;

    public static v0 f() {
        v0 v0Var = new v0();
        v0Var.E = 6;
        List list = Collections.EMPTY_LIST;
        v0Var.G = list;
        u0 u0Var = u0.U;
        v0Var.H = u0Var;
        v0Var.J = u0Var;
        v0Var.L = list;
        v0Var.M = list;
        v0Var.N = list;
        return v0Var;
    }

    @Override
    public final o20.b a() {
        w0 w0VarE = e();
        if (w0VarE.isInitialized()) {
            return w0VarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        w0 w0Var = null;
        try {
            try {
                w0.Q.getClass();
                g(new w0(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                w0 w0Var2 = (w0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    w0Var = w0Var2;
                    if (w0Var != null) {
                        g(w0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (w0Var != null) {
                g(w0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((w0) oVar);
        return this;
    }

    public final Object clone() {
        v0 v0VarF = f();
        v0VarF.g(e());
        return v0VarF;
    }

    public final w0 e() {
        w0 w0Var = new w0(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        w0Var.D = this.E;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        w0Var.E = this.F;
        if ((i & 4) == 4) {
            this.G = Collections.unmodifiableList(this.G);
            this.D &= -5;
        }
        w0Var.F = this.G;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        w0Var.G = this.H;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        w0Var.H = this.I;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        w0Var.I = this.J;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        w0Var.J = this.K;
        if ((this.D & 128) == 128) {
            this.L = Collections.unmodifiableList(this.L);
            this.D &= -129;
        }
        w0Var.K = this.L;
        if ((this.D & 256) == 256) {
            this.M = Collections.unmodifiableList(this.M);
            this.D &= -257;
        }
        w0Var.L = this.M;
        if ((this.D & 512) == 512) {
            this.N = Collections.unmodifiableList(this.N);
            this.D &= -513;
        }
        w0Var.M = this.N;
        w0Var.C = i2;
        return w0Var;
    }

    public final void g(w0 w0Var) {
        u0 u0Var;
        u0 u0Var2;
        if (w0Var == w0.P) {
            return;
        }
        int i = w0Var.C;
        if ((i & 1) == 1) {
            int i2 = w0Var.D;
            this.D = 1 | this.D;
            this.E = i2;
        }
        if ((i & 2) == 2) {
            int i3 = w0Var.E;
            this.D = 2 | this.D;
            this.F = i3;
        }
        if (!w0Var.F.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = w0Var.F;
                this.D &= -5;
            } else {
                if ((this.D & 4) != 4) {
                    this.G = new ArrayList(this.G);
                    this.D |= 4;
                }
                this.G.addAll(w0Var.F);
            }
        }
        if ((w0Var.C & 4) == 4) {
            u0 u0Var3 = w0Var.G;
            if ((this.D & 8) != 8 || (u0Var2 = this.H) == u0.U) {
                this.H = u0Var3;
            } else {
                t0 t0VarP = u0.p(u0Var2);
                t0VarP.g(u0Var3);
                this.H = t0VarP.e();
            }
            this.D |= 8;
        }
        int i4 = w0Var.C;
        if ((i4 & 8) == 8) {
            int i5 = w0Var.H;
            this.D |= 16;
            this.I = i5;
        }
        if ((i4 & 16) == 16) {
            u0 u0Var4 = w0Var.I;
            if ((this.D & 32) != 32 || (u0Var = this.J) == u0.U) {
                this.J = u0Var4;
            } else {
                t0 t0VarP2 = u0.p(u0Var);
                t0VarP2.g(u0Var4);
                this.J = t0VarP2.e();
            }
            this.D |= 32;
        }
        if ((w0Var.C & 32) == 32) {
            int i6 = w0Var.J;
            this.D |= 64;
            this.K = i6;
        }
        if (!w0Var.K.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = w0Var.K;
                this.D &= -129;
            } else {
                if ((this.D & 128) != 128) {
                    this.L = new ArrayList(this.L);
                    this.D |= 128;
                }
                this.L.addAll(w0Var.K);
            }
        }
        if (!w0Var.L.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = w0Var.L;
                this.D &= -257;
            } else {
                if ((this.D & 256) != 256) {
                    this.M = new ArrayList(this.M);
                    this.D |= 256;
                }
                this.M.addAll(w0Var.L);
            }
        }
        if (!w0Var.M.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = w0Var.M;
                this.D &= -513;
            } else {
                if ((this.D & 512) != 512) {
                    this.N = new ArrayList(this.N);
                    this.D |= 512;
                }
                this.N.addAll(w0Var.M);
            }
        }
        d(w0Var);
        this.A = this.A.b(w0Var.B);
    }
}
