package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class s0 extends o20.o {
    public static final s0 H;
    public static final a I = new a(18);
    public final o20.e A;
    public int B;
    public r0 C;
    public u0 D;
    public int E;
    public byte F;
    public int G;

    static {
        s0 s0Var = new s0();
        H = s0Var;
        s0Var.C = r0.INV;
        s0Var.D = u0.U;
        s0Var.E = 0;
    }

    public s0() {
        this.F = (byte) -1;
        this.G = -1;
        this.A = o20.e.A;
    }

    public s0(q0 q0Var) {
        this.F = (byte) -1;
        this.G = -1;
        this.A = q0Var.A;
    }

    public s0(o20.f fVar, o20.h hVar) {
        this.F = (byte) -1;
        this.G = -1;
        r0 r0Var = r0.INV;
        this.C = r0Var;
        this.D = u0.U;
        boolean z = false;
        this.E = 0;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        t0 t0VarP = null;
                        r0 r0Var2 = null;
                        if (iO == 8) {
                            int iL = fVar.l();
                            if (iL == 0) {
                                r0Var2 = r0.IN;
                            } else if (iL == 1) {
                                r0Var2 = r0.OUT;
                            } else if (iL == 2) {
                                r0Var2 = r0Var;
                            } else if (iL == 3) {
                                r0Var2 = r0.STAR;
                            }
                            if (r0Var2 == null) {
                                q1VarJ.n0(iO);
                                q1VarJ.n0(iL);
                            } else {
                                this.B |= 1;
                                this.C = r0Var2;
                            }
                        } else if (iO == 18) {
                            if ((this.B & 2) == 2) {
                                u0 u0Var = this.D;
                                u0Var.getClass();
                                t0VarP = u0.p(u0Var);
                            }
                            u0 u0Var2 = (u0) fVar.h(u0.V, hVar);
                            this.D = u0Var2;
                            if (t0VarP != null) {
                                t0VarP.g(u0Var2);
                                this.D = t0VarP.e();
                            }
                            this.B |= 2;
                        } else if (iO == 24) {
                            this.B |= 4;
                            this.E = fVar.l();
                        } else if (!fVar.r(iO, q1VarJ)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        q1VarJ.A();
                    } catch (IOException unused) {
                    } finally {
                        this.A = dVar.l();
                    }
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
        int iM = (this.B & 1) == 1 ? q1.m(1, this.C.A) : 0;
        if ((this.B & 2) == 2) {
            iM += q1.p(2, this.D);
        }
        if ((this.B & 4) == 4) {
            iM += q1.n(3, this.E);
        }
        int size = this.A.size() + iM;
        this.G = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return q0.e();
    }

    @Override
    public final o20.j c() {
        q0 q0VarE = q0.e();
        q0VarE.f(this);
        return q0VarE;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        if ((this.B & 1) == 1) {
            q1Var.d0(1, this.C.A);
        }
        if ((this.B & 2) == 2) {
            q1Var.g0(2, this.D);
        }
        if ((this.B & 4) == 4) {
            q1Var.e0(3, this.E);
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
        if ((this.B & 2) != 2 || this.D.isInitialized()) {
            this.F = (byte) 1;
            return true;
        }
        this.F = (byte) 0;
        return false;
    }
}
