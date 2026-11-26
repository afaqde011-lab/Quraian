package ab;

import ri.t1;

public final class n extends m00.i implements u00.p {
    public int A;
    public Throwable B;
    public long C;

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        n nVar = new n(4, (k00.c) obj4);
        nVar.B = (Throwable) obj2;
        nVar.C = jLongValue;
        return nVar.invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        if (i10 == 0) {
            t1.O(obj);
            Throwable th2 = this.B;
            long j9 = this.C;
            za.v.d().c(p.f399a, "Cannot check for unfinished work", th2);
            long jMin = Math.min(j9 * ((long) 30000), p.f400b);
            this.A = 1;
            if (a40.c0.l(jMin, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return Boolean.TRUE;
    }
}
