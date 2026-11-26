package i20;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class b extends o20.j implements o20.u {
    public final int B;
    public int C;
    public int D;
    public Object E;

    public b(int i) {
        this.B = i;
    }

    @Override
    public final o20.b a() {
        switch (this.B) {
            case 0:
                f fVarD = d();
                if (fVarD.isInitialized()) {
                    return fVarD;
                }
                throw new UninitializedMessageException();
            default:
                l lVarE = e();
                if (lVarE.isInitialized()) {
                    return lVarE;
                }
                throw new UninitializedMessageException();
        }
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        switch (this.B) {
            case 0:
                f fVar2 = null;
                try {
                    try {
                        f.H.getClass();
                        f(new f(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        f fVar3 = (f) e.A;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            fVar2 = fVar3;
                            if (fVar2 != null) {
                                f(fVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fVar2 != null) {
                        f(fVar2);
                    }
                    throw th;
                }
            default:
                l lVar = null;
                try {
                    try {
                        l.H.getClass();
                        g(new l(fVar));
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        l lVar2 = (l) e2.A;
                        try {
                            throw e2;
                        } catch (Throwable th3) {
                            th = th3;
                            lVar = lVar2;
                            if (lVar != null) {
                                g(lVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (lVar != null) {
                        g(lVar);
                    }
                    throw th;
                }
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        switch (this.B) {
            case 0:
                f((f) oVar);
                break;
            default:
                g((l) oVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.B) {
            case 0:
                b bVar = new b(0);
                bVar.E = e.P;
                bVar.f(d());
                return bVar;
            default:
                b bVar2 = new b(1);
                bVar2.E = o20.e.A;
                bVar2.g(e());
                return bVar2;
        }
    }

    public f d() {
        f fVar = new f(this);
        int i = this.C;
        int i2 = (i & 1) != 1 ? 0 : 1;
        fVar.C = this.D;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        fVar.D = (e) this.E;
        fVar.B = i2;
        return fVar;
    }

    public l e() {
        l lVar = new l(this);
        int i = this.C;
        int i2 = (i & 1) != 1 ? 0 : 1;
        lVar.C = this.D;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        lVar.D = (o20.t) this.E;
        lVar.B = i2;
        return lVar;
    }

    public void f(f fVar) {
        e eVar;
        if (fVar == f.G) {
            return;
        }
        int i = fVar.B;
        if ((i & 1) == 1) {
            int i2 = fVar.C;
            this.C = 1 | this.C;
            this.D = i2;
        }
        if ((i & 2) == 2) {
            e eVar2 = fVar.D;
            if ((this.C & 2) != 2 || (eVar = (e) this.E) == e.P) {
                this.E = eVar2;
            } else {
                c cVarH = e.h(eVar);
                cVarH.f(eVar2);
                this.E = cVarH.d();
            }
            this.C |= 2;
        }
        this.A = this.A.b(fVar.A);
    }

    public void g(l lVar) {
        if (lVar == l.G) {
            return;
        }
        int i = lVar.B;
        if ((i & 1) == 1) {
            int i2 = lVar.C;
            this.C = 1 | this.C;
            this.D = i2;
        }
        if ((i & 2) == 2) {
            o20.t tVar = lVar.D;
            tVar.getClass();
            this.C = 2 | this.C;
            this.E = tVar;
        }
        this.A = this.A.b(lVar.A);
    }
}
