package vn;

import ri.t1;

public final class r extends m00.i implements u00.o {
    public final int A;
    public g00.k B;
    public boolean C;

    public r(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g00.k kVar = (g00.k) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.A) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                r rVar = new r(3, (k00.c) obj3, 0);
                rVar.B = kVar;
                rVar.C = zBooleanValue;
                return rVar.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                r rVar2 = new r(3, (k00.c) obj3, 1);
                rVar2.B = kVar;
                rVar2.C = zBooleanValue2;
                return rVar2.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                g00.k kVar = this.B;
                boolean z = this.C;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                return new g00.k(kVar != null ? (Boolean) kVar.B : null, Boolean.valueOf(z));
            default:
                g00.k kVar2 = this.B;
                boolean z2 = this.C;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                return new g00.k(kVar2 != null ? (Boolean) kVar2.B : null, Boolean.valueOf(z2));
        }
    }
}
