package b1;

import ri.t1;

public final class j0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m00.i C;

    public j0(int i10, k00.c cVar, u00.k kVar) {
        super(2, cVar);
        this.A = i10;
        switch (i10) {
            case 1:
                this.C = (m00.i) kVar;
                super(2, cVar);
                break;
            default:
                this.C = (m00.i) kVar;
                break;
        }
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j0(0, cVar, this.C);
            default:
                return new j0(1, cVar, this.C);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.invoke(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
