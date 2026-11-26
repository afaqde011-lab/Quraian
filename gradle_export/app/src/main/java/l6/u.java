package l6;

import ri.t1;

public final class u extends m00.i implements u00.n {
    public final int A;
    public boolean B;

    public u(int i10, k00.c cVar, int i11) {
        super(i10, cVar);
        this.A = i11;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                u uVar = new u(2, cVar, 0);
                uVar.B = ((Boolean) obj).booleanValue();
                return uVar;
            default:
                u uVar2 = new u(2, cVar, 1);
                uVar2.B = ((Boolean) obj).booleanValue();
                return uVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        k00.c cVar = (k00.c) obj2;
        switch (i10) {
            case 0:
                break;
        }
        return ((u) create(bool, cVar)).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(this.B);
            default:
                boolean z10 = this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                return Boolean.valueOf(z10);
        }
    }
}
