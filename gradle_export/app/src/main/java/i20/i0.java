package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class i0 extends o20.k {
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
    public c1 P;
    public int Q;
    public int R;
    public List S;
    public List T;
    public List U;
    public List V;
    public List W;
    public List X;
    public List Y;
    public List Z;
    public p a0;
    public p b0;

    public static i0 f() {
        i0 i0Var = new i0();
        i0Var.E = 518;
        i0Var.F = 2054;
        u0 u0Var = u0.U;
        i0Var.H = u0Var;
        List list = Collections.EMPTY_LIST;
        i0Var.J = list;
        i0Var.K = u0Var;
        i0Var.M = list;
        i0Var.N = list;
        i0Var.O = list;
        i0Var.P = c1.N;
        i0Var.S = list;
        i0Var.T = list;
        i0Var.U = list;
        i0Var.V = list;
        i0Var.W = list;
        i0Var.X = list;
        i0Var.Y = list;
        i0Var.Z = list;
        p pVar = p.E;
        i0Var.a0 = pVar;
        i0Var.b0 = pVar;
        return i0Var;
    }

    @Override
    public final o20.b a() {
        j0 j0VarE = e();
        if (j0VarE.isInitialized()) {
            return j0VarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        j0 j0Var = null;
        try {
            try {
                j0.f0.getClass();
                g(new j0(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                j0 j0Var2 = (j0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    j0Var = j0Var2;
                    if (j0Var != null) {
                        g(j0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (j0Var != null) {
                g(j0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((j0) oVar);
        return this;
    }

    public final Object clone() {
        i0 i0VarF = f();
        i0VarF.g(e());
        return i0VarF;
    }

    public final j0 e() {
        j0 j0Var = new j0(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        j0Var.D = this.E;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        j0Var.E = this.F;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        j0Var.F = this.G;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        j0Var.G = this.H;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        j0Var.H = this.I;
        if ((i & 32) == 32) {
            this.J = Collections.unmodifiableList(this.J);
            this.D &= -33;
        }
        j0Var.I = this.J;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        j0Var.J = this.K;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        j0Var.K = this.L;
        if ((this.D & 256) == 256) {
            this.M = Collections.unmodifiableList(this.M);
            this.D &= -257;
        }
        j0Var.L = this.M;
        if ((this.D & 512) == 512) {
            this.N = Collections.unmodifiableList(this.N);
            this.D &= -513;
        }
        j0Var.M = this.N;
        if ((this.D & 1024) == 1024) {
            this.O = Collections.unmodifiableList(this.O);
            this.D &= -1025;
        }
        j0Var.O = this.O;
        if ((i & 2048) == 2048) {
            i2 |= 128;
        }
        j0Var.P = this.P;
        if ((i & 4096) == 4096) {
            i2 |= 256;
        }
        j0Var.Q = this.Q;
        if ((i & 8192) == 8192) {
            i2 |= 512;
        }
        j0Var.R = this.R;
        if ((this.D & 16384) == 16384) {
            this.S = Collections.unmodifiableList(this.S);
            this.D &= -16385;
        }
        j0Var.S = this.S;
        if ((this.D & 32768) == 32768) {
            this.T = Collections.unmodifiableList(this.T);
            this.D &= -32769;
        }
        j0Var.T = this.T;
        if ((this.D & 65536) == 65536) {
            this.U = Collections.unmodifiableList(this.U);
            this.D &= -65537;
        }
        j0Var.U = this.U;
        if ((this.D & 131072) == 131072) {
            this.V = Collections.unmodifiableList(this.V);
            this.D &= -131073;
        }
        j0Var.V = this.V;
        if ((this.D & 262144) == 262144) {
            this.W = Collections.unmodifiableList(this.W);
            this.D &= -262145;
        }
        j0Var.W = this.W;
        if ((this.D & 524288) == 524288) {
            this.X = Collections.unmodifiableList(this.X);
            this.D &= -524289;
        }
        j0Var.X = this.X;
        if ((this.D & 1048576) == 1048576) {
            this.Y = Collections.unmodifiableList(this.Y);
            this.D &= -1048577;
        }
        j0Var.Y = this.Y;
        if ((this.D & 2097152) == 2097152) {
            this.Z = Collections.unmodifiableList(this.Z);
            this.D &= -2097153;
        }
        j0Var.Z = this.Z;
        if ((i & 4194304) == 4194304) {
            i2 |= 1024;
        }
        j0Var.a0 = this.a0;
        if ((i & 8388608) == 8388608) {
            i2 |= 2048;
        }
        j0Var.b0 = this.b0;
        j0Var.C = i2;
        return j0Var;
    }

    public final void g(j0 j0Var) {
        p pVar;
        p pVar2;
        c1 c1Var;
        u0 u0Var;
        u0 u0Var2;
        if (j0Var == j0.e0) {
            return;
        }
        int i = j0Var.C;
        if ((i & 1) == 1) {
            int i2 = j0Var.D;
            this.D = 1 | this.D;
            this.E = i2;
        }
        if ((i & 2) == 2) {
            int i3 = j0Var.E;
            this.D = 2 | this.D;
            this.F = i3;
        }
        if ((i & 4) == 4) {
            int i4 = j0Var.F;
            this.D = 4 | this.D;
            this.G = i4;
        }
        if ((i & 8) == 8) {
            u0 u0Var3 = j0Var.G;
            if ((this.D & 8) != 8 || (u0Var2 = this.H) == u0.U) {
                this.H = u0Var3;
            } else {
                t0 t0VarP = u0.p(u0Var2);
                t0VarP.g(u0Var3);
                this.H = t0VarP.e();
            }
            this.D |= 8;
        }
        if ((j0Var.C & 16) == 16) {
            int i5 = j0Var.H;
            this.D = 16 | this.D;
            this.I = i5;
        }
        if (!j0Var.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = j0Var.I;
                this.D &= -33;
            } else {
                if ((this.D & 32) != 32) {
                    this.J = new ArrayList(this.J);
                    this.D |= 32;
                }
                this.J.addAll(j0Var.I);
            }
        }
        if ((j0Var.C & 32) == 32) {
            u0 u0Var4 = j0Var.J;
            if ((this.D & 64) != 64 || (u0Var = this.K) == u0.U) {
                this.K = u0Var4;
            } else {
                t0 t0VarP2 = u0.p(u0Var);
                t0VarP2.g(u0Var4);
                this.K = t0VarP2.e();
            }
            this.D |= 64;
        }
        if ((j0Var.C & 64) == 64) {
            int i6 = j0Var.K;
            this.D |= 128;
            this.L = i6;
        }
        if (!j0Var.L.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = j0Var.L;
                this.D &= -257;
            } else {
                if ((this.D & 256) != 256) {
                    this.M = new ArrayList(this.M);
                    this.D |= 256;
                }
                this.M.addAll(j0Var.L);
            }
        }
        if (!j0Var.M.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = j0Var.M;
                this.D &= -513;
            } else {
                if ((this.D & 512) != 512) {
                    this.N = new ArrayList(this.N);
                    this.D |= 512;
                }
                this.N.addAll(j0Var.M);
            }
        }
        if (!j0Var.O.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = j0Var.O;
                this.D &= -1025;
            } else {
                if ((this.D & 1024) != 1024) {
                    this.O = new ArrayList(this.O);
                    this.D |= 1024;
                }
                this.O.addAll(j0Var.O);
            }
        }
        if ((j0Var.C & 128) == 128) {
            c1 c1Var2 = j0Var.P;
            if ((this.D & 2048) != 2048 || (c1Var = this.P) == c1.N) {
                this.P = c1Var2;
            } else {
                b1 b1VarF = b1.f();
                b1VarF.g(c1Var);
                b1VarF.g(c1Var2);
                this.P = b1VarF.e();
            }
            this.D |= 2048;
        }
        int i7 = j0Var.C;
        if ((i7 & 256) == 256) {
            int i8 = j0Var.Q;
            this.D |= 4096;
            this.Q = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = j0Var.R;
            this.D |= 8192;
            this.R = i9;
        }
        if (!j0Var.S.isEmpty()) {
            if (this.S.isEmpty()) {
                this.S = j0Var.S;
                this.D &= -16385;
            } else {
                if ((this.D & 16384) != 16384) {
                    this.S = new ArrayList(this.S);
                    this.D |= 16384;
                }
                this.S.addAll(j0Var.S);
            }
        }
        if (!j0Var.T.isEmpty()) {
            if (this.T.isEmpty()) {
                this.T = j0Var.T;
                this.D &= -32769;
            } else {
                if ((this.D & 32768) != 32768) {
                    this.T = new ArrayList(this.T);
                    this.D |= 32768;
                }
                this.T.addAll(j0Var.T);
            }
        }
        if (!j0Var.U.isEmpty()) {
            if (this.U.isEmpty()) {
                this.U = j0Var.U;
                this.D &= -65537;
            } else {
                if ((this.D & 65536) != 65536) {
                    this.U = new ArrayList(this.U);
                    this.D |= 65536;
                }
                this.U.addAll(j0Var.U);
            }
        }
        if (!j0Var.V.isEmpty()) {
            if (this.V.isEmpty()) {
                this.V = j0Var.V;
                this.D &= -131073;
            } else {
                if ((this.D & 131072) != 131072) {
                    this.V = new ArrayList(this.V);
                    this.D |= 131072;
                }
                this.V.addAll(j0Var.V);
            }
        }
        if (!j0Var.W.isEmpty()) {
            if (this.W.isEmpty()) {
                this.W = j0Var.W;
                this.D &= -262145;
            } else {
                if ((this.D & 262144) != 262144) {
                    this.W = new ArrayList(this.W);
                    this.D |= 262144;
                }
                this.W.addAll(j0Var.W);
            }
        }
        if (!j0Var.X.isEmpty()) {
            if (this.X.isEmpty()) {
                this.X = j0Var.X;
                this.D &= -524289;
            } else {
                if ((this.D & 524288) != 524288) {
                    this.X = new ArrayList(this.X);
                    this.D |= 524288;
                }
                this.X.addAll(j0Var.X);
            }
        }
        if (!j0Var.Y.isEmpty()) {
            if (this.Y.isEmpty()) {
                this.Y = j0Var.Y;
                this.D &= -1048577;
            } else {
                if ((this.D & 1048576) != 1048576) {
                    this.Y = new ArrayList(this.Y);
                    this.D |= 1048576;
                }
                this.Y.addAll(j0Var.Y);
            }
        }
        if (!j0Var.Z.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = j0Var.Z;
                this.D &= -2097153;
            } else {
                if ((this.D & 2097152) != 2097152) {
                    this.Z = new ArrayList(this.Z);
                    this.D |= 2097152;
                }
                this.Z.addAll(j0Var.Z);
            }
        }
        if ((j0Var.C & 1024) == 1024) {
            p pVar3 = j0Var.a0;
            if ((this.D & 4194304) != 4194304 || (pVar2 = this.a0) == p.E) {
                this.a0 = pVar3;
            } else {
                o oVar = new o(0);
                oVar.D = Collections.EMPTY_LIST;
                oVar.h(pVar2);
                oVar.h(pVar3);
                this.a0 = oVar.d();
            }
            this.D |= 4194304;
        }
        if ((j0Var.C & 2048) == 2048) {
            p pVar4 = j0Var.b0;
            if ((this.D & 8388608) != 8388608 || (pVar = this.b0) == p.E) {
                this.b0 = pVar4;
            } else {
                o oVar2 = new o(0);
                oVar2.D = Collections.EMPTY_LIST;
                oVar2.h(pVar);
                oVar2.h(pVar4);
                this.b0 = oVar2.d();
            }
            this.D |= 8388608;
        }
        d(j0Var);
        this.A = this.A.b(j0Var.B);
    }
}
