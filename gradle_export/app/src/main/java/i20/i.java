package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class i extends o20.k {
    public int D;
    public int E;
    public int F;
    public int G;
    public List H;
    public List I;
    public List J;
    public List K;
    public List L;
    public List M;
    public List N;
    public List O;
    public List P;
    public List Q;
    public List R;
    public List S;
    public int T;
    public u0 U;
    public int V;
    public List W;
    public a1 X;
    public List Y;
    public h1 Z;
    public List a0;

    public static i f() {
        i iVar = new i();
        iVar.E = 6;
        List list = Collections.EMPTY_LIST;
        iVar.H = list;
        iVar.I = list;
        iVar.J = list;
        iVar.K = list;
        iVar.L = list;
        iVar.M = list;
        iVar.N = list;
        iVar.O = list;
        iVar.P = list;
        iVar.Q = list;
        iVar.R = list;
        iVar.S = list;
        iVar.U = u0.U;
        iVar.W = list;
        iVar.X = a1.G;
        iVar.Y = list;
        iVar.Z = h1.E;
        iVar.a0 = list;
        return iVar;
    }

    @Override
    public final o20.b a() {
        k kVarE = e();
        if (kVarE.isInitialized()) {
            return kVarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        k kVar = null;
        try {
            try {
                k.h0.getClass();
                g(new k(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                k kVar2 = (k) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    kVar = kVar2;
                    if (kVar != null) {
                        g(kVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (kVar != null) {
                g(kVar);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((k) oVar);
        return this;
    }

    public final Object clone() {
        i iVarF = f();
        iVarF.g(e());
        return iVarF;
    }

    public final k e() {
        k kVar = new k(this);
        int i = this.D;
        int i2 = (i & 1) != 1 ? 0 : 1;
        kVar.D = this.E;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        kVar.E = this.F;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        kVar.F = this.G;
        if ((i & 8) == 8) {
            this.H = Collections.unmodifiableList(this.H);
            this.D &= -9;
        }
        kVar.G = this.H;
        if ((this.D & 16) == 16) {
            this.I = Collections.unmodifiableList(this.I);
            this.D &= -17;
        }
        kVar.H = this.I;
        if ((this.D & 32) == 32) {
            this.J = Collections.unmodifiableList(this.J);
            this.D &= -33;
        }
        kVar.I = this.J;
        if ((this.D & 64) == 64) {
            this.K = Collections.unmodifiableList(this.K);
            this.D &= -65;
        }
        kVar.K = this.K;
        if ((this.D & 128) == 128) {
            this.L = Collections.unmodifiableList(this.L);
            this.D &= -129;
        }
        kVar.M = this.L;
        if ((this.D & 256) == 256) {
            this.M = Collections.unmodifiableList(this.M);
            this.D &= -257;
        }
        kVar.N = this.M;
        if ((this.D & 512) == 512) {
            this.N = Collections.unmodifiableList(this.N);
            this.D &= -513;
        }
        kVar.P = this.N;
        if ((this.D & 1024) == 1024) {
            this.O = Collections.unmodifiableList(this.O);
            this.D &= -1025;
        }
        kVar.Q = this.O;
        if ((this.D & 2048) == 2048) {
            this.P = Collections.unmodifiableList(this.P);
            this.D &= -2049;
        }
        kVar.R = this.P;
        if ((this.D & 4096) == 4096) {
            this.Q = Collections.unmodifiableList(this.Q);
            this.D &= -4097;
        }
        kVar.S = this.Q;
        if ((this.D & 8192) == 8192) {
            this.R = Collections.unmodifiableList(this.R);
            this.D &= -8193;
        }
        kVar.T = this.R;
        if ((this.D & 16384) == 16384) {
            this.S = Collections.unmodifiableList(this.S);
            this.D &= -16385;
        }
        kVar.U = this.S;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        kVar.W = this.T;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        kVar.X = this.U;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        kVar.Y = this.V;
        if ((this.D & 262144) == 262144) {
            this.W = Collections.unmodifiableList(this.W);
            this.D &= -262145;
        }
        kVar.Z = this.W;
        if ((i & 524288) == 524288) {
            i2 |= 64;
        }
        kVar.a0 = this.X;
        if ((this.D & 1048576) == 1048576) {
            this.Y = Collections.unmodifiableList(this.Y);
            this.D &= -1048577;
        }
        kVar.b0 = this.Y;
        if ((i & 2097152) == 2097152) {
            i2 |= 128;
        }
        kVar.c0 = this.Z;
        if ((this.D & 4194304) == 4194304) {
            this.a0 = Collections.unmodifiableList(this.a0);
            this.D &= -4194305;
        }
        kVar.d0 = this.a0;
        kVar.C = i2;
        return kVar;
    }

    public final void g(k kVar) {
        h1 h1Var;
        a1 a1Var;
        u0 u0Var;
        if (kVar == k.g0) {
            return;
        }
        int i = kVar.C;
        if ((i & 1) == 1) {
            int i2 = kVar.D;
            this.D = 1 | this.D;
            this.E = i2;
        }
        if ((i & 2) == 2) {
            int i3 = kVar.E;
            this.D = 2 | this.D;
            this.F = i3;
        }
        if ((i & 4) == 4) {
            int i4 = kVar.F;
            this.D = 4 | this.D;
            this.G = i4;
        }
        if (!kVar.G.isEmpty()) {
            if (this.H.isEmpty()) {
                this.H = kVar.G;
                this.D &= -9;
            } else {
                if ((this.D & 8) != 8) {
                    this.H = new ArrayList(this.H);
                    this.D |= 8;
                }
                this.H.addAll(kVar.G);
            }
        }
        if (!kVar.H.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = kVar.H;
                this.D &= -17;
            } else {
                if ((this.D & 16) != 16) {
                    this.I = new ArrayList(this.I);
                    this.D |= 16;
                }
                this.I.addAll(kVar.H);
            }
        }
        if (!kVar.I.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = kVar.I;
                this.D &= -33;
            } else {
                if ((this.D & 32) != 32) {
                    this.J = new ArrayList(this.J);
                    this.D |= 32;
                }
                this.J.addAll(kVar.I);
            }
        }
        if (!kVar.K.isEmpty()) {
            if (this.K.isEmpty()) {
                this.K = kVar.K;
                this.D &= -65;
            } else {
                if ((this.D & 64) != 64) {
                    this.K = new ArrayList(this.K);
                    this.D |= 64;
                }
                this.K.addAll(kVar.K);
            }
        }
        if (!kVar.M.isEmpty()) {
            if (this.L.isEmpty()) {
                this.L = kVar.M;
                this.D &= -129;
            } else {
                if ((this.D & 128) != 128) {
                    this.L = new ArrayList(this.L);
                    this.D |= 128;
                }
                this.L.addAll(kVar.M);
            }
        }
        if (!kVar.N.isEmpty()) {
            if (this.M.isEmpty()) {
                this.M = kVar.N;
                this.D &= -257;
            } else {
                if ((this.D & 256) != 256) {
                    this.M = new ArrayList(this.M);
                    this.D |= 256;
                }
                this.M.addAll(kVar.N);
            }
        }
        if (!kVar.P.isEmpty()) {
            if (this.N.isEmpty()) {
                this.N = kVar.P;
                this.D &= -513;
            } else {
                if ((this.D & 512) != 512) {
                    this.N = new ArrayList(this.N);
                    this.D |= 512;
                }
                this.N.addAll(kVar.P);
            }
        }
        if (!kVar.Q.isEmpty()) {
            if (this.O.isEmpty()) {
                this.O = kVar.Q;
                this.D &= -1025;
            } else {
                if ((this.D & 1024) != 1024) {
                    this.O = new ArrayList(this.O);
                    this.D |= 1024;
                }
                this.O.addAll(kVar.Q);
            }
        }
        if (!kVar.R.isEmpty()) {
            if (this.P.isEmpty()) {
                this.P = kVar.R;
                this.D &= -2049;
            } else {
                if ((this.D & 2048) != 2048) {
                    this.P = new ArrayList(this.P);
                    this.D |= 2048;
                }
                this.P.addAll(kVar.R);
            }
        }
        if (!kVar.S.isEmpty()) {
            if (this.Q.isEmpty()) {
                this.Q = kVar.S;
                this.D &= -4097;
            } else {
                if ((this.D & 4096) != 4096) {
                    this.Q = new ArrayList(this.Q);
                    this.D |= 4096;
                }
                this.Q.addAll(kVar.S);
            }
        }
        if (!kVar.T.isEmpty()) {
            if (this.R.isEmpty()) {
                this.R = kVar.T;
                this.D &= -8193;
            } else {
                if ((this.D & 8192) != 8192) {
                    this.R = new ArrayList(this.R);
                    this.D |= 8192;
                }
                this.R.addAll(kVar.T);
            }
        }
        if (!kVar.U.isEmpty()) {
            if (this.S.isEmpty()) {
                this.S = kVar.U;
                this.D &= -16385;
            } else {
                if ((this.D & 16384) != 16384) {
                    this.S = new ArrayList(this.S);
                    this.D |= 16384;
                }
                this.S.addAll(kVar.U);
            }
        }
        int i5 = kVar.C;
        if ((i5 & 8) == 8) {
            int i6 = kVar.W;
            this.D |= 32768;
            this.T = i6;
        }
        if ((i5 & 16) == 16) {
            u0 u0Var2 = kVar.X;
            if ((this.D & 65536) != 65536 || (u0Var = this.U) == u0.U) {
                this.U = u0Var2;
            } else {
                t0 t0VarP = u0.p(u0Var);
                t0VarP.g(u0Var2);
                this.U = t0VarP.e();
            }
            this.D |= 65536;
        }
        if ((kVar.C & 32) == 32) {
            int i7 = kVar.Y;
            this.D |= 131072;
            this.V = i7;
        }
        if (!kVar.Z.isEmpty()) {
            if (this.W.isEmpty()) {
                this.W = kVar.Z;
                this.D &= -262145;
            } else {
                if ((this.D & 262144) != 262144) {
                    this.W = new ArrayList(this.W);
                    this.D |= 262144;
                }
                this.W.addAll(kVar.Z);
            }
        }
        if ((kVar.C & 64) == 64) {
            a1 a1Var2 = kVar.a0;
            if ((this.D & 524288) != 524288 || (a1Var = this.X) == a1.G) {
                this.X = a1Var2;
            } else {
                g gVarG = a1.g(a1Var);
                gVarG.h(a1Var2);
                this.X = gVarG.e();
            }
            this.D |= 524288;
        }
        if (!kVar.b0.isEmpty()) {
            if (this.Y.isEmpty()) {
                this.Y = kVar.b0;
                this.D &= -1048577;
            } else {
                if ((this.D & 1048576) != 1048576) {
                    this.Y = new ArrayList(this.Y);
                    this.D |= 1048576;
                }
                this.Y.addAll(kVar.b0);
            }
        }
        if ((kVar.C & 128) == 128) {
            h1 h1Var2 = kVar.c0;
            if ((this.D & 2097152) != 2097152 || (h1Var = this.Z) == h1.E) {
                this.Z = h1Var2;
            } else {
                o oVar = new o(2);
                oVar.D = Collections.EMPTY_LIST;
                oVar.m(h1Var);
                oVar.m(h1Var2);
                this.Z = oVar.g();
            }
            this.D |= 2097152;
        }
        if (!kVar.d0.isEmpty()) {
            if (this.a0.isEmpty()) {
                this.a0 = kVar.d0;
                this.D &= -4194305;
            } else {
                if ((this.D & 4194304) != 4194304) {
                    this.a0 = new ArrayList(this.a0);
                    this.D |= 4194304;
                }
                this.a0.addAll(kVar.d0);
            }
        }
        d(kVar);
        this.A = this.A.b(kVar.B);
    }
}
