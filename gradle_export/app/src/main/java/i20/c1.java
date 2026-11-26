package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class c1 extends o20.l {
    public static final c1 N;
    public static final a O = new a(22);
    public final o20.e B;
    public int C;
    public int D;
    public int E;
    public u0 F;
    public int G;
    public u0 H;
    public int I;
    public List J;
    public e K;
    public byte L;
    public int M;

    static {
        c1 c1Var = new c1();
        N = c1Var;
        c1Var.D = 0;
        c1Var.E = 0;
        u0 u0Var = u0.U;
        c1Var.F = u0Var;
        c1Var.G = 0;
        c1Var.H = u0Var;
        c1Var.I = 0;
        c1Var.J = Collections.EMPTY_LIST;
        c1Var.K = e.P;
    }

    public c1() {
        this.L = (byte) -1;
        this.M = -1;
        this.B = o20.e.A;
    }

    public c1(b1 b1Var) {
        super(b1Var);
        this.L = (byte) -1;
        this.M = -1;
        this.B = b1Var.A;
    }

    public c1(o20.f fVar, o20.h hVar) {
        this.L = (byte) -1;
        this.M = -1;
        boolean z = false;
        this.D = 0;
        this.E = 0;
        u0 u0Var = u0.U;
        this.F = u0Var;
        this.G = 0;
        this.H = u0Var;
        this.I = 0;
        this.J = Collections.EMPTY_LIST;
        this.K = e.P;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.C |= 1;
                            this.D = fVar.l();
                        } else if (iO != 16) {
                            c cVarH = null;
                            t0 t0VarP = null;
                            t0 t0VarP2 = null;
                            if (iO == 26) {
                                if ((this.C & 4) == 4) {
                                    u0 u0Var2 = this.F;
                                    u0Var2.getClass();
                                    t0VarP = u0.p(u0Var2);
                                }
                                u0 u0Var3 = (u0) fVar.h(u0.V, hVar);
                                this.F = u0Var3;
                                if (t0VarP != null) {
                                    t0VarP.g(u0Var3);
                                    this.F = t0VarP.e();
                                }
                                this.C |= 4;
                            } else if (iO == 34) {
                                if ((this.C & 16) == 16) {
                                    u0 u0Var4 = this.H;
                                    u0Var4.getClass();
                                    t0VarP2 = u0.p(u0Var4);
                                }
                                u0 u0Var5 = (u0) fVar.h(u0.V, hVar);
                                this.H = u0Var5;
                                if (t0VarP2 != null) {
                                    t0VarP2.g(u0Var5);
                                    this.H = t0VarP2.e();
                                }
                                this.C |= 16;
                            } else if (iO == 40) {
                                this.C |= 8;
                                this.G = fVar.l();
                            } else if (iO == 48) {
                                this.C |= 32;
                                this.I = fVar.l();
                            } else if (iO == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.J = new ArrayList();
                                    c = '@';
                                }
                                this.J.add(fVar.h(h.H, hVar));
                            } else if (iO == 66) {
                                if ((this.C & 64) == 64) {
                                    e eVar = this.K;
                                    eVar.getClass();
                                    cVarH = e.h(eVar);
                                }
                                e eVar2 = (e) fVar.h(e.Q, hVar);
                                this.K = eVar2;
                                if (cVarH != null) {
                                    cVarH.f(eVar2);
                                    this.K = cVarH.d();
                                }
                                this.C |= 64;
                            } else if (!l(fVar, q1VarJ, hVar, iO)) {
                            }
                        } else {
                            this.C |= 2;
                            this.E = fVar.l();
                        }
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
                if (((c == true ? 1 : 0) & '@') == 64) {
                    this.J = Collections.unmodifiableList(this.J);
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
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.J = Collections.unmodifiableList(this.J);
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
            iN += q1.p(3, this.F);
        }
        if ((this.C & 16) == 16) {
            iN += q1.p(4, this.H);
        }
        if ((this.C & 8) == 8) {
            iN += q1.n(5, this.G);
        }
        if ((this.C & 32) == 32) {
            iN += q1.n(6, this.I);
        }
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            iN += q1.p(7, (o20.b) this.J.get(i2));
        }
        if ((this.C & 64) == 64) {
            iN += q1.p(8, this.K);
        }
        int size = this.B.size() + h() + iN;
        this.M = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return b1.f();
    }

    @Override
    public final o20.j c() {
        b1 b1VarF = b1.f();
        b1VarF.g(this);
        return b1VarF;
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
            q1Var.g0(3, this.F);
        }
        if ((this.C & 16) == 16) {
            q1Var.g0(4, this.H);
        }
        if ((this.C & 8) == 8) {
            q1Var.e0(5, this.G);
        }
        if ((this.C & 32) == 32) {
            q1Var.e0(6, this.I);
        }
        for (int i = 0; i < this.J.size(); i++) {
            q1Var.g0(7, (o20.b) this.J.get(i));
        }
        if ((this.C & 64) == 64) {
            q1Var.g0(8, this.K);
        }
        bVar.C(200, q1Var);
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
        if ((i & 2) != 2) {
            this.L = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.F.isInitialized()) {
            this.L = (byte) 0;
            return false;
        }
        if ((this.C & 16) == 16 && !this.H.isInitialized()) {
            this.L = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            if (!((h) this.J.get(i2)).isInitialized()) {
                this.L = (byte) 0;
                return false;
            }
        }
        if ((this.C & 64) == 64 && !this.K.isInitialized()) {
            this.L = (byte) 0;
            return false;
        }
        if (g()) {
            this.L = (byte) 1;
            return true;
        }
        this.L = (byte) 0;
        return false;
    }

    public final b1 n() {
        b1 b1VarF = b1.f();
        b1VarF.g(this);
        return b1VarF;
    }
}
