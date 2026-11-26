package ha;

import ea.m;
import g00.b0;
import ri.t1;
import u00.k;
import u00.n;

public final class a extends m00.i implements n {
    public final int A;
    public Object B;
    public final k C;

    public a(int i10, k00.c cVar, k kVar) {
        super(2, cVar);
        this.A = i10;
        this.C = kVar;
    }

    public a(k kVar, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.C = kVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                a aVar = new a(0, cVar, this.C);
                aVar.B = obj;
                return aVar;
            case 1:
                a aVar2 = new a(1, cVar, this.C);
                aVar2.B = obj;
                return aVar2;
            default:
                a aVar3 = new a(this.C, cVar);
                aVar3.B = obj;
                return aVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((m) obj, (k00.c) obj2).invokeSuspend(b0.a);
            case 1:
                return create((m) obj, (k00.c) obj2).invokeSuspend(b0.a);
            default:
                a aVarCreate = create((t5.b) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                aVarCreate.invokeSuspend(b0Var);
                return b0Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        k kVar = this.C;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                m mVar = (m) this.B;
                kotlin.jvm.internal.m.c(mVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return kVar.invoke(mVar.d());
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                m mVar2 = (m) this.B;
                kotlin.jvm.internal.m.c(mVar2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return kVar.invoke(mVar2.d());
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                kVar.invoke((t5.b) this.B);
                return b0.a;
        }
    }
}
