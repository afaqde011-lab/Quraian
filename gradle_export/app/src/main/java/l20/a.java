package l20;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import o20.o;
import o20.u;

public final class a extends o20.j implements u {
    public final int B;
    public int C;
    public int D;
    public int E;

    public a(int i) {
        this.B = i;
    }

    @Override
    public final o20.b a() {
        switch (this.B) {
            case 0:
                b bVarD = d();
                bVarD.isInitialized();
                return bVarD;
            default:
                c cVarE = e();
                cVarE.isInitialized();
                return cVarE;
        }
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        switch (this.B) {
            case 0:
                b bVar = null;
                try {
                    try {
                        b.H.getClass();
                        f(new b(fVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        b bVar2 = (b) e.A;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            if (bVar != null) {
                                f(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        f(bVar);
                    }
                    throw th;
                }
            default:
                c cVar = null;
                try {
                    try {
                        c.H.getClass();
                        g(new c(fVar));
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        c cVar2 = (c) e2.A;
                        try {
                            throw e2;
                        } catch (Throwable th3) {
                            th = th3;
                            cVar = cVar2;
                            if (cVar != null) {
                                g(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (cVar != null) {
                        g(cVar);
                    }
                    throw th;
                }
        }
    }

    @Override
    public final o20.j c(o oVar) {
        switch (this.B) {
            case 0:
                f((b) oVar);
                break;
            default:
                g((c) oVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.B) {
            case 0:
                a aVar = new a(0);
                aVar.f(d());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.g(e());
                return aVar2;
        }
    }

    public b d() {
        b bVar = new b(this);
        int i = this.C;
        int i2 = (i & 1) != 1 ? 0 : 1;
        bVar.C = this.D;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        bVar.D = this.E;
        bVar.B = i2;
        return bVar;
    }

    public c e() {
        c cVar = new c(this);
        int i = this.C;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cVar.C = this.D;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cVar.D = this.E;
        cVar.B = i2;
        return cVar;
    }

    public void f(b bVar) {
        if (bVar == b.G) {
            return;
        }
        int i = bVar.B;
        if ((i & 1) == 1) {
            int i2 = bVar.C;
            this.C = 1 | this.C;
            this.D = i2;
        }
        if ((i & 2) == 2) {
            int i3 = bVar.D;
            this.C = 2 | this.C;
            this.E = i3;
        }
        this.A = this.A.b(bVar.A);
    }

    public void g(c cVar) {
        if (cVar == c.G) {
            return;
        }
        int i = cVar.B;
        if ((i & 1) == 1) {
            int i2 = cVar.C;
            this.C = 1 | this.C;
            this.D = i2;
        }
        if ((i & 2) == 2) {
            int i3 = cVar.D;
            this.C = 2 | this.C;
            this.E = i3;
        }
        this.A = this.A.b(cVar.A);
    }
}
