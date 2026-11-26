package i20;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class k0 extends o20.j implements o20.u {
    public int B;
    public int C;
    public int D;
    public l0 E;

    public static k0 e() {
        k0 k0Var = new k0();
        k0Var.C = -1;
        k0Var.E = l0.PACKAGE;
        return k0Var;
    }

    @Override
    public final o20.b a() {
        m0 m0VarD = d();
        if (m0VarD.isInitialized()) {
            return m0VarD;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        m0 m0Var = null;
        try {
            try {
                m0.I.getClass();
                f(new m0(fVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                m0 m0Var2 = (m0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    m0Var = m0Var2;
                    if (m0Var != null) {
                        f(m0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (m0Var != null) {
                f(m0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        f((m0) oVar);
        return this;
    }

    public final Object clone() {
        k0 k0VarE = e();
        k0VarE.f(d());
        return k0VarE;
    }

    public final m0 d() {
        m0 m0Var = new m0(this);
        int i = this.B;
        int i2 = (i & 1) != 1 ? 0 : 1;
        m0Var.C = this.C;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        m0Var.D = this.D;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        m0Var.E = this.E;
        m0Var.B = i2;
        return m0Var;
    }

    public final void f(m0 m0Var) {
        if (m0Var == m0.H) {
            return;
        }
        int i = m0Var.B;
        if ((i & 1) == 1) {
            int i2 = m0Var.C;
            this.B = 1 | this.B;
            this.C = i2;
        }
        if ((i & 2) == 2) {
            int i3 = m0Var.D;
            this.B = 2 | this.B;
            this.D = i3;
        }
        if ((i & 4) == 4) {
            l0 l0Var = m0Var.E;
            l0Var.getClass();
            this.B = 4 | this.B;
            this.E = l0Var;
        }
        this.A = this.A.b(m0Var.A);
    }
}
