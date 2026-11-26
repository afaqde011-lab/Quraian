package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class u0 extends o20.l {
    public static final u0 U;
    public static final a V = new a(17);
    public final o20.e B;
    public int C;
    public List D;
    public boolean E;
    public int F;
    public u0 G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public u0 M;
    public int N;
    public u0 O;
    public int P;
    public int Q;
    public List R;
    public byte S;
    public int T;

    static {
        u0 u0Var = new u0();
        U = u0Var;
        u0Var.o();
    }

    public u0() {
        this.S = (byte) -1;
        this.T = -1;
        this.B = o20.e.A;
    }

    public u0(t0 t0Var) {
        super(t0Var);
        this.S = (byte) -1;
        this.T = -1;
        this.B = t0Var.A;
    }

    public u0(o20.f fVar, o20.h hVar) {
        this.S = (byte) -1;
        this.T = -1;
        o();
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    a aVar = V;
                    t0 t0VarP = null;
                    switch (iO) {
                        case 0:
                            break;
                        case 8:
                            this.C |= 4096;
                            this.Q = fVar.l();
                            continue;
                        case 18:
                            if ((i & 1) != 1) {
                                this.D = new ArrayList();
                                i |= 1;
                            }
                            this.D.add(fVar.h(s0.I, hVar));
                            continue;
                        case 24:
                            this.C |= 1;
                            this.E = fVar.m() != 0;
                            continue;
                        case 32:
                            this.C |= 2;
                            this.F = fVar.l();
                            continue;
                        case 42:
                            if ((this.C & 4) == 4) {
                                u0 u0Var = this.G;
                                u0Var.getClass();
                                t0VarP = p(u0Var);
                            }
                            u0 u0Var2 = (u0) fVar.h(aVar, hVar);
                            this.G = u0Var2;
                            if (t0VarP != null) {
                                t0VarP.g(u0Var2);
                                this.G = t0VarP.e();
                            }
                            this.C |= 4;
                            continue;
                        case 48:
                            this.C |= 16;
                            this.I = fVar.l();
                            continue;
                        case 56:
                            this.C |= 32;
                            this.J = fVar.l();
                            continue;
                        case 64:
                            this.C |= 8;
                            this.H = fVar.l();
                            continue;
                        case 72:
                            this.C |= 64;
                            this.K = fVar.l();
                            continue;
                        case 82:
                            if ((this.C & 256) == 256) {
                                u0 u0Var3 = this.M;
                                u0Var3.getClass();
                                t0VarP = p(u0Var3);
                            }
                            u0 u0Var4 = (u0) fVar.h(aVar, hVar);
                            this.M = u0Var4;
                            if (t0VarP != null) {
                                t0VarP.g(u0Var4);
                                this.M = t0VarP.e();
                            }
                            this.C |= 256;
                            continue;
                        case 88:
                            this.C |= 512;
                            this.N = fVar.l();
                            continue;
                        case 96:
                            this.C |= 128;
                            this.L = fVar.l();
                            continue;
                        case 106:
                            if ((this.C & 1024) == 1024) {
                                u0 u0Var5 = this.O;
                                u0Var5.getClass();
                                t0VarP = p(u0Var5);
                            }
                            u0 u0Var6 = (u0) fVar.h(aVar, hVar);
                            this.O = u0Var6;
                            if (t0VarP != null) {
                                t0VarP.g(u0Var6);
                                this.O = t0VarP.e();
                            }
                            this.C |= 1024;
                            continue;
                        case 112:
                            this.C |= 2048;
                            this.P = fVar.l();
                            continue;
                        case 802:
                            if ((i & 16384) != 16384) {
                                this.R = new ArrayList();
                                i |= 16384;
                            }
                            this.R.add(fVar.h(h.H, hVar));
                            continue;
                        default:
                            if (!l(fVar, q1VarJ, hVar, iO)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.A = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.A = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                if ((i & 16384) == 16384) {
                    this.R = Collections.unmodifiableList(this.R);
                }
                try {
                    q1VarJ.A();
                } catch (IOException unused) {
                } finally {
                    this.B = dVar.l();
                }
                k();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.D = Collections.unmodifiableList(this.D);
        }
        if ((i & 16384) == 16384) {
            this.R = Collections.unmodifiableList(this.R);
        }
        try {
            q1VarJ.A();
        } catch (IOException unused2) {
        } finally {
            this.B = dVar.l();
        }
        k();
    }

    public static t0 p(u0 u0Var) {
        t0 t0VarF = t0.f();
        t0VarF.g(u0Var);
        return t0VarF;
    }

    @Override
    public final int a() {
        int i = this.T;
        if (i != -1) {
            return i;
        }
        int iN = (this.C & 4096) == 4096 ? q1.n(1, this.Q) : 0;
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            iN += q1.p(2, (o20.b) this.D.get(i2));
        }
        if ((this.C & 1) == 1) {
            iN += q1.t(3) + 1;
        }
        if ((this.C & 2) == 2) {
            iN += q1.n(4, this.F);
        }
        if ((this.C & 4) == 4) {
            iN += q1.p(5, this.G);
        }
        if ((this.C & 16) == 16) {
            iN += q1.n(6, this.I);
        }
        if ((this.C & 32) == 32) {
            iN += q1.n(7, this.J);
        }
        if ((this.C & 8) == 8) {
            iN += q1.n(8, this.H);
        }
        if ((this.C & 64) == 64) {
            iN += q1.n(9, this.K);
        }
        if ((this.C & 256) == 256) {
            iN += q1.p(10, this.M);
        }
        if ((this.C & 512) == 512) {
            iN += q1.n(11, this.N);
        }
        if ((this.C & 128) == 128) {
            iN += q1.n(12, this.L);
        }
        if ((this.C & 1024) == 1024) {
            iN += q1.p(13, this.O);
        }
        if ((this.C & 2048) == 2048) {
            iN += q1.n(14, this.P);
        }
        for (int i3 = 0; i3 < this.R.size(); i3++) {
            iN += q1.p(100, (o20.b) this.R.get(i3));
        }
        int size = this.B.size() + h() + iN;
        this.T = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return t0.f();
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        h7.b bVar = new h7.b(this);
        if ((this.C & 4096) == 4096) {
            q1Var.e0(1, this.Q);
        }
        for (int i = 0; i < this.D.size(); i++) {
            q1Var.g0(2, (o20.b) this.D.get(i));
        }
        if ((this.C & 1) == 1) {
            boolean z = this.E;
            q1Var.p0(3, 0);
            q1Var.i0(z ? 1 : 0);
        }
        if ((this.C & 2) == 2) {
            q1Var.e0(4, this.F);
        }
        if ((this.C & 4) == 4) {
            q1Var.g0(5, this.G);
        }
        if ((this.C & 16) == 16) {
            q1Var.e0(6, this.I);
        }
        if ((this.C & 32) == 32) {
            q1Var.e0(7, this.J);
        }
        if ((this.C & 8) == 8) {
            q1Var.e0(8, this.H);
        }
        if ((this.C & 64) == 64) {
            q1Var.e0(9, this.K);
        }
        if ((this.C & 256) == 256) {
            q1Var.g0(10, this.M);
        }
        if ((this.C & 512) == 512) {
            q1Var.e0(11, this.N);
        }
        if ((this.C & 128) == 128) {
            q1Var.e0(12, this.L);
        }
        if ((this.C & 1024) == 1024) {
            q1Var.g0(13, this.O);
        }
        if ((this.C & 2048) == 2048) {
            q1Var.e0(14, this.P);
        }
        for (int i2 = 0; i2 < this.R.size(); i2++) {
            q1Var.g0(100, (o20.b) this.R.get(i2));
        }
        bVar.C(200, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return U;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.S;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.D.size(); i++) {
            if (!((s0) this.D.get(i)).isInitialized()) {
                this.S = (byte) 0;
                return false;
            }
        }
        if ((this.C & 4) == 4 && !this.G.isInitialized()) {
            this.S = (byte) 0;
            return false;
        }
        if ((this.C & 256) == 256 && !this.M.isInitialized()) {
            this.S = (byte) 0;
            return false;
        }
        if ((this.C & 1024) == 1024 && !this.O.isInitialized()) {
            this.S = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.R.size(); i2++) {
            if (!((h) this.R.get(i2)).isInitialized()) {
                this.S = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.S = (byte) 1;
            return true;
        }
        this.S = (byte) 0;
        return false;
    }

    public final boolean n() {
        return (this.C & 16) == 16;
    }

    public final void o() {
        List list = Collections.EMPTY_LIST;
        this.D = list;
        this.E = false;
        this.F = 0;
        u0 u0Var = U;
        this.G = u0Var;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = u0Var;
        this.N = 0;
        this.O = u0Var;
        this.P = 0;
        this.Q = 0;
        this.R = list;
    }

    @Override
    public final t0 c() {
        return p(this);
    }
}
