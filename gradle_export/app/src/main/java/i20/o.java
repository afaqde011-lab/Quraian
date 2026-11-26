package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class o extends o20.j implements o20.u {
    public final int B;
    public int C;
    public List D;

    public o(int i) {
        this.B = i;
    }

    @Override
    public final o20.b a() {
        switch (this.B) {
            case 0:
                p pVarD = d();
                if (pVarD.isInitialized()) {
                    return pVarD;
                }
                throw new UninitializedMessageException();
            case 1:
                n0 n0VarE = e();
                if (n0VarE.isInitialized()) {
                    return n0VarE;
                }
                throw new UninitializedMessageException();
            case 2:
                h1 h1VarG = g();
                h1VarG.isInitialized();
                return h1VarG;
            default:
                p0 p0VarF = f();
                p0VarF.isInitialized();
                return p0VarF;
        }
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        switch (this.B) {
            case 0:
                p pVar = null;
                try {
                    try {
                        p.F.getClass();
                        h(new p(fVar, hVar));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (pVar != null) {
                            h(pVar);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    p pVar2 = (p) e.A;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar = pVar2;
                        if (pVar != null) {
                            h(pVar);
                        }
                        throw th;
                    }
                }
            case 1:
                n0 n0Var = null;
                try {
                    try {
                        n0.F.getClass();
                        j(new n0(fVar, hVar));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (n0Var != null) {
                            j(n0Var);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    n0 n0Var2 = (n0) e2.A;
                    try {
                        throw e2;
                    } catch (Throwable th4) {
                        th = th4;
                        n0Var = n0Var2;
                        if (n0Var != null) {
                            j(n0Var);
                        }
                        throw th;
                    }
                }
            case 2:
                h1 h1Var = null;
                try {
                    try {
                        h1.F.getClass();
                        m(new h1(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e3) {
                        h1 h1Var2 = (h1) e3.A;
                        try {
                            throw e3;
                        } catch (Throwable th5) {
                            th = th5;
                            h1Var = h1Var2;
                            if (h1Var != null) {
                                m(h1Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (h1Var != null) {
                        m(h1Var);
                    }
                    throw th;
                }
            default:
                p0 p0Var = null;
                try {
                    try {
                        p0.F.getClass();
                        k(new p0(fVar));
                        return this;
                    } catch (InvalidProtocolBufferException e4) {
                        p0 p0Var2 = (p0) e4.A;
                        try {
                            throw e4;
                        } catch (Throwable th7) {
                            th = th7;
                            p0Var = p0Var2;
                            if (p0Var != null) {
                                k(p0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (p0Var != null) {
                        k(p0Var);
                    }
                    throw th;
                }
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        switch (this.B) {
            case 0:
                h((p) oVar);
                break;
            case 1:
                j((n0) oVar);
                break;
            case 2:
                m((h1) oVar);
                break;
            default:
                k((p0) oVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.B) {
            case 0:
                o oVar = new o(0);
                oVar.D = Collections.EMPTY_LIST;
                oVar.h(d());
                return oVar;
            case 1:
                o oVar2 = new o(1);
                oVar2.D = Collections.EMPTY_LIST;
                oVar2.j(e());
                return oVar2;
            case 2:
                o oVar3 = new o(2);
                oVar3.D = Collections.EMPTY_LIST;
                oVar3.m(g());
                return oVar3;
            default:
                o oVar4 = new o(3);
                oVar4.D = o20.r.B;
                oVar4.k(f());
                return oVar4;
        }
    }

    public p d() {
        p pVar = new p(this);
        if ((this.C & 1) == 1) {
            this.D = Collections.unmodifiableList(this.D);
            this.C &= -2;
        }
        pVar.B = this.D;
        return pVar;
    }

    public n0 e() {
        n0 n0Var = new n0(this);
        if ((this.C & 1) == 1) {
            this.D = Collections.unmodifiableList(this.D);
            this.C &= -2;
        }
        n0Var.B = this.D;
        return n0Var;
    }

    public p0 f() {
        p0 p0Var = new p0(this);
        if ((this.C & 1) == 1) {
            this.D = ((o20.s) this.D).getUnmodifiableView();
            this.C &= -2;
        }
        p0Var.B = (o20.s) this.D;
        return p0Var;
    }

    public h1 g() {
        h1 h1Var = new h1(this);
        if ((this.C & 1) == 1) {
            this.D = Collections.unmodifiableList(this.D);
            this.C &= -2;
        }
        h1Var.B = this.D;
        return h1Var;
    }

    public void h(p pVar) {
        if (pVar == p.E) {
            return;
        }
        if (!pVar.B.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = pVar.B;
                this.C &= -2;
            } else {
                if ((this.C & 1) != 1) {
                    this.D = new ArrayList(this.D);
                    this.C |= 1;
                }
                this.D.addAll(pVar.B);
            }
        }
        this.A = this.A.b(pVar.A);
    }

    public void j(n0 n0Var) {
        if (n0Var == n0.E) {
            return;
        }
        if (!n0Var.B.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = n0Var.B;
                this.C &= -2;
            } else {
                if ((this.C & 1) != 1) {
                    this.D = new ArrayList(this.D);
                    this.C |= 1;
                }
                this.D.addAll(n0Var.B);
            }
        }
        this.A = this.A.b(n0Var.A);
    }

    public void k(p0 p0Var) {
        if (p0Var == p0.E) {
            return;
        }
        if (!p0Var.B.isEmpty()) {
            if (((o20.s) this.D).isEmpty()) {
                this.D = p0Var.B;
                this.C &= -2;
            } else {
                if ((this.C & 1) != 1) {
                    this.D = new o20.r((o20.s) this.D);
                    this.C |= 1;
                }
                ((o20.s) this.D).addAll(p0Var.B);
            }
        }
        this.A = this.A.b(p0Var.A);
    }

    public void m(h1 h1Var) {
        if (h1Var == h1.E) {
            return;
        }
        if (!h1Var.B.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = h1Var.B;
                this.C &= -2;
            } else {
                if ((this.C & 1) != 1) {
                    this.D = new ArrayList(this.D);
                    this.C |= 1;
                }
                this.D.addAll(h1Var.B);
            }
        }
        this.A = this.A.b(h1Var.A);
    }
}
