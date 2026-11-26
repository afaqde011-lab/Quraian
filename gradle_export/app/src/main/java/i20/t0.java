package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class t0 extends o20.k {
    public int D;
    public List E;
    public boolean F;
    public int G;
    public u0 H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public u0 N;
    public int O;
    public u0 P;
    public int Q;
    public int R;
    public List S;

    public static t0 f() {
        t0 t0Var = new t0();
        List list = Collections.EMPTY_LIST;
        t0Var.E = list;
        u0 u0Var = u0.U;
        t0Var.H = u0Var;
        t0Var.N = u0Var;
        t0Var.P = u0Var;
        t0Var.S = list;
        return t0Var;
    }

    @Override
    public final o20.b a() {
        u0 u0VarE = e();
        if (u0VarE.isInitialized()) {
            return u0VarE;
        }
        throw new UninitializedMessageException();
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        u0 u0Var = null;
        try {
            try {
                u0.V.getClass();
                g(new u0(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                u0 u0Var2 = (u0) e.A;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    u0Var = u0Var2;
                    if (u0Var != null) {
                        g(u0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (u0Var != null) {
                g(u0Var);
            }
            throw th;
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        g((u0) oVar);
        return this;
    }

    public final Object clone() {
        t0 t0VarF = f();
        t0VarF.g(e());
        return t0VarF;
    }

    public final u0 e() {
        u0 u0Var = new u0(this);
        int i = this.D;
        if ((i & 1) == 1) {
            this.E = Collections.unmodifiableList(this.E);
            this.D &= -2;
        }
        u0Var.D = this.E;
        int i2 = (i & 2) != 2 ? 0 : 1;
        u0Var.E = this.F;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        u0Var.F = this.G;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        u0Var.G = this.H;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        u0Var.H = this.I;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        u0Var.I = this.J;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        u0Var.J = this.K;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        u0Var.K = this.L;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        u0Var.L = this.M;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        u0Var.M = this.N;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        u0Var.N = this.O;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        u0Var.O = this.P;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        u0Var.P = this.Q;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        u0Var.Q = this.R;
        if ((this.D & 16384) == 16384) {
            this.S = Collections.unmodifiableList(this.S);
            this.D &= -16385;
        }
        u0Var.R = this.S;
        u0Var.C = i2;
        return u0Var;
    }

    public final t0 g(u0 u0Var) {
        u0 u0Var2;
        u0 u0Var3;
        u0 u0Var4;
        u0 u0Var5 = u0.U;
        if (u0Var == u0Var5) {
            return this;
        }
        if (!u0Var.D.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = u0Var.D;
                this.D &= -2;
            } else {
                if ((this.D & 1) != 1) {
                    this.E = new ArrayList(this.E);
                    this.D |= 1;
                }
                this.E.addAll(u0Var.D);
            }
        }
        int i = u0Var.C;
        if ((i & 1) == 1) {
            boolean z = u0Var.E;
            this.D |= 2;
            this.F = z;
        }
        if ((i & 2) == 2) {
            int i2 = u0Var.F;
            this.D |= 4;
            this.G = i2;
        }
        if ((i & 4) == 4) {
            u0 u0Var6 = u0Var.G;
            if ((this.D & 8) != 8 || (u0Var4 = this.H) == u0Var5) {
                this.H = u0Var6;
            } else {
                t0 t0VarP = u0.p(u0Var4);
                t0VarP.g(u0Var6);
                this.H = t0VarP.e();
            }
            this.D |= 8;
        }
        if ((u0Var.C & 8) == 8) {
            int i3 = u0Var.H;
            this.D |= 16;
            this.I = i3;
        }
        if (u0Var.n()) {
            int i4 = u0Var.I;
            this.D |= 32;
            this.J = i4;
        }
        int i5 = u0Var.C;
        if ((i5 & 32) == 32) {
            int i6 = u0Var.J;
            this.D |= 64;
            this.K = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = u0Var.K;
            this.D |= 128;
            this.L = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = u0Var.L;
            this.D |= 256;
            this.M = i8;
        }
        if ((i5 & 256) == 256) {
            u0 u0Var7 = u0Var.M;
            if ((this.D & 512) != 512 || (u0Var3 = this.N) == u0Var5) {
                this.N = u0Var7;
            } else {
                t0 t0VarP2 = u0.p(u0Var3);
                t0VarP2.g(u0Var7);
                this.N = t0VarP2.e();
            }
            this.D |= 512;
        }
        int i9 = u0Var.C;
        if ((i9 & 512) == 512) {
            int i11 = u0Var.N;
            this.D |= 1024;
            this.O = i11;
        }
        if ((i9 & 1024) == 1024) {
            u0 u0Var8 = u0Var.O;
            if ((this.D & 2048) != 2048 || (u0Var2 = this.P) == u0Var5) {
                this.P = u0Var8;
            } else {
                t0 t0VarP3 = u0.p(u0Var2);
                t0VarP3.g(u0Var8);
                this.P = t0VarP3.e();
            }
            this.D |= 2048;
        }
        int i12 = u0Var.C;
        if ((i12 & 2048) == 2048) {
            int i13 = u0Var.P;
            this.D |= 4096;
            this.Q = i13;
        }
        if ((i12 & 4096) == 4096) {
            int i14 = u0Var.Q;
            this.D |= 8192;
            this.R = i14;
        }
        if (!u0Var.R.isEmpty()) {
            if (this.S.isEmpty()) {
                this.S = u0Var.R;
                this.D &= -16385;
            } else {
                if ((this.D & 16384) != 16384) {
                    this.S = new ArrayList(this.S);
                    this.D |= 16384;
                }
                this.S.addAll(u0Var.R);
            }
        }
        d(u0Var);
        this.A = this.A.b(u0Var.B);
        return this;
    }
}
