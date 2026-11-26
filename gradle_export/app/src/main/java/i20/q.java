package i20;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public final class q extends o20.j implements o20.u {
    public final int B;
    public int C;
    public Serializable D;
    public Object E;
    public o20.o F;
    public Serializable G;
    public Serializable H;

    public q(int i) {
        this.B = i;
    }

    public static q f() {
        q qVar = new q(0);
        qVar.D = s.RETURNS_CONSTANT;
        qVar.E = Collections.EMPTY_LIST;
        qVar.F = z.L;
        qVar.G = t.AT_MOST_ONCE;
        qVar.H = r.CONCLUSION_CONDITION;
        return qVar;
    }

    public static q g() {
        q qVar = new q(1);
        qVar.D = l20.b.G;
        l20.c cVar = l20.c.G;
        qVar.E = cVar;
        qVar.F = cVar;
        qVar.G = cVar;
        qVar.H = cVar;
        return qVar;
    }

    @Override
    public final o20.b a() {
        switch (this.B) {
            case 0:
                u uVarD = d();
                if (uVarD.isInitialized()) {
                    return uVarD;
                }
                throw new UninitializedMessageException();
            default:
                l20.d dVarE = e();
                dVarE.isInitialized();
                return dVarE;
        }
    }

    @Override
    public final o20.j b(o20.f fVar, o20.h hVar) throws Throwable {
        switch (this.B) {
            case 0:
                u uVar = null;
                try {
                    try {
                        u.K.getClass();
                        h(new u(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        u uVar2 = (u) e.A;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            uVar = uVar2;
                            if (uVar != null) {
                                h(uVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (uVar != null) {
                        h(uVar);
                    }
                    throw th;
                }
            default:
                l20.d dVar = null;
                try {
                    try {
                        l20.d.K.getClass();
                        j(new l20.d(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        l20.d dVar2 = (l20.d) e2.A;
                        try {
                            throw e2;
                        } catch (Throwable th3) {
                            th = th3;
                            dVar = dVar2;
                            if (dVar != null) {
                                j(dVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (dVar != null) {
                        j(dVar);
                    }
                    throw th;
                }
        }
    }

    @Override
    public final o20.j c(o20.o oVar) {
        switch (this.B) {
            case 0:
                h((u) oVar);
                break;
            default:
                j((l20.d) oVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.B) {
            case 0:
                q qVarF = f();
                qVarF.h(d());
                return qVarF;
            default:
                q qVarG = g();
                qVarG.j(e());
                return qVarG;
        }
    }

    public u d() {
        u uVar = new u(this);
        int i = this.C;
        int i2 = (i & 1) != 1 ? 0 : 1;
        uVar.C = (s) this.D;
        if ((i & 2) == 2) {
            this.E = Collections.unmodifiableList((List) this.E);
            this.C &= -3;
        }
        uVar.D = (List) this.E;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        uVar.E = (z) this.F;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        uVar.F = (t) this.G;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        uVar.G = (r) this.H;
        uVar.B = i2;
        return uVar;
    }

    public l20.d e() {
        l20.d dVar = new l20.d(this);
        int i = this.C;
        int i2 = (i & 1) != 1 ? 0 : 1;
        dVar.C = (l20.b) this.D;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        dVar.D = (l20.c) this.E;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        dVar.E = (l20.c) this.F;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        dVar.F = (l20.c) this.G;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        dVar.G = (l20.c) this.H;
        dVar.B = i2;
        return dVar;
    }

    public void h(u uVar) {
        z zVar;
        if (uVar == u.J) {
            return;
        }
        if ((uVar.B & 1) == 1) {
            s sVar = uVar.C;
            sVar.getClass();
            this.C = 1 | this.C;
            this.D = sVar;
        }
        if (!uVar.D.isEmpty()) {
            if (((List) this.E).isEmpty()) {
                this.E = uVar.D;
                this.C &= -3;
            } else {
                if ((this.C & 2) != 2) {
                    this.E = new ArrayList((List) this.E);
                    this.C |= 2;
                }
                ((List) this.E).addAll(uVar.D);
            }
        }
        if ((uVar.B & 2) == 2) {
            z zVar2 = uVar.E;
            if ((this.C & 4) != 4 || (zVar = (z) this.F) == z.L) {
                this.F = zVar2;
            } else {
                x xVarE = x.e();
                xVarE.f(zVar);
                xVarE.f(zVar2);
                this.F = xVarE.d();
            }
            this.C |= 4;
        }
        if ((uVar.B & 4) == 4) {
            t tVar = uVar.F;
            tVar.getClass();
            this.C |= 8;
            this.G = tVar;
        }
        if ((uVar.B & 8) == 8) {
            r rVar = uVar.G;
            rVar.getClass();
            this.C |= 16;
            this.H = rVar;
        }
        this.A = this.A.b(uVar.A);
    }

    public void j(l20.d dVar) {
        l20.c cVar;
        l20.c cVar2;
        l20.c cVar3;
        l20.c cVar4;
        l20.b bVar;
        if (dVar == l20.d.J) {
            return;
        }
        if ((dVar.B & 1) == 1) {
            l20.b bVar2 = dVar.C;
            if ((this.C & 1) != 1 || (bVar = (l20.b) this.D) == l20.b.G) {
                this.D = bVar2;
            } else {
                l20.a aVar = new l20.a(0);
                aVar.f(bVar);
                aVar.f(bVar2);
                this.D = aVar.d();
            }
            this.C |= 1;
        }
        if ((dVar.B & 2) == 2) {
            l20.c cVar5 = dVar.D;
            if ((this.C & 2) != 2 || (cVar4 = (l20.c) this.E) == l20.c.G) {
                this.E = cVar5;
            } else {
                l20.a aVarG = l20.c.g(cVar4);
                aVarG.g(cVar5);
                this.E = aVarG.e();
            }
            this.C |= 2;
        }
        if (dVar.g()) {
            l20.c cVar6 = dVar.E;
            if ((this.C & 4) != 4 || (cVar3 = (l20.c) this.F) == l20.c.G) {
                this.F = cVar6;
            } else {
                l20.a aVarG2 = l20.c.g(cVar3);
                aVarG2.g(cVar6);
                this.F = aVarG2.e();
            }
            this.C |= 4;
        }
        if ((dVar.B & 8) == 8) {
            l20.c cVar7 = dVar.F;
            if ((this.C & 8) != 8 || (cVar2 = (l20.c) this.G) == l20.c.G) {
                this.G = cVar7;
            } else {
                l20.a aVarG3 = l20.c.g(cVar2);
                aVarG3.g(cVar7);
                this.G = aVarG3.e();
            }
            this.C |= 8;
        }
        if ((dVar.B & 16) == 16) {
            l20.c cVar8 = dVar.G;
            if ((this.C & 16) != 16 || (cVar = (l20.c) this.H) == l20.c.G) {
                this.H = cVar8;
            } else {
                l20.a aVarG4 = l20.c.g(cVar);
                aVarG4.g(cVar8);
                this.H = aVarG4.e();
            }
            this.C |= 16;
        }
        this.A = this.A.b(dVar.A);
    }
}
