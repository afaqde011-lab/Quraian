package ur;

import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import ri.t1;

public final class o1 extends m00.i implements u00.p {
    public int A;
    public ReciterCollectionEvent B;
    public long C;
    public final r1 D;

    public o1(r1 r1Var, k00.c cVar) {
        super(4, cVar);
        this.D = r1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj2).longValue();
        o1 o1Var = new o1(this.D, (k00.c) obj4);
        o1Var.B = (ReciterCollectionEvent) obj;
        o1Var.C = jLongValue;
        return o1Var.invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ReciterCollectionEvent reciterCollectionEvent = this.B;
        long j = this.C;
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return obj;
        }
        t1.O(obj);
        this.B = null;
        this.C = j;
        this.A = 1;
        Object objJ = r1.j(this.D, reciterCollectionEvent, j, this);
        return objJ == aVar ? aVar : objJ;
    }
}
