package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class z extends o20.o {
    public static final z L;
    public static final a M = new a(9);
    public final o20.e A;
    public int B;
    public int C;
    public int D;
    public y E;
    public u0 F;
    public int G;
    public List H;
    public List I;
    public byte J;
    public int K;

    static {
        z zVar = new z();
        L = zVar;
        zVar.C = 0;
        zVar.D = 0;
        zVar.E = y.TRUE;
        zVar.F = u0.U;
        zVar.G = 0;
        List list = Collections.EMPTY_LIST;
        zVar.H = list;
        zVar.I = list;
    }

    public z() {
        this.J = (byte) -1;
        this.K = -1;
        this.A = o20.e.A;
    }

    public z(x xVar) {
        this.J = (byte) -1;
        this.K = -1;
        this.A = xVar.A;
    }

    public z(o20.f fVar, o20.h hVar) {
        y yVar;
        this.J = (byte) -1;
        this.K = -1;
        boolean z = false;
        this.C = 0;
        this.D = 0;
        y yVar2 = y.TRUE;
        this.E = yVar2;
        this.F = u0.U;
        this.G = 0;
        List list = Collections.EMPTY_LIST;
        this.H = list;
        this.I = list;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iO = fVar.o();
                        if (iO != 0) {
                            if (iO == 8) {
                                this.B |= 1;
                                this.C = fVar.l();
                            } else if (iO != 16) {
                                Object objP = null;
                                if (iO == 24) {
                                    int iL = fVar.l();
                                    if (iL != 0) {
                                        if (iL == 1) {
                                            objP = y.FALSE;
                                        } else if (iL == 2) {
                                            objP = y.NULL;
                                        }
                                        yVar = objP;
                                    } else {
                                        yVar = yVar2;
                                    }
                                    if (yVar == 0) {
                                        q1VarJ.n0(iO);
                                        q1VarJ.n0(iL);
                                    } else {
                                        this.B |= 4;
                                        this.E = yVar;
                                    }
                                } else if (iO == 34) {
                                    if ((this.B & 8) == 8) {
                                        u0 u0Var = this.F;
                                        u0Var.getClass();
                                        objP = u0.p(u0Var);
                                    }
                                    t0 t0Var = objP;
                                    u0 u0Var2 = (u0) fVar.h(u0.V, hVar);
                                    this.F = u0Var2;
                                    if (t0Var != 0) {
                                        t0Var.g(u0Var2);
                                        this.F = t0Var.e();
                                    }
                                    this.B |= 8;
                                } else if (iO != 40) {
                                    a aVar = M;
                                    if (iO == 50) {
                                        if ((i & 32) != 32) {
                                            this.H = new ArrayList();
                                            i |= 32;
                                        }
                                        this.H.add(fVar.h(aVar, hVar));
                                    } else if (iO == 58) {
                                        if ((i & 64) != 64) {
                                            this.I = new ArrayList();
                                            i |= 64;
                                        }
                                        this.I.add(fVar.h(aVar, hVar));
                                    } else if (!fVar.r(iO, q1VarJ)) {
                                    }
                                } else {
                                    this.B |= 16;
                                    this.G = fVar.l();
                                }
                            } else {
                                this.B |= 2;
                                this.D = fVar.l();
                            }
                        }
                        z = true;
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
                if ((i & 32) == 32) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if ((i & 64) == 64) {
                    this.I = Collections.unmodifiableList(this.I);
                }
                try {
                    q1VarJ.A();
                } catch (IOException unused) {
                } finally {
                    this.A = dVar.l();
                }
                throw th;
            }
        }
        if ((i & 32) == 32) {
            this.H = Collections.unmodifiableList(this.H);
        }
        if ((i & 64) == 64) {
            this.I = Collections.unmodifiableList(this.I);
        }
        try {
            q1VarJ.A();
        } catch (IOException unused2) {
        } finally {
            this.A = dVar.l();
        }
    }

    @Override
    public final int a() {
        int i = this.K;
        if (i != -1) {
            return i;
        }
        int iN = (this.B & 1) == 1 ? q1.n(1, this.C) : 0;
        if ((this.B & 2) == 2) {
            iN += q1.n(2, this.D);
        }
        if ((this.B & 4) == 4) {
            iN += q1.m(3, this.E.A);
        }
        if ((this.B & 8) == 8) {
            iN += q1.p(4, this.F);
        }
        if ((this.B & 16) == 16) {
            iN += q1.n(5, this.G);
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            iN += q1.p(6, (o20.b) this.H.get(i2));
        }
        for (int i3 = 0; i3 < this.I.size(); i3++) {
            iN += q1.p(7, (o20.b) this.I.get(i3));
        }
        int size = this.A.size() + iN;
        this.K = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return x.e();
    }

    @Override
    public final o20.j c() {
        x xVarE = x.e();
        xVarE.f(this);
        return xVarE;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        if ((this.B & 1) == 1) {
            q1Var.e0(1, this.C);
        }
        if ((this.B & 2) == 2) {
            q1Var.e0(2, this.D);
        }
        if ((this.B & 4) == 4) {
            q1Var.d0(3, this.E.A);
        }
        if ((this.B & 8) == 8) {
            q1Var.g0(4, this.F);
        }
        if ((this.B & 16) == 16) {
            q1Var.e0(5, this.G);
        }
        for (int i = 0; i < this.H.size(); i++) {
            q1Var.g0(6, (o20.b) this.H.get(i));
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            q1Var.g0(7, (o20.b) this.I.get(i2));
        }
        q1Var.j0(this.A);
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.J;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.B & 8) == 8 && !this.F.isInitialized()) {
            this.J = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.H.size(); i++) {
            if (!((z) this.H.get(i)).isInitialized()) {
                this.J = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            if (!((z) this.I.get(i2)).isInitialized()) {
                this.J = (byte) 0;
                return false;
            }
        }
        this.J = (byte) 1;
        return true;
    }
}
