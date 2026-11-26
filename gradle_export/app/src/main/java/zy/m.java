package zy;

import androidx.lifecycle.u0;
import g00.b0;
import java.util.concurrent.CancellationException;
import ri.t1;
import ta.c0;

public final class m extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final p C;

    public m(p pVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = pVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                m mVar = new m(this.C, cVar, 0);
                mVar.B = obj;
                return mVar;
            default:
                m mVar2 = new m(this.C, cVar, 1);
                mVar2.B = obj;
                return mVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                m mVar = (m) create(th, cVar);
                b0 b0Var = b0.a;
                mVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                m mVar2 = (m) create(th, cVar);
                b0 b0Var2 = b0.a;
                mVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        p pVar = this.C;
        Throwable th = (Throwable) this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (!(th instanceof CancellationException)) {
                    pVar.f.accountDeleteFailed(th);
                    c0.M(u0.i(pVar), (k00.i) null, (u00.n) null, new n(pVar, null, 1), new z.b(pVar, th, (k00.c) null, 4), 23);
                } else {
                    pVar.getClass();
                }
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                pVar.i(l.a((l) pVar.c.d.getValue(), null, 0, 0, false, false, false, false, p.j(pVar, th), 1023));
                break;
        }
        return b0Var;
    }
}
