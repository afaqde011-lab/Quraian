package jo;

import a40.c0;
import ho.q;
import ri.t1;
import vn.b0;

public final class m {
    public final b0 a;

    public m(b0 b0Var) {
        this.a = b0Var;
    }

    public final Object a(q qVar, boolean z, m00.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.D = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.B;
        l00.a aVar = l00.a.A;
        int i2 = lVar.D;
        b0 b0Var = this.a;
        if (i2 == 0) {
            t1.O(obj);
            lVar.A = z;
            lVar.D = 1;
            if (b0Var.e(qVar, lVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = lVar.A;
            t1.O(obj);
        }
        if (z) {
            c0.y(b0Var.i, null, null, new l6.d(b0Var, (k00.c) null, 19), 3);
        }
        return g00.b0.a;
    }
}
