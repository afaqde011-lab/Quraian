package i20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class u extends o20.o {
    public static final u J;
    public static final a K = new a(7);
    public final o20.e A;
    public int B;
    public s C;
    public List D;
    public z E;
    public t F;
    public r G;
    public byte H;
    public int I;

    static {
        u uVar = new u();
        J = uVar;
        uVar.C = s.RETURNS_CONSTANT;
        uVar.D = Collections.EMPTY_LIST;
        uVar.E = z.L;
        uVar.F = t.AT_MOST_ONCE;
        uVar.G = r.CONCLUSION_CONDITION;
    }

    public u() {
        this.H = (byte) -1;
        this.I = -1;
        this.A = o20.e.A;
    }

    public u(q qVar) {
        this.H = (byte) -1;
        this.I = -1;
        this.A = qVar.A;
    }

    public u(o20.f fVar, o20.h hVar) {
        this.H = (byte) -1;
        this.I = -1;
        s sVar = s.RETURNS_CONSTANT;
        this.C = sVar;
        this.D = Collections.EMPTY_LIST;
        this.E = z.L;
        t tVar = t.AT_MOST_ONCE;
        this.F = tVar;
        r rVar = r.CONCLUSION_CONDITION;
        this.G = rVar;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        r rVar2 = null;
                        s sVar2 = null;
                        x xVarE = null;
                        t tVar2 = null;
                        if (iO == 8) {
                            int iL = fVar.l();
                            if (iL == 0) {
                                sVar2 = sVar;
                            } else if (iL == 1) {
                                sVar2 = s.CALLS;
                            } else if (iL == 2) {
                                sVar2 = s.RETURNS_NOT_NULL;
                            }
                            if (sVar2 == null) {
                                q1VarJ.n0(iO);
                                q1VarJ.n0(iL);
                            } else {
                                this.B |= 1;
                                this.C = sVar2;
                            }
                        } else if (iO == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.D = new ArrayList();
                                c = 2;
                            }
                            this.D.add(fVar.h(z.M, hVar));
                        } else if (iO == 26) {
                            if ((this.B & 2) == 2) {
                                z zVar = this.E;
                                zVar.getClass();
                                xVarE = x.e();
                                xVarE.f(zVar);
                            }
                            z zVar2 = (z) fVar.h(z.M, hVar);
                            this.E = zVar2;
                            if (xVarE != null) {
                                xVarE.f(zVar2);
                                this.E = xVarE.d();
                            }
                            this.B |= 2;
                        } else if (iO == 32) {
                            int iL2 = fVar.l();
                            if (iL2 == 0) {
                                tVar2 = tVar;
                            } else if (iL2 == 1) {
                                tVar2 = t.EXACTLY_ONCE;
                            } else if (iL2 == 2) {
                                tVar2 = t.AT_LEAST_ONCE;
                            }
                            if (tVar2 == null) {
                                q1VarJ.n0(iO);
                                q1VarJ.n0(iL2);
                            } else {
                                this.B |= 4;
                                this.F = tVar2;
                            }
                        } else if (iO == 40) {
                            int iL3 = fVar.l();
                            if (iL3 == 0) {
                                rVar2 = rVar;
                            } else if (iL3 == 1) {
                                rVar2 = r.RETURNS_CONDITION;
                            } else if (iL3 == 2) {
                                rVar2 = r.HOLDSIN_CONDITION;
                            }
                            if (rVar2 == null) {
                                q1VarJ.n0(iO);
                                q1VarJ.n0(iL3);
                            } else {
                                this.B |= 8;
                                this.G = rVar2;
                            }
                        } else if (!fVar.r(iO, q1VarJ)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.D = Collections.unmodifiableList(this.D);
                    }
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
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.D = Collections.unmodifiableList(this.D);
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
        int i = this.I;
        if (i != -1) {
            return i;
        }
        int iM = (this.B & 1) == 1 ? q1.m(1, this.C.A) : 0;
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            iM += q1.p(2, (o20.b) this.D.get(i2));
        }
        if ((this.B & 2) == 2) {
            iM += q1.p(3, this.E);
        }
        if ((this.B & 4) == 4) {
            iM += q1.m(4, this.F.A);
        }
        if ((this.B & 8) == 8) {
            iM += q1.m(5, this.G.A);
        }
        int size = this.A.size() + iM;
        this.I = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return q.f();
    }

    @Override
    public final o20.j c() {
        q qVarF = q.f();
        qVarF.h(this);
        return qVarF;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        if ((this.B & 1) == 1) {
            q1Var.d0(1, this.C.A);
        }
        for (int i = 0; i < this.D.size(); i++) {
            q1Var.g0(2, (o20.b) this.D.get(i));
        }
        if ((this.B & 2) == 2) {
            q1Var.g0(3, this.E);
        }
        if ((this.B & 4) == 4) {
            q1Var.d0(4, this.F.A);
        }
        if ((this.B & 8) == 8) {
            q1Var.d0(5, this.G.A);
        }
        q1Var.j0(this.A);
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
        for (int i = 0; i < this.D.size(); i++) {
            if (!((z) this.D.get(i)).isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if ((this.B & 2) != 2 || this.E.isInitialized()) {
            this.H = (byte) 1;
            return true;
        }
        this.H = (byte) 0;
        return false;
    }
}
