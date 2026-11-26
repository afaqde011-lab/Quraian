package i20;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class q0 extends o20.j implements o20.u {
    public int B;
    public r0 C;
    public u0 D;
    public int E;

    public static q0 e() {
        q0 q0Var = new q0();
        q0Var.C = r0.INV;
        q0Var.D = u0.U;
        return q0Var;
    }

    @Override
    public final o20.b a() {
        s0 s0VarD = d();
        if (s0VarD.isInitialized()) {
            return s0VarD;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        s0 s0Var = null;
        try {
            try {
                s0.I.getClass();
                f(new s0(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                s0 s0Var2 = (s0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    s0Var = s0Var2;
                    if (s0Var != null) {
                        f(s0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (s0Var != null) {
                f(s0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        f((s0) oVar);
        return this;
    }

    public final Object clone() {
        q0 q0VarE = e();
        q0VarE.f(d());
        return q0VarE;
    }

    public final s0 d() {
        s0 s0Var = new s0(this);
        int i = this.B;
        int i2 = (i & 1) != 1 ? 0 : 1;
        s0Var.C = this.C;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        s0Var.D = this.D;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        s0Var.E = this.E;
        s0Var.B = i2;
        return s0Var;
    }

    public final void f(s0 s0Var) {
        u0 u0Var;
        if (s0Var == s0.H) {
            return;
        }
        if ((s0Var.B & 1) == 1) {
            r0 r0Var = s0Var.C;
            r0Var.getClass();
            this.B = 1 | this.B;
            this.C = r0Var;
        }
        if ((s0Var.B & 2) == 2) {
            u0 u0Var2 = s0Var.D;
            if ((this.B & 2) != 2 || (u0Var = this.D) == u0.U) {
                this.D = u0Var2;
            } else {
                t0 t0VarP = u0.p(u0Var);
                t0VarP.g(u0Var2);
                this.D = t0VarP.e();
            }
            this.B |= 2;
        }
        if ((s0Var.B & 4) == 4) {
            int i = s0Var.E;
            this.B = 4 | this.B;
            this.E = i;
        }
        this.A = this.A.b(s0Var.A);
    }
}
