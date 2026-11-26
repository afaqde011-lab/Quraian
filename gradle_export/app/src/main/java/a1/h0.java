package a1;

import java.util.ArrayList;

public final class h0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final f0.i C;
    public final l1.z0 D;

    public h0(f0.i iVar, l1.z0 z0Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = iVar;
        this.D = z0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new h0(this.C, this.D, cVar, 0);
            default:
                return new h0(this.C, this.D, cVar, 1);
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
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                ArrayList arrayList = new ArrayList();
                d40.d1 d1Var = this.C.f5476a;
                g0 g0Var = new g0(arrayList, this.D, 0);
                this.B = 1;
                d1Var.collect(g0Var, this);
                return aVar;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                ArrayList arrayList2 = new ArrayList();
                d40.d1 d1Var2 = this.C.f5476a;
                g0 g0Var2 = new g0(arrayList2, this.D, 1);
                this.B = 1;
                d1Var2.collect(g0Var2, this);
                return aVar2;
        }
    }
}
