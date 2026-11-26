package lb;

import a40.z;
import g00.b0;
import ri.t1;
import u00.n;

public final class g extends m00.i implements n {
    public final int A;
    public int B;
    public final j C;
    public final wb.i D;

    public g(j jVar, wb.i iVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = jVar;
        this.D = iVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new g(this.C, this.D, cVar, 0);
            default:
                return new g(this.C, this.D, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    obj = j.a(this.C, this.D, 0, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return obj;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                this.B = 1;
                Object objA = j.a(this.C, this.D, 1, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }
}
