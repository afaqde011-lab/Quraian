package dz;

import a40.z;
import g00.b0;
import ri.t1;

public final class p extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final s C;
    public final int D;

    public p(s sVar, int i, k00.c cVar, int i2) {
        super(2, cVar);
        this.A = i2;
        this.C = sVar;
        this.D = i;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new p(this.C, this.D, cVar, 0);
            case 1:
                return new p(this.C, this.D, cVar, 1);
            default:
                return new p(this.C, this.D, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((p) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    zt.a aVar2 = this.C.d;
                    this.B = 1;
                    if (((ut.p) aVar2).d(this.D, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 1:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    zt.a aVar4 = this.C.d;
                    this.B = 1;
                    if (((ut.p) aVar4).e(this.D, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar5 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    io.a aVar6 = this.C.g;
                    this.B = 1;
                    if (((vn.o) aVar6).c(this.D, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
