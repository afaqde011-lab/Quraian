package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class a0 extends o20.k {
    public int D;
    public int E;
    public int F;
    public int G;
    public u0 H;
    public int I;
    public List J;
    public u0 K;
    public int L;
    public List M;
    public List N;
    public List O;
    public List P;
    public a1 Q;
    public List R;
    public p S;
    public List T;
    public List U;
    public List V;

    public static a0 f() {
        a0 a0Var = new a0();
        a0Var.E = 6;
        a0Var.F = 6;
        u0 u0Var = u0.U;
        a0Var.H = u0Var;
        List list = Collections.EMPTY_LIST;
        a0Var.J = list;
        a0Var.K = u0Var;
        a0Var.M = list;
        a0Var.N = list;
        a0Var.O = list;
        a0Var.P = list;
        a0Var.Q = a1.G;
        a0Var.R = list;
        a0Var.S = p.E;
        a0Var.T = list;
        a0Var.U = list;
        a0Var.V = list;
        return a0Var;
    }

    @Override
    public final o20.b a() {
        b0 b0VarE = e();
        if (b0VarE.isInitialized()) {
            return b0VarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        b0 b0Var = null;
        try {
            try {
                b0.Z.getClass();
                g(new b0(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                b0 b0Var2 = (b0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    b0Var = b0Var2;
                    if (b0Var != null) {
                        g(b0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (b0Var != null) {
                g(b0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((b0) oVar);
        return this;
    }

    public final Object clone() {
        a0 a0VarF = f();
        a0VarF.g(e());
        return a0VarF;
    }

    public final b0 e() {
        b0 b0Var = new b0(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        b0Var.D = this.E;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        b0Var.E = this.F;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        b0Var.F = this.G;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        b0Var.G = this.H;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        b0Var.H = this.I;
        if ((i & 32) == 32) {
            this.J = Collections.unmodifiableList(this.J);
            this.D &= -33;
        }
        b0Var.I = this.J;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        b0Var.J = this.K;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        b0Var.K = this.L;
        if ((this.D & 256) == 256) {
            this.M = Collections.unmodifiableList(this.M);
            this.D &= -257;
        }
        b0Var.L = this.M;
        if ((this.D & 512) == 512) {
            this.N = Collections.unmodifiableList(this.N);
            this.D &= -513;
        }
        b0Var.M = this.N;
        if ((this.D & 1024) == 1024) {
            this.O = Collections.unmodifiableList(this.O);
            this.D &= -1025;
        }
        b0Var.O = this.O;
        if ((this.D & 2048) == 2048) {
            this.P = Collections.unmodifiableList(this.P);
            this.D &= -2049;
        }
        b0Var.P = this.P;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        b0Var.Q = this.Q;
        if ((this.D & 8192) == 8192) {
            this.R = Collections.unmodifiableList(this.R);
            this.D &= -8193;
        }
        b0Var.R = this.R;
        if ((i & 16384) == 16384) {
            i2 |= 256;
        }
        b0Var.S = this.S;
        if ((this.D & 32768) == 32768) {
            this.T = Collections.unmodifiableList(this.T);
            this.D &= -32769;
        }
        b0Var.T = this.T;
        if ((this.D & 65536) == 65536) {
            this.U = Collections.unmodifiableList(this.U);
            this.D &= -65537;
        }
        b0Var.U = this.U;
        if ((this.D & 131072) == 131072) {
            this.V = Collections.unmodifiableList(this.V);
            this.D &= -131073;
        }
        b0Var.V = this.V;
        b0Var.C = i2;
        return b0Var;
    }

    public final void g(b0 b0Var) {
        p pVar;
        a1 a1Var;
        u0 u0Var;
        u0 u0Var2;
        if (b0Var == b0.Y) {
            return;
        }
        int i = b0Var.C;
        if ((i & 1) == 1) {
            int i2 = b0Var.D;
            this.D = 1 | this.D;
            this.E = i2;
        }
        if ((i & 2) == 2) {
            int i3 = b0Var.E;
            this.D = 2 | this.D;
            this.F = i3;
        }
        if ((i & 4) == 4) {
            int i4 = b0Var.F;
            this.D = 4 | this.D;
            this.G = i4;
        }
        if ((i & 8) == 8) {
            u0 u0Var3 = b0Var.G;
            if ((this.D & 8) != 8 || (u0Var2 = this.H) == u0.U) {
                this.H = u0Var3;
            } else {
                t0 t0VarP = u0.p(u0Var2);
                t0VarP.g(u0Var3);
                this.H = t0VarP.e();
            }
            this.D |= 8;
        }
        if ((b0Var.C & 16) == 16) {
            int i5 = b0Var.H;
            this.D = 16 | this.D;
            this.I = i5;
        }
        if (!b0Var.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = b0Var.I;
                this.D &= -33;
            } else {
                if ((this.D & 32) != 32) {
                    this.J = new ArrayList(this.J);
                    this.D |= 32;
                }
                this.J.addAll(b0Var.I);
            }
        }
        if ((b0Var.C & 32) == 32) {
            u0 u0Var4 = b0Var.J;
            if ((this.D & 64) != 64 || (u0Var = this.K) == u0.U) {
                this.K = u0Var4;
            } else {
                t0 t0VarP2 = u0.p(u0Var);
                t0VarP2.g(u0Var4);
                this.K = t0VarP2.e();
            }
            this.D |= 64;
        }
        if ((b0Var.C & 64) == 64) {
            int i6 = b0Var.K;
            this.D |= 128;
            this.L = i6;
        }
        if (!b0Var.L.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = b0Var.L;
                this.D &= -257;
            } else {
                if ((this.D & 256) != 256) {
                    this.M = new ArrayList(this.M);
                    this.D |= 256;
                }
                this.M.addAll(b0Var.L);
            }
        }
        if (!b0Var.M.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = b0Var.M;
                this.D &= -513;
            } else {
                if ((this.D & 512) != 512) {
                    this.N = new ArrayList(this.N);
                    this.D |= 512;
                }
                this.N.addAll(b0Var.M);
            }
        }
        if (!b0Var.O.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = b0Var.O;
                this.D &= -1025;
            } else {
                if ((this.D & 1024) != 1024) {
                    this.O = new ArrayList(this.O);
                    this.D |= 1024;
                }
                this.O.addAll(b0Var.O);
            }
        }
        if (!b0Var.P.isEmpty()) {
            if (this.P.isEmpty()) {
                this.P = b0Var.P;
                this.D &= -2049;
            } else {
                if ((this.D & 2048) != 2048) {
                    this.P = new ArrayList(this.P);
                    this.D |= 2048;
                }
                this.P.addAll(b0Var.P);
            }
        }
        if ((b0Var.C & 128) == 128) {
            a1 a1Var2 = b0Var.Q;
            if ((this.D & 4096) != 4096 || (a1Var = this.Q) == a1.G) {
                this.Q = a1Var2;
            } else {
                g gVarG = a1.g(a1Var);
                gVarG.h(a1Var2);
                this.Q = gVarG.e();
            }
            this.D |= 4096;
        }
        if (!b0Var.R.isEmpty()) {
            if (this.R.isEmpty()) {
                this.R = b0Var.R;
                this.D &= -8193;
            } else {
                if ((this.D & 8192) != 8192) {
                    this.R = new ArrayList(this.R);
                    this.D |= 8192;
                }
                this.R.addAll(b0Var.R);
            }
        }
        if ((b0Var.C & 256) == 256) {
            p pVar2 = b0Var.S;
            if ((this.D & 16384) != 16384 || (pVar = this.S) == p.E) {
                this.S = pVar2;
            } else {
                o oVar = new o(0);
                oVar.D = Collections.EMPTY_LIST;
                oVar.h(pVar);
                oVar.h(pVar2);
                this.S = oVar.d();
            }
            this.D |= 16384;
        }
        if (!b0Var.T.isEmpty()) {
            if (this.T.isEmpty()) {
                this.T = b0Var.T;
                this.D &= -32769;
            } else {
                if ((this.D & 32768) != 32768) {
                    this.T = new ArrayList(this.T);
                    this.D |= 32768;
                }
                this.T.addAll(b0Var.T);
            }
        }
        if (!b0Var.U.isEmpty()) {
            if (this.U.isEmpty()) {
                this.U = b0Var.U;
                this.D &= -65537;
            } else {
                if ((this.D & 65536) != 65536) {
                    this.U = new ArrayList(this.U);
                    this.D |= 65536;
                }
                this.U.addAll(b0Var.U);
            }
        }
        if (!b0Var.V.isEmpty()) {
            if (this.V.isEmpty()) {
                this.V = b0Var.V;
                this.D &= -131073;
            } else {
                if ((this.D & 131072) != 131072) {
                    this.V = new ArrayList(this.V);
                    this.D |= 131072;
                }
                this.V.addAll(b0Var.V);
            }
        }
        d(b0Var);
        this.A = this.A.b(b0Var.B);
    }
}
