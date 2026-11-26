package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class x0 extends o20.k {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public y0 H;
    public List I;
    public List J;
    public List K;

    public static x0 f() {
        x0 x0Var = new x0();
        x0Var.H = y0.INV;
        List list = Collections.EMPTY_LIST;
        x0Var.I = list;
        x0Var.J = list;
        x0Var.K = list;
        return x0Var;
    }

    @Override
    public final o20.b a() {
        z0 z0VarE = e();
        if (z0VarE.isInitialized()) {
            return z0VarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        z0 z0Var = null;
        try {
            try {
                z0.O.getClass();
                g(new z0(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                z0 z0Var2 = (z0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    z0Var = z0Var2;
                    if (z0Var != null) {
                        g(z0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (z0Var != null) {
                g(z0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((z0) oVar);
        return this;
    }

    public final Object clone() {
        x0 x0VarF = f();
        x0VarF.g(e());
        return x0VarF;
    }

    public final z0 e() {
        z0 z0Var = new z0(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        z0Var.D = this.E;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        z0Var.E = this.F;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        z0Var.F = this.G;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        z0Var.G = this.H;
        if ((i & 16) == 16) {
            this.I = Collections.unmodifiableList(this.I);
            this.D &= -17;
        }
        z0Var.H = this.I;
        if ((this.D & 32) == 32) {
            this.J = Collections.unmodifiableList(this.J);
            this.D &= -33;
        }
        z0Var.I = this.J;
        if ((this.D & 64) == 64) {
            this.K = Collections.unmodifiableList(this.K);
            this.D &= -65;
        }
        z0Var.K = this.K;
        z0Var.C = i2;
        return z0Var;
    }

    public final void g(z0 z0Var) {
        if (z0Var == z0.N) {
            return;
        }
        int i = z0Var.C;
        if ((i & 1) == 1) {
            int i2 = z0Var.D;
            this.D = 1 | this.D;
            this.E = i2;
        }
        if ((i & 2) == 2) {
            int i3 = z0Var.E;
            this.D = 2 | this.D;
            this.F = i3;
        }
        if ((i & 4) == 4) {
            boolean z = z0Var.F;
            this.D = 4 | this.D;
            this.G = z;
        }
        if ((i & 8) == 8) {
            y0 y0Var = z0Var.G;
            y0Var.getClass();
            this.D = 8 | this.D;
            this.H = y0Var;
        }
        if (!z0Var.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = z0Var.H;
                this.D &= -17;
            } else {
                if ((this.D & 16) != 16) {
                    this.I = new ArrayList(this.I);
                    this.D |= 16;
                }
                this.I.addAll(z0Var.H);
            }
        }
        if (!z0Var.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = z0Var.I;
                this.D &= -33;
            } else {
                if ((this.D & 32) != 32) {
                    this.J = new ArrayList(this.J);
                    this.D |= 32;
                }
                this.J.addAll(z0Var.I);
            }
        }
        if (!z0Var.K.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = z0Var.K;
                this.D &= -65;
            } else {
                if ((this.D & 64) != 64) {
                    this.K = new ArrayList(this.K);
                    this.D |= 64;
                }
                this.K.addAll(z0Var.K);
            }
        }
        d(z0Var);
        this.A = this.A.b(z0Var.B);
    }
}
