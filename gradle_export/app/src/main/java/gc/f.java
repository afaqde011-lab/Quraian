package gc;

import g00.b0;
import ri.t1;

public final class f extends m00.i implements u00.k {
    public final g A;
    public final cc.a B;
    public final float C;
    public final boolean D;

    public f(g gVar, cc.a aVar, float f3, boolean z10, k00.c cVar) {
        super(1, cVar);
        this.A = gVar;
        this.B = aVar;
        this.C = f3;
        this.D = z10;
    }

    public final k00.c create(k00.c cVar) {
        return new f(this.A, this.B, this.C, this.D, cVar);
    }

    public final Object invoke(Object obj) {
        f fVarCreate = create((k00.c) obj);
        b0 b0Var = b0.a;
        fVarCreate.invokeSuspend(b0Var);
        return b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        cc.a aVar2 = this.B;
        g gVar = this.A;
        gVar.I.setValue(aVar2);
        gVar.h(this.C);
        gVar.g(1);
        gVar.A.setValue(Boolean.FALSE);
        if (this.D) {
            gVar.L.setValue(Long.MIN_VALUE);
        }
        return b0.a;
    }
}
