package androidx.lifecycle;

import ri.t1;

public final class h implements d40.j {
    public final int A;
    public final c40.t B;

    public h(c40.t tVar, int i10) {
        this.A = i10;
        this.B = tVar;
    }

    public final Object emit(Object obj, k00.c cVar) {
        d40.m mVar;
        switch (this.A) {
            case 0:
                Object objM = this.B.D.m(obj, cVar);
                return objM == l00.a.A ? objM : g00.b0.a;
            default:
                if (cVar instanceof d40.m) {
                    mVar = (d40.m) cVar;
                    int i10 = mVar.C;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        mVar.C = i10 - Integer.MIN_VALUE;
                    } else {
                        mVar = new d40.m(this, cVar);
                    }
                } else {
                    mVar = new d40.m(this, cVar);
                }
                Object obj2 = mVar.A;
                l00.a aVar = l00.a.A;
                int i11 = mVar.C;
                if (i11 == 0) {
                    t1.O(obj2);
                    if (obj == null) {
                        obj = e40.b.b;
                    }
                    mVar.C = 1;
                    if (this.B.D.m(obj, mVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj2);
                }
                return g00.b0.a;
        }
    }
}
