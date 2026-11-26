package d40;

import ri.t1;

public final class n0 extends m00.i implements u00.n {
    public final int A;
    public int B;

    public n0(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                n0 n0Var = new n0(2, cVar, 0);
                n0Var.B = ((Number) obj).intValue();
                return n0Var;
            case 1:
                return new n0(2, cVar, 1);
            case 2:
                n0 n0Var2 = new n0(2, cVar, 2);
                n0Var2.B = ((Number) obj).intValue();
                return n0Var2;
            default:
                n0 n0Var3 = new n0(2, cVar, 3);
                n0Var3.B = ((Number) obj).intValue();
                return n0Var3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((n0) create(Integer.valueOf(((Number) obj).intValue()), (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((n0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((n0) create(Integer.valueOf(((Number) obj).intValue()), (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((n0) create(Integer.valueOf(((Number) obj).intValue()), (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(this.B > 0);
            case 1:
                l00.a aVar2 = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (w00.a.z(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 2:
                int i2 = this.B;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(i2 > 0);
            default:
                int i3 = this.B;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(i3 > 0);
        }
    }
}
