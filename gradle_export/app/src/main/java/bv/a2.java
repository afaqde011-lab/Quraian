package bv;

public final class a2 extends m00.i implements u00.o {
    public final int A;
    public boolean B;
    public boolean C;

    public a2(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        switch (this.A) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                a2 a2Var = new a2(3, (k00.c) obj3, 0);
                a2Var.B = zBooleanValue;
                a2Var.C = zBooleanValue2;
                return a2Var.invokeSuspend(g00.b0.a);
            case 1:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                a2 a2Var2 = new a2(3, (k00.c) obj3, 1);
                a2Var2.B = zBooleanValue3;
                a2Var2.C = zBooleanValue4;
                return a2Var2.invokeSuspend(g00.b0.a);
            case 2:
                boolean zBooleanValue5 = bool.booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                a2 a2Var3 = new a2(3, (k00.c) obj3, 2);
                a2Var3.B = zBooleanValue5;
                a2Var3.C = zBooleanValue6;
                return a2Var3.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue7 = bool.booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                a2 a2Var4 = new a2(3, (k00.c) obj3, 3);
                a2Var4.B = zBooleanValue7;
                a2Var4.C = zBooleanValue8;
                return a2Var4.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                boolean z = this.B;
                boolean z2 = this.C;
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                return new g00.k(Boolean.valueOf(z), Boolean.valueOf(z2));
            case 1:
                boolean z3 = this.B;
                boolean z4 = this.C;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                return new g00.k(Boolean.valueOf(z3), Boolean.valueOf(z4));
            case 2:
                boolean z5 = this.B;
                boolean z6 = this.C;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                return new g00.k(Boolean.valueOf(z5), Boolean.valueOf(z6));
            default:
                boolean z7 = this.B;
                boolean z8 = this.C;
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                return new g00.k(Boolean.valueOf(z7), Boolean.valueOf(z8));
        }
    }
}
