package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class z0 extends o20.l {
    public static final z0 N;
    public static final a O = new a(20);
    public final o20.e B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public y0 G;
    public List H;
    public List I;
    public int J;
    public List K;
    public byte L;
    public int M;

    static {
        z0 z0Var = new z0();
        N = z0Var;
        z0Var.D = 0;
        z0Var.E = 0;
        z0Var.F = false;
        z0Var.G = y0.INV;
        List list = Collections.EMPTY_LIST;
        z0Var.H = list;
        z0Var.I = list;
        z0Var.K = list;
    }

    public z0() {
        this.J = -1;
        this.L = (byte) -1;
        this.M = -1;
        this.B = o20.e.A;
    }

    public z0(x0 x0Var) {
        super(x0Var);
        this.J = -1;
        this.L = (byte) -1;
        this.M = -1;
        this.B = x0Var.A;
    }

    public z0(o20.f fVar, o20.h hVar) {
        this.J = -1;
        this.L = (byte) -1;
        this.M = -1;
        this.D = 0;
        this.E = 0;
        this.F = false;
        y0 y0Var = y0.INV;
        this.G = y0Var;
        List list = Collections.EMPTY_LIST;
        this.H = list;
        this.I = list;
        this.K = list;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iO = fVar.o();
                        if (iO == 0) {
                            z = true;
                        } else if (iO == 8) {
                            this.C |= 1;
                            this.D = fVar.l();
                        } else if (iO == 16) {
                            this.C |= 2;
                            this.E = fVar.l();
                        } else if (iO == 24) {
                            this.C |= 4;
                            this.F = fVar.m() != 0;
                        } else if (iO == 32) {
                            int iL = fVar.l();
                            y0 y0Var2 = iL != 0 ? iL != 1 ? iL != 2 ? null : y0Var : y0.OUT : y0.IN;
                            if (y0Var2 == null) {
                                q1VarJ.n0(iO);
                                q1VarJ.n0(iL);
                            } else {
                                this.C |= 8;
                                this.G = y0Var2;
                            }
                        } else if (iO == 42) {
                            if ((i & 16) != 16) {
                                this.H = new ArrayList();
                                i |= 16;
                            }
                            this.H.add(fVar.h(u0.V, hVar));
                        } else if (iO == 48) {
                            if ((i & 32) != 32) {
                                this.I = new ArrayList();
                                i |= 32;
                            }
                            this.I.add(Integer.valueOf(fVar.l()));
                        } else if (iO == 50) {
                            int iE = fVar.e(fVar.l());
                            if ((i & 32) != 32 && fVar.c() > 0) {
                                this.I = new ArrayList();
                                i |= 32;
                            }
                            while (fVar.c() > 0) {
                                this.I.add(Integer.valueOf(fVar.l()));
                            }
                            fVar.d(iE);
                        } else if (iO == 802) {
                            if ((i & 64) != 64) {
                                this.K = new ArrayList();
                                i |= 64;
                            }
                            this.K.add(fVar.h(h.H, hVar));
                        } else if (!l(fVar, q1VarJ, hVar, iO)) {
                            z = true;
                        }
                    } catch (IOException e) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                        invalidProtocolBufferException.A = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.A = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if ((i & 16) == 16) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if ((i & 32) == 32) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                if ((i & 64) == 64) {
                    this.K = Collections.unmodifiableList(this.K);
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
        if ((i & 16) == 16) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if ((i & 32) == 32) {
            this.I = Collections.unmodifiableList(this.I);
        }
        if ((i & 64) == 64) {
            this.K = Collections.unmodifiableList(this.K);
        }
        try {
            q1VarJ.A();
        } catch (IOException unused2) {
        } finally {
            this.B = dVar.l();
        }
        k();
    }

    @Override
    public final int a() {
        int i = this.M;
        if (i != -1) {
            return i;
        }
        int iN = (this.C & 1) == 1 ? q1.n(1, this.D) : 0;
        if ((this.C & 2) == 2) {
            iN += q1.n(2, this.E);
        }
        if ((this.C & 4) == 4) {
            iN += q1.t(3) + 1;
        }
        if ((this.C & 8) == 8) {
            iN += q1.m(4, this.G.A);
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            iN += q1.p(5, (o20.b) this.H.get(i2));
        }
        int iO = 0;
        for (int i3 = 0; i3 < this.I.size(); i3++) {
            iO += q1.o(((Integer) this.I.get(i3)).intValue());
        }
        int iP = iN + iO;
        if (!this.I.isEmpty()) {
            iP = iP + 1 + q1.o(iO);
        }
        this.J = iO;
        for (int i4 = 0; i4 < this.K.size(); i4++) {
            iP += q1.p(100, (o20.b) this.K.get(i4));
        }
        int size = this.B.size() + h() + iP;
        this.M = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return x0.f();
    }

    @Override
    public final o20.j c() {
        x0 x0VarF = x0.f();
        x0VarF.g(this);
        return x0VarF;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        h7.b bVar = new h7.b(this);
        if ((this.C & 1) == 1) {
            q1Var.e0(1, this.D);
        }
        if ((this.C & 2) == 2) {
            q1Var.e0(2, this.E);
        }
        if ((this.C & 4) == 4) {
            boolean z = this.F;
            q1Var.p0(3, 0);
            q1Var.i0(z ? 1 : 0);
        }
        if ((this.C & 8) == 8) {
            q1Var.d0(4, this.G.A);
        }
        for (int i = 0; i < this.H.size(); i++) {
            q1Var.g0(5, (o20.b) this.H.get(i));
        }
        if (this.I.size() > 0) {
            q1Var.n0(50);
            q1Var.n0(this.J);
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            q1Var.f0(((Integer) this.I.get(i2)).intValue());
        }
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            q1Var.g0(100, (o20.b) this.K.get(i3));
        }
        bVar.C(1000, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return N;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.L;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.C;
        if ((i & 1) != 1) {
            this.L = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.L = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            if (!((u0) this.H.get(i2)).isInitialized()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            if (!((h) this.K.get(i3)).isInitialized()) {
                this.L = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.L = (byte) 1;
            return true;
        }
        this.L = (byte) 0;
        return false;
    }
}
