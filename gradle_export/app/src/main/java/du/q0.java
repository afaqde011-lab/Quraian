package du;

import ri.t1;

public final class q0 extends m00.i implements u00.o {
    public final int A;
    public zp.a B;
    public boolean C;

    public q0(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zp.a aVar = (zp.a) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.A) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                q0 q0Var = new q0(3, (k00.c) obj3, 0);
                q0Var.B = aVar;
                q0Var.C = zBooleanValue;
                return q0Var.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                q0 q0Var2 = new q0(3, (k00.c) obj3, 1);
                q0Var2.B = aVar;
                q0Var2.C = zBooleanValue2;
                return q0Var2.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                zp.a aVar = this.B;
                boolean z = this.C;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                return new g00.k(aVar, Boolean.valueOf(z));
            default:
                zp.a aVar3 = this.B;
                boolean z2 = this.C;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(!aVar3.a || z2);
        }
    }
}
