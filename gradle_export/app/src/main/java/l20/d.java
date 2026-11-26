package l20;

import com.google.android.gms.internal.play_billing.q1;
import i20.q;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o20.o;

public final class d extends o {
    public static final d J;
    public static final i20.a K = new i20.a(27);
    public final o20.e A;
    public int B;
    public b C;
    public c D;
    public c E;
    public c F;
    public c G;
    public byte H;
    public int I;

    static {
        d dVar = new d();
        J = dVar;
        dVar.C = b.G;
        c cVar = c.G;
        dVar.D = cVar;
        dVar.E = cVar;
        dVar.F = cVar;
        dVar.G = cVar;
    }

    public d() {
        this.H = (byte) -1;
        this.I = -1;
        this.A = o20.e.A;
    }

    public d(q qVar) {
        this.H = (byte) -1;
        this.I = -1;
        this.A = qVar.A;
    }

    public d(o20.f fVar, o20.h hVar) {
        this.H = (byte) -1;
        this.I = -1;
        this.C = b.G;
        c cVar = c.G;
        this.D = cVar;
        this.E = cVar;
        this.F = cVar;
        this.G = cVar;
        o20.d dVar = new o20.d();
        q1 q1VarJ = q1.J(dVar, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iO = fVar.o();
                    if (iO != 0) {
                        a aVarG = null;
                        if (iO == 10) {
                            if ((this.B & 1) == 1) {
                                b bVar = this.C;
                                bVar.getClass();
                                aVarG = new a(0);
                                aVarG.f(bVar);
                            }
                            b bVar2 = (b) fVar.h(b.H, hVar);
                            this.C = bVar2;
                            if (aVarG != null) {
                                aVarG.f(bVar2);
                                this.C = aVarG.d();
                            }
                            this.B |= 1;
                        } else if (iO == 18) {
                            if ((this.B & 2) == 2) {
                                c cVar2 = this.D;
                                cVar2.getClass();
                                aVarG = c.g(cVar2);
                            }
                            c cVar3 = (c) fVar.h(c.H, hVar);
                            this.D = cVar3;
                            if (aVarG != null) {
                                aVarG.g(cVar3);
                                this.D = aVarG.e();
                            }
                            this.B |= 2;
                        } else if (iO == 26) {
                            if ((this.B & 4) == 4) {
                                c cVar4 = this.E;
                                cVar4.getClass();
                                aVarG = c.g(cVar4);
                            }
                            c cVar5 = (c) fVar.h(c.H, hVar);
                            this.E = cVar5;
                            if (aVarG != null) {
                                aVarG.g(cVar5);
                                this.E = aVarG.e();
                            }
                            this.B |= 4;
                        } else if (iO == 34) {
                            if ((this.B & 8) == 8) {
                                c cVar6 = this.F;
                                cVar6.getClass();
                                aVarG = c.g(cVar6);
                            }
                            c cVar7 = (c) fVar.h(c.H, hVar);
                            this.F = cVar7;
                            if (aVarG != null) {
                                aVarG.g(cVar7);
                                this.F = aVarG.e();
                            }
                            this.B |= 8;
                        } else if (iO == 42) {
                            if ((this.B & 16) == 16) {
                                c cVar8 = this.G;
                                cVar8.getClass();
                                aVarG = c.g(cVar8);
                            }
                            c cVar9 = (c) fVar.h(c.H, hVar);
                            this.G = cVar9;
                            if (aVarG != null) {
                                aVarG.g(cVar9);
                                this.G = aVarG.e();
                            }
                            this.B |= 16;
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
        int i = this.I;
        if (i != -1) {
            return i;
        }
        int iP = (this.B & 1) == 1 ? q1.p(1, this.C) : 0;
        if ((this.B & 2) == 2) {
            iP += q1.p(2, this.D);
        }
        if ((this.B & 4) == 4) {
            iP += q1.p(3, this.E);
        }
        if ((this.B & 8) == 8) {
            iP += q1.p(4, this.F);
        }
        if ((this.B & 16) == 16) {
            iP += q1.p(5, this.G);
        }
        int size = this.A.size() + iP;
        this.I = size;
        return size;
    }

    @Override
    public final o20.j b() {
        return q.g();
    }

    @Override
    public final o20.j c() {
        q qVarG = q.g();
        qVarG.j(this);
        return qVarG;
    }

    @Override
    public final void d(q1 q1Var) {
        a();
        if ((this.B & 1) == 1) {
            q1Var.g0(1, this.C);
        }
        if ((this.B & 2) == 2) {
            q1Var.g0(2, this.D);
        }
        if ((this.B & 4) == 4) {
            q1Var.g0(3, this.E);
        }
        if ((this.B & 8) == 8) {
            q1Var.g0(4, this.F);
        }
        if ((this.B & 16) == 16) {
            q1Var.g0(5, this.G);
        }
        q1Var.j0(this.A);
    }

    public final boolean g() {
        return (this.B & 4) == 4;
    }

    @Override
    public final boolean isInitialized() {
        if (this.H == 1) {
            return true;
        }
        this.H = (byte) 1;
        return true;
    }
}
