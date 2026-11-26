package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class h0 extends o20.l {
    public static final h0 J;
    public static final a K = new a(12);
    public final o20.e B;
    public int C;
    public p0 D;
    public n0 E;
    public f0 F;
    public List G;
    public byte H;
    public int I;

    static {
        h0 h0Var = new h0();
        J = h0Var;
        h0Var.D = p0.E;
        h0Var.E = n0.E;
        h0Var.F = f0.K;
        h0Var.G = Collections.EMPTY_LIST;
    }

    public h0() {
        this.H = (byte) -1;
        this.I = -1;
        this.B = o20.e.A;
    }

    public h0(g0 g0Var) {
        super(g0Var);
        this.H = (byte) -1;
        this.I = -1;
        this.B = g0Var.A;
    }

    public h0(o20.f fVar, o20.h hVar) {
        this.H = (byte) -1;
        this.I = -1;
        this.D = p0.E;
        this.E = n0.E;
        this.F = f0.K;
        this.G = Collections.EMPTY_LIST;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        e0 e0VarF = null;
                        o oVar = null;
                        o oVar2 = null;
                        if (iO == 10) {
                            if ((this.C & 1) == 1) {
                                p0 p0Var = this.D;
                                p0Var.getClass();
                                oVar = new o(3);
                                oVar.D = o20.r.B;
                                oVar.k(p0Var);
                            }
                            p0 p0Var2 = (p0) fVar.h(p0.F, hVar);
                            this.D = p0Var2;
                            if (oVar != null) {
                                oVar.k(p0Var2);
                                this.D = oVar.f();
                            }
                            this.C |= 1;
                        } else if (iO == 18) {
                            if ((this.C & 2) == 2) {
                                n0 n0Var = this.E;
                                n0Var.getClass();
                                oVar2 = new o(1);
                                oVar2.D = Collections.EMPTY_LIST;
                                oVar2.j(n0Var);
                            }
                            n0 n0Var2 = (n0) fVar.h(n0.F, hVar);
                            this.E = n0Var2;
                            if (oVar2 != null) {
                                oVar2.j(n0Var2);
                                this.E = oVar2.e();
                            }
                            this.C |= 2;
                        } else if (iO == 26) {
                            if ((this.C & 4) == 4) {
                                f0 f0Var = this.F;
                                f0Var.getClass();
                                e0VarF = e0.f();
                                e0VarF.g(f0Var);
                            }
                            f0 f0Var2 = (f0) fVar.h(f0.L, hVar);
                            this.F = f0Var2;
                            if (e0VarF != null) {
                                e0VarF.g(f0Var2);
                                this.F = e0VarF.e();
                            }
                            this.C |= 4;
                        } else if (iO == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.G = new ArrayList();
                                c = '\b';
                            }
                            this.G.add(fVar.h(k.h0, hVar));
                        } else if (!l(fVar, q1VarJ, hVar, iO)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.G = Collections.unmodifiableList(this.G);
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
            } catch (InvalidProtocolBufferException e) {
                e.A = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.A = this;
                throw invalidProtocolBufferException;
            }
        }
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.G = Collections.unmodifiableList(this.G);
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
        int i = this.I;
        if (i != -1) {
            return i;
        }
        int iP = (this.C & 1) == 1 ? q1.p(1, this.D) : 0;
        if ((this.C & 2) == 2) {
            iP += q1.p(2, this.E);
        }
        if ((this.C & 4) == 4) {
            iP += q1.p(3, this.F);
        }
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            iP += q1.p(4, (o20.b) this.G.get(i2));
        }
        int size = this.B.size() + h() + iP;
        this.I = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return g0.f();
    }

    @Override
    public final o20.j c() {
        g0 g0VarF = g0.f();
        g0VarF.g(this);
        return g0VarF;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        h7.b bVar = new h7.b(this);
        if ((this.C & 1) == 1) {
            q1Var.g0(1, this.D);
        }
        if ((this.C & 2) == 2) {
            q1Var.g0(2, this.E);
        }
        if ((this.C & 4) == 4) {
            q1Var.g0(3, this.F);
        }
        for (int i = 0; i < this.G.size(); i++) {
            q1Var.g0(4, (o20.b) this.G.get(i));
        }
        bVar.C(200, q1Var);
        q1Var.j0(this.B);
    }

    @Override
    public final o20.b getDefaultInstanceForType() {
        return J;
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.H;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.C & 2) == 2 && !this.E.isInitialized()) {
            this.H = (byte) 0;
            return false;
        }
        if ((this.C & 4) == 4 && !this.F.isInitialized()) {
            this.H = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.G.size(); i++) {
            if (!((k) this.G.get(i)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.H = (byte) 1;
            return true;
        }
        this.H = (byte) 0;
        return false;
    }
}
