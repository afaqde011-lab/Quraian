package i20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class g extends o20.j implements o20.u {
    public final int B;
    public int C;
    public List D;
    public int E;

    public g(int i) {
        this.B = i;
    }

    public static g f() {
        g gVar = new g(1);
        gVar.D = Collections.EMPTY_LIST;
        gVar.E = -1;
        return gVar;
    }

    @Override
    public final o20.b a() {
        switch (this.B) {
            case 0:
                h hVarD = d();
                if (hVarD.isInitialized()) {
                    return hVarD;
                }
                throw new UninitializedMessageException();
            default:
                a1 a1VarE = e();
                if (a1VarE.isInitialized()) {
                    return a1VarE;
                }
                throw new UninitializedMessageException();
        }
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        switch (this.B) {
            case 0:
                h hVar2 = null;
                try {
                    try {
                        g((h) h.H.a(fVar, hVar));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (hVar2 != null) {
                            g(hVar2);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    h hVar3 = (h) e.A;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        hVar2 = hVar3;
                        if (hVar2 != null) {
                            g(hVar2);
                        }
                        throw th;
                    }
                }
            default:
                a1 a1Var = null;
                try {
                    try {
                        a1.H.getClass();
                        h(new a1(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        a1 a1Var2 = (a1) e2.A;
                        try {
                            throw e2;
                        } catch (Throwable th3) {
                            th = th3;
                            a1Var = a1Var2;
                            if (a1Var != null) {
                                h(a1Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (a1Var != null) {
                        h(a1Var);
                    }
                    throw th;
                }
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        switch (this.B) {
            case 0:
                g((h) oVar);
                break;
            default:
                h((a1) oVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.B) {
            case 0:
                g gVar = new g(0);
                gVar.D = Collections.EMPTY_LIST;
                gVar.g(d());
                return gVar;
            default:
                g gVarF = f();
                gVarF.h(e());
                return gVarF;
        }
    }

    public h d() {
        h hVar = new h(this);
        int i = this.C;
        int i2 = (i & 1) != 1 ? 0 : 1;
        hVar.C = this.E;
        if ((i & 2) == 2) {
            this.D = Collections.unmodifiableList(this.D);
            this.C &= -3;
        }
        hVar.D = this.D;
        hVar.B = i2;
        return hVar;
    }

    public a1 e() {
        a1 a1Var = new a1(this);
        int i = this.C;
        if ((i & 1) == 1) {
            this.D = Collections.unmodifiableList(this.D);
            this.C &= -2;
        }
        a1Var.C = this.D;
        int i2 = (i & 2) != 2 ? 0 : 1;
        a1Var.D = this.E;
        a1Var.B = i2;
        return a1Var;
    }

    public void g(h hVar) {
        if (hVar == h.G) {
            return;
        }
        if ((hVar.B & 1) == 1) {
            int i = hVar.C;
            this.C = 1 | this.C;
            this.E = i;
        }
        if (!hVar.D.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = hVar.D;
                this.C &= -3;
            } else {
                if ((this.C & 2) != 2) {
                    this.D = new ArrayList(this.D);
                    this.C |= 2;
                }
                this.D.addAll(hVar.D);
            }
        }
        this.A = this.A.b(hVar.A);
    }

    public void h(a1 a1Var) {
        if (a1Var == a1.G) {
            return;
        }
        if (!a1Var.C.isEmpty()) {
            if (this.D.isEmpty()) {
                this.D = a1Var.C;
                this.C &= -2;
            } else {
                if ((this.C & 1) != 1) {
                    this.D = new ArrayList(this.D);
                    this.C |= 1;
                }
                this.D.addAll(a1Var.C);
            }
        }
        if ((a1Var.B & 1) == 1) {
            int i = a1Var.D;
            this.C |= 2;
            this.E = i;
        }
        this.A = this.A.b(a1Var.A);
    }
}
