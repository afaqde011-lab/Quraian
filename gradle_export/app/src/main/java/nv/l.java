package nv;

import g00.b0;
import k9.a2;
import k9.e1;
import k9.g1;
import ri.t1;

public final class l extends m00.i implements u00.k {
    public final g1 A;
    public final a2 B;
    public final String C;
    public final e1 D;

    public l(g1 g1Var, a2 a2Var, String str, e1 e1Var, k00.c cVar) {
        super(1, cVar);
        this.A = g1Var;
        this.B = a2Var;
        this.C = str;
        this.D = e1Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new l(this.A, this.B, this.C, this.D, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((l) create((k00.c) obj)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        this.A.c(this.B, this.C, 1, this.D);
        return k9.q.d();
    }
}
