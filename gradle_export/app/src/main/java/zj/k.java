package zj;

import a40.z;
import cs.o;
import g00.b0;
import ri.t1;

public final class k extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m C;

    public k(m mVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = mVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new k(this.C, cVar, 0);
            default:
                return new k(this.C, cVar, 1);
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
                    m mVar = this.C;
                    d40.i data = mVar.f17523b.getData();
                    o oVar = new o(mVar.f17524c, 2);
                    this.B = 1;
                    if (data.collect(oVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
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
                d40.i data2 = this.C.f17523b.getData();
                this.B = 1;
                Object objS = d40.o.s(data2, this);
                return objS == aVar2 ? aVar2 : objS;
        }
    }
}
