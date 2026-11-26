package is;

import g1.s1;
import java.io.IOException;
import java.time.ZoneId;
import ri.t1;

public final class g1 {
    public final ms.b a;
    public final js.j b;
    public final bk.m c;

    public g1(ms.b bVar, js.j jVar, fs.m mVar, bk.m mVar2) {
        this.a = bVar;
        this.b = jVar;
        this.c = mVar2;
    }

    public final Object a(m00.c cVar) {
        Object objN = rd.a.N(this.b.a.a, false, true, new ks.e(9), cVar);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objN != aVar) {
            objN = b0Var;
        }
        if (objN != aVar) {
            objN = b0Var;
        }
        return objN == aVar ? objN : b0Var;
    }

    public final Object b(int i, m00.c cVar) throws IOException {
        d1 d1Var;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i2 = d1Var.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d1Var.D = i2 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar);
            }
        } else {
            d1Var = new d1(this, cVar);
        }
        Object objH = d1Var.B;
        l00.a aVar = l00.a.A;
        int i3 = d1Var.D;
        g00.b0 b0Var = g00.b0.a;
        if (i3 == 0) {
            t1.O(objH);
            String id = ZoneId.systemDefault().getId();
            kotlin.jvm.internal.m.d(id, "getId(...)");
            d1Var.A = i;
            d1Var.D = 1;
            objH = this.a.h(id, i, d1Var);
            if (objH != aVar) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objH);
            return b0Var;
        }
        i = d1Var.A;
        t1.O(objH);
        hs.c0 c0Var = (hs.c0) objH;
        if (c0Var == null) {
            throw new IOException(g4.c.i("Listening year ", i, ": empty response"));
        }
        String strI = this.c.i(c0Var);
        kotlin.jvm.internal.m.d(strI, "toJson(...)");
        gs.h hVar = new gs.h(strI, System.currentTimeMillis(), i);
        d1Var.A = i;
        d1Var.D = 2;
        ks.m mVar = this.b.a;
        Object objN = rd.a.N(mVar.a, false, true, new h1.v0(mVar, hVar, 16), d1Var);
        if (objN != aVar) {
            objN = b0Var;
        }
        if (objN != aVar) {
            objN = b0Var;
        }
        return objN == aVar ? aVar : b0Var;
    }

    public final Object c(int i, m00.c cVar) {
        f1 f1Var;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i2 = f1Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f1Var.C = i2 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object objN = f1Var.A;
        l00.a aVar = l00.a.A;
        int i3 = f1Var.C;
        if (i3 == 0) {
            t1.O(objN);
            f1Var.C = 1;
            objN = rd.a.N(this.b.a.a, true, false, new s1(i, 10), f1Var);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objN);
        }
        Long l = (Long) objN;
        return new Long(l != null ? l.longValue() : 0L);
    }
}
