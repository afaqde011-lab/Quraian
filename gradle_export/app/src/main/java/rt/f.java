package rt;

import h00.x;
import ht.k;
import java.util.List;
import java.util.concurrent.CancellationException;
import ri.t1;

public final class f {
    public final ht.b a;
    public final k b;
    public final b c;
    public final h d;

    public f(ht.b bVar, k kVar, b bVar2, h hVar) {
        this.a = bVar;
        this.b = kVar;
        this.c = bVar2;
        this.d = hVar;
    }

    public static final Object a(f fVar, m00.c cVar) throws Throwable {
        c cVar2;
        fVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.C = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(fVar, cVar);
            }
        } else {
            cVar2 = new c(fVar, cVar);
        }
        Object objC = cVar2.A;
        l00.a aVar = l00.a.A;
        int i2 = cVar2.C;
        try {
            if (i2 == 0) {
                t1.O(objC);
                k kVar = fVar.b;
                cVar2.C = 1;
                objC = kVar.c(cVar2);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objC);
            }
            return (List) objC;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return x.A;
        }
    }
}
