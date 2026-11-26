package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class e0 extends o20.k {
    public int D;
    public List E;
    public List F;
    public List G;
    public a1 H;
    public h1 I;

    public static e0 f() {
        e0 e0Var = new e0();
        List list = Collections.EMPTY_LIST;
        e0Var.E = list;
        e0Var.F = list;
        e0Var.G = list;
        e0Var.H = a1.G;
        e0Var.I = h1.E;
        return e0Var;
    }

    @Override
    public final o20.b a() {
        f0 f0VarE = e();
        if (f0VarE.isInitialized()) {
            return f0VarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        f0 f0Var = null;
        try {
            try {
                f0.L.getClass();
                g(new f0(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                f0 f0Var2 = (f0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    f0Var = f0Var2;
                    if (f0Var != null) {
                        g(f0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (f0Var != null) {
                g(f0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((f0) oVar);
        return this;
    }

    public final Object clone() {
        e0 e0VarF = f();
        e0VarF.g(e());
        return e0VarF;
    }

    public final f0 e() {
        f0 f0Var = new f0(this);
        int i = this.D;
        if ((i & 1) == 1) {
            this.E = Collections.unmodifiableList(this.E);
            this.D &= -2;
        }
        f0Var.D = this.E;
        if ((this.D & 2) == 2) {
            this.F = Collections.unmodifiableList(this.F);
            this.D &= -3;
        }
        f0Var.E = this.F;
        if ((this.D & 4) == 4) {
            this.G = Collections.unmodifiableList(this.G);
            this.D &= -5;
        }
        f0Var.F = this.G;
        int i2 = (i & 8) != 8 ? 0 : 1;
        f0Var.G = this.H;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        f0Var.H = this.I;
        f0Var.C = i2;
        return f0Var;
    }

    public final void g(f0 f0Var) {
        h1 h1Var;
        a1 a1Var;
        if (f0Var == f0.K) {
            return;
        }
        if (!f0Var.D.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = f0Var.D;
                this.D &= -2;
            } else {
                if ((this.D & 1) != 1) {
                    this.E = new ArrayList(this.E);
                    this.D |= 1;
                }
                this.E.addAll(f0Var.D);
            }
        }
        if (!f0Var.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = f0Var.E;
                this.D &= -3;
            } else {
                if ((this.D & 2) != 2) {
                    this.F = new ArrayList(this.F);
                    this.D |= 2;
                }
                this.F.addAll(f0Var.E);
            }
        }
        if (!f0Var.F.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = f0Var.F;
                this.D &= -5;
            } else {
                if ((this.D & 4) != 4) {
                    this.G = new ArrayList(this.G);
                    this.D |= 4;
                }
                this.G.addAll(f0Var.F);
            }
        }
        if ((f0Var.C & 1) == 1) {
            a1 a1Var2 = f0Var.G;
            if ((this.D & 8) != 8 || (a1Var = this.H) == a1.G) {
                this.H = a1Var2;
            } else {
                g gVarG = a1.g(a1Var);
                gVarG.h(a1Var2);
                this.H = gVarG.e();
            }
            this.D |= 8;
        }
        if ((f0Var.C & 2) == 2) {
            h1 h1Var2 = f0Var.H;
            if ((this.D & 16) != 16 || (h1Var = this.I) == h1.E) {
                this.I = h1Var2;
            } else {
                o oVar = new o(2);
                oVar.D = Collections.EMPTY_LIST;
                oVar.m(h1Var);
                oVar.m(h1Var2);
                this.I = oVar.g();
            }
            this.D |= 16;
        }
        d(f0Var);
        this.A = this.A.b(f0Var.B);
    }
}
