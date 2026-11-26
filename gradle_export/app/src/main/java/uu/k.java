package uu;

import a40.z;
import d40.p1;
import g00.b0;
import ri.t1;

public final class k extends m00.i implements u00.n {
    public final int A = 0;
    public int B;
    public final w C;
    public boolean D;

    public k(w wVar, k00.c cVar) {
        super(2, cVar);
        this.C = wVar;
    }

    public k(w wVar, boolean z, k00.c cVar) {
        super(2, cVar);
        this.C = wVar;
        this.D = z;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new k(this.C, cVar);
            default:
                return new k(this.C, this.D, cVar);
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
        return ((k) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z;
        switch (this.A) {
            case 0:
                Object obj2 = l00.a.A;
                int i = this.B;
                w wVar = this.C;
                if (i == 0) {
                    t1.O(obj);
                    boolean zA = wVar.m.a();
                    this.D = zA;
                    this.B = 1;
                    Object objG = wVar.g(true, this);
                    if (objG != obj2) {
                        obj = objG;
                        z = zA;
                    }
                    return obj2;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.D;
                t1.O(obj);
                k9.u uVar = (k9.u) obj;
                obj2 = b0.a;
                if (uVar != null) {
                    w.d(wVar, uVar, z);
                }
                return obj2;
            default:
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                b0 b0Var = b0.a;
                if (i2 == 0) {
                    t1.O(obj);
                    p1 p1Var = this.C.I;
                    Boolean boolValueOf = Boolean.valueOf(this.D);
                    this.B = 1;
                    p1Var.emit(boolValueOf, this);
                    if (b0Var == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
        }
    }
}
