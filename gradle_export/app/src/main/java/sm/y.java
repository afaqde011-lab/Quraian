package sm;

import ri.t1;

public final class y extends m00.i implements u00.n {
    public final int A;
    public float B;
    public final tm.e C;

    public y(tm.e eVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = eVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                y yVar = new y(this.C, cVar, 0);
                yVar.B = ((Number) obj).floatValue();
                return yVar;
            default:
                y yVar2 = new y(this.C, cVar, 1);
                yVar2.B = ((Number) obj).floatValue();
                return yVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        float fFloatValue = ((Number) obj).floatValue();
        k00.c cVar = (k00.c) obj2;
        switch (i) {
            case 0:
                y yVar = (y) create(Float.valueOf(fFloatValue), cVar);
                g00.b0 b0Var = g00.b0.a;
                yVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                y yVar2 = (y) create(Float.valueOf(fFloatValue), cVar);
                g00.b0 b0Var2 = g00.b0.a;
                yVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        tm.e eVar = this.C;
        float f = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (eVar.d() != f) {
                    eVar.g(f);
                }
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                eVar.g(f);
                break;
        }
        return b0Var;
    }
}
