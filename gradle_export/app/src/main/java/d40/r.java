package d40;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$;
import ri.t1;

public final class r implements i {
    public final DataStoreImpl$data$1$invokeSuspend$.inlined.map.1 A;
    public final u00.o B;

    public r(DataStoreImpl$data$1$invokeSuspend$.inlined.map.1 r1, u00.o oVar) {
        this.A = r1;
        this.B = oVar;
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) throws Throwable {
        q qVar;
        e40.p pVar;
        e40.p pVar2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.B = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.A;
        l00.a aVar = l00.a.A;
        int i2 = qVar.B;
        try {
            try {
                if (i2 == 0) {
                    t1.O(obj);
                    DataStoreImpl$data$1$invokeSuspend$.inlined.map.1 r11 = this.A;
                    qVar.D = this;
                    qVar.E = jVar;
                    qVar.B = 1;
                    if (r11.collect(jVar, qVar) != aVar) {
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) qVar.D;
                        t1.O(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar2 = (e40.p) qVar.D;
                    try {
                        t1.O(obj);
                        pVar2.releaseIntercepted();
                        return g00.b0.a;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar2.releaseIntercepted();
                        throw th;
                    }
                }
                jVar = qVar.E;
                this = (r) qVar.D;
                t1.O(obj);
                u00.o oVar = this.B;
                qVar.D = pVar;
                qVar.E = null;
                qVar.B = 3;
                if (oVar.invoke(pVar, null, qVar) != aVar) {
                    pVar2 = pVar;
                    pVar2.releaseIntercepted();
                    return g00.b0.a;
                }
            } catch (Throwable th3) {
                th = th3;
                pVar2 = pVar;
                pVar2.releaseIntercepted();
                throw th;
            }
            pVar = new e40.p(jVar, qVar.getContext());
        } catch (Throwable th4) {
            r rVar = this;
            r1 r1Var = new r1(th4);
            u00.o oVar2 = rVar.B;
            qVar.D = th4;
            qVar.E = null;
            qVar.B = 2;
            if (o.e(r1Var, oVar2, th4, qVar) != aVar) {
                throw th4;
            }
        }
        return aVar;
    }
}
