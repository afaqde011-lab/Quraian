package jq;

import jo.o;
import m00.i;
import ri.t1;
import vl.f;
import vl.r;
import xw.k;

public final class e implements yl.a {
    public static final int g = 0;
    public final k a;
    public final xw.d b;
    public final xv.c c;
    public final jo.d d;
    public final o e;
    public final au.a f;

    static {
        int i = au.a.d;
    }

    public e(k kVar, xw.d dVar, xv.c cVar, jo.d dVar2, o oVar, au.a aVar) {
        this.a = kVar;
        this.b = dVar;
        this.c = cVar;
        this.d = dVar2;
        this.e = oVar;
        this.f = aVar;
    }

    public final Object a(u00.k kVar, u00.k kVar2, m00.c cVar) {
        a aVar;
        u00.k kVar3;
        Throwable th;
        u00.k kVar4;
        Object objInvoke;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.E = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objInvoke2 = aVar.C;
        Object obj = l00.a.A;
        int i2 = aVar.E;
        if (i2 == 0) {
            t1.O(objInvoke2);
            aVar.A = kVar;
            aVar.B = (i) kVar2;
            aVar.E = 1;
            objInvoke2 = kVar.invoke(aVar);
            kVar3 = kVar2;
            if (objInvoke2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            u00.k kVar5 = (u00.k) aVar.B;
            kVar = aVar.A;
            t1.O(objInvoke2);
            kVar3 = kVar5;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objInvoke2);
                return objInvoke2;
            }
            kVar4 = aVar.A;
            try {
                t1.O(objInvoke2);
            } catch (Throwable th2) {
                th = th2;
                t1.s(th);
            }
        }
        aVar.A = null;
        aVar.B = null;
        aVar.E = 3;
        objInvoke = kVar4.invoke(aVar);
        if (objInvoke != obj) {
            return obj;
        }
        return objInvoke;
        if (objInvoke2 != null) {
            return objInvoke2;
        }
        if (!((Boolean) this.f.c.getValue()).booleanValue()) {
            return null;
        }
        try {
            aVar.A = kVar;
            aVar.B = null;
            aVar.E = 2;
            if (kVar3.invoke(aVar) != obj) {
                kVar4 = kVar;
                aVar.A = null;
                aVar.B = null;
                aVar.E = 3;
                objInvoke = kVar4.invoke(aVar);
                if (objInvoke != obj) {
                    return objInvoke;
                }
            }
        } catch (Throwable th3) {
            u00.k kVar6 = kVar;
            th = th3;
            kVar4 = kVar6;
            t1.s(th);
        }
        return obj;
    }

    public final f b(r rVar) {
        return new f(rVar, ((Boolean) this.f.c.getValue()).booleanValue() ? vl.e.A : vl.e.B);
    }

    public final java.lang.Object c(vl.r r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: jq.e.c(vl.r, m00.c):java.lang.Object");
    }
}
