package l6;

import java.util.concurrent.CancellationException;
import ri.t1;

public final class q extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final d6.r D;

    public q(d6.r rVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = rVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                q qVar = new q(this.D, cVar, 0);
                qVar.C = obj;
                return qVar;
            default:
                q qVar2 = new q(this.D, cVar, 1);
                qVar2.C = obj;
                return qVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(mVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                m mVar = (m) this.C;
                this.B = 1;
                Object objB = mVar.b(this.D, this);
                return objB == aVar ? aVar : objB;
            default:
                g00.b0 b0Var = l00.a.A;
                int i11 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i11 == 0) {
                    t1.O(obj);
                    m mVar2 = (m) this.C;
                    String str = this.D.f4681a;
                    this.B = 1;
                    d6.r rVar = (d6.r) mVar2.f10037a.remove(str);
                    if (rVar != null) {
                        rVar.f4684d.f((Throwable) null);
                        rVar.f4682b.set(false);
                        rVar.m.i((CancellationException) null);
                    }
                    if (b0Var2 == b0Var) {
                        return b0Var;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var2;
        }
    }
}
