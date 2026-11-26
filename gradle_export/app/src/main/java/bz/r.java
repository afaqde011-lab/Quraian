package bz;

import a40.z;
import g00.b0;
import ri.t1;

public final class r extends m00.i implements u00.n {
    public final int A;
    public s B;
    public int C;
    public final s D;

    public r(s sVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = sVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new r(this.D, cVar, 0);
            default:
                return new r(this.D, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((r) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        s sVar;
        ep.c cVar;
        s sVar2;
        ep.c cVar2;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.C;
                if (i == 0) {
                    t1.O(obj);
                    s sVar3 = this.D;
                    try {
                        wo.b0 b0Var = sVar3.d;
                        this.B = sVar3;
                        this.C = 1;
                        Object objF = b0Var.f(this);
                        if (objF == aVar) {
                            return aVar;
                        }
                        obj = objF;
                        sVar = sVar3;
                    } catch (Throwable unused) {
                        sVar = sVar3;
                        cVar = null;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = this.B;
                    try {
                        t1.O(obj);
                    } catch (Throwable unused2) {
                        cVar = null;
                    }
                }
                cVar = (ep.c) obj;
                s.j(sVar, cVar);
                return b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.C;
                if (i2 == 0) {
                    t1.O(obj);
                    s sVar4 = this.D;
                    sVar4.i(p.a((p) sVar4.c.d.getValue(), true, null, null, null, false, false, false, 253));
                    try {
                        wo.b0 b0Var2 = sVar4.d;
                        this.B = sVar4;
                        this.C = 1;
                        Object objF2 = b0Var2.f(this);
                        if (objF2 == aVar2) {
                            return aVar2;
                        }
                        obj = objF2;
                        sVar2 = sVar4;
                    } catch (Throwable unused3) {
                        sVar2 = sVar4;
                        cVar2 = null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar2 = this.B;
                    try {
                        t1.O(obj);
                    } catch (Throwable unused4) {
                        cVar2 = null;
                    }
                }
                cVar2 = (ep.c) obj;
                s.j(sVar2, cVar2);
                return b0.a;
        }
    }
}
