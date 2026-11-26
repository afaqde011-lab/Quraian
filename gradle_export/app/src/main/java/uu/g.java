package uu;

import a40.z;
import g00.b0;
import java.util.List;
import ri.t1;

public final class g extends m00.i implements u00.n {
    public final w A;
    public final long B;
    public final long C;
    public final List D;
    public final int E;

    public g(w wVar, long j, long j2, List list, int i, k00.c cVar) {
        super(2, cVar);
        this.A = wVar;
        this.B = j;
        this.C = j2;
        this.D = list;
        this.E = i;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new g(this.A, this.B, this.C, this.D, this.E, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((z) obj, (k00.c) obj2);
        b0 b0Var = b0.a;
        gVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = b0.a;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        if (this.A.m.a()) {
            this.A.Q = true;
            w wVar = this.A;
            long j = this.B;
            if (j < 0) {
                j = 0;
            }
            wVar.R = j;
            long j2 = this.C;
            long j3 = j2 >= 0 ? j2 : 0L;
            k9.u uVar = this.A.r;
            if (uVar != null) {
                uVar.setMediaItems(this.D, this.E, j3);
            }
            k9.u uVar2 = this.A.r;
            if (uVar2 != null) {
                uVar2.prepare();
            }
            k9.u uVar3 = this.A.r;
            if (uVar3 != null) {
                uVar3.setVolume(((Number) this.A.F.getValue()).floatValue());
            }
        }
        return b0Var;
    }
}
