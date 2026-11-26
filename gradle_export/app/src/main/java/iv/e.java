package iv;

import a40.z;
import g00.b0;
import j0.v;
import ri.t1;

public final class e extends m00.i implements u00.n {
    public int A;
    public final v B;
    public final float C;
    public final int D;

    public e(v vVar, float f, int i, k00.c cVar) {
        super(2, cVar);
        this.B = vVar;
        this.C = f;
        this.D = i;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new e(this.B, this.C, this.D, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i == 0) {
            t1.O(obj);
            v vVar = this.B;
            if (!vVar.j.a()) {
                int iM = a.m(vVar, this.C);
                int i2 = this.D;
                if (iM != i2) {
                    this.A = 1;
                    if (vVar.f(i2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return b0.a;
    }
}
