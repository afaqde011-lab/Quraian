package d6;

import android.content.Context;

public final class e1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final f1 D;
    public final Context E;
    public final int[] F;

    public e1(f1 f1Var, Context context, int[] iArr, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = f1Var;
        this.E = context;
        this.F = iArr;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                e1 e1Var = new e1(this.D, this.E, this.F, cVar, 0);
                e1Var.C = obj;
                return e1Var;
            default:
                e1 e1Var2 = new e1(this.D, this.E, this.F, cVar, 1);
                e1Var2.C = obj;
                return e1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    a40.z zVar = (a40.z) this.C;
                    this.B = 1;
                    if (this.D.a(zVar, this.E, this.F, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    a40.z zVar2 = (a40.z) this.C;
                    this.B = 1;
                    if (this.D.d(zVar2, this.E, this.F, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
