package m1;

import g00.b0;
import q30.k;
import u.u0;
import u00.n;

public final class g extends m00.h implements n {
    public final int B;
    public long[] C;
    public int D;
    public int E;
    public int F;
    public int G;
    public long H;
    public int I;
    public Object J;
    public Object K;
    public final Object L;

    public g(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.B = i10;
        this.L = obj;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.B) {
            case 0:
                g gVar = new g((h) this.L, cVar, 0);
                gVar.J = obj;
                return gVar;
            case 1:
                g gVar2 = new g((u.g) this.L, cVar, 1);
                gVar2.J = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((u.g) this.L, cVar, 2);
                gVar3.J = obj;
                return gVar3;
            default:
                g gVar4 = new g((u0) this.L, cVar, 3);
                gVar4.J = obj;
                return gVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.B) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(kVar, cVar).invokeSuspend(b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: m1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
