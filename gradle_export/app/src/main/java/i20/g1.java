package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class g1 extends o20.o {
    public static final g1 K;
    public static final a L = new a(23);
    public final o20.e A;
    public int B;
    public int C;
    public int D;
    public e1 E;
    public int F;
    public int G;
    public f1 H;
    public byte I;
    public int J;

    static {
        g1 g1Var = new g1();
        K = g1Var;
        g1Var.C = 0;
        g1Var.D = 0;
        g1Var.E = e1.ERROR;
        g1Var.F = 0;
        g1Var.G = 0;
        g1Var.H = f1.LANGUAGE_VERSION;
    }

    public g1() {
        this.I = (byte) -1;
        this.J = -1;
        this.A = o20.e.A;
    }

    public g1(d1 d1Var) {
        this.I = (byte) -1;
        this.J = -1;
        this.A = d1Var.A;
    }

    public g1(o20.f fVar) {
        this.I = (byte) -1;
        this.J = -1;
        boolean z = false;
        this.C = 0;
        this.D = 0;
        e1 e1Var = e1.ERROR;
        this.E = e1Var;
        this.F = 0;
        this.G = 0;
        f1 f1Var = f1.LANGUAGE_VERSION;
        this.H = f1Var;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        if (iO == 8) {
                            this.B |= 1;
                            this.C = fVar.l();
                        } else if (iO != 16) {
                            f1 f1Var2 = null;
                            e1 e1Var2 = null;
                            if (iO == 24) {
                                int iL = fVar.l();
                                if (iL == 0) {
                                    e1Var2 = e1.WARNING;
                                } else if (iL == 1) {
                                    e1Var2 = e1Var;
                                } else if (iL == 2) {
                                    e1Var2 = e1.HIDDEN;
                                }
                                if (e1Var2 == null) {
                                    q1VarJ.n0(iO);
                                    q1VarJ.n0(iL);
                                } else {
                                    this.B |= 4;
                                    this.E = e1Var2;
                                }
                            } else if (iO == 32) {
                                this.B |= 8;
                                this.F = fVar.l();
                            } else if (iO == 40) {
                                this.B |= 16;
                                this.G = fVar.l();
                            } else if (iO == 48) {
                                int iL2 = fVar.l();
                                if (iL2 == 0) {
                                    f1Var2 = f1Var;
                                } else if (iL2 == 1) {
                                    f1Var2 = f1.COMPILER_VERSION;
                                } else if (iL2 == 2) {
                                    f1Var2 = f1.API_VERSION;
                                }
                                if (f1Var2 == null) {
                                    q1VarJ.n0(iO);
                                    q1VarJ.n0(iL2);
                                } else {
                                    this.B |= 32;
                                    this.H = f1Var2;
                                }
                            } else if (!fVar.r(iO, q1VarJ)) {
                            }
                        } else {
                            this.B |= 2;
                            this.D = fVar.l();
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
                try {
                    q1VarJ.A();
                } catch (IOException unused) {
                } finally {
                    this.A = dVar.l();
                }
                throw th;
            }
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
        int i = this.J;
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
            iN += q1.n(4, this.F);
        }
        if ((this.B & 16) == 16) {
            iN += q1.n(5, this.G);
        }
        if ((this.B & 32) == 32) {
            iN += q1.m(6, this.H.A);
        }
        int size = this.A.size() + iN;
        this.J = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return d1.e();
    }

    @Override
    public final o20.j c() {
        d1 d1VarE = d1.e();
        d1VarE.f(this);
        return d1VarE;
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
            q1Var.e0(4, this.F);
        }
        if ((this.B & 16) == 16) {
            q1Var.e0(5, this.G);
        }
        if ((this.B & 32) == 32) {
            q1Var.d0(6, this.H.A);
        }
        q1Var.j0(this.A);
    }

    @Override
    public final boolean isInitialized() {
        if (this.I == 1) {
            return true;
        }
        this.I = (byte) 1;
        return true;
    }
}
