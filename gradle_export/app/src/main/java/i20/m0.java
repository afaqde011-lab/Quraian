package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class m0 extends o20.o {
    public static final m0 H;
    public static final a I = new a(15);
    public final o20.e A;
    public int B;
    public int C;
    public int D;
    public l0 E;
    public byte F;
    public int G;

    static {
        m0 m0Var = new m0();
        H = m0Var;
        m0Var.C = -1;
        m0Var.D = 0;
        m0Var.E = l0.PACKAGE;
    }

    public m0() {
        this.F = (byte) -1;
        this.G = -1;
        this.A = o20.e.A;
    }

    public m0(k0 k0Var) {
        this.F = (byte) -1;
        this.G = -1;
        this.A = k0Var.A;
    }

    public m0(o20.f fVar) {
        this.F = (byte) -1;
        this.G = -1;
        this.C = -1;
        boolean z = false;
        this.D = 0;
        l0 l0Var = l0.PACKAGE;
        this.E = l0Var;
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
                        } else if (iO == 16) {
                            this.B |= 2;
                            this.D = fVar.l();
                        } else if (iO == 24) {
                            int iL = fVar.l();
                            l0 l0Var2 = iL != 0 ? iL != 1 ? iL != 2 ? null : l0.LOCAL : l0Var : l0.CLASS;
                            if (l0Var2 == null) {
                                q1VarJ.n0(iO);
                                q1VarJ.n0(iL);
                            } else {
                                this.B |= 4;
                                this.E = l0Var2;
                            }
                        } else if (!fVar.r(iO, q1VarJ)) {
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
        int i = this.G;
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
        int size = this.A.size() + iN;
        this.G = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return k0.e();
    }

    @Override
    public final o20.j c() {
        k0 k0VarE = k0.e();
        k0VarE.f(this);
        return k0VarE;
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
        q1Var.j0(this.A);
    }

    @Override
    public final boolean isInitialized() {
        byte b = this.F;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.B & 2) == 2) {
            this.F = (byte) 1;
            return true;
        }
        this.F = (byte) 0;
        return false;
    }
}
