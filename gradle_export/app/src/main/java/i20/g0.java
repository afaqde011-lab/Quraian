package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class g0 extends o20.k {
    public int D;
    public p0 E;
    public n0 F;
    public f0 G;
    public List H;

    public static g0 f() {
        g0 g0Var = new g0();
        g0Var.E = p0.E;
        g0Var.F = n0.E;
        g0Var.G = f0.K;
        g0Var.H = Collections.EMPTY_LIST;
        return g0Var;
    }

    @Override
    public final o20.b a() {
        h0 h0VarE = e();
        if (h0VarE.isInitialized()) {
            return h0VarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        h0 h0Var = null;
        try {
            try {
                h0.K.getClass();
                g(new h0(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                h0 h0Var2 = (h0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    h0Var = h0Var2;
                    if (h0Var != null) {
                        g(h0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (h0Var != null) {
                g(h0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((h0) oVar);
        return this;
    }

    public final Object clone() {
        g0 g0VarF = f();
        g0VarF.g(e());
        return g0VarF;
    }

    public final h0 e() {
        h0 h0Var = new h0(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        h0Var.D = this.E;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        h0Var.E = this.F;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        h0Var.F = this.G;
        if ((i & 8) == 8) {
            this.H = Collections.unmodifiableList(this.H);
            this.D &= -9;
        }
        h0Var.G = this.H;
        h0Var.C = i2;
        return h0Var;
    }

    public final void g(h0 h0Var) {
        f0 f0Var;
        n0 n0Var;
        p0 p0Var;
        if (h0Var == h0.J) {
            return;
        }
        if ((h0Var.C & 1) == 1) {
            p0 p0Var2 = h0Var.D;
            if ((this.D & 1) != 1 || (p0Var = this.E) == p0.E) {
                this.E = p0Var2;
            } else {
                o oVar = new o(3);
                oVar.D = o20.r.B;
                oVar.k(p0Var);
                oVar.k(p0Var2);
                this.E = oVar.f();
            }
            this.D |= 1;
        }
        if ((h0Var.C & 2) == 2) {
            n0 n0Var2 = h0Var.E;
            if ((this.D & 2) != 2 || (n0Var = this.F) == n0.E) {
                this.F = n0Var2;
            } else {
                o oVar2 = new o(1);
                oVar2.D = Collections.EMPTY_LIST;
                oVar2.j(n0Var);
                oVar2.j(n0Var2);
                this.F = oVar2.e();
            }
            this.D |= 2;
        }
        if ((h0Var.C & 4) == 4) {
            f0 f0Var2 = h0Var.F;
            if ((this.D & 4) != 4 || (f0Var = this.G) == f0.K) {
                this.G = f0Var2;
            } else {
                e0 e0VarF = e0.f();
                e0VarF.g(f0Var);
                e0VarF.g(f0Var2);
                this.G = e0VarF.e();
            }
            this.D |= 4;
        }
        if (!h0Var.G.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = h0Var.G;
                this.D &= -9;
            } else {
                if ((this.D & 8) != 8) {
                    this.H = new ArrayList(this.H);
                    this.D |= 8;
                }
                this.H.addAll(h0Var.G);
            }
        }
        d(h0Var);
        this.A = this.A.b(h0Var.B);
    }
}
