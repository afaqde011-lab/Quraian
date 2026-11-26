package dq;

import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import g00.b0;
import g1.o0;
import ri.t1;

public final class p extends m00.i implements u00.o {
    public final int A = 0;
    public long B;
    public Object C;

    public p(int i, k00.c cVar) {
        super(i, cVar);
    }

    public p(o0 o0Var, k00.c cVar) {
        super(3, cVar);
        this.C = o0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                p pVar = new p(3, (k00.c) obj3);
                pVar.C = (ReciterCollectionEvent) obj;
                pVar.B = jLongValue;
                return pVar.invokeSuspend(b0.a);
            default:
                long j = ((h2.b) obj2).a;
                p pVar2 = new p((o0) this.C, (k00.c) obj3);
                pVar2.B = j;
                b0 b0Var = b0.a;
                pVar2.invokeSuspend(b0Var);
                return b0Var;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                ReciterCollectionEvent reciterCollectionEvent = (ReciterCollectionEvent) this.C;
                long j = this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                return new g00.k(reciterCollectionEvent, new Long(j));
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                long j2 = this.B;
                o0 o0Var = (o0) this.C;
                o0Var.U = Float.intBitsToFloat((int) (j2 >> 32));
                o0Var.V = Float.intBitsToFloat((int) (j2 & 4294967295L));
                return b0.a;
        }
    }
}
